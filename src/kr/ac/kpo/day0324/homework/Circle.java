package kr.ac.kpo.day0324.homework;

public class Circle extends Figure{
	
	private int radius;
	
	public Circle() {}
	public Circle(int radius) {
		this.radius = radius;
		
		double area = radius * radius * Math.PI; //area private으로 선언되어 있기때문에 setter로 값을 넣어줌
		setArea(area);
	}
	
	@Override
	public void printArea() {
		
		System.out.println("반지름 : " + radius + "원의 넓이 : " + getArea());// area private으로 선언되어 있기 때문에 getter로 값을 불러옴
	}

}
