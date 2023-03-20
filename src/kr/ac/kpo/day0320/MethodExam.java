package kr.ac.kpo.day0320;

import java.util.Scanner;

/**
 * 총합을 구하는 클래스
 * 
 * @author Lim JangHee
 *
 */

public class MethodExam {

	/**
	 * 문서화 주석(*2개) 호출자메소드에서 받아온 두개의 정수 사이의 총합을 반환하는 메소드
	 * 
	 * @param num1 총합의 시작값
	 * @param num2 총합의 종료값
	 * @return num1~num2사이의 총합
	 */

	// 코드 미리 짜놓고 /**하면 알아서 해당 변수들에 대한 주석을 만들어줌

	public int getTotal(int num1, int num2) {

		int total = 0;
		for (int i = num1; i <= num2; i++) {
			total += i;
		}

		return total;
	}

	/**
	 * 단을 이용하여 구구단을 출력
	 * 
	 * @param dan 출력할 단
	 */
	public void printGugudan(int dan) {

		System.out.println("***" + dan + "단 ***");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + "=" + (dan * i));
		}
	}

	/**
	 * 구구단 전체를 출력
	 */
	public void printGugudan() {
		for (int i = 2; i <= 9; i++) {
//			System.out.println("***" + i + "단 ***");
//			for (int j = 1; j <= 9; j++) {
//			System.out.println(i + " * " + j + "=" + (i * j));			
//			}
			printGugudan(i);
		}
	}
	
	/**
	 * 키보드로 단을 입력받아 반환
	 * @return 입력받은 단
	 */
	public int getDan() {
		
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		return dan;
		
	}
	
	/**
	 * 시작단 ~ 종료단 구구단 출력
	 * @param startDan 시작단
	 * @param endDan   종료단
	 */
	public void printGugudan(int startDan, int endDan) {
		
		for(int dan=startDan; dan <= endDan; dan++) {
			printGugudan(dan);
		}
	}

}
