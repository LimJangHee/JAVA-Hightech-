package kr.ac.kpo.day0306;

/*
  	출력메소드 System.out.출력메소드() -> 상수값들을 화면에 출력하는게 목적
  	print()   : 개행문자(x)
  	println() : 개행문자(o)
  	printf()  : 
 */

public class PrintMain {
	
	public static void main(String[] args) {
		
		System.out.print(10); //출력만 하는 메소드(개행 안함)
		System.out.print(12.34);
		
		System.out.println(10); //출력하고 개행하는 메소드
		System.out.println(12.34);
		
		// '3'   : 숫자가 아닌 문자 3
		// '\n'  : 개행문자
		// '\t'  : tap
		// '\\'  : 역슬러시
		// "3"   : 숫자가 아닌 문자열 3
		
		System.out.println('A'); // = System.out.print('A') + System.out.print('\n') = System.out.print("A\n")
		
		// 10 12.34 홍길동
		System.out.print(10);
		System.out.print(' ');
		System.out.print(12.34);
		System.out.print(' ');
		System.out.print("홍길동");
		
		// 'A' = '\u0041' -> 유니코드를 의미하며 뒤는 16진수를 사용
		// 문자열이 아닌 문자를 사용할 경우 아스키(유니)코드로 인식해서 결과값이 숫자로 나옴
		System.out.println(10 + " " + 12.34 + " " + "홍길동");
		
		
	}

}
