package quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class F01_CalendarQuiz {

	// DB�� ����Ǿ� �ִ� ���������� ��ȸ�ؼ� ���� 5������ ������ ������

	// ���� ���� ������ ������ �����
	// ���� ������ ������ ������ ��� ������ ����غ�����

	public static void main(String[] args) {
		HikariConfig config = new HikariConfig("some/path/hikari.properties");
		HikariDataSource ds = new HikariDataSource(config);

		try {
			Connection conn = ds.getConnection();

			PreparedStatement pstmt = conn
					.prepareStatement("SELECT * FROM random_car_table WHERE REGEXP_LIKE(car_id, ?)");

			pstmt.setString(1, getTodaysRegExp());

			ResultSet rs = pstmt.executeQuery();

			int count = 0;
			System.out.println("��ȣ��\t\t����\t�뵵\t���ݿ���");
			System.out.println("-----------------------");
			while (rs.next()) {
				System.out.printf("%s\t%s\t%s\t����\n", rs.getString(1), rs.getString(2), rs.getString(3));
				++count;
			}
			System.out.printf("������ ���� ������ �� %d�� �Դϴ�.\n", count);

			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String getTodaysRegExp() {
		Calendar c = Calendar.getInstance();

		switch (c.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.MONDAY:
			return ".*1$|6$";
		case Calendar.TUESDAY:
			return ".*2$|7$";
		case Calendar.WEDNESDAY:
			return ".*3$|8$";
		case Calendar.THURSDAY:
			return ".*4$|9$";
		case Calendar.FRIDAY:
			return ".*5$|10$";
		default:
			return ".";
		}

	}

}
