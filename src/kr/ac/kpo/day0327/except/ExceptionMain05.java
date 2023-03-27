package kr.ac.kpo.day0327.except;

import java.util.Random;

public class ExceptionMain05 {

	public static void main(String[] args) {

		System.out.println(" ==== start ====");
		try {
			String str = null;
			System.out.println("length : " + str.length());
			
			return; //return을 만나면 반환하고 종료하기 때문에 end은 출력하지 않지만 fianlly에 있는것은 출력해줌
		} catch (Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
		} finally { //예외가 발생하던 발생히지 않던 무조건 실행
			System.out.println("무조건 실행됩니다");
		}
		System.out.println("==== end ====");
	}
}
