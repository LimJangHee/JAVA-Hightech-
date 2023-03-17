package kr.ac.kpo.day0313;

public class BreakMain01 {

	public static void main(String[] args) {
		
		for(int cnt = 1; cnt <= 10; cnt++) {
		
			if(cnt == 3){ //가장 가까운 반복문 or switch문을 빠져나옴
				break;
			}
			
			
			System.out.println("Hi");
		}	
	}
}
