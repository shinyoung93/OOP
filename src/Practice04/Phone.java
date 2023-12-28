package Practice04;

public abstract class Phone {

	private String number;

	public void setNumber(String number) {
		this.number = number;
	}

	
	public String getNumber() {
		return number;
	}


	public abstract void call(String number);
}
