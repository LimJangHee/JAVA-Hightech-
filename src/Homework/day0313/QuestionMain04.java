package Homework.day0313;

public class QuestionMain04 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j = i; j <= i+4; j++) {
				System.out.printf("%d", j);
			}
			System.out.println();
		}
	}

}
