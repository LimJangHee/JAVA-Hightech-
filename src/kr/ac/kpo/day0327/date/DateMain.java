package kr.ac.kpo.day0327.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
	
	public static void main(String[] args) {
		
		
		Calendar c = Calendar.getInstance(); //추상클래스라 new를 못함
		System.out.println("c : " + c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK); //1(일) ~ 7(토)
		
		System.out.println("오늘은 " + year + "년" + month + "월" + date + "일" + date + "입니다.");
		
		// 날짜를 변경 2020년 5월 5일로
		c.set(2022, 5-1, 15); //month가 0~11이라서 1빼줘야됨
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2020/5/5 무슨요일 : " + day);
		
		Date d = c.getTime();
		System.out.println(d);
		
		System.out.println("1 ~ 12월 중 가장 큰달 : " + (c.getActualMaximum(Calendar.MONTH)+1));
		System.out.println("1 ~ 12월 중 가장 작은달 : " +( c.getActualMinimum(Calendar.MONTH)+1));
		System.out.println("5월의 마지막날 : " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		
		//현재시간을 년-월-일 시:분:초 표현
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		System.out.println(sdf.format(c.getTime()));
		
		
		

		
		
		
		
		
		
//		Date 클래스		
//		Date d = new Date();
//		System.out.println("d : " + d.toString()); //toString 메소드를 오버라이딩해서 주소값이 아닌 현 시간이 나옴
//		
//		오늘은 2023년 3월 27일 (월)입니다
//		int year = d.getYear() + 1900; //deprecated의미 -> 더 높은 버젼의 좋은 메소드가 존재함
//		int month = d.getMonth() + 1;
//		int date = d.getDate();
//		int day = d.getDay(); // 0(일) ~ 6(토)
//		String[] dayArr = {"일", "월", "화", "수", "목", "금", "토"};
//		System.out.println("오늘은" + year + "년" + month + "월" + date + "일" + day + "입니다");
	}

}
