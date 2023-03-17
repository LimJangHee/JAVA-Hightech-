package kr.ac.kpo.day0309;

public class OperationMain02 {
	
	public static void main(String[] args) {
		
		int a = 0, b = 0;
		
		// boolean result = ++a > 1 && ++b >=0; //&&연산에서는 앞의 값이 거짓이면 뒤를 볼 필요도 없이 거짓이라 뒤에 연산을 하지 않음
											    //앞의 연산이 거짓이라 뒤에꺼는 보지도 않고 result값을 출력함
											    //즉 b연산은 아예 무시하고 넘어감(b증가하지 않음)
		
		boolean result = ++b >= 0 && ++a > 1; //앞의 연산이 참이라 뒤에 연산까지 함
											  //a,b 연산이 모두 적용됨
		System.out.printf("a = %d b = %d=\n", a, b);
	}

}