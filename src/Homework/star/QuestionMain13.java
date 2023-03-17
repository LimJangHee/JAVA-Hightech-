package Homework.star;

import java.util.Scanner;

public class QuestionMain13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int line = sc.nextInt();

		for (int i = 1; i <= line; i++) {
			if (line % 2 == 0) {
				if (i <= line / 2) {
					for (int j = line / 2; j >= 1; j--) {
						if (j - i > 0) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
					System.out.println();
				} else {
					for (int j = line / 2; j >= 1; j--) {
						if ((line + 1) - i < j) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
					System.out.println();
				}
			} else {
				if (i <= (line / 2) + 1) {
					for (int j = (line / 2) + 1; j >= 1; j--) {
						if (j - i > 0) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
					System.out.println();
				} else {
					for (int j = (line / 2) + 1; j >= 1; j--) {
						if ((line + 1) - i < j) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
					System.out.println();
				}
			}
		}
	}

}
