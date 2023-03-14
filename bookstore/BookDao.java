package bookstore;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
	//1. 책 이름 검색 
	//select * from book where bookname like ?
	
	public List<BookDto> searchBook(Connection conn, String bookname){
		List<BookDto> list = new ArrayList<>();
		String sql = "select * from book where bookname like ?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, "%"+bookname+"%");
			ResultSet rs =  pstmt.executeQuery();
			
			
			while(rs.next()) {
				BookDto book = new BookDto();
				book.setBookid(rs.getInt("bookid"));
				book.setBookname(rs.getString("bookname"));
				book.setPublisher(rs.getString("publisher"));
				book.setPrice(rs.getInt("price"));
				
				list.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	//2. 고객 이름 검색
	public List<CustomerDto> searchName(Connection conn, String name){
		List<CustomerDto> list = new ArrayList<>();
		String sql = "select name,custid from customer where name like ?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, "%"+name+"%");
			ResultSet rs =  pstmt.executeQuery();
			
			while(rs.next()) {
				CustomerDto customer = new CustomerDto();
				customer.setname(rs.getString("name"));
				list.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//3. 주문 내역 확인(주문번호, 고객명, 책이름, 주문 일자)
	
	 public List<OrdersDto> checkOrder(Connection conn){
		 String sql = "select orderid, name, bookname, orderdate"
		 		+ " from customer c, orders o , book b"+
				 " where c.custid = o.custid and o.bookid = b.bookid";
		 List<OrdersDto> list = new ArrayList<>();
		 try(PreparedStatement pstmt = conn.prepareStatement(sql);
				 ResultSet rs = pstmt.executeQuery(); ){
			 while(rs.next()) {
				 OrdersDto dto = new OrdersDto();
				 dto.setOrderid(rs.getInt("orderid"));
				 dto.setName(rs.getString("name"));
				 dto.setBookname(rs.getString("bookname"));
				 dto.setOrderdate(rs.getTimestamp("orderdate"));
				 list.add(dto);
			 }
		 } catch (SQLException e) {
			e.printStackTrace();
		}
		return list; 
	 }
	//4. 책 추가
	// select max(bookid)+1 from book 
	public int nwId(Connection conn) {
		String sql = "select max(bookid)+1 from book";
		int i = 0;
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();){
			
			if(rs.next()) {
				i = rs.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	// insert into book values (?,?,?,?)
	public int insertBook(Connection conn, BookDto dto) {
		int i = 0;
		String sql = "insert into book values (?,?,?,?)";
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, dto.getBookid());
			pstmt.setString(2, dto.getBookname());
			pstmt.setString(3, dto.getPublisher());
			pstmt.setInt(4, dto.getPrice());
			
			i = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
}






