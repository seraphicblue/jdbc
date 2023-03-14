package bookstore;

import java.util.Date;

public class OrdersDto {

	private int orderid;
	private String name;
	private String bookname;
	private Date orderdate;
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	@Override
	public String toString() {
		return "OrdersDto [orderid=" + orderid + ", name=" + name + ", bookname=" + bookname + ", orderdate="
				+ orderdate + "]";
	}
}
