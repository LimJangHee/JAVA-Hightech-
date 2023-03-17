package Homework.day0315;

import java.util.Scanner;

public class QuestionMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[5];
		
		System.out.println("5개의 정수를 입력해주세요.");
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			System.out.println("num" + (i+1) + " : " + ar[i]);
			if(ar[i]<0 || ar[i]>100) {
				i--;
			}
			
		}
		
		System.out.println("< PRINT >");
		for(int i=0; i< ar.length; i++) {
			System.out.printf("%d\t", ar[i]);
		}
		
		System.out.println();
		System.out.println("< Reverse >");
		for(int i=ar.length-1; i>=0; i--) {
			System.out.printf("%d\t", (ar[i]/10 + (ar[i]%10)*10));
		}
	}

}
