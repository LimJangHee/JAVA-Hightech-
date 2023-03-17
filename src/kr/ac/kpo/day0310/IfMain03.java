package kr.ac.kpo.day0310;

import java.util.Scanner;

public class IfMain03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("보유하고 있는 책권수 : ");
		int book = sc.nextInt();
		
		if(book == 0) { //다중 if문
			System.out.println("보유하고 있는 책 없음");
		}
		else if(book == 1){
			
			System.out.println(book + "book");
		}
		else {
			System.out.println(book + "books");
		}
					
	}

}
