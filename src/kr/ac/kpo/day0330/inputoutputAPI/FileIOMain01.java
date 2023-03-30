package kr.ac.kpo.day0330.inputoutputAPI;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain01 {
	
	public static void main(String[] args) {
		
		System.out.println("문자를 입력하세요. ctrl+z 입력시 종료합니다.");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);//1바이트 단위로 들어온걸 모아서 char로 저장해주는 필터클래스(한글 입력시 사용)
		
		while(true) {
			try {
				int c = isr.read();
				
				if(c == -1) {
					break;
				}
				
				System.out.print((char)c);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
//		System.out.println("문자를 입력하세요. ctrl+z 입력시 종료합니다.");
//		InputStream is = System.in; //바이트 단위로 램에 입력
//		while(true) {
//			
//			try { //try친 후 ctrl + space + enter치면 자동으로 try catch만들어줌
//				int c = is.read(); //checked exception : 컴파일 시점에 예외처리를 해야됨(반드시 예외 처리를 해줘야됨)
//				if(c == -1) { //읽는것에 실패했을시 반환값이 -1
//					break;
//				}
//				System.out.println((char)c);//int타입으로 읽어온것을 char타입으로 변경
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}

}
