package com.salesforce;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods1 = new Goods("니콘",400000);
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();

//		goods1.setName("니콘");
//		goods1.setPrice(400000);
//
//		goods2.setName("LG그램");
//		goods2.setPrice(900000);
		
		goods3.setName("머그컵");
		goods3.setPrice(2000);

		goods1.showInfo();
		goods2.showInfo();
		goods3.showInfo();

		
		
	}

}
