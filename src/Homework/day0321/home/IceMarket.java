package Homework.day0321.home;

import java.util.Scanner;

public class IceMarket {
	
	IceCream[] iceArr;
	Scanner sc = new Scanner(System.in);
	
	int getInt(String msg) {
		System.out.println(msg);
		int num = sc.nextInt();
		return num;
	}
	
	String getStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
	
	void buy() {
		int cnt = getInt("아이스크림 몇개 구입할래?");
		iceArr = new IceCream[cnt];
		
		for(int i=0; i<iceArr.length; i++) {
			System.out.println("*** " + (i+1) +"번째 아이스크림 구매 정보 입력 ***");
			String name = getStr("아이스크림 명 : ");
			int price = getInt("아이스크림 가격 : ");
			iceArr[i] = new IceCream(name, price);
		}
	}
	
	void display() {
		System.out.println(" < 총 " + iceArr.length + "개의 아이스크림 구매 정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		for(int i=0; i < iceArr.length; i++) {
			System.out.println(i+1 + "\t");
			iceArr[i].info();
		}
	}
	
	void process() {
		buy();
		display();
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> 196139048a225774d88807c4afc5b7f3ae8fc85f
