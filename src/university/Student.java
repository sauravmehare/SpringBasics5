package university;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String name;
	private String ID;
	private Address address;
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Address getAddress() {
		return address;
	}
	@Qualifier("add1")
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + ", address=" + address + "]";
	}


}
