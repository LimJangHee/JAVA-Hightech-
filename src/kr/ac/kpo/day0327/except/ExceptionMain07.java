package kr.ac.kpo.day0327.except;

import java.util.Scanner;

public class ExceptionMain07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("홀수를 입력 : ");
		int num = sc.nextInt();
		try {
			if (num % 2 != 1) {
				throw new OddMismatchException(num + " : 홀수가 아닙니다"); //
			}
			
			System.out.println("num = " + num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
