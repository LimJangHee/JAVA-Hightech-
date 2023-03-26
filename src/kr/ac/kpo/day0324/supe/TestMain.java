package kr.ac.kpo.day0324.supe;

class One{
	private int a;
	protected int b;
	public int c;
	
	public void print() {
		System.out.println("a : " + this.a);
		System.out.println("b : " + this.b);
		System.out.println("c : " + this.c);
	}
}

class Two extends One{
	private int a2;
	protected int b2;
	public int c2;
	
	public void print() {
		//a는 안보이고 b,c는 보임
		//즉 super로 땡겨올수 있는거는 b,c만 가능
		//this는 본인의 변수를 지칭하는것임 -> super랑 헷갈리지 말것
		
	}
}

public class TestMain {
	
	public static void main(String[] args) {
		
	}

}
