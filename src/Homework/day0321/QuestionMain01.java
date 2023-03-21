package Homework.day0321;

public class QuestionMain01 {
	
	public static void main(String[] args) {
		
		StringUtil su = new StringUtil();
		ScannerUtil scan = new ScannerUtil();
		
		String str = scan.nextStr("문자열 입력");
		char ch = scan.nextChar("문자 입력");
		
		int an = StringUtil.checkChar(str, ch);
		System.out.println(ch + " 인 경우 : " + an);
		
		String an02 = StringUtil.removeChar(str, ch);
		System.out.println(ch + " 인 경우 : " + an02);
	}

}
