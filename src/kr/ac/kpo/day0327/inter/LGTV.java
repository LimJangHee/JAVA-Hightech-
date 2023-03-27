package kr.ac.kpo.day0327.inter;

public class LGTV implements TV {
	
	private boolean power;
	private int channelNo;
	private int volumeSize;
	private int tempVolumeSize;
	private boolean muteFlag = false;
	
	public LGTV() {
		power = false;
		channelNo = 10;
		volumeSize = 7;
		System.out.println("LGTV를 구매했습니다.");
	}

	@Override
	public void powerOn() {
		power = true;
		System.out.println("TV 전원을 켭니다");
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void powerOff() {
		power = false;
		System.out.println("TV 전원을 끕니다");
	}
	
	@Override
	public void channelUp() {
		channelNo++;
		System.out.println("채널 up을 선택했습니다");
		info();
	}
	
	@Override
	public void channelDown() {
		channelNo--;
		System.out.println("채널 down을 선택했습니다");
		info();
	}
	
	@Override
	public void volumeUp() {
		if(TV.MAX_VOLUME_SIZE < volumeSize) //static변수기 때문에 TV클래스명으로 호출
		volumeSize++;
		System.out.println("볼류 up을 선택했습니다");
		info();
	}
	
	@Override
	public void volumeDown() {
		if(TV.MIN_VOLUME_SIZE != volumeSize) {
			volumeSize--;
		}
		System.out.println("볼륨 down을 선택했습니다");
		info();
	}
	
	@Override
	public void mute() {
		
		if(!muteFlag) {
		tempVolumeSize = volumeSize;
		volumeSize = TV.MIN_VOLUME_SIZE;
		muteFlag = true;
		System.out.println("음소거중입니다");
		} else {
			volumeSize = tempVolumeSize;
			muteFlag = false;
			System.out.println("음소거 해제합니다");
		}
		info();
	}
	
	public void info() {
		System.out.println("채널번호 : " + channelNo + ", 음량크기 : " + volumeSize);
	}

}
