package Homework.day0320;

import java.util.Scanner;

public class QuestionMain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("하나의 문자를 입력해주세요 : ");
		char ch = sc.next().charAt(0);
		
		StringUtil su = new StringUtil();
		su.isUpperChar(ch);
		su.isLowerChar(ch);
		
		System.out.println("두개의 숫자를 입력해주세요 : ");
		int num01 = sc.nextInt();
		int num02 = sc.nextInt();
		int max = su.max(num01, num02);
		System.out.println(max + "가 더 큽니다.");
		int min = su.min(num01, num02);
		System.out.println(min + "가 더 작습니다.");
		
		System.out.println("문자열을 입력해주세요.");
		String line = sc.nextLine();
		su.reverseString(line);
		String newline = su.toUpperString(line);
		System.out.println("대문자로 출력 : " + newline);
		newline = su.toLowerString(line);
		System.out.println("소문자로 출력 : " + newline);
		
		System.out.println("문자열 두개를 입력해주세요.");
		String str01 = sc.nextLine();
		String str02 = sc.nextLine();
		su.compareTo(str01, str02);
		
		System.out.println("문자열을 입력해주세요.");
		String str03 = sc.nextLine();
		System.out.println("검색할 문자열을 입력해주세요.");
		String sub01 = sc.nextLine();
		boolean result = su.endsWith(str03, sub01);
		System.out.println("검색할 문자열로 끝나는지 여부 : " + result);
		
		System.out.println("문자열을 입력해주세요.");
		String str04 = sc.nextLine();
		System.out.println("검색할 문자열을 일력해주세요.");
		String sub02 = sc.nextLine();
		int location = su.index(str04, sub02);
		System.out.println(sub02 + "은 " + location + "번지에 위치함");

	}

}
