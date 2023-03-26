package kr.ac.kpo.day0323.abs;

public class SamsungPrinter extends Printer{
	
	public void samPrint() {
		System.out.println("삼성프린터에서 출력합니다...");
	}
	
	@Override
	public void print() {
		System.out.println("삼성프린터에서 출력중...");//혹은 위의 메소드 호출
	}

}
