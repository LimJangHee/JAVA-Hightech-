package kr.ac.kpo.day0322.homework;

public class IceCream {
	
	String name;
	int price;
	static int total;
	
	IceCream(){}
	
	IceCream(String name, int price){
		this.name = name;
		this.price = price;
		IceCream.total += price;
	}
	
	public String getName() { //외부에서 멤버변수를 직접 호출하는게 좋은 방법이 아니기 때문에 출력하는 메소드를 만들어줌
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public static void totalInfo(){ //객체 생성과 상관없이 total값을 확인하기 위해 static으로 생성
		System.out.println("총" + total + "개");
	}

}
