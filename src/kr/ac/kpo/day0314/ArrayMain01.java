package kr.ac.kpo.day0314;

public class ArrayMain01 {
	
	public static void main(String[] args) {
		
		int[] ar;
		ar = new int[5];
		
		System.out.println("ar : " + ar); //해당 배열이 저장되어 있는 주소값 출력
		System.out.println("ar배열의 크기 : " + ar.length); //배열의 크기 출력
		
		System.out.println("첫번째 정수 : " + ar[0]); //new를 통해 힙에다 저장을 하면 default값으로 0을 저장
		System.out.println("두번째 정수 : " + ar[1]);
		
		// default값 : int=0, boolean=false, char='\u0000', class=null
		System.out.println("세번째 정수 : " + ar[2]);
		System.out.println("네번째 정수 : " + ar[3]);
		System.out.println("다섯번째 정수 : " + ar[4]);
		
		for(int i=0; i<ar.length; i++) { // 배열에서는 반복문 초기화값을 0으로 사용
			System.out.println("ar[" + i +"] : " + ar[i]);
		}
	}

}
