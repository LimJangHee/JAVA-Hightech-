package kr.ac.kpo.day0315;

import java.util.Arrays;
import java.util.Scanner;

/*
 	키보드로 3개의 실수를 입력받아 출력하는 코드를 작성하시오
 */

public class ArrayMain03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] ar = new double[3];

		for (int i = 0; i < ar.length; i++) {

			System.out.println(i + 1 + "번째 실수 : ");
			ar[i] = sc.nextDouble();
		}
		
		/*
		 	배열의 모든 요소 출력방식
		 	1. index를 이용해서 출력
		 	2. 1.5버전의 for문 이용해서 출력
		 	3. Arrays.toString() 메소드를 이용하여 출력
		 */

		// 1.
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + "\t");
		}
		System.out.println();
		
		
		// 2. for(자료형 변수 : 배열명) -> 해당 배열의 0~마지막까지 반복하면서 data에 해당 값을 저장
		for(double data :ar) {
			System.out.println(data + "\t");
		}
		System.out.println();
		
		
		// 3. Arrays.toString() 배열이 가지고 있는 모든 요소를 추출해서 하나의 문자열 형태로 만들어줘
		System.out.println(Arrays.toString(ar));
	}

}
