package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class GenerateRandomCarSol {

	//	���� ��ȣ�� ����
	//	https://post.naver.com/viewer/postView.nhn?volumeNo=24171702&memberNo=35787715 
	
	// 	���� ���� ���� �ڵ������� 100�� �����Ǿ� DB�� ����Ǵ� ���α׷��� �������� 
	
	//  ���� ��ȣ�� 
	//		01 ~ 69 : �¿��� / 
	//  	70 ~ 79 : ������ /
	// 		80 ~ 97 : ȭ���� / 
	//		98 ~ 99 : Ư����(����,�ý�,�ù� ���)
	//	�߰� �ѱ� �з�	
	// 	 - �ڰ��� : �����ٶ󸶰ųʴ����ӹ���������뵵�θ𺸼ҿ��������η繫�μ����� (PRIVATE)
	// 	 - �Ϲݿ�(�ýÿ� ���� ��������) : �ƹٻ��� (BUSINESS)
	// 	 - �뿩�����(����ī) : ����ȣ (RENTAL) 
	//  0100~9999 ����	
	
	// 	������ȣ�� ���� - ����Ʈ ���� 
	// 	��ȣ�� ���� ������ �ڿ� ��ȣ�� ���� �����Ǵ� �͵� �����Ͽ�
	// 	������ü�� ������ �� DB�� �˸°� �����غ�����
	
	// 	�� JAVA�ڵ�� DB��ũ������ �����ֽø� �˴ϴ�
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");		
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"1234"
			);
			PreparedStatement pstmt = 
					conn.prepareStatement("INSERT INTO random_car_table"
							+ " VALUES(?, ?, ?)");
			
			// Batch : �ϰ�ó�� 
			for (int i = 0; i < 100; ++i) {
				Car car = Car.ran();
				pstmt.setString(1, car.getPlateNumber());
				pstmt.setString(2, car.getCtype());
				pstmt.setString(3, car.getUsage());				
				pstmt.addBatch();
				// int row = pstmt.executeUpdate();
				// System.out.println(row + "���� ������Ʈ �Ǿ����ϴ�.");
			}
			// ��Ҵٰ� �ѹ��� executeBatch()�ϸ� �� ������ �������� �迭�� ��ȯ�ȴ�
			int[] rows = pstmt.executeBatch();			
			System.out.println(Arrays.toString(rows));
			
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		
			System.out.println("����");
		} catch (SQLException e) {			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {			
			System.out.println("[ojdbc] Ŭ���� ��ΰ� Ʋ�Ƚ��ϴ�.");
		}
	}
}