package kr.ac.kpo.day0310;

public class OperationMain05 {
	
	public static void main(String[] args) {
		
		//비트 연산
		int num = 0x0055ff00;
		
		System.out.printf("%x\n", num); //x:16진수
		System.out.printf("%x\n", ~num); //~:비트반전
		System.out.printf("%08x\n", num & 0xffff0000);
		System.out.printf("%08x\n", num | 0x0000ffff);
	}

}
