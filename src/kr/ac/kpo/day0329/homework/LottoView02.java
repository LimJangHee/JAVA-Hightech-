package kr.ac.kpo.day0329.homework;

import java.util.Arrays;
import java.util.Random;

public class LottoView02 {

	public void start() {

//		System.out.print("게임수를 입력 : );
		int gameCnt = 10;
		for (int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto()));
		}

	}

	// boolean 배열을 만들어서 false이면 사용한후 true를 반환, true이면 사용 못하게
	private int[] getLotto() {

		Random r = new Random();
		int[] lottoNums = new int[6];
		boolean[] flags = new boolean[45]; // 0~44까지 default로 false가 들어감

		for (int i = 0; i < lottoNums.length;) {
			int random = r.nextInt(45);
			if (!flags[random]) { // if() true이면 실행 -> !false이면 이니까 true
				lottoNums[i++] = random + 1; // 후위 증가라서 0에 넣고 증가
				flags[random] = true;
			} else {
				System.out.print('!');
			}
		}
		return lottoNums;

	}
}
