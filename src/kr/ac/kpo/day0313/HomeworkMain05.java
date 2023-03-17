package kr.ac.kpo.day0313;

import java.util.Scanner;

public class HomeworkMain05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("보유하고 있는 책권수 입력 : ");
		int book = sc.nextInt();
		
		if(book < 0) {
			System.out.println("잘 못 입력했습니다.");
		}
		else if(book == 0) {
			System.out.println("보유하고 있는 책 없습니다.");
		}
		else if(book == 1) {
			System.out.println(book + " book");
		}
		else {
			System.out.println(book + " books");
		}
		
		switch(book) {
		case 0 : System.out.println("보유하고 있는 책 없습니다.");
				break;
		case 1 : System.out.println(book + " book");
				break;
		default : // 0x80000000 -> 1000 0000 0000 0000 0000 0000 0000 0000
				  // 16진수, 하나당 4bit(8421) 총 32bit
			switch(book & 0x80000000) { //부호비트가 0,1인지 비교해서 -> 11일때만 1이고 그외에는 다 0
			// 0이면 양수이고 1이면 음수
			case 0 : System.out.println(book + " books");
					break;
			default : System.out.println("잘 못 입력했습니다");		
			}
		
		
		}
	}

}
