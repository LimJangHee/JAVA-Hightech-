package Homework.day0310;

import java.util.Scanner;

// 물건값을 입력하고, 돈을 지불했을 때 거스름돈과 잔액을 표시하는 코드를 작성하시오

public class QuestionMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("물건값을 입력해주세요. : ");
		int cost = sc.nextInt();
		
		System.out.println("지불한 돈을 입력해주세요. : ");
		int pay = sc.nextInt();
		
		if(pay > cost) {
			System.out.println("거스름돈 : " + (pay - cost) + "개");
			System.out.println("1000원 : " + (pay - cost) / 1000 + "개");
			System.out.println("500원 : " + ((pay - cost) % 1000) / 500 + "개");
			System.out.println("100원 : " + (((pay - cost) % 1000) % 500) / 100 + "개");
			System.out.println("50원 : " + ((((pay - cost) % 1000) % 500) % 100) / 50 + "개");
			System.out.println("10원 : " + (((((pay - cost) % 1000) % 500) % 100) % 50) / 10 + "개");
		}
		else {
			System.out.println((cost - pay) + "원이 부족합니다.");
		}
			
		
		
		
		
	}

}
