package Homework.day0317;

import java.util.Random;
import java.util.Scanner;

// 컴퓨터가 생각하고 있는 1-100사이의 정수를 맞추는 프로그램을 작성하시오

public class QuestionMain01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int random = 0, num = 0; //랜덤값 저장 변수, 입력값 저장 변수
		int max = 100, min = 1; //최초 범위 초기화
		Print p = new Print(); //출력 관련 행동을 모두 print 클래스에 메소드화 시킴

		for (int i = 0; i <= 1;) { //랜덤값이 0이 아닐때까지만 반복
			random = r.nextInt(101);
			if (random != 0) {
				i++;
			} else {
				continue;
			}

		}

		for (int i = 6; i >= 1;) {

			p.range(min, max); //범위 출력 메소드 호출
			num = sc.nextInt();

			if (num >= min && num <= max) { //범위 내의 숫자를 입력시에만 다음 회수로 넘어감
				i--;
			} else {
				continue;
			}

			if (num < random) { //입력받은 값이 랜덤값 보다 작은 경우
				p.small(num); //입력값이 더 작다는 출력 메소드 호출
				p.count(i); //남은 횟수 출력 메소드 호출
				min = num; //최소값 범위 새롭게 지정

			}
			if (num > random) { //입력받은 값이 랜덤값 보다 큰 경우
				p.big(num); //입력값이 더 크다는 출력 메소드 호출
				p.count(i); 
				max = num; //최대값의 범위 새롭게 지정
			}
			if (num == random) { //입력받은 값이 정답인 경우
				p.correct(); //정답일 경우 출력 메소드 호출
				break; //정답이라 반복문 탈출
			}
			if (i == 0) { //정답을 맞추지 못하고 횟수를 모두 소진한 경우
				p.incorrect(random); //정답을 맞추지 못한 경우에 대한 출력 메소드 호출

			}

		}

	}

}