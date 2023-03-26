package kr.ac.kpo.day0323;

public class LGPrinter extends Printer{
	
	private String model;
	
	public LGPrinter() {
		model = "LG프린터";
	}
	
	public void lgPrint() {
		System.out.println(model + "에서 출력중...");
	}

}
