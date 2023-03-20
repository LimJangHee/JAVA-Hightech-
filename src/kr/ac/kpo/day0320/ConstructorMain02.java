package kr.ac.kpo.day0320;

public class ConstructorMain02 {
	
	public static void main(String[] args) {
		
//		Member m = new Member();
		// 이렇게 생성할 경우 클래스에서 변수 값을 변경시 여기서도 변경을 해줘야 됨 -> 불편
//		m.name = "홍길동";
//		m.age = 25;
//		m.bloodType = "A";
		
		Member m = new Member("홍길동", 25, "A"); //값을 전달하기만 함
		Member m2 = new Member();
		Member m3 = new Member("홍길순"); //전달되는 값의 개수가 달라지면 해당하는 생성자를 따로 생성해줘야됨
		Member m4 = new Member("강길동", 30);
		
		m.info();
		m2.info();
		m3.info();
		m4.info();
		
	}

}
