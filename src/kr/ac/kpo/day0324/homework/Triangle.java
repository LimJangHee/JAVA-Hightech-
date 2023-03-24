package kr.ac.kpo.day0324.homework;

public class Triangle extends PlainFigure{
	
	public Triangle() {}
	
	public Triangle(int width, int height) {
		super(width, height);
		double area = width * height * 0.5;
		setArea(area);
	}
	
	@Override
	public void printArea() {
		System.out.printf("밑변 %d 높이 %d인 삼각형의 넓이 : %f\n", getWidth(), height, getArea());
	}

}
