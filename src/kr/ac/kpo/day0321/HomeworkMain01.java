package kr.ac.kpo.day0321;

import java.util.Scanner;

public class HomeworkMain01 {
	
	public static void main(String[] args) {
		
		// Scanner sc  = new Scanner(System.in);
		ScannerUtil scan = new ScannerUtil();
		char c = scan.nextChar("문자를 입력 : ");
		
//		System.out.print("문자를 입력 : ");
//		char c = sc.nextLine().charAt(0); //문자열을 입력받아 첫번째 문자를 추출
		
		StringUtil util = new StringUtil();
		// 대문자여부 판단
		boolean bool = util.isUpperChar(c);
		if(bool) {
			System.out.println(c + " : 대문자가 맞습니다");
		} else {
			System.out.println(c + " : 대문자가 아닙니다");
		}
		
		int num01 = scan.nextInt("첫번째 정수를 입력 : ");
		int num02 = scan.nextInt("두번째 정수를 입력 : ");
		int maxNum = util.max(num01, num02);
		System.out.println(num01 + ", " + num02 + "중 큰수 : " + maxNum);
		
	}

}
