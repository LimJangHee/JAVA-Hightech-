package kr.ac.kpo.day0414;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kpo.util.ConnectionFactory;
import kr.ac.kpo.util.JDBCClose;

//class Employee implements AutoCloseable {
//
//	@Override
//	public void close() throws Exception {
//		
//	}
//	
//}

/*
 	아이디를 입력 : hong
 	수정할 이름을 입력 : 
 	이름 변경이 완료되었습니다
 	
 	아이디를 입력
 */

public class UpdateMain {
	
	public static void main(String[] args) {
		
		// 1.7버전 try catch
		// 괄호 안에서 AutoCloseable interface를 상속받은 객체만 생성해서 사용가능
		// try catch문이 끝나면 이 괄호 안에 있는 해당 객체는 자동으로 close를 해줌
//		try(
//				Employee e = new Employee();
//				) {
//			
//		} catch (Exception e) {
//			e.prtinStackTrace();
//		}
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디를 입력 : ");
			String id = sc.nextLine();
			System.out.print("변경할 이름을 입력 : ");
			String name = sc.nextLine();
			
			String sql = "update t_test ";
				   sql += " set name = ? ";
				   sql += " where id = ? ";
				   
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			
			int cnt = pstmt.executeUpdate(); //위에서 새롭게 값을 넣어 업데이트 한거를 실제로 진행 -> 반환값을 int형으로
			if(cnt == 0) {
				System.out.println("해당 아이디가 존재하지 않습니다.");
			} else {
				System.out.println("이름변경이 완료되었습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn);
		}
		
	}

}
