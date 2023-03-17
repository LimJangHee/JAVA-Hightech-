package Homework.day0310;

import java.util.Scanner;

// 4개의 정수를 입력받아 가장 큰수를 출력하는 코드를 작성하시오.

public class QuestionMain04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요. : ");
		int num01 = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하세요. : ");
		int num02 = sc.nextInt();
		
		System.out.println("세번째 정수를 입력하세요. : ");
		int num03 = sc.nextInt();
		
		System.out.println("네번째 정수를 입력하세요. : ");
		int num04 = sc.nextInt();
		
		if(num01 >= num02 && num01 >= num03 && num01 >= num04) {
			System.out.println("가장 큰 수 : " + num01);
		}
		else if(num02 >= num01 && num02 >= num03 && num02 >= num04) {
			System.out.println("가장 큰 수 : " + num02 );
		}
		else if(num03 >= num01 && num03 >= num02 && num03 >= num04) {
			System.out.println("가장 큰 수 : " + num03);
		}
		else {
			System.out.println("가장 큰 수 : " + num04);
		}
		
			
	}

}
