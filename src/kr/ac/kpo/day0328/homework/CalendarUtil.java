package kr.ac.kpo.day0328.homework;

import java.util.Calendar;

public class CalendarUtil {
	
	private Calendar c;
	
	public CalendarUtil() { //인스 생성시 객체를 생성하는 방식
		c = Calendar.getInstance();
	}
	
	public void showByYear(int year) {
		
		for(int month = 1; month <= 12; month++) {
			showByMonth(year, month);
		}
	}
	
	public void showByMonth(int year, int month) {
		
		System.out.printf("*** %4d년 %02d월 ***\n", year, month);
		
		// year/month/1 날짜정보 수정
		c.set(year, month-1, 1);
		
		// 요일 추출
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		// 해당월의 마지막 날
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("week : " + week + ", lastday : " + lastday);
		
		showByDay(week, lastday);
	}
	
	//실제 매커니즘이 들어가는 메소드이며 외부에 표출해줄 필요가 없기 때문에 private 으로, 외부에서 호출할때 해당 클래스는 보이지 않음
	private void showByDay(int week, int lastday) {//혹은 해당 클래스에서만 사용하기 때문에 private으로 
		
		System.out.println("==========================================================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("==========================================================");
		int cnt = 0; // \t의 갯수를 확인
		for(int i=1; i < week; i++) {
			System.out.print("\t");
			++cnt;
		}
		for(int day=1; day<=lastday; day++) {
			System.out.print(day + "\t");
			if(++cnt % 7 == 0) { // \t의 갯수가 7개면 다음줄로 넘어가기
				System.out.println();
			}
		}
		if(cnt % 7 != 0) {
			System.out.println();
		}
		System.out.println();
		System.out.println("==========================================================");
	}

}
