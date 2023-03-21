package kr.ac.kpo.day0321;

import java.util.Scanner;

/**
 * 다양한 상수를 입려갑ㄷ을 수 있는 기능클래스
 * @author User
 *
 */

public class ScannerUtil {
	
	// Scanner sc = new Scanner(System.in);
	Scanner sc;
	
	ScannerUtil(){
		sc = new Scanner(System.in);
	}
	
	char nextChar(String msg) {
		System.out.print(msg);
		return sc.nextLine().charAt(0);
	}
	
	int nextInt(String msg) {
		System.out.print(msg);
		return sc.nextInt();
	}
	
	String nextStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}

}
