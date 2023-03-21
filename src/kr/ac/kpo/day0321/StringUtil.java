package kr.ac.kpo.day0321;

public class StringUtil {
	
	// 대문자 A~Z : 65~90
	boolean isUpperChar(char c) {
		if(c >= 'A' && c <= 'Z') { //그냥 대문자 넣어도 알아서 적용해줌
			return true;
		}
		return false;
		
	}
	
	boolean isLowerChar(char c) {
		if(c >= 'a' && c <= 'z') { 
			return true;
		}
		return false;
		
	}
	
	int max(int i, int j) {
		return i > j ? i : j;
	}
	
	String reverseString(String str) {
		
//		String revStr = "";
//		for(int i = str.length()-1; i >= 0; i--) {
//			revStr = revStr + str.charAt(i); //계속 연달아 붙여서 저장
//		}
//		return revStr;
		
		char[] chars = new char[str.length()];
		for(int i = str.length()-1, j = 0; i >= 0; i--) {
			chars[j++] = str.charAt(i);
		}
		String revStr = new String(chars);
		return revStr;
	}
	
	String toUpperString(String str) {
		
		String upperStr = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(isLowerChar(c)) { //소문자가 맞을경우
				c = (char)(c + ('A' - 'a')); //소문자를 대문자로 바꿔주기 위한 차이를 더해줌
			}
			upperStr = upperStr + c;
		}
		return upperStr;
	}
	
	int compareTo(String str, String str2) {
		
		int length = str.length() < str2.length() ? str.length() : str2.length();
		// 두개의 문자열 중에 더 작은 길이를 돌아가는 횟수로 지정
		for(int i = 0; i < length; i++) { //짧은 문자열 길이 기준 그 사이에 다른 값이 존재했을때 
			if(str.charAt(i) != str2.charAt(i)) {
				return str.charAt(i) - str2.charAt(i);
			}
		}
		if(str.length() == str2.length()) { //문자열이 완전 같았을때
			return 0;
		} else if(str.length() == length) { //짧은 문자열 길이 기준까지 모두 같았을때
			return -str2.charAt(length);
		}
		return str.charAt(length);
		
	}

}
