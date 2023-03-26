package Homework.day0322;

public class Square {
	
	int line;
	
	Square(){}
	Square(int line){
		this.line = line;
	}
	
	// 넓이 결과값만을 원하는 경우의 메소드
	double getArea(int line) {
		return  line * line;
	}
	
	// 넓이 결과값 출력을 원하는 경우의 메소드
	void printArea(int line) {
		double result = getArea(line);
		System.out.printf("한변의 길이가 %d인 정사각형의 넓이는 %.2f입니다.", line, result);
	}

}