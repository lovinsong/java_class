package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CUD {

	// # CRUD
	// - ��� ���α׷��� CRUD�� �ִ�
	// C : Create (INSERT)
	// R : Read (SELECT)
	// U : Update (UPDATE)
	// D : Delete (DELETE)

	// JDBC���� SELECT�� �ϸ� ResultSet�� ��ȯ�ȴ�
	// �� ���� INSERT, UPDATE, DELETE�� ����� ���� ��ȯ�ȴ�.
	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "1234");

			String sql = "INSERT INTO coffees VALUES (empp_seq.nextval, ?, ?)";

			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, "ī���");
			pstmt.setInt(2, 3200);

			// pstmt.executeQuery()
			// - ResultSet�� ��ȯ�� ���� ����(SELECT)�� �����ų �� ����Ѵ�

			// pastmt.executeUpdate()
			// - DML�� INSERT, UPDATE, DELETE �Ǵ� ��ȯ�Ǵ� ���� ����
			// DDL ���� �������� �����ų �� ����Ѵ�

			int row = pstmt.executeUpdate();

			System.out.printf("%d ���� ����Ǿ����ϴ�.\n", row);

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
