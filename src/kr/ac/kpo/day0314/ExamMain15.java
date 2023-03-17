package kr.ac.kpo.day0314;

public class ExamMain15 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; i-j>0; j++) {
				System.out.print(' ');
			}
			for(int j=1; j<2*(6-i); j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
