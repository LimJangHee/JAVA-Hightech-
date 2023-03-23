package Homework.day0323;

//Rectangle클래스로부터 상속받음
public class Triangle extends Shape{
	
	Triangle(){
		super();
	}
	Triangle(int line1, int line2){
		super(line1, line2);
	}
	
	//부모클래스 메소드 오버라이딩
	// 넓이 결과값만을 원하는 경우의 메소드
	@Override
	public double getArea(int line1, int line2) {
		return line1 * line2 * 0.5;
	}
	
	// 넓이 결과값 출력을 원하는 경우의 메소드
	@Override
	public void printArea(int line1, int line2) {
		double result = getArea(line1, line2);
		System.out.printf("한변의 길이가 %d, 높이가 %d인 "
				+ "삼각형의 넓이는 %.2f입니다.", line1, line2, result);
	}
}