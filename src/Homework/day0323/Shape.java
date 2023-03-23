package Homework.day0323;

public abstract class Shape {
	
	private int line1;
	private int line2;
	
	Shape(){}
	Shape(int line1, int line2){
		this.line1 = line1;
		this.line2 = line2;
	}
	
	
	public abstract double getArea(int line01, int line02);
	public abstract void printArea(int line01, int line02);
	

}
