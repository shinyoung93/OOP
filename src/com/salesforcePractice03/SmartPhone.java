package com.salesforcePractice03;

public class SmartPhone extends MusicPhone {

	public SmartPhone() {

	}

	public void execute(String str) {
		if ("앱".equals(str)) {
			app(str);
		} else {
			super.execute(str);
		}

	}

	private void app(String str) {
		System.out.println("앱실행");
	}

	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}

}