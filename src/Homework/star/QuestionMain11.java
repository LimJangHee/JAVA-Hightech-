package Homework.star;

import java.util.Scanner;

public class QuestionMain11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int line = sc.nextInt();

		for (int i = 1; i <= line; i++) {
			if (line % 2 == 0) {
				if (i <= line / 2) {
					for (int j = line / 2; i <= j; j--) {
						System.out.print('*');
					}
					System.out.println();
				} else {
					for (int k = line / 2; i - k > 0; k++) {
						System.out.print('*');
					}
					System.out.println();
				}
			} else {
				if (i <= (line / 2) + 1) {
					for (int j = (line / 2) + 1; i <= j; j--) {
						System.out.print('*');
					}
					System.out.println();
				} else {
					for (int k = line / 2; i - k > 0; k++) {
						System.out.print('*');
					}
					System.out.println();
				}

			}
		}
	}

}
