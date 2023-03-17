package kr.ac.kpo.day0310;

import java.util.Scanner;

/*
  	1 ~ 3사이의 정수 입력 :
  	
  	1입력 -> one
  	2입력 -> two
  	3입력 -> three
  	그외입력 -> 오류
 */

// switch문은 여러 초이스들 중 다중 선택을 하는 경우 사용
public class SwitchMain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
//		if(no == 1) {
//			System.out.println("one");
//		}
//		else if(no == 2) {
//			System.out.println("two");
//		}
//		else if(no == 3){
//			System.out.println("three");
//		}
//		else {
//			System.out.println("error");
//		}
//		
		switch(no) { // 해당되는 케이스 부터 끝까지를 출력해줌 ex)3에 해당되면 3부터 default까지를 출력해줌
					// 그래서 break키워드를 추가하여 해당 케이스를 적용시키고 빠져나오게 해줌
					// case 뒤에 적용할 수 있는 것은 정수, 문자, 문자열만 가능
		case 1: System.out.println("one");
				break;
		case 2: System.out.println("two");
				break;
		case 3: System.out.println("three");
				break;
		default :System.out.println("error"); //if문과 다르게 default의 위치는 상관없으니 가장 밑에 넣어주는게 좋음
				break;
		}
			
		
		
	}

}
