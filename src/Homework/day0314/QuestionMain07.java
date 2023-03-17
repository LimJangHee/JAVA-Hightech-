package Homework.day0314;

import java.util.Scanner;

public class QuestionMain07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작단과 종료단을 입력해주세요."); 
		
		int num01 = sc.nextInt();
		int num02 = sc.nextInt();
		
		int max, min;
		
		if(num02 > num01) {
			max = num02;
			min = num01;
		}
		else {
			max = num01;
			min = num02;
		}
		
		for(int i = min; i<=max; i++) {
			
			System.out.println("*** " + i + "단 ***");
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			
		}
	}

}
