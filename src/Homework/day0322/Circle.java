package Homework.day0322;

//정사각형 클래스로 부터 상속받음
public class Circle extends Square{
	
	Circle(){
		super();
	}
	
	Circle(int line){
		super(line);
	}

	//부모 클래스의 메소드를 오버라이딩
	// 넓이 결과값만을 원하는 경우의 메소드
	@Override
	double getArea(int line) {
		return line * line * 3.14159;
	}
	
	// 넓이 결과값 출력을 원하는 경우의 메소드
	@Override
	void printArea(int line) {
		double result = getArea(line);
		System.out.printf("반지름의 길이가 %d인 원의 넓이는 %.2f입니다.", line, result);
	}

}
