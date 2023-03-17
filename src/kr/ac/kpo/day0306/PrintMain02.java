package kr.ac.kpo.day0306;

/*
	printf : 변환문자를 이용하여 상수 출력, 개행문자(x) -> 개행할려면 /n
	%c : 문자
	%d : 10진수 정수 -> %nd : n자리 정수
	%f : 실수       -> %.nf : 소수 n자리 까지
	%s : 문자열
	%b : 논리값
	Exception 오류 : 애기치 못한 오류로 인해서 강제 종류함
 */

public class PrintMain02 {
	
	public static void main(String[] args) {
		
		System.out.printf("%d %f %s\n", 10, 12.34, "홍길동"); //소수점 여섯자리까지 표기
		System.out.printf("%d %.2f %s\n", 10, 12.34, "홍길동"); //소수점 둘째자리까지 표기, 반약 버려지는 경우에는 반올림
		System.out.printf("[%5d] %.2f %s\n", 1000, 12.34, "홍길동"); //5자리까지 오른쪽 정렬
		System.out.printf("[%-5d] %.2f %s\n", 1000, 12.34, "홍길동"); //5자리까지 왼쪽 정렬
		System.out.printf("[%-5d] %.2f [%-10s]\n", 1000, 12.34, "홍길동");
		System.out.printf("[%05d] %.2f [%-10s]\n", 123, 12.34, "홍길동"); //5자리까지 출력하며 비어있는 자리는 0으로 출력
		// System.out.printf("[%-05d] %.2f [%-10s]\n", 123, 12.34, "홍길동"); 12300 -> 출력값이 달라지기 때문에 사용 불가
		System.out.printf("[%5d] %.2f [%-10s]\n", 12345678, 12.34, "홍길동"); //출력값에 영향을 끼치기 때문에 5는 무시되고 12345678이 표시됨
	
		// 논리값
		System.out.println(true);
		System.out.println(false);
		System.out.printf("4 > 2 : %b\n", 4 > 2);
	}

}
