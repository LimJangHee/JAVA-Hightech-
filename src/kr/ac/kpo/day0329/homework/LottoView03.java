package kr.ac.kpo.day0329.homework;

import java.util.Arrays;
import java.util.Random;

public class LottoView03 {

	public void start() {

//		System.out.print("게임수를 입력 : );
		int gameCnt = 10;
		for (int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto()));
		}

	}
	
	// 랜덤숫자를 뽑아서 배열의 마지막에 순서대로 교환해서 집어넣기 -> 마지막 6배열의 순서에 랜덤 숫자가 들어가 있음
	private int[] getLotto() {

		Random r = new Random();
		int[] lottoNums = new int[6];
		int[] nums = new int[45];
		for(int i=0; i<nums.length; i++) {
			nums[i] = i+1;
		}
		
		for(int i=0; i<6; i++) {
			int randIdx = r.nextInt(45-i);
			
			int temp = nums[randIdx];
			nums[randIdx] = nums[45-1-i];
			nums[45-1-i] = temp;
		}
		
		//배열의 일부분을 다른 배열에 대입(복사)하는 방법
		System.arraycopy(nums, nums.length-lottoNums.length, lottoNums, 0, lottoNums.length);
		
		return lottoNums;
		}
		

	
}
