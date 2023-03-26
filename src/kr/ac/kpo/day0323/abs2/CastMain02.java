package kr.ac.kpo.day0323.abs2;

public class CastMain02 {
	
	public static void main(String[] args) {
		
		Parent p = new Child01();
		
		Child01 c = (Child01)new Parent(); //명시적 형변환 -> 단 이렇게만 작성하면 실행시 오류 발생
										   //이전에 묵시적 형변환을 미리 했어댜 됨
	}

}
