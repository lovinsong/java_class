package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCpTest {

	public static void main(String[] args) {

		
		// HikariConfig 객체에 설정을 넣은 후 DataSource 생성자에 전달
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
		config.setUsername("hr");
		config.setPassword("1234");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

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

			// ConnectionPool을 사용할 때는 conn을 닫는 대신 ds를 닫아야 한다.
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
