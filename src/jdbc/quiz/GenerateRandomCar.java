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

	// 랜덤 값을 가진 자동차들이 100대 생성되어 DB에 저장되는 프로그램을 만들어보세요

	// 차량번호판 정보 - 사이트 참조
	// https://post.naver.com/viewer/postView.nhn?volumeNo=24171702&memberNo=35787715
	// 번호를 랜덤 생성한 뒤에 번호에 따라 결정되는 것들 적용하여
	// 차량객체를 생성한 후 DB에 알맞게 저장해보세요
	// 앞자리 00 ~ 99
	// 01 ~ 69 : 승용차
	// 70 ~ 79 : 승합차
	// 80 ~ 97 : 화물차
	// 98 ~ 99 : 특수차량
	// 가 나 다 라 마
	// 거 너 더 러 머
	// 버 서 어 저 고
	// 노 도 로 모 보
	// 소 오 조 구 누
	// 두 루 무 부 수 우 주
	// 아 바 사 자 : 영업용 차량
	// 하 허 호 : 랜터 카

	// ex : 69 아 0001 : 영업용 승용차
	// ex : 75 하 0001 : 화물 렌터 카
	// --> 앞에 두자리 걸러서
	// -- > 한글 걸러 :

	// JAVA코드와 DB스크린샷

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

				String[] Word = new String[] { "가", "나", "다", "라", "마", "거", "너", "더", "러", "머", "버", "서", "어", "저",
						"고", "노", "도", "로", "모", "보", "소", "오", "조", "구", "누", "두", "루", "무", "부", "수", "우", "주", "아",
						"바", "사", "자", "하", "허", "호" };

				List<String> wordList = Arrays.asList(Word);
				Collections.shuffle(wordList);
				String mid_Word = wordList.get(0);
				int front_Num = ran.nextInt(99) + 1;
				int back_Num = ran.nextInt(9899) + 100;
				

				String car_Use;
				if (mid_Word.equals("아") || mid_Word.equals("바") || mid_Word.equals("사") || mid_Word.equals("자")) {
					car_Use = "영업용";
				} else if (mid_Word.equals("하") || mid_Word.equals("허") || mid_Word.equals("호")) {
					car_Use = "렌트한";
				} else
					car_Use = "일반";

				String car_Type;
				if (front_Num <= 69) {
					car_Type = "승용차";
				} else if (front_Num <= 79) {
					car_Type = "승합차";
				} else if (front_Num <= 97) {
					car_Type = "화물차";
				} else
					car_Type = "특수 차량";
				
				String check_num;
				if (back_Num % 10 == 1 || back_Num % 10 == 6) {
					check_num = "월요일 출입 제한";
				} else if (back_Num % 10 == 2 || back_Num % 10 == 7) {
					check_num = "화요일 출입 제한";
				} else if (back_Num % 10 == 3 || back_Num % 10 == 8) {
					check_num = "수요일 출입 제한";
				} else if (back_Num % 10 == 4 || back_Num % 10 == 9) {
					check_num = "목요일 출입 제한";
				} else {
					check_num = "금요일 출입 제한";
				}

				String today;
				int korea_today = korea_time.get(Calendar.DATE);
				if((int)(korea_today % 10) == (back_Num - (int)Math.floor(back_Num/10)*10)) {
					today = "출입 제한";
				}else {
					today = "출입 가능";
				}
				
				
				PreparedStatement pstmt = conn.prepareStatement(sql);

				pstmt.setInt(1, front_Num);
				pstmt.setString(2, mid_Word);
				pstmt.setInt(3, back_Num);
				pstmt.setString(4, car_Use);
				pstmt.setString(5, car_Type);
				pstmt.setString(6, check_num);
				pstmt.setString(7, today);
				
				

				int row = pstmt.executeUpdate(); // 추가 해주는 구문
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
