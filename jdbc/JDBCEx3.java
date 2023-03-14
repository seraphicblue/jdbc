package day0310.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx3 {
//customer 테이블에 6,'손흥민','영국 토트넘''010-1111-1111'
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;//객체생성안될수도 있으면  NULLEXCEPTION 발생할수있음

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madang", "madang", "madang");
			stmt = conn.createStatement();
			int x = stmt.executeUpdate("insert into customer values" + "(6,'손흥민','영국 토트넘','010-1111-1111')");
			if (x == 1) {
				System.out.println("입력완료");
			} else {
				System.out.println("입력실패");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(stmt !=null) {
				try{stmt.close();}catch (SQLException e) {}//null exception 처리
			}
			if(conn !=null) {
				try{conn.close();}catch (SQLException e) {}
			}
		}
	}

}
