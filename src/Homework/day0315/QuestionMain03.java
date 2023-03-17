package Homework.day0315;

import java.util.Scanner;

public class QuestionMain03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		String[] grade = new String[5];
		int error = 0;
		double sum = 0;

		System.out.println("성적을 입력해주세요.");

		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			if (90 <= score[i] && score[i] <= 100) {
				grade[i] = "A";
			} else if (80 <= score[i] && score[i] <= 89) {
				grade[i] = "B";
			} else if (70 <= score[i] && score[i] <= 79) {
				grade[i] = "C";
			} else if (60 <= score[i] && score[i] <= 69) {
				grade[i] = "D";
			} else if (0 <= score[i] && score[i] <= 59) {
				grade[i] = "F";
			} else {
				score[i] = 0;
				grade[i] = "ERROR!!";
				error++;
			}

		}

		System.out.println("< PRINT >");
		
		System.out.printf("%s\t %s\t %s\n", "번호", "성적", "학점");
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d\t %d\t %s\n", i + 1, score[i], grade[i]);
		}
		
		System.out.println();
		System.out.println("5명 입력 중 [" + error + "]회 에러발생");
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		System.out.println("총점 : " + sum + "점" );
		System.out.println("평균 : " + (sum / score.length) + "점");

	}

}
