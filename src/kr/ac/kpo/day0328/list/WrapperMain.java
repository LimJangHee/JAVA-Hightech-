package kr.ac.kpo.day0328.list;

/*
	  기본자료형		참조자료형
	  boolean		Boolean
	  char			Character
	  byte			Byte
	  short			Short
	  int			Integer
	  long			Long
	  float			Float
	  double		Double
 */

public class WrapperMain {
	
	public static void main(String[] args) {
		
		Integer i = new Integer(12); //Wrapper클래스를 활용해서 기본자료형을 참조자료형화 시켜서 List와 Set에서도 활용
		System.out.println("i : " + i);
		
		int i2 = i; // auto unboxing : 참조자료형인 Wrapper클래스를 기본자료형에 대입하는게 원래는 안되지만 자동으로 가능하게 해줌
					// 반대는 auto boxing
	}

}
