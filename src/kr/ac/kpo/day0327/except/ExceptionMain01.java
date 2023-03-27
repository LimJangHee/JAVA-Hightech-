package kr.ac.kpo.day0327.except;

import java.util.Random;

public class ExceptionMain01 {
	
	public static void main(String[] args) {
		
		System.out.println(" ==== start ====");
		
		Random r = new Random();
		int random = r.nextInt(3);
		
		System.out.println("random : " + random);
		System.out.println(10 / random); //0이 나오면 오류발생, 이 이후의 문장들은 실행되지 않고 강제종료
		
		System.out.println(" ==== end ====");
	}

}
