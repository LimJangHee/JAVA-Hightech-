package kr.ac.kpo.day0306;

public class ConstantMain {

	public static void main(String[] args) {
		
		 
		int secondNum = 123; //자료형 변수 = 저장값
		
		// firstNum = 200; 변수의 값은 언제나 변경 가능 -> 그래서 변수값을 고정하기 위해서 final을 사용
		final int FIRST_NUM = 10; //상수 변수 : final 선언이 되어있는 변수들은 변경 불가를 표시하기위해 대문자들로만 선언
		
		
		System.out.println(FIRST_NUM + secondNum);
				
		
	}

}
