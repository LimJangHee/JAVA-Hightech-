package Homework.day0321.home;

public class IceCream {
	
	String name;
	int price;
	
	IceCream(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info() {
		System.out.println(name + "\t" + price);
	}

}