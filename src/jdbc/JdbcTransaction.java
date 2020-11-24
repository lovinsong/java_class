package jdbc;

import java.sql.*;

public class JdbcTransaction {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("ojdbc 연결 성공");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "1234");

			// 자동 커밋이 기본적으로 활성화 되어 있으므로
			// 트랜젝션 제어를 위해서는 자동 커밋을 비활성화 해야한다
			conn.setAutoCommit(false);
			
			String sql1 = "UPDATE coffees SET cprice = cprice + 500 WHERE CFID <= 150";
			
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			
			int row = pstmt1.executeUpdate();
			
			System.out.println(row + "행이 변했습니다.");
			
			String sql2 = "SELECT AVG(cprice) FROM coffees";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			
			ResultSet rs = pstmt2.executeQuery();
			
			double avg_price = 0;
			if(rs.next()) {
				avg_price = rs.getDouble(1);
			}
			
			System.out.println("평균 커피값이 " + avg_price + "입니다.");
			if(avg_price < 2000) {
				System.out.println("커피값 오름");
				conn.commit();	//DML의 결과를 확정 짓는다
			}else {
				System.out.println("커피값 동결");
				conn.rollback();	// DML결과를 되돌린다
			}
			
			if(pstmt1 != null)pstmt1.close();
			if(conn != null)conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 못 찾음");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
