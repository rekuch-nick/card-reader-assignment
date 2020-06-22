package Utils;

import Excpetions.InvalidCardInputException;

public class CardInputUtil {

	
	
	public static String[] parseCardInput(String s) throws InvalidCardInputException {
		
		String[] data = s.split(",");
		
		if(data.length != 3) { throw new InvalidCardInputException(); }
		
		
		return data;
	}
}
