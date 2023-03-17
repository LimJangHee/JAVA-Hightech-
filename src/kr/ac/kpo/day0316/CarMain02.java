package kr.ac.kpo.day0316;

public class CarMain02 {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.model = "소나타";
		c.price = 3000;
		
		Car c2 = new Car();		
		c2.model = "모닝";
		c2.price = 1900;
		
		Car c3 = new Car();
		c3.model = "테슬라";
		c3.price = 8000;
		
		
		Car[] carArr = {c, c2, c3};
		
		for(int i=0; i<carArr.length; i++) {
			System.out.println("모델명 : " + carArr[i].model + ", 가격 : " + carArr[i].price + "만원");
		}
		
		//carArr배열의 n번째 배열의 멤버변수
		
		System.out.println("모델명 : " + c.model + ", 가격 :" + c.price + "만원");
		System.out.println("모델명 : " + c2.model + ", 가격 :" + c2.price + "만원");
	}

}
