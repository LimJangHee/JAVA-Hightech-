package kr.ac.kpo.day0316;

public class Homework0314_8 {

	public static void main(String[] args) {

//		for (int i = 2; i <= 9; i += 3) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d\t", i, j, i * j);
//				System.out.printf("%d * %d = %d\t", i + 1, j, (i + 1) * j);
//				if (i + 2 <= 9) {
//					System.out.printf("%d * %d = %d\t", i + 2, j, (i + 2) * j);
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

		int step = 3;
		
		for (int i = 2; i <= 9; i += step) {
			for (int j = 1; j <= 9; j++) {
				for (int k = i; k <= i +step && k <= 9; k++) {
					System.out.printf("%d * %d = %d\t", i, j, i * j);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
