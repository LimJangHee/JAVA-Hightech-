package Homework.day0321;

import java.util.Scanner;

public class ScannerUtil {
	
	Scanner sc = new Scanner(System.in);
	
	String nextStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
	
	char nextChar(String msg) {
		System.out.println(msg);
		return sc.nextLine().charAt(0);
	}

}
