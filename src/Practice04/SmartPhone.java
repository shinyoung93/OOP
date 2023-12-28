package Practice04;

public class SmartPhone extends TelePhone {

	private boolean power;

	public void turnOn(boolean on) {
		this.power = on;
	}

	public void call(String number) {
		if (power) {
			System.out.println(super.getNumber() + " 에서 ");
			System.out.println(number + " 로 전화를 겁니다.");
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}

	}

	public void searchInternet(String url) {
		if (power) {
			System.out.println(url + " 검색합니다");
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}

	}
}