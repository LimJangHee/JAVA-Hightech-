package Homework.day0314;

public class QuestionMain04 {

	public static void main(String[] args) {

		int snail = 0;
		int time = 1;

		while (snail < 100) {
			if (snail < 50) {
				snail += 4;
			} else {
				snail += 3;
			}
			System.out.println(time + "시간 후 달팽이가 올라간 총 높이 : " + snail + "M");
			time++;
			
		}
	}
}
