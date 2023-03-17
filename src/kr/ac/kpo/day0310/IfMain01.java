package kr.ac.kpo.day0310;

import java.util.Scanner;

/*
 	보유하고 있는 책권수 입력 : 3
 	3 books
 	
 	보유하고 있는 책권수 입력 : 1
 	1 book
 */

// if문은 여러 초이스들 중 하나를 선택하는 경우 사용
public class IfMain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("보유하고 있는 책권수 입력 : ");//여기 이후에 scanner 참조 변수 선언 해주면?
		int book = sc.nextInt();
		
//		System.out.print(book + "book");
//		
//		if(book != 1) {
//			System.out.println("s");
//		}
		
//		System.out.println(book + (book == 1 ? "book" : "books")); 조건 연산자로 표현시
		
		if(book == 1) {
			System.out.println(book + "book");
		}
		else {
			System.out.println(book + "books");
		}
		
	}

}
