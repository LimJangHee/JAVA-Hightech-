package kr.ac.kpo.day0313;

public class ContinueMain {
	
	public static void main(String[] args) {
		
		for(int cnt = 1; cnt <= 10; cnt++) {
		
			if(cnt == 3){ 
				continue; // continue 조건에 해당할시 이후의 과정을 생략하고 증감으로 이동
			}			  // if else문장으로 대체 가능하기 때문에 잘 사용하지는 않음 
			
			
			System.out.println("Hi");
		}	
	}
}
