package pack;

import java.util.List;

public class Bank {
	private String bankName;
	private List locations;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(String bankName, List locations) {
		super();
		this.bankName = bankName;
		this.locations = locations;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public List getLocations() {
		return locations;           
	}
	public void setLocations(List locations) {
		this.locations = locations;
	}
	

}
