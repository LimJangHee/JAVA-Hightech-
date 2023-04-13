package kr.ac.kpo.day0413.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kpo.util.ConnectionFactory;
import kr.ac.kpo.util.JDBCClose;

public class SelectMain01 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
//			ConnectionFactory factory = new ConnectionFactory();
//			conn = factory.getConnection();
			
			//1,2단계
			conn = new ConnectionFactory().getConnection();
			
			//3단계
			String sql = "select * from t_test ";
			pstmt = conn.prepareStatement(sql);
			
			//4단계 저장되어 있는 레코드들을 불러오기
			ResultSet rs = pstmt.executeQuery();
			// rs.next(); // 첫번째 레코드 값을 가르키며 값이 있을경우 true를, 없을 경우 false를 반환
			while(rs.next()) { //false값 즉 레코드가 없을때까지 반복
				String id = rs.getString("id"); //id컬럽에 있는 값
				String name = rs.getString("name");//name컬럼에 있는 값
				System.out.println(id + "(" + name + ")");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt,  conn);
		}
	}

}
