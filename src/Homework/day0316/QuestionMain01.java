package Homework.day0316;

import java.util.Scanner;

public class QuestionMain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] primeArr = new int[10][20];
		
		System.out.println("정수를 입력하세요. 0 입력시 종료");
		for(int i=0; i < primeArr.length; i++) {
			int num = sc.nextInt();
			if(num == 0) break;
			for(int j = num, k = 0; j>=1; j--) {
				if(num % j == 0) {
					primeArr[i][k] = j;
					k++;
				}
			}
		}
		for(int i=0; i<primeArr.length; i++) {
			if(primeArr[i][0] != 0) {
				System.out.printf("%d의 약수 : ", primeArr[i][0]);
			}
			for(int j=0; j<=primeArr[i][0];) {
				if(primeArr[i][j]!=0) {
					System.out.print(primeArr[i][j]+" ");
					j++;
				}
				else {
					break;
				}
			}
			System.out.println();
		}
	}
	

}
