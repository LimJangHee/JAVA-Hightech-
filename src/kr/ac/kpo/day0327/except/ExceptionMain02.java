package kr.ac.kpo.day0327.except;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {

		System.out.println(" ==== start ====");

		Random r = new Random();
		int random = r.nextInt(3);

		try { //try에서 예외 발생시 catch에서 이를 처리해주고 다음 문장을 실행
			System.out.println("random : " + random);
			System.out.println(10 / random);
		} catch (ArithmeticException ae) { //해당 수학상의 예외가 발생에 대해서 이를 ae라는 변수에 저장
			System.out.println("예외발생!!!");
			System.out.println(ae.getMessage()); //에러가 난 이유 메세지를 출력해줌
			ae.printStackTrace(); //에러가 난 부분을 찾아서 알려줌
		}
		System.out.println(" ==== end ====");
	}

}
