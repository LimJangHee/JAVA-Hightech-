package kr.ac.kpo.day0329.homework;

import java.util.Arrays;
import java.util.Random;

public class LottoView {

	public void start() {

//		System.out.print("게임수를 입력 : );
		int gameCnt = 10;
		for (int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto()));
		}

	}

	private int[] getLotto() {

		Random r = new Random();
		int[] lottoNums = new int[6];
		loop: for (int i = 0; i < lottoNums.length;) {
			lottoNums[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lottoNums[i] == lottoNums[j]) {
					System.out.print('!');
					continue loop; //반복문의 위치를 지정
				}
			}
			i++;
		}
		return lottoNums;

	}

//	private int[] getLotto() {
//
//		Random r = new Random();
//		int[] lottoNums = new int[6];
//		for (int i = 0; i < lottoNums.length;) {
//			lottoNums[i] = r.nextInt(45) + 1;
//			boolean bool = true;
//			for (int j = 0; j < i; j++) {
//				if (lottoNums[i] == lottoNums[j]) {
//					System.out.print('!');
//					bool = false;
//					break;
//				}
//			}
//			if (bool) {
//				i++;
//			}
//		}
//		return lottoNums;
//
//	}
}
