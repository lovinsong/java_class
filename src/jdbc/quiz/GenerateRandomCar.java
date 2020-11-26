package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GenerateRandomCar {

	// ���� ���� ���� �ڵ������� 100�� �����Ǿ� DB�� ����Ǵ� ���α׷��� ��������

	// ������ȣ�� ���� - ����Ʈ ����
	// https://post.naver.com/viewer/postView.nhn?volumeNo=24171702&memberNo=35787715
	// ��ȣ�� ���� ������ �ڿ� ��ȣ�� ���� �����Ǵ� �͵� �����Ͽ�
	// ������ü�� ������ �� DB�� �˸°� �����غ�����
	// ���ڸ� 00 ~ 99
	// 01 ~ 69 : �¿���
	// 70 ~ 79 : ������
	// 80 ~ 97 : ȭ����
	// 98 ~ 99 : Ư������
	// �� �� �� �� ��
	// �� �� �� �� ��
	// �� �� �� �� ��
	// �� �� �� �� ��
	// �� �� �� �� ��
	// �� �� �� �� �� �� ��
	// �� �� �� �� : ������ ����
	// �� �� ȣ : ���� ī

	// ex : 69 �� 0001 : ������ �¿���
	// ex : 75 �� 0001 : ȭ�� ���� ī
	// --> �տ� ���ڸ� �ɷ���
	// -- > �ѱ� �ɷ� :

	// JAVA�ڵ�� DB��ũ����

	public static void main(String[] args) {

//			System.out.print(front_Num + " ");
//			System.out.print(mid_Word + " ");
//			System.out.print(back_Num + " ");
//			System.out.print(car_type);

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "1234");

			String sql = "INSERT INTO cars VALUES (?, ?, ?, ?, ?, ?, ?)";

			for (int i = 0; i < 100; ++i) {

				Random ran = new Random();
				Calendar korea_time = Calendar.getInstance();

				String[] Word = new String[] { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
						"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
						"��", "��", "��", "��", "��", "ȣ" };

				List<String> wordList = Arrays.asList(Word);
				Collections.shuffle(wordList);
				String mid_Word = wordList.get(0);
				int front_Num = ran.nextInt(99) + 1;
				int back_Num = ran.nextInt(9899) + 100;
				

				String car_Use;
				if (mid_Word.equals("��") || mid_Word.equals("��") || mid_Word.equals("��") || mid_Word.equals("��")) {
					car_Use = "������";
				} else if (mid_Word.equals("��") || mid_Word.equals("��") || mid_Word.equals("ȣ")) {
					car_Use = "��Ʈ��";
				} else
					car_Use = "�Ϲ�";

				String car_Type;
				if (front_Num <= 69) {
					car_Type = "�¿���";
				} else if (front_Num <= 79) {
					car_Type = "������";
				} else if (front_Num <= 97) {
					car_Type = "ȭ����";
				} else
					car_Type = "Ư�� ����";
				
				String check_num;
				if (back_Num % 10 == 1 || back_Num % 10 == 6) {
					check_num = "������ ���� ����";
				} else if (back_Num % 10 == 2 || back_Num % 10 == 7) {
					check_num = "ȭ���� ���� ����";
				} else if (back_Num % 10 == 3 || back_Num % 10 == 8) {
					check_num = "������ ���� ����";
				} else if (back_Num % 10 == 4 || back_Num % 10 == 9) {
					check_num = "����� ���� ����";
				} else {
					check_num = "�ݿ��� ���� ����";
				}

				String today;
				int korea_today = korea_time.get(Calendar.DATE);
				if((int)(korea_today % 10) == (back_Num - (int)Math.floor(back_Num/10)*10)) {
					today = "���� ����";
				}else {
					today = "���� ����";
				}
				
				
				PreparedStatement pstmt = conn.prepareStatement(sql);

				pstmt.setInt(1, front_Num);
				pstmt.setString(2, mid_Word);
				pstmt.setInt(3, back_Num);
				pstmt.setString(4, car_Use);
				pstmt.setString(5, car_Type);
				pstmt.setString(6, check_num);
				pstmt.setString(7, today);
				
				

				int row = pstmt.executeUpdate(); // �߰� ���ִ� ����
			}
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
