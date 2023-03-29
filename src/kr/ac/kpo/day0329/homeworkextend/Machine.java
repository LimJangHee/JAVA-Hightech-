package kr.ac.kpo.day0329.homeworkextend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Machine {
	
	private List<Ball> balls; //list에 ball형의 데이터
	
	public Machine() {
		for(int i=1; i <=45; i++) {
			balls = new ArrayList<>();
			Ball ball = new Ball(i);
			balls.add(ball);
		}
	}
	
	public void start() {
		Collections.shuffle(balls);
	}
	
	public Ball getBall() {
		return balls.remove(0);
	}

}
