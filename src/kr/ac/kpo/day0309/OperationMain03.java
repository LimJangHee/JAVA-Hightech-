package kr.ac.kpo.day0309;

public class OperationMain03 {
	
	public static void main(String[] args) {
		
		int num01 = 12, num02 = 5; // 초기화 하지 않은 변수를 맨 앞에 두는 습관을 가질 것
		// ex) int num03, num01 = 12, num02 = 5;
		
		boolean bool = (num02 != 0 && num01 % num02 == 0);
		// 만약 나누는 값(분모)가 0이면 Exception에러 발생, 그래서 &&를 활요해서 조건을 달아줌
		// num02가 0이 아니면 앞의 식이 참이기 때문에 뒤에 식까지 넘어감
		// num02가 0이면 앞의 식이 거짓이기 때문에 뒤에 식을 계산하지 않고 넘어감
		
		System.out.printf("%d는 %d의 배수판단 : %b\n", num01, num02, bool);
	}

}
