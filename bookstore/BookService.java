package bookstore;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class BookService {

	BookDao dao = new BookDao();
	
	public void insertBook(Connection conn) {
		System.out.println("책을 추가합니다.");
		
		int bookid = dao.nwId(conn);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("bookname > ");
		String bookname = scan.nextLine();
		
		System.out.print("publisher > ");
		String publisher = scan.nextLine();
		
		System.out.print("price > ");
		int price = scan.nextInt();
		
		
		BookDto dto = new BookDto(bookid, bookname, publisher, price);
		int i = dao.insertBook(conn, dto);
		
		if(i != 0) {
			System.out.println(dto+" 추가됨");
		}
		
	}
	
	
	
	
	public void checkOrder(Connection conn) {
		System.out.println("주문 내역");
		List<OrdersDto> list = dao.checkOrder(conn);
		if(list.size() == 0) {
			System.out.println("주문 내역이 없습니다.");
		}else {
			for(OrdersDto o : list) {
				System.out.println(o);
			}
		}
	}
	
	public void searchBook(Connection conn) {
		System.out.println("도서명 검색");
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("검색 > ");
		 String bookname = scanner.nextLine();
		 
		 List<BookDto> list = dao.searchBook(conn, bookname);
		 if(list.size() == 0) {
			 System.out.println("검색 조건에 맞는 책이 없습니다.");
		 }else {
			 for(BookDto b : list) {
				 System.out.println(b);
			 }
		 }}
		 public void searchName(Connection conn) {
				System.out.println("고객명 검색");
				 Scanner scanner = new Scanner(System.in);
				 System.out.print("검색 > ");
				 String name = scanner.nextLine();
				 
				 List<CustomerDto> list = dao.searchName(conn, name);
				 if(list.size() == 0) {
					 System.out.println("검색 조건에 맞는 책이 없습니다.");
				 }else {
					 for(CustomerDto b : list) {
						 System.out.println(b);
					 }
				 }
	}
	
	
}





