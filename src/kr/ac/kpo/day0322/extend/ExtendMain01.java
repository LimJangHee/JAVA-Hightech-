package kr.ac.kpo.day0322.extend;

class One{
	One(){
		System.out.println("1 생성자 호출");
	}
}

class Two extends One{
	Two(){
		System.out.println("2 생성자 호출");
	}
}

class Three extends Two{
	Three(){
		System.out.println("3 생성자 호출");
	}
}

public class ExtendMain01 {
	
	public static void main(String[] args) {
		// new One();
		new Two(); //1,2생성자 둘다 만들어짐 -> super가 생략되어 있는것
		new Three(); //1,2,3생성자 모두 생성 -> 단 상속은 super, sub관계만 존재하기 때문에 super는 Two
		// 부모의 공간이 먼저 만들어지고 자식의 공간이 만들어짐
	}

}
