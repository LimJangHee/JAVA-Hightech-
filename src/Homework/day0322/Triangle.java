package Homework.day0322;

//Rectangle클래스로부터 상속받음
public class Triangle extends Rectangle{
	
	Triangle(){
		super();
	}
	Triangle(int line, int line2){
		super(line, line2);
	}
	
	//부모클래스 메소드 오버라이딩
	// 넓이 결과값만을 원하는 경우의 메소드
	@Override
	double getArea2(int line, int line2) {
		return line * line2 * 0.5;
	}
	
	// 넓이 결과값 출력을 원하는 경우의 메소드
	@Override
	void printArea2(int line, int line2) {
		double result = getArea2(line, line2);
		System.out.printf("한변의 길이가 %d, 높이가 %d인 "
				+ "삼각형의 넓이는 %.2f입니다.", line, line2, result);
	}
}
