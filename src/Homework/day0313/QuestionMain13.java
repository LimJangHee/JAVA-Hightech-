package Homework.day0313;

public class QuestionMain13 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=5; j>=1; j--) {
					if(j-i>0) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			else {
				for(int j=5; j>=1; j--) {
					if(10-i < j) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
	}

}
