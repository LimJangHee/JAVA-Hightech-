package kr.ac.kpo.day0327.inter;

public interface TV {
	
	//인터페이스에서는 상수 선언만 가능
	//public static final이 생략되어있음
	int MAX_VOLUME_SIZE = 50;
	int MIN_VOLUME_SIZE = 0;
	
	//인터페이스 메소드는 public abstract가 다 생략되어있는것임
	void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();
	

}
