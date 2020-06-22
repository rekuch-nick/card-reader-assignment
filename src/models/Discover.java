package models;

public class Discover extends CreditCard {

	public Discover(String[] data) {
		super(data);
	}
	
	@Override
	public String toString() {
		return name + "'s Discover card";
	}
	
	public static boolean validNumber(String n) {
		if(n.length() != 16) { return false; }
		if(!n.substring(0, 4).equals("6011")) { return false; }
		
		return true;
	}
}
