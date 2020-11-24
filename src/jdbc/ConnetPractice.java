package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnetPractice {

	// ����ڷκ��� �μ���ȣ�� �Է¹�����
	// �ش� �μ��� ��� ������� ������ ��ȸ�ؼ� �ֿܼ� ����غ�����
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("ojdbc ���� ����");
			
			Connection conn  = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"1234"
			);
			System.out.println("���� ����");
			
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
