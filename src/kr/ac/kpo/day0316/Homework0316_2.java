package kr.ac.kpo.day0316;

import java.util.Scanner;

public class Homework0316_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];

//		for (int i = 0; i < nums.length; i++) { do while은 for문 안에서 특정 식을 반복할때 사용하는 것이 좋음
//			do {
//				System.out.printf("num %d : ", i + 1);
//				nums[i] = sc.nextInt();
//			} while (nums[i] < 0 || nums[i] > 99);
//		}

//		for(int i=0; i<nums.length; i++) {
//			System.out.printf("num %d : ", i+1);
//			nums[i] = sc.nextInt();
//			if(nums[i] < 0 || nums[i] > 99) {
//				i--;
//			}
//		}

		for (int i = 0; i < nums.length;) { //for문에서 증감조건을 생략하고 밑에서 조건에 따라 증감할 수 있게 설정해줌
			System.out.printf("num %d : ", i + 1);
			nums[i] = sc.nextInt();
			if (nums[i] >= 0 && nums[i] <= 99) {
				i++;
			}
		}
		
		System.out.println("< PRINT >");
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		System.out.println("< REVERSE >");
		for(int i = nums.length-1; i >= 0; i--) {
			
			int n10 = nums[i] / 10;
			int n1 = nums[i] % 10;
			
			System.out.print(n1 * 10 + n10 + "\t");
		}
		System.out.println();
	}
}
