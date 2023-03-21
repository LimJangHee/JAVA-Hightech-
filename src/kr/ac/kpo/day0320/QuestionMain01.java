package kr.ac.kpo.day0320;

import java.util.Random;
import java.util.Scanner;

// 컴퓨터가 생각하고 있는 1-100사이의 정수를 맞추는 프로그램을 작성하시오

public class QuestionMain01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int random = 0, num = 0; 
		int max = 100, min = 1; 
		Print p = new Print(); 

		for (int i = 0; i <= 1;) { //r.nextInt()% 100 +1 -> 1 ~ 100
			random = r.nextInt(101); //r.nextInt()% 90 + 10 -> 10 ~ 90
			if (random != 0) {
				i++;
			} else {
				continue;
			}

		}

		for (int i = 6; i >= 1;) {

			p.range(min, max); 
			num = sc.nextInt();

			if (num >= min && num <= max) { 
				i--;
			} else {
				continue;
			}

			if (num < random) { 
				p.small(num); 
				p.count(i); 
				min = num; 

			}
			if (num > random) { 
				p.big(num); 
				p.count(i); 
				max = num; 
			}
			if (num == random) { 
				p.correct(); 
				break; 
			}
			if (i == 0) { 
				p.incorrect(random); 

			}

		}

	}

}