package day0310.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dfdfdfdfdfdfdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement pstmt = null;//객체생성안될수도 있으면  NULLEXCEPTION 발생할수있음

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madang", "madang", "madang");
	        pstmt = conn.prepareStatement("delete from customer where custid =?");
	        pstmt.setInt(1, 6);
	        
	        int x = pstmt.executeUpdate();//실행 select면 excutequery로 실행
	        
	        if(x==1) {
	        	System.out.println("삭제 성공");
	        }else {
	        	System.out.println("없는 고객번호 입니다");
	        }
	        
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt !=null) {
				try{pstmt.close();}catch (SQLException e) {}//null exception 처리
			}
			if(conn !=null) {
				try{conn.close();}catch (SQLException e) {}
			}
		
	}


	}}

