package kr.ac.kpo.day0324.inter;

public abstract class PlainFigure extends Figure{ //부모의 추상 메소드를 재정의 하지 않았기 때문에 추상 클래스가 됨
	
	private int width;
	protected int height;
	
	public PlainFigure() {}
	public PlainFigure(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
	}

	@Override
	public void setArea(double area) {
		super.setArea(area);//부모클래스에 있는 setArea 메소드를 호출
	}
}
