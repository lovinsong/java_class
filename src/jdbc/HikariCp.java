package jdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCp {

	// 1�� directly instantiate a HikariDataSource like so:
	// �ν��Ͻ��� �ٷ� �̿��ϴ� ���
	// Config ����� �������� �̷��� �ϼ���
	
//	public static void main(String[] args) {
//		
//			HikariDataSource ds = new HikariDataSource();
//			ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
//			ds.setUsername("hr");
//			ds.setPassword("1234");
//	
//			try {
//			
//			Connection conn = ds.getConnection();
//
//			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
//
//			ResultSet rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//				System.out.printf("%-15s\t%-10s\t%-10d\t%-10d\n", rs.getString("last_name"), rs.getString("first_name"),
//						rs.getInt("salary"), rs.getInt("department_id"));
//			}
//
//			rs.close();
//			pstmt.close();
//			conn.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//			
//	}

	// 2�� property file based: �� �̿��� ���
	// Examines both filesystem and classpath for .properties file
	// ������ ���� �������� �ҷ����� ���
//	public static void main(String[] args) {
//
//		// ���� ���Ͽ� ����� ���� �̿��ϴ� ���
//		// Map, ��ųʸ�, �Ӽ�, Property, Entry, JSON.. 
//		// �����͸� Key=Value���·� �ٷ�� �͵�
//		
//		// �� ������Ʈ ������ ��θ� ã�ư� ��
//		HikariConfig config = new HikariConfig("some/path/hikari.properties");
////		HikariConfig config = new HikariConfig("F:\\�ڹ�SW������ �缺���� 10�� �۸���\\git\\java_class\\assets\\hikari.properties");
//		HikariDataSource ds = new HikariDataSource(config);
//
//		try {
//			Connection conn = ds.getConnection();
//
//			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
//
//			ResultSet rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//				System.out.printf("%-15s\t%-10s\t%-10d\t%-10d\n", rs.getString("last_name"), rs.getString("first_name"),
//						rs.getInt("salary"), rs.getInt("department_id"));
//			}
//
//			rs.close();
//			pstmt.close();
//			conn.close();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//	}
	
	// 3�� java.util.Properties based:
	// ���� ���� ��ü�� �����ؼ� �����ϴ� ���
	
	public static void main(String[] args) {
		
		Properties props = new Properties();
		props.setProperty("dataSourceClassName", "oracle.jdbc.pool.OracleDataSource");
		props.setProperty("dataSource.url", "jdbc:oracle:thin:@localhost:1521/XEPDB1");
		props.setProperty("dataSource.user", "hr");
		props.setProperty("dataSource.password", "1234");
		props.setProperty("dataSource.databaseName", "oracle");
		props.put("dataSource.logWriter", new PrintWriter(System.out));
		
		HikariConfig config = new HikariConfig(props);
		HikariDataSource ds = new HikariDataSource(config);
		
		try {
			
			Connection conn = ds.getConnection();

			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.printf("%-15s\t%-10s\t%-10d\t%-10d\n", rs.getString("last_name"), rs.getString("first_name"),
						rs.getInt("salary"), rs.getInt("department_id"));
			}

			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
