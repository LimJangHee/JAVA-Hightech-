package Homework.star;

import java.util.Scanner;

public class QuestionMain07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int line = sc.nextInt();
		
		for(int i=1; i<=line; i++) {
			for(int j=1; j<=line+1-i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
