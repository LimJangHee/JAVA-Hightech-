package kr.ac.kpo.day0327.except;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain06 {

	public static void a() {

		System.out.println(" ==== a start ====");
		try {
			// 컴파일시점 예외처리/ checked Exception
			FileReader fr = new FileReader("a.txt"); // 하드디스크에 있는 특정 파일을 읽기 위해 사용
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		System.out.println(" ==== a end ====");
	}

	public static void b() throws NullPointerException { // b에서 해당 오류가 발생하게 되면 b를 호출한 호출자에게 떠넘기라는 뜻

		System.out.println(" ==== a start ====");
		String str = null;
		System.out.println("length : " + str.length());
		System.out.println(" ==== b end ====");
	}

	public static void main(String[] args) {

		try {
			b();
		} catch (NullPointerException e) {
			System.out.println("main 예외처리...");
			e.printStackTrace();
		}
		a();
	}

}
