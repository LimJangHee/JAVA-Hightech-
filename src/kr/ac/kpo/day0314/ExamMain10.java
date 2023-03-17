package kr.ac.kpo.day0314;

/* 	 	 
 	*
 	**
 	***
 	****
 	*****
 	****
 	***
 	**
 	*	
 */

public class ExamMain10 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			
			if(i <= 5) {
				for(int j = 1; j <= 1; j++) {
				System.out.print("*");
			}
			}else {
				for(int j=1; j<=10-i; j++) {
				System.out.print("*");
				}
				}
		}
		System.out.println();
		
	}

}
