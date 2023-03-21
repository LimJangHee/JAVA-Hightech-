package Homework.day0321;

import java.util.Scanner;

public class ScannerUtil02 {
	
	Scanner sc = new Scanner(System.in);
	
	int ask(String msg) {
		System.out.println(msg);
		return sc.nextInt();
	}
	
	String name(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
}
