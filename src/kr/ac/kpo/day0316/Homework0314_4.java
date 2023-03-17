package kr.ac.kpo.day0316;

public class Homework0314_4 {

	public static void main(String[] args) {

		int snail = 0, hour = 0;

		while (snail < 100) {
			snail += (snail < 50 ? 5 - 1 : 5 - 2);
			System.out.printf("[%d시간] 달팽이가 올라간 총 높이 : %dM\n", ++hour, snail);
		}

//		while ((snail += 5) < 100) {
//			snail += (snail < 50 ? -1 : -2);
//			System.out.printf("[%d시간] 달팽이가 올라간 총 높이 : %dM\n", ++hour, snail);
//		}
//		System.out.printf("[%d시간] 달팽이가 올라간 총 높이 : %dM\n", ++hour, snail);
	}

}
