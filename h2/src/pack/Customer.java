package pack;

//import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "c")
public class Customer extends Person {
	private String bankName;

	public Customer(String name, int uid, String bankName) {
		super(name, uid);
		this.bankName = bankName;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
}
