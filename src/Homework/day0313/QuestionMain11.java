package Homework.day0313;

public class QuestionMain11 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=5; i<=j; j--) {
					System.out.print('*');
				}
				System.out.println();
			}
			else {
				for(int k=4; i-k>0; k++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
	}

}
