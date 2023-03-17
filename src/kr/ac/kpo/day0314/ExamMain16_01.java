package kr.ac.kpo.day0314;


public class ExamMain16_01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i - 1; j++) {
					System.out.print("-");
				}
				for(int j=1; j <= 2*(6-i)-1; j++) {
					System.out.print('*');
				}
			} else {
				for(int j=1; j<= 9-i; j++) {
					System.out.print('-');
				}
				for(int j=1; j<=2*(i-4)-1; j++) {
					System.out.print('*');
				}

			}
			System.out.println();
		}
		
		
		
		for(int i=1; i<=9; i++) {

			int space = 0, k = 5;
			
			for(int j=1; j <= space; j++) {
				System.out.print('-');
			}
			for(int j=1; j<=2*k-1; j++) {
				System.out.println('*');
			}
			
			System.out.println();
			
			if(i < 5) {
				space++;
				k--;
			}
			else {
				space--;
				k++;
			}
		}
		
		
		int k =0;
		
		for(int i=1; i<=9; i++) {
						
			
			for(int j=1; j<=9; j++) {
				if(j <= k || j >= 10-k) {
					System.out.print('-');
				}
				else {
					System.out.print('*');
				}
				
			}
			
			System.out.println();
			if(i < 5) {
				k++;
			}
			else {
				k--;
			}
		}

	}
}