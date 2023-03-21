package Homework.day0321;

public class Icecream {
	
	String name;
	int price;
	ScannerUtil02 scan = new ScannerUtil02();
	
	Icecream(){}
	
	Icecream(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	String name(String msg) {
		String name = scan.name(msg);
		return name;
	}
	
	int price(String msg) {
		int price = scan.ask(msg);
		return price;
	}

}
