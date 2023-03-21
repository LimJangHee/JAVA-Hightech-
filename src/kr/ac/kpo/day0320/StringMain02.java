package kr.ac.kpo.day0320;

import java.util.Arrays;

public class StringMain02 {

	public static void main(String[] args) {

		String str01 = "Hello World";
		String str02 = "Hello World";

		if (str01 == str02) { // 주소비교
			System.out.println("str01 == str02");
		} else {
			System.out.println("str01 != str02");
		}

		// 문자열 값 비교, 대소문자를 구분함
		boolean bool = str01.equals(str02); 
		if (bool) { //참이면
			System.out.println("str01 == str02");
		} else {
			System.out.println("str01 != str02");
		}
		
		// 문자열 값 비교, 대소문자를 구분하지 않음
		bool = str01.equalsIgnoreCase(str02);
		if (bool) { //참이면
			System.out.println("str01 == str02");
		} else {
			System.out.println("str01 != str02");
		}
		
		String[] names = {"홍길동", "강길동", "홍실순", "홍길동", "김길순", "김길남", "길동홍"};
		
		System.out.println("names " + Arrays.toString(names));
		System.out.println("< 홍길동인 사람을 검색 >");
		for(String name : names){
			if(name.equals("홍길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 홍씨성을 가진 사람을 검색 >");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 이름 길동인 사람을 검색 >");
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 길동 이 포함된 사람을 검색 >");
		for(String name : names) {
			if(name.contains("길동")) {
				System.out.println(name);
			}
		}
		
		str01 = "banana";
		str02 = "boat";
		
		int cmp = str01.compareTo(str02);
		if(cmp == 0) {
			System.out.println(str01 + " == " + str02);
		} else if(cmp > 0) {
			System.out.println(str02 + " < " + str01);
		}else {
			System.out.println(str01 + " < " + str02);
		}
	}

}
