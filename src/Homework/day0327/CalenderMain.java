package Homework.day0327;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderMain {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		int selection = 1; // 1,2,3 항목 선택용 변수
		int year = 0, month = 0;// 년, 월 저장용 변수

		while (selection >= 1 && selection <= 3) {// 1 ~ 3을 선택하는 동안 계속 반복

			System.out.println("원하는 항목을 선택하세요 (1. 특정년도 2. 특정월 3. 종료)");
			selection = sc.nextInt();

			if (selection == 1) { // 1번을 선택했을시
				System.out.println("년도를 선택하세요 : ");
				year = sc.nextInt();
				for (int i = 0; i <= 11; i++) { // 1~12월
					System.out.println(year + "년" + (i + 1) + "월");
					System.out.println("일\t월\t화\t수\t목\t금\t토");
					c.set(year, i, 1); // 입력받은 년도와 반복되는 월의 1일로 세팅
					// 해당 날짜의 요일이 2(월)~7(토)에 해당하는경우 그 수의 -1만큼의 공백을 생성
					if (c.get(Calendar.DAY_OF_WEEK) >= 2 && c.get(Calendar.DAY_OF_WEEK) <= 7) {
						for (int j = 1; j < c.get(Calendar.DAY_OF_WEEK); j++) {
							System.out.print("\t");
						}
					}
					// 지정된 월의 최고 일수까지 반복
					for (int k = 1; k <= c.getActualMaximum(Calendar.DAY_OF_MONTH); k++) {
						c.set(year, i, k); // 1일씩 올리며 날짜를 세팅
						System.out.print(k + "\t");// 해당 일수를 출력
						if (c.get(Calendar.DAY_OF_WEEK) == 7) {// 만약 해당 날짜가 토요일인 경우 다음열로
							System.out.println();
						}
						if (k == c.getActualMaximum(Calendar.DAY_OF_MONTH)) {// 최고일수까지 출력후 빈줄 생성
							System.out.println();
							System.out.println();
						}
					}

				}

			}
			if (selection == 2) {// 2번을 선택했을시
				System.out.println("월을 입력하세요 : ");
				month = sc.nextInt();
				System.out.println("2023년 " + month + "월");
				System.out.println("일\t월\t화\t수\t목\t금\t토");
				c.set(2023, month - 1, 1);// 입력받은 월의 1일로 세팅
				// 해당 날짜의 요일이 2(월)~7(토)에 해당하는경우 그 수의 -1만큼의 공백을 생성
				if (c.get(Calendar.DAY_OF_WEEK) >= 2 && c.get(Calendar.DAY_OF_WEEK) <= 7) {
					for (int i = 1; i < c.get(Calendar.DAY_OF_WEEK); i++) {
						System.out.print("\t");
					}
				}
				// 입력받은 월의 최고 일수까지 반복
				for (int j = 1; j <= c.getActualMaximum(Calendar.DAY_OF_MONTH); j++) {
					c.set(2023, month - 1, j); //1일씩 올리며 날짜를 세팅
					System.out.print(j + "\t");
					if (c.get(Calendar.DAY_OF_WEEK) == 7) {//토요일일경우 다음줄로 줄 바꿈
						System.out.println();
					}
					if (j == c.getActualMaximum(Calendar.DAY_OF_MONTH)) {
						System.out.println();
					}

				}

			}
			if (selection == 3) {// 3번을 선택했을시 반복문 탈출
				System.out.println("종료하였습니다.");
				break;
			}
		}

	}
}
