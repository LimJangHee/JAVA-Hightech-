package kr.ac.kpo.day0414;

public class StringMain06 {

	public static void main(String[] args) {

		// 문자열은 변화가 안되기 때문에 각각의 데이터 공간을 새롭게 만들어서 총 30만건을 만들기 때문에 시간이 오래걸림
		// 그래서 변화가 자주 일어날 경우 String클래스로 만드는것이 큰 낭비임
		// 그래서 사용하는 것이 StringBuilder(비동기화)(-> 한번에 여러개 작업) 혹은 StringBuffer(동기화)(->한번에 하나의
		// 작업만)클래스를 사용
		String data = ""; //고정된 문자열
		long start = System.currentTimeMillis();
		for (int i = 0; i < 300000; i++) {
			data += i;
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) / 1000. + "초");

		
		// 시간이 훨씬 단축됨 -> 그래서 쿼리 작성할때는 StringBuilder를 사용해야됨
		StringBuilder sb = new StringBuilder(); //변화하는 문자열
		start = System.currentTimeMillis();
		for (int i = 0; i < 300000; i++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) / 1000. + "초");
	}

}
