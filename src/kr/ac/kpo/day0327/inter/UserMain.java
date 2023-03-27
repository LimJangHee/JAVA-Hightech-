package kr.ac.kpo.day0327.inter;

public class UserMain {
	
	public static void main(String[] args) {
		
		TV tv = new LGTV(); //객체 형변환
//		TV tv = new SamsungTV(); 
		tv.powerOn();
		tv.volumeDown();
		tv.mute();
		tv.channelUp();
		tv.mute();
		tv.powerOff();
		LGTV lg = (LGTV)tv;
		
		System.out.println(lg); //실제로는 toString메소드가 숨겨져 있는것
		System.out.println(lg.toString()); //Object 클래스는 모든 클래스가 생성과 동시에 상속받음(추상클래스 포함)
//		System.out.println(tv.toString()); //TV는 인터페이스기 때문에 Object클래스를 상속받지 않아서 사용 불가
	}

}
