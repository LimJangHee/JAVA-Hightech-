package Homework.day0315;

import java.util.Scanner;

public class QuestionMain01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];

		System.out.println("10개의 정수를 입력해주세요.");

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		System.out.println("<짝수>");
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] % 2 == 0) {
				System.out.printf("%d\t", ar[i]);
			}

		}

		System.out.println();
		
		System.out.println("<홀수>");
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] % 2 != 0) {
				System.out.printf("%d\t", ar[i]);
			}

		}

	}

}
