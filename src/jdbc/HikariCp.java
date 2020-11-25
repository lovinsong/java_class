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

	// 1번 directly instantiate a HikariDataSource like so:
	// 인스턴스를 바로 이용하는 방법
	// Config 만들기 귀찮으면 이렇게 하세요
	
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

	// 2번 property file based: 를 이용한 방법
	// Examines both filesystem and classpath for .properties file
	// 파일을 만들어서 그파일을 불러오는 방법
//	public static void main(String[] args) {
//
//		// 설정 파일에 저장된 값을 이용하는 방법
//		// Map, 딕셔너리, 속성, Property, Entry, JSON.. 
//		// 데이터를 Key=Value형태로 다루는 것들
//		
//		// ※ 프로젝트 내부의 경로를 찾아갈 때
//		HikariConfig config = new HikariConfig("some/path/hikari.properties");
////		HikariConfig config = new HikariConfig("F:\\자바SW개발자 양성과정 10월 송만기\\git\\java_class\\assets\\hikari.properties");
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
	
	// 3번 java.util.Properties based:
	// 설정 파일 객체를 생성해서 전달하는 방법
	
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
