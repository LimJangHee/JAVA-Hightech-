package kr.ac.kpo.day0317;

import java.util.Random;

public class RandomMain {
	
	public static void main(String[] args) {
		
		// 임의의 정수를 추출
		Random r = new Random();
		
		int random = r.nextInt(101); //0부터 100까지 101개의 범위
		System.out.println(random);
	}

}
