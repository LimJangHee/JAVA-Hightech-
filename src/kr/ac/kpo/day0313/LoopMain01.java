package kr.ac.kpo.day0313;

public class LoopMain01 {
	
	public static void main(String[] args) {
		
		System.out.println("--- start ---");
		
		int cnt = 1;
		while(cnt <= 5) {
			System.out.println("Hello");
			++cnt;
		}
		
		System.out.println("--- end ---");
		
		System.out.println(cnt);
	}

}
