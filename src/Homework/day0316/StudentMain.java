package Homework.day0316;

import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		Student st4 = new Student();
		Student st5 = new Student();

		Student[] studentArr = { st1, st2, st3, st4, st5 };

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < studentArr.length; i++) {
			System.out.print((i + 1) + "'s 성적 : ");
			studentArr[i].num = i + 1;
			studentArr[i].score = sc.nextInt();
		}
		System.out.println("< PRINT >");
		System.out.println("번호\t성적\t학점");

		int error = 0;
		int sum = 0;
		for (int i = 0; i < studentArr.length; i++) {

			System.out.print(studentArr[i].num + "\t");


			if (studentArr[i].score >= 0 && studentArr[i].score <= 100) {

				if (90 <= studentArr[i].score) {
					studentArr[i].grade = 'A';
				} else if (80 <= studentArr[i].score) {
					studentArr[i].grade = 'B';
				} else if (70 <= studentArr[i].score) {
					studentArr[i].grade = 'C';
				} else if (60 <= studentArr[i].score) {
					studentArr[i].grade = 'D';
				} else if (studentArr[i].score >= 0 && studentArr[i].score < 60) {
					studentArr[i].grade = 'F';
				}
				System.out.println(studentArr[i].score + "\t" + studentArr[i].grade);
				sum += studentArr[i].score;
			} else {
				System.out.println("ERROR!!");
				++error;
			}
		}
		System.out.println("\n5명 입력중 [" + error + "]회 에러발생");
		System.out.println("총점 : " + sum + "점");
		System.out.printf("평균 : %.1f점", (double) sum / 5);


	}
}
