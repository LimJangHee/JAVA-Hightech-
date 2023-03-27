package kr.ac.kpo.day0327.except;

import java.util.Random;

public class ExceptionMain04 {

	public static void main(String[] args) {

		System.out.println(" ==== start ====");

		Random r = new Random();
		int random = r.nextInt(3);

		try { 
			System.out.println("random : " + random);
			System.out.println(10 / random);
			
			String str = "hello";
			System.out.println(str.charAt(5)); 
		} catch(Exception e) { //모든 예외 클래스들은 Exception클래스를 상속받고 있기때문에 묵시적 형변환을 통해서 호출 
			e.printStackTrace();
		}
		

		System.out.println(" ==== end ====");
	}

}
