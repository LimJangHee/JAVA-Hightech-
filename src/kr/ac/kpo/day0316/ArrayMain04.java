package kr.ac.kpo.day0316;

import java.util.Arrays;

public class ArrayMain04 {
	
	public static void main(String[] args) {
		
		int loc = 0;
		
		// "하이테크" "자바" "교육"
//		String[] strArr = {"하이ㅏ테크", "자바", "교육"};
		String[] strArr = new String[5];
		strArr[loc++] = "하이테크"; //loc변수를 통해서 index를 자동으로 조정 -> 추가 및 삭제시 알아서 index 매겨줌 
		strArr[loc++] = "인공지능";
		strArr[loc++] = "자바";
		strArr[loc++] = "교육";
		
		System.out.println("< index 이용 출력 >");
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("< 1.5버전 for 출력>");
		for(String str : strArr) {
			System.out.println(str);
		}
		
		System.out.println("< Arrays.toString() 이용 출력 >"); //배열에 있는 모든 요소들을 하나의 문자열로 만듬
		System.out.println(Arrays.toString(strArr));
		
		
	}

}
