package Homework.day0310;

import java.util.Scanner;

// 3개의 정수를 입력받아 작은수에서 큰순서로 출력하는 코드를 작성하시오.

public class QuestionMain03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요. : ");
		int num01 = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하세요. : ");
		int num02 = sc.nextInt();
		
		System.out.println("세번째 정수를 입력하세요. : ");
		int num03 = sc.nextInt();
		
		if(num01 >= num02) {
			if(num01 >= num03) {
				if(num02 >= num03) {
					System.out.println(num01 + ">" + num02 + ">" + num03);
				}
				else {
					System.out.println(num01 + ">" + num03 + ">" + num02);
				}
			}
			else {
				System.out.println(num03 + ">" + num01 + ">" + num02);
			}
		}
		else {
			if(num02 <= num03) {
				System.out.println(num03 + ">" + num02 + ">" + num01 );
			}
			else {
				if(num01 >= num03) {
					System.out.println(num02 + ">" + num01 + ">" + num03);
				}
				else {
					System.out.println(num02 + ">" + num03 + ">" + num01);
				}
			}
		}
		
	}

}
