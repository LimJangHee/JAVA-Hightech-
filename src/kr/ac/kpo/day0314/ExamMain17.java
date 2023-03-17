package kr.ac.kpo.day0314;

public class ExamMain17 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			if(i<=4) {
				for(int j=1; j<=i; j++) {
					System.out.print('*');
				}
				System.out.print('-');
			}
			System.out.println();
			if(i==5) {
				for(int j=1; j<=9; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
