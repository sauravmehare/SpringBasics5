package university;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Teacher implements Staff {

	private String empId;
	private Address address;
	@Autowired
	private Insurance insuance;

	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println(empId + "Is teaching.");
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println(empId + "teacher is getting salary.");

	}

	public String getEmpId() {
		return empId;
	}
	@Required
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Teacher [empId=" + empId + ", address=" + address + ", insuance=" + insuance + "]";
	}

}
