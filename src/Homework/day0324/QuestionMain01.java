package Homework.day0324;

import java.util.Random;
import java.util.Scanner;

public class QuestionMain01 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int com1, com2, com3; //컴퓨터가 할당받는 변수
		int user1, user2, user3;//사용자가 입력하는 변수
		int chance = 6;//주어진 기회
		int strike = 0, ball = 0, out = 0;//스트라이크, 볼, 아웃 초기화
		
		while(true) {// 컴퓨터에 1~9사이의 랜덤 정수 할당
			com1 = random.nextInt(100) % 9 +1;
			com2 = random.nextInt(100) % 9 +1;
			com3 = random.nextInt(100) % 9 +1;
			if(!(com1 == com2 || com2 == com3 || com1 == com3)) {// 3개의 숫자가 겹치지 않을때까지 반복
				break;
			}
		}
		
		while(chance >= 1) {//기회6번을 사용할때까지의 반복 조건
			
			System.out.println("1~9사이의 서로 다른 3개의 정수를 입력해주세요.");
			user1 = sc.nextInt();
			user2 = sc.nextInt();
			user3 = sc.nextInt();
			
			// 스트라이크 조건 만족시 스트라이크 횟수 증가
			if(com1 == user1) strike++;
			if(com2 == user2) strike++;
			if(com3 == user3) strike++;
			
			// 볼 조건 만족시 볼 횟수 증가
			if(com1 == user2 || com1 == user3) ball++;
			if(com2 == user1 || com2 == user3) ball++;
			if(com3 == user1 || com3 == user2) ball++;
			
			//남아있는 기회 감소
			chance--;
			
			
			if(strike == 3) { // 3스트라이크 일시
				System.out.println("정답입니다!!!");
				break;
			}
			else {
				if(strike == 0 && ball == 0) { //아웃일시
					out++;
					System.out.println(out + "아웃입니다.");
				}
				else { //스트라이크와 볼이 섞여있을 경우
					System.out.printf("%d스트라이크, %d볼\n", strike, ball);
					System.out.println(chance + "번의 기회가 남았습니다.");
				}
				
				// 스트라이크와 볼을 0으로 초기화해서 다음 입력값을 받음
				strike = 0;
				ball = 0;
			}
			
			if(out == 3) { //out을 3번 했을경우 반복문 종료
				System.out.println("아웃으로 기회를 모두 소진하셨습니다.");
				System.out.println("정답은 [" + com1 +"][" + com2 + "][" + com3 + "] 입니다.");
				break;
			}
			
			if(chance == 0) {//기회 6번을 모두 소진했을 경우 출력
				System.out.println("6번의 기회를 모두 소진하셨습니다.");
				System.out.println("정답은 [" + com1 +"][" + com2 + "][" + com3 + "] 입니다.");
				break;
			}
			
			
		}
	}

}
