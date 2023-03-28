package kr.ac.kpo.day0328.list;

import kr.ac.kpo.day0327.inter.LGTV;

class A { //object형으로 받으면 값을 받아올때 항상 형변환을 해줘야됨
	private Object member;
	
	A(Object member){
		this.member = member;
	}
	
	Object getMember() {
		return member;
	}
}

class B<T> { //제너릭형 -> 같은 타입의 값만 받아올 수 있게 해줌
	private T member;
	
	B(T member){
		this.member = member;
	}
	
	T getMember() {
		return member;
	}
}


public class GenericMain {
	
	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList(); //어떤 타입이든지 받아오기 위해서 object형으로 만들어져있음
//		list.add("Hello");
//		list.add(new Car());
//		list.add(new LGTV());
//		
//		(Car)list.get(1); //list가 object형으로 묵시적 형변환을 해서 저장하기 때문에 이를 불러올때 형변환을 해줘야됨
		
		A a1 = new A("hello");
		String str = (String)a1.getMember();
		
		A a2 = new A(new LGTV());
		LGTV tv = (LGTV)a2.getMember();
		tv.powerOn();
		
		B<String> b1 = new B<String>("hello"); //
		B<LGTV> b2 = new B<LGTV>(new LGTV());
		b1.getMember();
		b2.getMember();
	}

}
