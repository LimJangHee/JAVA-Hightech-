package kr.ac.kpo.day0316;

public class CarMain {
	
	public static void main(String[] args) {
		
		Car c = new Car(); //같은 패키지 안에 있어서 생략가능
		
		// new kr.ac.kpo.day07.TV() 다른 패키지에 있으서 풀 디렉토리로 불러와야됨
		
		// 참조변수명.멤버변수
		
		c.model = "소나타";
		c.price = 3000;
		
		Car c2 = new Car();
		
		c2.model = "모닝";
		c2.price = 1900;
		
		System.out.println("모델명 : " + c.model + ", 가격 :" + c.price + "만원");
		System.out.println("모델명 : " + c2.model + ", 가격 :" + c2.price + "만원");
	}

}
