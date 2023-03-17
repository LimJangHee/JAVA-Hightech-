package kr.ac.kpo.day0310;

/*
 
 */

public class OperationMain04 {
	
	public static void main(String[] args) {
		
		int num01 = 15, num02 = 3;
		
		boolean bool = (num02 != 0 && num01 % num02 == 0);
		
		String result = bool ? "배수입니다" : "배수가 아닙니다";
		
		System.out.printf("%d는 %d의 배수판단 : %s\n", num01, num02, result);
		
		
		// 조건? true일경우 : flase일경우
//		String msg = true ? "배수" : "배수아님";
//		System.out.println(false? "배수다" : "배수가 아니다" );
	}

}
