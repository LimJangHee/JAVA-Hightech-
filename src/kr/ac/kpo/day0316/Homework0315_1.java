package kr.ac.kpo.day0316;

import java.util.Scanner;

public class Homework0315_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			System.out.println("num " + (i + 1) + ":");
			nums[i] = sc.nextInt();
		}

//		System.out.println("< 짝수 >");
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] % 2 == 0) {
//				System.out.print(nums[i] + " ");
//			}
//		}
//		System.out.println();
//		
//		System.out.println("< 홀수 >");
//		for (int num : nums) {
//			if (num % 2 == 1) {
//				System.out.print(num + " ");
//			}
//		}
//		System.out.println();

		for (int mod = 0; mod < 2; mod++) { // 나머지를 기준으로 반복문 생성
			System.out.printf("<< %s>>", mod == 0 ? "짝수" : "홀수");
			for (int num : nums) {
				if (num % 2 == mod) {
					System.out.println(num + " ");
				}
			}
			System.out.println();
		}
	}

}
