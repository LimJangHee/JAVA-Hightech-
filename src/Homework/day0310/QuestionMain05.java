package Homework.day0310;

import java.util.Scanner;

/*	다음의 결과를 보이는 코드를 if문 switch문으로 각각 작성하시오

	보유하고 있는 책권수 : 0
   보유하고 있는 책 없다
   
   보유하고 있는 책권수 : 1
   1 book
   
   보유하고 있는 책권수 : 3
   3 books
   
   보유하고 있는 책권수 : -3
   잘못입력했습니다
 */

public class QuestionMain05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("보유하고 있는 책권수를 입력하세요 : ");
		int book = sc.nextInt();
		
		if(book == 0) {
			System.out.println("보유하고 있는 책 없다.");
		}
		else if(book == 1) {
			System.out.println("1 book");
		}
		else if(book > 1) {
			System.out.println(book + " books");
		}
		else {
			System.out.println("잘 못 입력했습니다.");
		}
		
		switch(book) {
		
		case 0 : System.out.println("보유하고 있는 책 없다.");
				break;
		
		case 1 : System.out.println("1 book");
				break;
		
		default : System.out.println(book > 0 ? book + " books" : "잘 못 입력했습니다."  );
		}
		
	}

}
