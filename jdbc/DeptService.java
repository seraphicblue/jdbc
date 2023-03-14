package day0310.jdbc;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class DeptService {
	
	DeptDao dao=new DeptDao();
	public void searchDept(Connection conn) {
		System.out.print("부서명의 일부를 입력하세요> ");
		Scanner sc =new Scanner(System.in);
		String dname = sc.nextLine();
		DeptDTO dto=dao.searchDept(conn, dname);
		if (dto==null) {
			System.out.println("입력하신 부서명는 없습니다.");
		}else {
			System.out.println(dto);
		}
		
	}
		
	
	
	public void deptOne(Connection conn) {
		System.out.print("부서번호를 입력하세요> ");
		Scanner sc =new Scanner(System.in);
		int deptno = sc.nextInt();
		DeptDTO dto=dao.deptOne(conn, deptno);
		if (dto==null) {
			System.out.println("입력하신 부서는 없습니다.");
		}else {
			System.out.println(dto);
		}
		
	}
	
	public void DeptAll(Connection conn) {
		List<DeptDTO> dlist =dao.deptAll(conn);
		System.out.println("전체 부서 정보");
		for(DeptDTO dept :dlist) {
			System.out.println(dept);
		}
		System.out.println("==========end===========\n");
	}
}






