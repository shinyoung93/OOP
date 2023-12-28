package Practice04;

public class TelePhone extends Phone{

	private boolean power;
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void call(String number) {
		if(power) {
			System.out.println(super.getNumber() + " 에서 ");
			System.out.println(number + " 로 전화를 겁니다.");
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
		
		
	}

	
	
}
