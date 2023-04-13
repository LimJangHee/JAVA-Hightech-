package kr.ac.kpo.day0413.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBMain {
	
	public static void main(String[] args) {
		
		
		try {
			// 1. 드라이버 로딩 -> 예외처리 해줘야됨
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료...");
			
			// 2. DB접속 -> catch에서 Exception으로 형변환해서 예외처리 같이 해줌
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("DB 연결 성공...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
