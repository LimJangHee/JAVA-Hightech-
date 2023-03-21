package kr.ac.kpo.day0321;

public class HomeworkMain02 {
	
	public static void main(String[] args) {
		
		ScannerUtil scan = new ScannerUtil();
		StringUtil util = new StringUtil();
		
		String str = scan.nextStr("문자열을 입력 : ");
		String revStr = util.reverseString(str);
		System.out.println("str : " + str);
		System.out.println("revStr : " + revStr);
	}

}
