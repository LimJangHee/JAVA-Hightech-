package Homework.day0317;

public class Print { //출력 관련 모든 행동을 메소드화 시킨 클래스

	void range(int min, int max) { //범위 출력 메소드
		System.out.println(min + "~" + max + "사이의 정수를 입력해 주세요 : ");
	}

	void small(int num) { //입력값이 작은 경우 출력 메소드
		System.out.println(num + "보다 큰수입니다.");
	}

	void big(int num) { //입력값이 큰 경우 출력 메소드
		System.out.println(num + "보다 작은수입니다.");
	}

	void count(int i) { //남은 횟수 출력 메소드
		System.out.println("기회는 총" + i + "번 남았습니다.");
	}
	
	void correct() { //정답인 경우 출력 메소드
		System.out.println("축하합니다!! 정답입니다.");
	}
	
	void incorrect(int random) { //기회를 모두 소진하고 오답인 경우 출력 메소드		
		System.out.println("아쉽습니다. 기회를 소진하였습니다.");
		System.out.println("정답은 [" + random + "] 이였습니다.");
		
	}

}
