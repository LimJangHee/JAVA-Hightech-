package kr.ac.kpo.day0313;

import java.util.Scanner;

public class HomeworkMain03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int min = num, max = num2;
		if(num > num2) {
			min = num2;
			max = num;
		}
		
		if(num3 < min) {
			System.out.println(num3 + " < " + min + " < " + max);
		}
		else if(num3 < max) {
			System.out.println(min + " < " + num3 + " < " + max);
		}
		else {
			System.out.println(min + " < " + max + " < " + num3);
		}
	}

}
