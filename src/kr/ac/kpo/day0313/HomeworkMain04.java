package kr.ac.kpo.day0313;

import java.util.Scanner;

public class HomeworkMain04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 4개를 입력 : ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		//방법 1
		int max01 = num > num2 ? num : num2; // 1번 2번을 비교해서 큰 값 대입 max01대입
		int max02 = num3; // 3번 4번을 비교해서 큰 값 max02에 대입
		if(num3 < num4) {
			max02 = num4;
		}
		
		System.out.println("가장 큰 수 : " + (max01 > max02 ? max01 : max02));
		
		//방법 2
		int max = num; // int max = num > num2 ? num : num2;
		if(num < num2) { // 1,2번 키교해서 큰거
			max = num2;
		}
		if(max < num3) {// 1,2 결과값과 3을 비교
			max = num3;
		}
		if(max < num4) {// 1~3 결과값과 4를 비교
			max = num4;
		}
		
		System.out.println("가장 큰 수 : " + max);
	}

}
