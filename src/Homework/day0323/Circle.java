package Homework.day0323;

//정사각형 클래스로 부터 상속받음
public class Circle extends Shape{
	
	Circle(){
		super();
	}
	
	Circle(int line1, int line2){
		super(line1, line2);
	}

	//부모 클래스의 메소드를 오버라이딩
	// 넓이 결과값만을 원하는 경우의 메소드
	@Override
	public double getArea(int line1, int line2) {
		return line1 * line2 * 3.14159;
	}
	
	// 넓이 결과값 출력을 원하는 경우의 메소드
	@Override
	public void printArea(int line1, int line2) {
		double result = getArea(line1, line2);
		System.out.printf("반지름의 길이가 %d인 원의 넓이는 %.2f입니다.", line1, result);
	}

}
