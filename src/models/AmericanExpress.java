package models;

public class AmericanExpress extends CreditCard {
	
	public AmericanExpress(String[] data) {
		super(data);
	}
	
	@Override
	public String toString() {
		return name + "'s American Express card";
	}
	
	public static boolean validNumber(String n) {
		if(n.length() != 15) { return false; }
		if(!n.substring(0, 1).equals("3")) { return false; }
		
		boolean secondCharValid = false;
		if(n.substring(1, 2).equals("4")) { secondCharValid = true; }  
		if(n.substring(1, 2).equals("7")) { secondCharValid = true; }
		if(!secondCharValid) { return false; }
		
		return true;
	}
}
