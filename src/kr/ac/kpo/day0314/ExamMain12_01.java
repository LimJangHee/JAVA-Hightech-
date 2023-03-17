package kr.ac.kpo.day0314;
/*
 	*****
 	-****
 	--***
 	---**
 	----*
 	---**
 	--***
 	-****
 	*****
 */

public class ExamMain12_01 {
	
	public static void main(String[] args) {

		int space = 0;
		int star = 5;
		
		for(int i=1; i<=9; i++) {
			
			for(int j=1; j<= space; j++) {
				System.out.print('-');
			}
			
			for(int j=1; j<=star; j++) {
				System.out.print('*');
			}
			
			System.out.println();
			if(i<5) {
				space++;
				star--;
			}
			else {
				space--;
				star++;
			}
		}
	}

}
