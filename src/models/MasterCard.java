package models;

public class MasterCard extends CreditCard {

	public MasterCard(String[] data) {
		super(data);
	}
	
	@Override
	public String toString() {
		return name + "'s Mastercard";
	}
	
	public static boolean validNumber(String n) {
		if(n.length() != 16) { return false; }
		if(!n.substring(0, 1).equals("5") && !n.substring(0, 1).equals("2")) { return false; }
		
		boolean secondCharValid = false;
		if(n.substring(1, 2).equals("1")) { secondCharValid = true; }  
		if(n.substring(1, 2).equals("2")) { secondCharValid = true; }
		if(n.substring(1, 2).equals("3")) { secondCharValid = true; }
		if(n.substring(1, 2).equals("4")) { secondCharValid = true; }
		if(n.substring(1, 2).equals("5")) { secondCharValid = true; }
		if(!secondCharValid) { return false; }
		
		return true;
	}
	
}
