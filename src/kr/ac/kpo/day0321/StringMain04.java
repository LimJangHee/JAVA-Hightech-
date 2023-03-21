package kr.ac.kpo.day0321;

public class StringMain04 {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		char ch = 'l';
		
		int idx = -1;
		while((idx = str.indexOf(ch, idx+1)) != -1) {
			System.out.println(ch + "위치 : " + idx);
		}
		
//		int idx = str.indexOf(ch, 0);
//		while(idx != -1) {
//			System.out.println(ch + "위치 : " + idx);
//			idx = str.indexOf(ch, idx+1);
//		}
	}

}
