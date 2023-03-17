package kr.ac.kpo.day0315;

public class ArrayMain02 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// for문을 이용한 배열에 값 대입
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}
		
		// 배열에 값을 대입하지 않고 바로 초기화 시켜서 생성
		int[] ar = {10, 20, 30, 40, 50}; //참조변수 선언과 동시에 초기화할때만 사용가능
		int[] arrr = new int[] {10, 20, 30, 40, 50}; //이 방법으로 초기화 할때는 만들어줄 공간수 지정을 따로 안해도 됨
		// 어떤한 경우에도 사용될수 있기때문에 후자를 사용한다고 생각하면 됨

		System.out.println(arr[0]);
		
		// for문을 이용한 배열 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
