package kr.ac.kpo.day0314;

public class ExamMain16 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=1; i-j>0; j++) {
					System.out.print(' ');
				}
				for(int j=1; j<2*(6-i); j++) {
					System.out.print('*');
				}
			
			}
			else {
				for(int j=1; 9-i>=j; j++) {
					System.out.print(' ');
				}
				for(int j=1; j<= 2*i-9; j++)
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
