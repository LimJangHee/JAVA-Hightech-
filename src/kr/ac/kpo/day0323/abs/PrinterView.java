package kr.ac.kpo.day0323.abs;

import java.util.Scanner;

public class PrinterView {
	
	
	private Scanner sc = new Scanner(System.in);
	
	public void work() {
		
		System.out.print("출력할 프린터를 선택하세요(1. LG 2. Samsung) : ");
		int choice = sc.nextInt();
		sc.nextLine(); //버퍼 비우기용
		
		//*********************** 중요 ***************************************
		//부모의 클래스 변수 = new 자식의 클래스() 매우 중요!!! -> 하나의 변수로 인스를 여러개 생성할 수 있다는 장점!!
		Printer p = null;//부모 클래스로 인스 변수를 생성하고 null값을 집어넣음
		switch(choice) { //각 케이스별로 인스 생성을 하며 변수는 동등하게 적용
		case 1:
			p = new LGPrinter();
			break;
		case 2: 
			p = new SamsungPrinter();//
			break;
		default :
			System.out.println("잘못입력하셨습니다");
		}
		if(p != null) {// choice에 있는 경우에만 출력하게 해줌
			p.print();// 같은 변수 p로 생성해줬기 때문에 case밖으로 빼서 호출 가능해짐
		}
	}

}
