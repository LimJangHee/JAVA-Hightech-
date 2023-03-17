package Homework.day0310;

import java.util.Scanner;

// 반지름을 입력받아 원의 넓이과 둘레를 출력하는 코드 작성하시오  (소수점 4째짜리 출력)

public class QuestionMain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double pie = 3.14159;
		
		System.out.println("반지름을 입력해주세요. : ");
		double radius = sc.nextDouble();
		
		System.out.printf("원넓이 : %.4f\n", radius * radius * pie );
		System.out.printf("원둘레 : %.4f\n", 2 * radius * pie);
		
	}

}
