package kr.ac.kpo.day0322.homework;

import kr.ac.kpo.day0321.ScannerUtil; //외부 패키지에서 클래스를 불러오는 경우

public class IceCreamMarket {
	
	void open() {
		
		ScannerUtil scan = new ScannerUtil();//외부 패키지에서 import를 통해 불러옴
		
		int cnt = scan.nextInt("아이스크림 몇개 구입할래?");
		IceCream[] iceArr = new IceCream[cnt]; //아이스크림이 몇개 필요한지에 대한 배열
											  //아이스크림 객체는 new를 통한 생성자를 통해서만 만들어짐
		
		for(int i=0; i<iceArr.length; i++) {
			System.out.printf("*** %d번째 아이스크림 구매정보 입력 ***\n", i+1);
			String name = scan.nextStr("아이스크림명 : "); //ScannerUtil파일 참고 -> 정수형 입력받을때 버퍼 지워주는거 확인
			int price = scan.nextInt("아이스크림가격 : ");
			
			iceArr[i] = new IceCream(name, price);
		}
		
		System.out.printf("< 총 %d개 아이스크림 구매정보 출력 >\n");
		System.out.println("--------------------------------");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		System.out.println("--------------------------------");
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println(i+1 + "\t" + iceArr[i].getName()
					 + "\t" + iceArr[i].getPrice());//외부에서 멤버변수를 직접 호출하는게 아닌 메소드를 통해서 호출
		}
		System.out.println("-----------------------------------");
		IceCream.totalInfo();
	}

}
