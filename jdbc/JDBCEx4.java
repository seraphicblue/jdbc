package day0310.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCEx4 {

	public static void main(String[] args) {
		//update customer set phone='010-0000-6666' where custid =6;
		Connection conn = null;
		PreparedStatement pstmt = null;//객체생성안될수도 있으면  NULLEXCEPTION 발생할수있음

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madang", "madang", "madang");
	        pstmt = conn.prepareStatement("update customer set phone=? where custid =?");
	        pstmt.setString(1,"010-0000-6666");
	        pstmt.setInt(2, 6);
	        
	        int x = pstmt.executeUpdate();//실행 select면 excutequery로 실행
	        
	        if(x==1) {
	        	System.out.println("전화번호 변경");
	        }else {
	        	System.out.println("없는 고객번호 입니다");
	        }
	        
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
