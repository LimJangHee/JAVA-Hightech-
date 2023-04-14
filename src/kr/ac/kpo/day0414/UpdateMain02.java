package kr.ac.kpo.day0414;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kpo.util.ConnectionFactory;

public class UpdateMain02 {
	
	public static void main(String[] args) {
		
		//1.7버전 try문 -> finally를 통한 close를 하지 않음
		
		// String은 AutoCloseable을 상속받지 않았기 때문에  try() 밖에다가 미리 쿼리를 생성해줘야됨
		String sql = "update t_test ";
			   sql += "   set name = ? ";
			   sql += " where id = ? ";
					   
		try ( //해당 괄호 안에는 AutoCloseable을 상속받은 대상만 객체 생성이 가능하며
			//해당 객체들은 try문이 끝나면 자동으로 close를 해주기 때문에 finally에서 close를 해주지 않아도 됨
				Scanner sc = new Scanner(System.in);
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql); //쿼리 객체화(집어넣기 위한) 대상
				
				) {
			System.out.print("아이디를 입력 : ");
			String id = sc.nextLine();
			System.out.print("변경할 이름을 입력 : ");
			String name = sc.nextLine();
			
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			
			int cnt = pstmt.executeUpdate(); 
			if(cnt == 0) {
				System.out.println("해당 아이디가 존재하지 않습니다.");
			} else {
				System.out.println("이름변경이 완료되었습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
