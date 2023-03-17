package kr.ac.kpo.day0317;

public class MethodMain01 {

	static int prnStar(int num, String data) {// 밑의 메인 메소드에서 prnStar을 호출할때 cnt를 넘겨줬으며 그걸 받기위해 자료형(정수) 와 변수 선언을 해줌
		// 메인메소드에 전달할 값이 없으면 static void prnStar
		// 메인메소드에 전달할 값이 있으면 해당 값의 자료형을 입력 static int prnStar
		// static return형 메소드명(파라미터)
		// return형에서 묵시적 형변환이 가능 : return을 int로 했을시 return형을 double로도 가능
		System.out.println("*********");
		System.out.println("호출자가 넘겨준 정수 : " + num);
		System.out.println("호출자가 넘겨준 문자열 : " + data);

		int sum = num % 10 + num / 10;

		return sum;

		// return : 피호출자메소드에서 return을 만나면 호출자 메소드로 복귀하는데 return뒤의 값을 가지고 복귀함
		// 같은 타입을 여러개 return하는 경우에는 배열을 써야되고 다른 타입을 return할때에는 collection을 써야됨
		// String[] list = {},
		// return list
	}

	public static void main(String[] args) {

		int cnt = 10;
		int s = prnStar(cnt, "abc"); // main메소드에 있는 변수혹은 값을 prnStar 메소드에 전달
										// 호출된 prnStar가 종료후 전달한 값을 정수형 a에 저장(return으로 전달한 값)
		System.out.println("자리수 합 : " + s);
		System.out.println("Hello");
		prnStar(5, "Hi"); // 호출하면서 값을 넘겨줄때마다 prnStar에서 변수에 새롭게 초기화를 해줌
		System.out.println("Hi");
		prnStar(22, "Good");
		System.out.println("Good-bye");
		prnStar(9, "bye");
	}

}
