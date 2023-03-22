package Homework.day0322;

import java.util.Scanner;

public class ScannerUtil {
	 /*다른 클래스에서 ScannerUtil클래스의 메소드 호출을 통해 입력받을 값에대한 설명 출력과
		값을 입력받을 수 있도록 생성
	*/
	Scanner sc = new Scanner(System.in);
	
	int select(String msg) {
		System.out.println(msg);
		int num = sc.nextInt();
		return num;
				
	}
	

}
