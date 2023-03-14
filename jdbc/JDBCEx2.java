package day0310.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx2 {
//select*from book 북테이블의 record 를 여러개 가져온다
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}// 2. db접속-connection -url,user,password
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/madang", "madang", "madang");
			// 3. sql문 실행
			Statement stmt = conn.createStatement();
		    ResultSet rs =stmt.executeQuery("select*from book");
		    while(rs.next()) {
		    	//int bookid = rs.getInt("bookid");
				String bookname = rs.getString("bookname");
				String publisher = rs.getString(3);
				int price = rs.getInt(4);//int가 null일때 기본값인 0으로 반환해준다.(int null은 불가능)

				System.out.printf("이름 :%s 출판사:%s 가격:%d\n", bookname, publisher, price);
		    }
		    rs.close();
		    stmt.close();
		    conn.close();
		    
		} catch (SQLException e) {
			e.printStackTrace();
	}
	}}

