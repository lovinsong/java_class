import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class F01_Calendar {

	public static void main(String[] args) {

		// 자바로 날짜/시간 다루기
		// java.util.Date
		// java.uitl.Calendar

		// 1970년 1월 1일 이후로 시간이 얼마나 흘렀는지를 통해 시간을 표현
//		System.out.println(System.currentTimeMillis());

		Date now = new Date();
		System.out.println(now + "\n");

		// Date 클래스는 전부 deprecated 상태다 (날짜를 담아놓는 용도로만 사용한다)
		// now.getDay();

		// # Calendar 클래스
		// - 달력을 표현한 클래스
		// - 날짜를 쉽게 계산할 수 있는 기능들이 모여있다
		// - 생성자 대신 getInstance() 함수를 통해 인스턴스를 받아온다

		// # TimeZone 클래스
		// - 경도를 설정할 수 있는 클래스
//		for (String zone_id : TimeZone.getAvailableIDs()) {
//			System.out.println(zone_id);
//		}

		TimeZone zone1 = TimeZone.getTimeZone("US/Samoa");

		Calendar samoa_time = Calendar.getInstance(zone1);

		// # Calendar의 set메서드로 해당 필드를 내가 원하는 값으로 변경할 수 있다

		// MONTH를 10월로 변경
		samoa_time.set(Calendar.MONTH, 10 - 1);
		samoa_time.set(Calendar.DATE, 20);

		// # Calendar의 get(field) 메서드로 원하는 값을 꺼내올 수 있다
		int samoa_year = samoa_time.get(Calendar.YEAR);

		// Calendar는 Month만 1월이 0이다(그러므로 +1 해줘야함)
		int samoa_month = samoa_time.get(Calendar.MONTH) + 1;
		int samoa_date = samoa_time.get(Calendar.DATE);

		// HOUR: 12시, HOUR_OF_DAY : 24시
		int samoa_hour = samoa_time.get(Calendar.HOUR_OF_DAY);
		int samoa_minute = samoa_time.get(Calendar.MINUTE);
		int samoa_second = samoa_time.get(Calendar.SECOND);

		int samoa_am_pm = samoa_time.get(Calendar.AM_PM);

		// DAY_OF_WEEK: 요일
		int samoa_week = samoa_time.get(Calendar.DAY_OF_WEEK);

		// WEEK_OF_MONTH : 몇 번째 주인가?
		int samoa_wom = samoa_time.get(Calendar.WEEK_OF_MONTH);

		// DAY_OF_WEEK_IN_MONTH : 이번 요일이 몇 번째 요일인가?
		int samoa_dowim = samoa_time.get(Calendar.DAY_OF_WEEK_IN_MONTH);

		System.out.printf("사모아 : 오늘은 %d번째 %s요일 입니다.\n", samoa_dowim, getStrWeek(samoa_week));

		System.out.printf("samoa time - %d/%02d/%02d %d:%d:%d %s %s %d번째 주\n", samoa_year, samoa_month, samoa_date,
				samoa_hour, samoa_minute, samoa_second, samoa_am_pm == 0 ? "AM" : "PM", getStrWeek(samoa_week),
				samoa_wom);

		// korea 타임
		System.out.println();

		TimeZone zone2 = TimeZone.getTimeZone("Asia/Seoul");
		Calendar korea_time = Calendar.getInstance(zone2);

		int korea_year = korea_time.get(Calendar.YEAR);
		int korea_month = korea_time.get(Calendar.MONTH) + 1;
		int korea_date = korea_time.get(Calendar.DATE);
		int korea_hour = korea_time.get(Calendar.HOUR_OF_DAY);
		int korea_minute = korea_time.get(Calendar.MINUTE);
		int korea_second = korea_time.get(Calendar.SECOND);
		int korea_am_pm = korea_time.get(Calendar.AM_PM);
		int korea_week = korea_time.get(Calendar.DAY_OF_WEEK);
		int korea_wom = korea_time.get(Calendar.WEEK_OF_MONTH);
		int korea_dowim = korea_time.get(Calendar.DAY_OF_WEEK_IN_MONTH);

		System.out.printf("한국  : 오늘은 %d번째 %s요일 입니다.\n", korea_dowim, getStrWeek(korea_week));

		System.out.printf("korea time - %d/%02d/%02d %d:%d:%d %s %s %d번째 주\n", korea_year, korea_month, korea_date,
				korea_hour, korea_minute, korea_second, korea_am_pm == 0 ? "AM" : "PM", getStrWeek(korea_week),
				korea_wom);

		System.out.println(5231 - (int)Math.floor(5231/10)*10 );
		
	}

	private static String getStrWeek(int calendar_dow) {
		switch (calendar_dow) {
		case Calendar.MONDAY:
			return "월";
		case Calendar.TUESDAY:
			return "화";
		case Calendar.WEDNESDAY:
			return "수";
		case Calendar.THURSDAY:
			return "목";
		case Calendar.FRIDAY:
			return "금";
		case Calendar.SATURDAY:
			return "토";
		case Calendar.SUNDAY:
			return "일";
		}
		return null;
	}

}
