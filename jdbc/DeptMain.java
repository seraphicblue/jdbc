package day0310.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeptMain {
	
	private static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/madang", "madang", "madang");
	}
	
	public static void main(String[] args) {
		//	모든 부서 정보 조회
		Connection conn = null;
		try {
			conn = getConnection();
            DeptService service = new DeptService();
			service.DeptAll(conn);
			service.deptOne(conn);
			service.searchDept(conn);
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}