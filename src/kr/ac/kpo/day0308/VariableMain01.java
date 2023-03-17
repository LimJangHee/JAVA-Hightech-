package kr.ac.kpo.day0308;

public class VariableMain01 {
	
	public static void main(String[] args) {
		
		char ch; // 변수 선언은 해당 { }(블록 스코프) 안에서만 적용 됨
		
		ch = 'A';
		System.out.println("ch : " + ch);
		
		ch = '!';
		System.out.println("ch : " + ch);
		
		ch ='\u0061'; //유니코드로 작성, 4자리를 다 채워서 작성해줘야됨(00)
		System.out.println("ch : " + ch);
		
	}

}
