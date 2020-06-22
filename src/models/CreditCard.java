package models;

public abstract class CreditCard {

	protected String name;
	protected String number;
	protected String expires;
	
	public CreditCard(String[] data) {
		this.name = data[2];
		this.number = data[0];
		this.expires = data[1];
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExpires() {
		return expires;
	}
	public void setExpires(String expires) {
		this.expires = expires;
	}
	
	
}
