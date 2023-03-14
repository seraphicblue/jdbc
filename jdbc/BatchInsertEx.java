package day0310.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchInsertEx {
	public static void main(String[] args) {

		boolean commit = false;
		// create table test(id varchar(10) primary key, password varchar(10))

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madang", "madang", "madang");
			stmt = conn.createStatement();

			conn.setAutoCommit(false);//트랜잭션 시작
            //모아둠
			stmt.addBatch("INSERT INTO test " + "VALUES('abc1011', '1111')");
			stmt.addBatch("INSERT INTO test " + "VALUES('abc2022', '2222')");
			stmt.addBatch("INSERT INTO test " + "VALUES('abc3033', '3333')");//중간에 중복이생기면 앞에 값들도 취소
			stmt.addBatch("INSERT INTO test " + "VALUES('abc4044', '4444')");
           
			int[] updateCounts = stmt.executeBatch();//실행
			commit = true;
			conn.commit();
			conn.setAutoCommit(commit);

			rs = stmt.executeQuery("SELECT * FROM test");

			while (rs.next()) {
				String id = rs.getString("id");
				String password = rs.getString("password");
				System.out.println("id : " + id + " , password : " + password);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (!commit)
					conn.rollback();
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
	}
}
