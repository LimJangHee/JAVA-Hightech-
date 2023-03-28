package kr.ac.kpo.day0328.homework;

import java.util.Scanner;

public class CalendarView { //기능 클래스

	private Scanner sc;
	private CalendarUtil util; 

	public CalendarView() { //인스 생성시 객첵를 생성하는 방식
		sc = new Scanner(System.in);
		util = new CalendarUtil();
	}

	public int scanInt(String msg) {

		System.out.print(msg);
		int type = sc.nextInt();
		sc.nextLine();

		return type;

	}

	public void process() {
		while (true) {
			int type = scanInt("항목을 선택하세요(1.특정년도  2.특정월  3.종료) => ");
			switch (type) {
			case 1:
				int year = scanInt("년도를 입력 : ");
				util.showByYear(year);
				break;
			case 2:
				year = scanInt("년도를 입력 : ");
				int month = scanInt("월을 입력 : ");
				util.showByMonth(year, month);
				break;
			case 3:
				System.out.println("달력서비스를 종료합니다");
				System.exit(0); //소프트웨어를 종료시킴, 0은 정상적으로 종료시킴을 나타냄
			}
		}
	}
}
