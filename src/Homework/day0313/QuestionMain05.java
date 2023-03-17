package Homework.day0313;

public class QuestionMain05 {
	
	public static void main(String[] args) {
		
		for(int i=5; i>=1; i--) {
			for(int j = i; j <= i+4; j++) {
				System.out.printf("%d", j);
			}
			System.out.println();
		}
	}

}
