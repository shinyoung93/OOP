package Practice04;

public class PhoneApp {

	public static void main(String[] args) {
		TelePhone tp = new TelePhone();
		tp.power(false);
		tp.setNumber("01028136366");
		tp.call("01026670633");
		
		SmartPhone sp = new SmartPhone();
		sp.turnOn(false);
		sp.setNumber("01028136366");
		sp.call("01026670633");
		sp.searchInternet("frank1401@naver.com");
	}

}
