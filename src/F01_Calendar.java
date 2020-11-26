import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class F01_Calendar {

	public static void main(String[] args) {

		// �ڹٷ� ��¥/�ð� �ٷ��
		// java.util.Date
		// java.uitl.Calendar

		// 1970�� 1�� 1�� ���ķ� �ð��� �󸶳� �귶������ ���� �ð��� ǥ��
//		System.out.println(System.currentTimeMillis());

		Date now = new Date();
		System.out.println(now + "\n");

		// Date Ŭ������ ���� deprecated ���´� (��¥�� ��Ƴ��� �뵵�θ� ����Ѵ�)
		// now.getDay();

		// # Calendar Ŭ����
		// - �޷��� ǥ���� Ŭ����
		// - ��¥�� ���� ����� �� �ִ� ��ɵ��� ���ִ�
		// - ������ ��� getInstance() �Լ��� ���� �ν��Ͻ��� �޾ƿ´�

		// # TimeZone Ŭ����
		// - �浵�� ������ �� �ִ� Ŭ����
//		for (String zone_id : TimeZone.getAvailableIDs()) {
//			System.out.println(zone_id);
//		}

		TimeZone zone1 = TimeZone.getTimeZone("US/Samoa");

		Calendar samoa_time = Calendar.getInstance(zone1);

		// # Calendar�� set�޼���� �ش� �ʵ带 ���� ���ϴ� ������ ������ �� �ִ�

		// MONTH�� 10���� ����
		samoa_time.set(Calendar.MONTH, 10 - 1);
		samoa_time.set(Calendar.DATE, 20);

		// # Calendar�� get(field) �޼���� ���ϴ� ���� ������ �� �ִ�
		int samoa_year = samoa_time.get(Calendar.YEAR);

		// Calendar�� Month�� 1���� 0�̴�(�׷��Ƿ� +1 �������)
		int samoa_month = samoa_time.get(Calendar.MONTH) + 1;
		int samoa_date = samoa_time.get(Calendar.DATE);

		// HOUR: 12��, HOUR_OF_DAY : 24��
		int samoa_hour = samoa_time.get(Calendar.HOUR_OF_DAY);
		int samoa_minute = samoa_time.get(Calendar.MINUTE);
		int samoa_second = samoa_time.get(Calendar.SECOND);

		int samoa_am_pm = samoa_time.get(Calendar.AM_PM);

		// DAY_OF_WEEK: ����
		int samoa_week = samoa_time.get(Calendar.DAY_OF_WEEK);

		// WEEK_OF_MONTH : �� ��° ���ΰ�?
		int samoa_wom = samoa_time.get(Calendar.WEEK_OF_MONTH);

		// DAY_OF_WEEK_IN_MONTH : �̹� ������ �� ��° �����ΰ�?
		int samoa_dowim = samoa_time.get(Calendar.DAY_OF_WEEK_IN_MONTH);

		System.out.printf("���� : ������ %d��° %s���� �Դϴ�.\n", samoa_dowim, getStrWeek(samoa_week));

		System.out.printf("samoa time - %d/%02d/%02d %d:%d:%d %s %s %d��° ��\n", samoa_year, samoa_month, samoa_date,
				samoa_hour, samoa_minute, samoa_second, samoa_am_pm == 0 ? "AM" : "PM", getStrWeek(samoa_week),
				samoa_wom);

		// korea Ÿ��
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

		System.out.printf("�ѱ�  : ������ %d��° %s���� �Դϴ�.\n", korea_dowim, getStrWeek(korea_week));

		System.out.printf("korea time - %d/%02d/%02d %d:%d:%d %s %s %d��° ��\n", korea_year, korea_month, korea_date,
				korea_hour, korea_minute, korea_second, korea_am_pm == 0 ? "AM" : "PM", getStrWeek(korea_week),
				korea_wom);

		System.out.println(5231 - (int)Math.floor(5231/10)*10 );
		
	}

	private static String getStrWeek(int calendar_dow) {
		switch (calendar_dow) {
		case Calendar.MONDAY:
			return "��";
		case Calendar.TUESDAY:
			return "ȭ";
		case Calendar.WEDNESDAY:
			return "��";
		case Calendar.THURSDAY:
			return "��";
		case Calendar.FRIDAY:
			return "��";
		case Calendar.SATURDAY:
			return "��";
		case Calendar.SUNDAY:
			return "��";
		}
		return null;
	}

}
