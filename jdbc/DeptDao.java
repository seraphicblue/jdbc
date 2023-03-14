package day0310.jdbc;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDao {// 수행할 sql문마다 메서드 선언
	public DeptDTO searchDept(Connection conn, String dname) {
		DeptDTO dto = null;
	String sql = "select *from dept where dname like ?";
	try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
		pstmt.setString(1, "%"+dname+"%");

		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			dto = new DeptDTO();
			dto.setDeptno(rs.getInt("deptno"));
			dto.setDname(rs.getString("dname"));
			dto.setLoc(rs.getString("loc"));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return dto;

}
		
		
	
	public DeptDTO deptOne(Connection conn, int deptno) {
		DeptDTO dto = null;
		String sql = "select *from dept where deptno =?";
		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, deptno);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				dto = new DeptDTO();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;

	}

	// select *from dept rs=>자바객체 SELECT 여러줄,컬럼 여러개 -> List<dto>
	public List<DeptDTO> deptAll(Connection conn) {
		List<DeptDTO> dlist = new ArrayList<>();
		String sql = "select*from dept";
		// 한줄,컬럼전부다

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				DeptDTO dto = new DeptDTO();
				dto.setDeptno(rs.getInt("deptno"));// nextcl로 각각 값저장 해서 dto 객체 생성
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));

				dlist.add(dto);// dto 객체의 주소값저장
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dlist;
	}
}