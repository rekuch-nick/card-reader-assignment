
import Excpetions.InvalidCardInputException;
import Excpetions.InvalidCardnumberException;
import Utils.CardInputUtil;
import models.AmericanExpress;
import models.CreditCard;
import models.Discover;
import models.MasterCard;
import models.Visa;

public class Main {

	
	
	public static void main(String[] args) {
		
		//sample card data:
		String[] cardsIn = {"5100123412341234,07/22,John Doe", "601112341234123,09/23,Jane Doe"};
		
		for(String s : cardsIn) {
			try {
				String[] data = CardInputUtil.parseCardInput(s);
				CreditCard card = creditCardFactory(data);
				System.out.println("Created " + card.toString() + ".");
			} catch (InvalidCardInputException e) {
				System.out.println(s + " is not valid input: \nData must be in the format 'card number,expire date, cardholder name'");
			} catch (InvalidCardnumberException e) {
				System.out.println(s + " is not a valid Credit Card.");
			}
		}

	}
	
	private static CreditCard creditCardFactory(String[] data) throws InvalidCardnumberException {
		
		System.out.println("testing " + data[0]);
		
		//data[0] is a string of the card number
		if(AmericanExpress.validNumber(data[0])){ return new MasterCard(data); }
		if(Discover.validNumber(data[0])){ return new MasterCard(data); }
		if(MasterCard.validNumber(data[0])){ return new MasterCard(data); }
		if(Visa.validNumber(data[0])){ return new MasterCard(data); }
		
		throw new InvalidCardnumberException();
	}

}
