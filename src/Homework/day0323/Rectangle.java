package Homework.day0323;

//Square클래스로부터 상속받음
public class Rectangle extends Shape{
		
	Rectangle(){
		super();
	}
	
	Rectangle(int line1, int line2){
		super(line1, line2);
	}
	
	// 넓이 결과값만을 원하는 경우의 메소드
	@Override
	public double getArea(int line1, int line2) {
		return line1 * line2;
	}
	
	// 넓이 결과값 출력을 원하는 경우의 메소드
	@Override
	public void printArea(int line1, int line2) {
		double result = getArea(line1, line2);
		System.out.printf("한변의 길이가 %d, 다른 한변의 길이기 %d인 "
				+ "직사각형의 넓이는 %.2f입니다.", line1, line2, result);
	}
	
	

}