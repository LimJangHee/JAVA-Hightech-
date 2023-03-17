package Homework.day0313;

public class QuestionMain12 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=1; j<=5; j++) {
					if(j < i) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			else {
				for(int j=1; j<=5; j++) {
					if(9-i < j) {
						System.out.print('*');
					}
					else {
						System.out.print(' ');
					}
					
				}
				System.out.println();
			}
		}
	}

}
