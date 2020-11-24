package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

	// ������ ���� ���Ͽ��� �о���� �͵� ���� ����̴�
	final static String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	final static String id = "hr";
	final static String password = "1234";	
	
	// ����̹� �ε�� �ѹ��� �ϸ� �Ǳ� ������ static ��Ͽ� ����
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		}
	}
	
	// ����Ʈ�� Ŀ�ؼ��� �̸� �����صΰ�, ��������� ���� Ŀ�ؼ��� �����ֱ�
	List<JdbcConnection> pool;
		
	public ConnectionPool(int size) {	
		pool = new ArrayList<>(size);
		
		for (int i = 0; i < size; ++i)
			pool.add(new JdbcConnection());		
	}
	
	public JdbcConnection getConnection() {
		for (JdbcConnection jconn : pool) {
			if (!jconn.using) {
				jconn.using = true;
				return jconn;
			}
		}		
		System.out.println("���� ������Դϴ�.");
		return null;
	}
	
	class JdbcConnection {
		Connection conn;
		boolean using;
		
		public JdbcConnection() {
			try {
				conn = DriverManager.getConnection(url, id, password);
				using = false;				
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
		
		public void close() {
			using = false;
		}
	}	
	
	public static void main(String[] args) {
		ConnectionPool src = new ConnectionPool(3);
		
		JdbcConnection conn1 = src.getConnection();
		System.out.println("conn1 addr : " + conn1);			
		
		JdbcConnection conn2 = src.getConnection();
		System.out.println("conn2 addr : " + conn2);
		
		JdbcConnection conn3 = src.getConnection();
		System.out.println("conn3 addr : " + conn3);
		
		// close�� �ϸ� Connection�� ���� ��� ��������� ���� ���·� �����Ѵ�
		conn1.close();
		conn2.close();
		conn3.close();
		
		JdbcConnection conn4 = src.getConnection();
		System.out.println("conn4 addr : " + conn4);
	}
}