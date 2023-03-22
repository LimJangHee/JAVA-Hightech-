package Homework.day0322;

public class Area {
	//ScannerUtil instance 생성
	ScannerUtil scan = new ScannerUtil();
	
	//각 도형별 instance 생성 
	Circle c = new Circle();
	Rectangle r = new Rectangle();
	Square s = new Square();
	Triangle t = new Triangle();
	
	//입력받은 변,높이,반지름의 길이를 저장할 변수 생성
	int num01;
	int num02;
	
	//호출시 도형의 넓이를 구해주는 메소드
	void calcArea() {
		System.out.println("1.삼각형 2. 정사각형 3. 직사각형 4. 원");
		
		//입력받은 숫자를 저장하여 숫자에 해당하는 도형별 넓이 결과값 출력
		int num = scan.select("면적을 구할 도형에 해당하는 번호를 선택하세요");
		if (num == 1) {
			num01 = scan.select("한변의 길이를 입력하세요");
			num02 = scan.select("높이를 입력하세요");
			t.printArea2(num01, num02);
			
		}
		if (num == 2) {
			num01 = scan.select("한변의 길이를 입력하세요");
			s.printArea(num01);
			
		}
		if (num == 3 ) {
			num01 = scan.select("한변의 길이를 입력하세요");
			num02 = scan.select("다른한변의 길이를 입력하세요");
			r.printArea2(num01, num02);
			
		}
		if(num == 4) {
			num01 = scan.select("반지름의 길이를 입력하세요");
			c.printArea(num01);
			
		}
		
	}

}
