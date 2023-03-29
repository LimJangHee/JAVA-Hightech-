package kr.ac.kpo.day0329.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoView04 {

	public void start() {

//		System.out.print("게임수를 입력 : );
		int gameCnt = 10;
		for (int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto()));
		}

	}
	
	private int[] getLotto() {

		int[] lottoNums = new int[6];
		Random r = new Random();
		
		Set<Integer> lottos = new HashSet<>(); //TreeSet이면 번호가 정렬되서 나옴
		while(lottos.size() < 6) {
			lottos.add(r.nextInt(45)+1);
		}
		int i = 0;
		for(int num : lottos) {
			lottoNums[i++] = num;
		}
		return lottoNums;
		}
	
	
//	private int[] getLotto() {
//		int[] lottoNums = new int[6];
//		
//		List<Integer> nums = new ArrayList<>();
//		for(int i = 1; i <= 45; i++) {
//			nums.add(i);
//		}
//		Collections.shuffle(nums); //배열에 들어가있는 값들을 임의로 섞는 메소드
//		for(int i=0; i < lottoNums.length; i++) {
//			lottoNums[i] = nums.get(i); //셔플로 섞었기 때문에 get으로 가져와도 랜덤값을 가져옴
//		}
//		
//		return lottoNums;
//	}
		

	
}
