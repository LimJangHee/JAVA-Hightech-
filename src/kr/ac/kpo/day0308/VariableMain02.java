package kr.ac.kpo.day0308;

public class VariableMain02 {

	public static void main(String[] args) {
		
		double num = 12.34;
		
		num = (double)34; // double형으로 선언을 해줬기 때문에 정수형인 34는 오류가 뜸
						  // 그래서 ()34를 통해서 괄호안의 자료형으로 형변환을 해줌
						  // 단 더 작은 자료형을 보다 큰 자료형으로 형변환을 할 시에는 묵시적으로 형 변환을 할 수 있음
						  // num = 34; 형변환을 따로할 필요 없음(묵시적형변환)
		
		System.out.println("num : " + num);
		
		int num2;
		num2 = (int)45.67; // 정수형으로 형변환시 소수점 부분은 버림
						   // 명시적(강제적)형변환
						   // 큰 자료형을 보다 작은 자료형으로 형변화을 할때는 강제적(명시적)으로 형변환을 해줘야 됨
		
		System.out.println("num2 : " + num2); 
		
		float num3;
		num3 = (float)10.4; //10.4f 플로트형 실수를 표현하는 방법
		System.out.println("num3 ; " + num3);
		
		System.out.println(12 + (int)12.34); //산술연산의 경우 데이터 타입이 달라도 알아서 큰 자료형으로 묵시적형변환해서 계산해줌
		System.out.println(12 + 12.34);
	}

}
