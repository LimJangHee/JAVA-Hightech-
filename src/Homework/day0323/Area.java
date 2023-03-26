package Homework.day0323;

public class Area {
	//ScannerUtil instance 생성
	ScannerUtil scan = new ScannerUtil();
	
	//입력받은 변,높이,반지름의 길이를 저장할 변수 생성
	private int num01;
	private int num02;
	
	//호출시 도형의 넓이를 구해주는 메소드
	void calcArea() {
		System.out.println("1.삼각형 2. 정사각형 3. 직사각형 4. 원");
		
		//입력받은 숫자를 저장하여 숫자에 해당하는 도형별 넓이 결과값 출력
		int num = scan.select("면적을 구할 도형에 해당하는 번호를 선택하세요");
		
		Shape sh = null;
		switch(num) {
		case 1:
			sh = new Triangle();
			num01 = scan.select("한변의 길이를 입력하세요");
			num02 = scan.select("높이를 입력하세요");
			break;
		case 2:
			sh = new Square();
			num01 = scan.select("한변의 길이를 입력하세요");
			num02 = num01;
			break;
		case 3:
			sh = new Rectangle();
			num01 = scan.select("한변의 길이를 입력하세요");
			num02 = scan.select("다른한변의 길이를 입력하세요");
			break;
		case 4:
			sh = new Circle();
			num01 = scan.select("반지름의 길이를 입력하세요");
			num02 = num01;
			break;
		default:
			System.out.println("잘 못 입력하였습니다");
		
		}
		if(sh != null) {
			sh.printArea(num01, num02);
		}
		
			
		
		
	}

}