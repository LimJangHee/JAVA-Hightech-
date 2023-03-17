package kr.ac.kpo.day0317;

public class MethodMain02 {
	
	// method클래스 참조
	
	public static void main(String[] args) {
		
		Method m = new Method(); //외부 클래스에 대한 인스턴트 생성
		m.call(); //인스턴트.메소드
		m.call(10); //위의 메소드와 별개의 메소드를 호출한다는 것
		m.call("aaa",12);
		m.call('a');//char형의 메소드는 만들어주지 않았지만 묵시적 형변환으로 보다 큰 타입에 담아진다 즉 int형으로 담아짐
	}

}
