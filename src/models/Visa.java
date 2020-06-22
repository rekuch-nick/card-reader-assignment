package models;

public class Visa extends CreditCard {

	public Visa(String[] data) {
		super(data);
	}
	
	@Override
	public String toString() {
		return name + "'s Visa card";
	}
	
	public static boolean validNumber(String n) {
		if(n.length() != 13 && n.length() != 16) { return false; }
		if(!n.substring(0, 1).equals("4")) { return false; }
		
		return true;
	}
}
