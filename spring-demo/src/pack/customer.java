package pack;

import org.springframework.beans.factory.annotation.Autowired;

public class customer {
	
	private Identifier id;
	
	@Autowired
	private Address address;
	
	public customer() {
		super();
		System.out.println("Customer() is called");
		// TODO Auto-generated constructor stub
	}

	public customer(Identifier id) {
		super();
		System.out.println("Customer(Identifier) is called");
		this.id = id;
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		System.out.println("setId() is called");
		this.id = id;
	}
	
	public void getInformations() {
		id.display();
		address.display();
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}

