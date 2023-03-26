package Homework.day0322;

//Square클래스로부터 상속받음
public class Rectangle extends Square{
	
	int line2;
	
	Rectangle(){
		super();
	}
	
	Rectangle(int line, int line2){
		super(line);
		this.line2 = line2;
	}
	
	// 넓이 결과값만을 원하는 경우의 메소드
	double getArea2(int line, int line2) {
		return line * line2;
	}
	
	// 넓이 결과값 출력을 원하는 경우의 메소드
	void printArea2(int line, int line2) {
		double result = getArea2(line, line2);
		System.out.printf("한변의 길이가 %d, 다른 한변의 길이기 %d인 "
				+ "직사각형의 넓이는 %.2f입니다.", line, line2, result);
	}
	
	

}