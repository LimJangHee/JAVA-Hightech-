package Homework.star;

import java.util.Scanner;

public class QuestionMain09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int line = sc.nextInt();
		
		for(int i=line; i>=1; i--) {
			for(int j=1; j<=line; j++) {
				if(j<i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
