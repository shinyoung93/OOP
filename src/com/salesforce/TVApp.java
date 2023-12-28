package com.salesforce;

import Practice04.TV;

public class TVApp {

	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.status();
		
		tv.power(true);
		tv.volume(120);
		tv.status();

		tv.volume(false);
		tv.status();
		
		tv.channel(255);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();
		
		TV tv1 = new TV(1,1,true);
		tv1.status();
	}

}
