package Homework.star;

import java.util.Scanner;

public class QuestionMain17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int line = sc.nextInt();

		if (line % 2 != 0) {
			for (int i = 1; i <= line / 2; i++) {
				for (int j = 0; j < i; j++)
					System.out.print("*");
				for (int j = 0; j < line - 2 * i; j++)
					System.out.print(" ");
				for (int j = 0; j < i; j++)
					System.out.print("*");
				System.out.println();
			}
			for (int i = 0; i < line; i++) {
				System.out.print("*");
			}
			System.out.println();
			for (int i = 1; i <= line / 2; i++) {
				for (int j = 0; j < line / 2 - i + 1; j++)
					System.out.print("*");
				for (int j = 0; j < i * 2 - 1; j++)
					System.out.print(" ");
				for (int j = 0; j < line / 2 - i + 1; j++)
					System.out.print("*");
				System.out.println();
			}
		}
		else {
			for(int i=1; i<=line/2; i++){
			      for(int j=0; j<i; j++) System.out.print("*");
			      for(int j=0; j<line-2*i; j++) System.out.print(" ");
			      for(int j=0; j<i; j++) System.out.print("*");
			      System.out.println();
			    }
			    
			    for (int i = 0; i < line; i++) {
					System.out.print("*");
				}
				System.out.println();
			    
			    for(int i=1; i<=line/2; i++){
			      for(int j=0; j<line/2-i; j++) System.out.print("*");
			      for(int j=0; j<i*2; j++) System.out.print(" ");
			      for(int j=0; j<line/2-i; j++) System.out.print("*");
			      System.out.println();
			    }
			
		}
	}

}
