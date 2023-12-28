package Practice04;

public class TV {

	private int channel;
	private int volume;
	private boolean power;

	public TV(int c, int v, boolean p) {
		this.channel = c;
		this.volume = v;
		this.power = p;
	}

	public TV() {
		this(7,20,false);
//		this.channel = 7;
//		this.volume = 20;
//		this.power = false;

	}

	public int getChannel() {
		return this.channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public void power(boolean p) {
		this.power = p;
	}

	public void channel(int c) {
		if (c > -1) {
			if (c < 256) {
				this.channel = c;
			} else {
				System.out.println("채널 0에서 256사이의 번호를 입력해주세요");
			}
		} else {
			System.out.println("채널 0에서 256사이의 번호를 입력해주세요");
		}
	}

	public void channel(boolean is) {
		if (is == true) {
			if (this.channel < 255) {
				this.channel += 1;
			} else {
				System.out.println("255번 입니다.");
			}
		}

		if (is == false) {
			if (this.channel > 0) {
				this.channel -= 1;
			} else {
				System.out.println("0번 입니다.");
			}
		}
	}

	public void volume(int v) {
		if (v > 0) {
			if (v < 101) {
				this.volume = v;
			} else {
				System.out.println("볼륨 0에서 100사이의 번호를 입력해주세요");
			}
		} else {
			System.out.println("볼륨 0에서 100사이의 번호를 입력해주세요");
		}
	}

	public void volume(boolean is) {
		if (is == true) {
			if (this.volume < 100) {
				this.volume += 1;
			} else {
				System.out.println("볼륨이 100 입니다.");
			}
		}

		if (is == false) {
			if (this.volume > 0) {
				this.volume -= 1;
			} else {
				System.out.println("볼륨이 0 입니다.");
			}
		}
	}

	public void status() {
		System.out.println("power = " + power + " channel = " + channel + " volume = " + volume);
	}
}
