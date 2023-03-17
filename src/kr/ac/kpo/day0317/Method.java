package kr.ac.kpo.day0317;

public class Method {
	
	//Java에서는 메소드를 구분할때 매소드명(파라미터)로 하기때문에 메소드명이 같아도 파리미터의 유무에 따라 중복해서 생성가능(메소드 오버로딩)
	//System.out.println()을 생각해보면 println이라는 같은 메소드에 ()안에 타입만 쭉 변경해서 사용 가능한 방법으로 메소드 오버로딩 사용
	//단 리턴타입이랑은 아무 상관이 없음 -> voic call() 이랑 int call() 은 중복 에러가 뜸
	//해당 클래스내에 선언된 멤버 변수는 메소드 내에서 공유할 수 있음
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	void call(int i) {
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(String s, int i) {
		
	}

}
