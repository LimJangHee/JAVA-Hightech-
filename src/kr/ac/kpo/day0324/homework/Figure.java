package kr.ac.kpo.day0324.homework;

public abstract class Figure {
	
	private double area; // -> protected double area를 사용하면 상속관계에 있는 클래스들이 접근가능해서 this.area사용가능
	
	public double getArea() { //get변수명(맨앞글자 대문자) -> private으로 선언된 멤버변수를 외부에 보여주기 위한 메소드
		return this.area;
	}
	
	public void setArea(double area) {//set변수명(맨앞글자 대문자) -> private으로 선언된 멤버변수를 수정하기 위한 메소드
		this.area = area;
	}
	
	public abstract void printArea();

}
