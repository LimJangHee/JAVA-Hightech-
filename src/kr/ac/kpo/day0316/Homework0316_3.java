package kr.ac.kpo.day0316;

import java.util.Scanner;

public class Homework0316_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int errCnt = 0;
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d\'s score : ", i + 1);
			score[i] = sc.nextInt();
		}

		System.out.println("NO\tScore\tGrade");
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 0 && score[i] <= 100) {
				sum = sum + score[i];

				char grade;
				switch (score[i] / 10) {
				case 10:
				case 9:
					grade = 'A';
					break;
				case 8:
				case 7:
				case 6:
				default:
				}
				System.out.print(i + 1 + "\t" + score[i] + "\t");
			} else {
				System.out.println(i + 1 + "\tError!!!");
				++errCnt;
			}
		}
		System.out.printf("", errCnt);
		System.out.println();
		System.out.println((double)sum / score.length);

	}

}
