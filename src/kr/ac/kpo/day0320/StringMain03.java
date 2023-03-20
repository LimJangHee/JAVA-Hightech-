package kr.ac.kpo.day0320;

public class StringMain03 {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		char ch = 'r';
		
		System.out.println("str : [" + str + "]");
		int idx = str.indexOf(ch);
		System.out.println(ch + "위치 : " + str.indexOf(idx));
		
		ch = 'p';
		System.out.println(ch + "위치 : " + str.indexOf(ch)); //값이 없을 경우 -1로 출력
		
		String searchStr = "lo";
		System.out.println(searchStr + "위치 : " + str.indexOf(searchStr));
		
		ch = 'l';
		System.out.println(str.indexOf(ch)); //앞에서부터
		System.out.println(str.indexOf(ch,3)); //3번째부터
		System.out.println(str.lastIndexOf(ch)); //뒤에서부터
	}

}
