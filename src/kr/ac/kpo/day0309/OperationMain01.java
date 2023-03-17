package kr.ac.kpo.day0309;

public class OperationMain01 {

	public static void main(String[] args) {

		int num = 123;
		
		num = num + 1; // 대입 연산자 처리 순서가 제일 느림
		
		num += 50; // 변수를 한번만 쓰기 위해서 줄인것(더한 다음 대입하라) -> 복합대입연산자, 배정연산자
		
		++num; // num 변수의 값을 1씩 증가(증감 연산자)
		
		System.out.println("num : " + num);
		
		int a = 10;
		
		System.out.println(++a); //증가를 하고 a값을 출력하라
		System.out.println(a++); //a를 먼저 출력하고 증가를 하라
	}

}
