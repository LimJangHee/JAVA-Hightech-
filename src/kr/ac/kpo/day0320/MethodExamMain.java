package kr.ac.kpo.day0320;

public class MethodExamMain {
	
	public static void main(String[] args) {
		
		MethodExam exam = new MethodExam(); // 문서화 주석을 달아줘서 MethodExam위에 마우스를 올리면 해당 설명이 나옴
		
		int total = exam.getTotal(10, 100); // exam.하고 getToal을 확인해보면 문서화 주석으로 달아놓은거 확인 가능
		System.out.println("10 ~ 100사이의 총합 : " + total);
		
		exam.printGugudan(5);
		exam.printGugudan();
		
		System.out.print("시작단 : ");
		int startDan = exam.getDan();
		System.out.print("종료단 : ");
		int endDan = exam.getDan();
		exam.printGugudan(startDan, endDan);
		
		
	}

}
