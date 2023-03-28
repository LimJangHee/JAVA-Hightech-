package Homework.day0328;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoView {

	public void start() {

//		System.out.print("게임수를 입력 : );
		int gameCnt = 10;
		for (int i = 1; i <= gameCnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getLotto()));
		}

	}

	private Integer[] getLotto() {
		
		Random random = new Random();
		Set<Integer> set = new HashSet<>();
		for(; set.size()<6;) {
			set.add(random.nextInt(45)+1);
		}
		
		Integer[] arr = set.toArray(new Integer[0]);
		return arr;
		
	}

//	private int[] getLotto() {
//		Random random = new Random();
//		List<Integer> list = new ArrayList<Integer>();
//		for (int i = 1; i <= 45; i++) {
//			list.add(i);
//		}
//		int x = 45;
//		int[] arr = new int[6];
//		for (int j = 0; j <= 5; j++) {
//			arr[j] = list.remove(random.nextInt(x));
//			x--;
//		}
//
//		return arr;
//	}

//	private int[] getLotto() {
//		Random random = new Random();
//		int[] arr = new int[6];
//		do {
//			for(int i = 0; i <= 5; i++) {
//				arr[i] = random.nextInt(44) + 1;
//			}
//		} while(arr[0] != arr[1] && arr[0] != arr[2] && arr[0] != arr[3] && arr[0] != arr[4] && arr[0] != arr[5] &&
//				arr[1] != arr[2] && arr[1] != arr[3] && arr[1] != arr[4] && arr[1] != arr[5] && arr[2] != arr[3] &&
//				arr[2] != arr[4] && arr[2] != arr[5] && arr[3] != arr[4] && arr[3] != arr[5] && arr[4] != arr[5]);
//		
//		return arr;
//	}
}
