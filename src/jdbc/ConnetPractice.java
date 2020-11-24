package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnetPractice {

	// 사용자로부터 부서번호를 입력받으면
	// 해당 부서의 모든 사원들의 정보를 조회해서 콘솔에 출력해보세요
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("ojdbc 연결 성공");
			
			Connection conn  = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"1234"
			);
			System.out.println("연결 성공");
			
			PreparedStatement pstmt =
					conn.prepareStatement("SELECT * FROM employees " 
								+ "WHERE department_id IN ?");
			pstmt.setInt(1, 50);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%-15s\t%-15s\t%-15s\t%-15s\t%-15s\t%-15s\t%-15s\t%-10d\t%-10d%-10d\t%-10d\n",
				rs.getString("employee_id"),
				rs.getString("first_name"),
				rs.getString("last_name"),
				rs.getString("email"),
				rs.getString("phone_number"),
				rs.getString("hire_date"),
				rs.getString("job_id"),
				rs.getInt("salary"),
				rs.getInt("commission_pct"),
				rs.getInt("manager_id"),
				rs.getInt("department_id")
					);
				}
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
