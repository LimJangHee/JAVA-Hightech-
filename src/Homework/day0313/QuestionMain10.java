package Homework.day0313;

public class QuestionMain10 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			if(i <= 5) {
				for(int j=1; j<=i; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
			else {
				for(int k=10; k-i>0; k--) {
					System.out.print('*');
				}
				System.out.println();
				
			}
				
		}
	}

}
