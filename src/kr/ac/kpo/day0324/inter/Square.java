package kr.ac.kpo.day0324.inter;

public class Square extends Rectangle{ //printArea메소드 부모꺼를 사용
	
	public Square() {}
	public Square(int width) { //width를 입력받아 부모 변수에 width, width를 입력
		super(width, width);
	}

}
