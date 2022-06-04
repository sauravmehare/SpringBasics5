package university;

public class Address {
	private String residental;
	private long pin;
	
	public Address(String residental, long pin) {
		super();
		this.residental = residental;
		this.pin = pin;
	}
	public Address(String residental) {
		this.residental = residental;
	}
	public Address(long pin) {
		this.pin = pin;
	}
	public Address(){}
	
	@Override
	public String toString() {
		return "Address [residental=" + residental + ", pin=" + pin + "]";
	}
	public String getResidental() {
		return residental;
	}
	public void setResidental(String residental) {
		this.residental = residental;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}

}
