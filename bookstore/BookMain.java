package bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class BookMain {
	private static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/madang", "madang", "madang");
	}
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = getConnection();
			
			BookService service = new BookService();
			Scanner s = new Scanner(System.in);
			while(true) {
				System.out.println("메뉴를 선택하세요.");
				System.out.println("======================");
				System.out.println("1. 책 이름 검색 2. 고객 이름 검색 3. 주문 내역 확인 4. 책 추가");
				System.out.println("======================");
				int menu = s.nextInt();
				if (menu == 1) {
					service.searchBook(conn);
				}else if(menu == 2) {
					service.searchName(conn);//고객 이름 검색 추가할 것
				}else if(menu == 3) {
					service.checkOrder(conn);
				}else if(menu == 4) {
					service.insertBook(conn);
				}else {
					System.out.println("프로그램 종료");
					break;
				}
			}
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
