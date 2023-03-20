package Homework.day0320;

public class StringUtil {
	
	char ch;
	/**
	 * 대문자일 경우 대문자 출력
	 * @param ch 입력받은 문자
	 */
	void isUpperChar(char ch) {
		this.ch = ch;
		if(Character.isUpperCase(ch)) {
			System.out.println(ch + "는 대문자입니다.");
		}
		
	}
	/**
	 * 소문자일 경우 소문자 출력
	 * @param ch 입력받은 문자
	 */
	void isLowerChar(char ch) {
		this.ch = ch;
		if(Character.isLowerCase(ch)) {
			System.out.println(ch + "는 소문자입니다.");
		}
		
	}
	/**
	 * 두개의 수를 입력받아 큰수를 반환
	 * @param num01 임의의 정수
	 * @param num02 임의의 정수
	 * @return 반환되는 더 큰 값
	 */
	int max(int num01, int num02) {
		int max;
		if(num01 >= num02) {
			max = num01;
		}
		else {
			max = num02;
		}
		return max;
		
	}
	/**
	 * 두개의 수를 입력받아 작은수를 반환
	 * @param num01 임의의 정수
	 * @param num02 임의의 정수
	 * @return 반환되는 더 작은 수
	 */
	
	int min(int num01, int num02) {
		int min;
		if(num01 <= num02) {
			min = num01;
		}
		else {
			min = num02;
		}
		return min;
	}
	/**
	 * 문자열을 입력받아 거꾸로 출력
	 * @param line 입력받는 문자열
	 */
	void reverseString(String line) {
		StringBuffer sb = new StringBuffer(line);
		String reverse = sb.reverse().toString();
		System.out.println("거꾸로 출력 : " + reverse);
		
	}
	/**
	 * 문자열을 입력받아 모두 대문자로 출력
	 * @param line 입력받는 문자열
	 * @return 모두 대문자로 변환 후 반환
	 */
	String toUpperString(String line) {
		String newline = line.toUpperCase();
		return newline;
	}
	/**
	 * 문자열을 입력받아 모두 소문자로 출력
	 * @param line 입력받는 문자열
	 * @return 모두 소문자로 변환 후 반환
	 */
	String toLowerString(String line) {
		String newline = line.toLowerCase();
		return newline;
	}
	/**
	 * 두개의 문자열을 입력받아 더 큰값을, 같으면 같다고 출력
	 * @param str01 입력받는 임의의 문자열
	 * @param str02 입력받는 임의의 문자열
	 */
	void compareTo(String str01, String str02) {
		if(str01.compareTo(str02) == 0) {
			System.out.println("두 문자열의 크기는 같습니다.");
		}else if(str01.compareTo(str02) > 0) {
			System.out.println(str01 + "문자열이 더 큽니다.");
		}else {
			System.out.println(str02 + "문자열이 더 큽니다.");
		}
	}
	/**
	 * 문자열을 입력받고 검색할 문자열을 입력받아 검색할 문자열로 끝나는지 여부 판단
	 * @param str03 검색받을 문자열 입력
	 * @param sub01 검색할 문자열 입력
	 * @return 검색할 문자열 있을시 true 없을시 false 반환
	 */
	boolean endsWith(String str03, String sub01) {
		boolean result = str03.endsWith(sub01);
		return result;
	}
	
	int index(String str04, String sub02) {
		int result = str04.indexOf(sub02);
		return result;
	}

}
