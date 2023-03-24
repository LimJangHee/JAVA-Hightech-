package kr.ac.kpo.day0324.inter;

public class Rectangle extends PlainFigure {

	protected String name;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		super(width, height);
		double area = width * height;
		setArea(area);
		name = "직사각형";
	}

	@Override
	public void printArea() {

		System.out.printf("가로 %d 세로 %d인 %s의 넓이 : %f\n",
					getWidth(), height, name, getArea());
	}
	
	
}
