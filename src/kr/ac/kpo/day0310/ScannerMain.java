package kr.ac.kpo.day0310;
import java.util.Scanner; //java.util이라는 패키지에 Scanner라는 클래스를 가져옴

public class ScannerMain {
	
	public static void main(String[] args) {
		
		//키보드 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력 :");
		// String str = sc.next(); //입력받은 문자를 str에 저장
								   //next는 단어 단위의 문자열만 입력받음
		String str = sc.nextLine();//그래서 문자열을 입력받기 위해서 사용하는 메소드 
		
		System.out.println("str : " + str);
		
		System.out.println("정수를 입력 : ");
		int num = sc.nextInt(); //정수를 입력받기 위한 메소드
		System.out.println("num : " + num);
		
		System.out.println("실수를 입력 : ");
		double num2 = sc.nextDouble();
		System.out.println("num2 : " + num2);
		
		System.out.println("문자를 입력 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch : " + ch);
		
		
	}

}
