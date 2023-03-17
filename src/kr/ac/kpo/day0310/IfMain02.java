package kr.ac.kpo.day0310;

import java.util.Scanner;

/*
 	보유하고 있는 책권수 입력 : 3
 	3 books
 	
 	보유하고 있는 책권수 입력 : 1
 	1 book
 	
 	보유하고 있는 책권수 입력 : 0
 	보유하고 있는 책 없음
 */
public class IfMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("보유하고 있는 책권수 : ");
		int book = sc.nextInt();
		
		if(book == 0) {
			System.out.println("보유하고 있는 책 없음");
		}
		else {
			
			if(book == 1) { //중첩된 if else문 -> 앞의 조건까지 포함되어 있다는 것 기억!!
				System.out.println(book + "book");
			}
			else {
				System.out.println(book + "books");
			}
			
		}
		
	}

}
