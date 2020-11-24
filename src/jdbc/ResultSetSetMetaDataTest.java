package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetSetMetaDataTest {
	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "1234");

			String sql = "SELECT * FROM employees INNER JOIN departments" + " USING(department_id)";

			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			
			// ���������� ������ ResultSet�� ���� ���� ��� ��ü
			ResultSetMetaData rsmd = rs.getMetaData();
			

			System.out.println("�÷� ���� : " + rsmd.getColumnCount());
			
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.println(i + "��° �÷� ����:");
				System.out.println("\t�÷� �̸�: " + rsmd.getColumnName(i));
				System.out.println("\t�÷� Ÿ�� �̸�: " + rsmd.getColumnTypeName(i));
				System.out.print("\t�÷� Ÿ�� ��ȣ: " + rsmd.getColumnType(i));
			
				switch (rsmd.getColumnType(i)) {
				case java.sql.Types.VARCHAR:
					System.out.println(" (varchar)");
					break;
				case java.sql.Types.NUMERIC:
					System.out.println(" (number)");
					break;
				case java.sql.Types.DATE:
					System.out.println(" (date)");
					break;
				case java.sql.Types.TIMESTAMP:
					System.out.println(" (timestamp)");
					break;
				default:
					System.out.println(" ( �𸥴� )");
					break;
				}
				System.out.println("\t�÷� ũ�� : " + rsmd.getColumnDisplaySize(i));				
			}
			
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();

			System.out.println();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
