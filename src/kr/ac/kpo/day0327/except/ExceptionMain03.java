package kr.ac.kpo.day0327.except;

import java.util.Random;

public class ExceptionMain03 {

	public static void main(String[] args) {

		System.out.println(" ==== start ====");

		Random r = new Random();
		int random = r.nextInt(3);

		try { 
			System.out.println("random : " + random);
			System.out.println(10 / random);
			
			String str = "hello";
			System.out.println(str.charAt(5)); //0~4까지만 있기때문에 5번째 구하는 것에 대해서 오류 발생
		} catch(ArithmeticException | StringIndexOutOfBoundsException e) { //or을 통해서 한번에 묶어서 사용 가능
			e.printStackTrace();
		}
		
//		catch (ArithmeticException ae) { 
//			System.out.println("예외발생!!!");
//			System.out.println(ae.getMessage()); 
//			ae.printStackTrace(); 
//		} catch(StringIndexOutOfBoundsException se) {//charAt 오류에 대한 예외처리
//			System.out.println("StringIndexOutOfBoundsException 예외발생!!!");
//			se.printStackTrace();
//		}
		System.out.println(" ==== end ====");
	}

}
