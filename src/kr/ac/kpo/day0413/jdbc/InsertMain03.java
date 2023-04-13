package kr.ac.kpo.day0413.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMain03 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2단계
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			// 3단계
			Scanner sc = new Scanner(System.in);

			System.out.print("삽입할 ID를 입력 : ");
			String id = sc.nextLine();

			System.out.print("삽입할 이름을 입력 : ");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id, name) values(?, ?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id); //배열과 달리 1 번부터 시작함
			pstmt.setString(2, name);
			
			// 4단계
			int cnt = pstmt.executeUpdate(); //preparedStatement는 쿼리 없이 실행만 해주면 됨
			System.out.println("총 " + cnt + "개 행 삽입...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
