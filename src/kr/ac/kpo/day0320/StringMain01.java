package kr.ac.kpo.day0320;

import java.util.Arrays;

public class StringMain01 {
	
	public static void main(String[] args) {
		
		String str = new String();
		String str2 = new String("Hello");
		char[] chars = {'H', 'e', 'l', 'l', 'o'};
		String str3 = new String(chars);
		byte[] bytes = {72, 101, 108, 108, 111};
		String str4 = new String(bytes);
		
		System.out.println("str : [" + str + "]");
		System.out.println("str2 : [" + str2 + "]");
		System.out.println("str3 : [" + str3 + "]");
		System.out.println("str4 : [" + str4 + "]");
		
		System.out.println(str + "의 길이 : " + str4.length());
		for(int i=0; i<str4.length(); i++) {
			System.out.println(i + "번째 문자 :" + str4.charAt(i)); //배열이 아닌 문자열을 배열화 시켜서 가져옴
		}
		
		chars = new char[10];
		System.out.println("chars : " + Arrays.toString(chars));
//		str4.getChars(0, str4.length(), chars, 0);
		str4.getChars(2, 4, chars, 6); //2~4번째 전까지(2,3)을 6번째 배열부터 저장
		System.out.println("chars : " + Arrays.toString(chars));
	}

}
