package kr.ac.kpo.day0323.abs;

public class LGPrinter extends Printer{
	
	private String model;
	
	public LGPrinter() {
		model = "LG프린터";
	}
	
	public void lgPrint() {
		System.out.println(model + "에서 출력중...");
	}
	
	@Override
	public void print() {
		System.out.println("LG프린터에서 출력중...");//혹은 위에 메소드를 호출
	}

}
