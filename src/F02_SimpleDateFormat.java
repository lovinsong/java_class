import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class F02_SimpleDateFormat {

	public static void main(String[] args) {

		// �����ϰ� ��¥/�ð��� ���ڿ��� ��ȯ�ϴ� ���
		
		/*
		 	y : ��
		  	M : ��
		 	d : ��
		 	D : �� ������ ���� �� (1 ~ 365)
		 	K : �� (0 ~ 11)
		 	k : �� (1 ~ 24)
			H : �� (0 ~ 23)
			h : �� (1 ~ 12)
			m : ��
			s : ��
			S : �и�������(1/1000��)
			E : ����
			a : ����/����
			w : ���� �� ��° ��
			W : ���� �� ��° ��
		*/
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy�� MM�� dd�� ");
		Date now = new Date();
				
		// Calendar �ν��Ͻ��� getTime() �޼��带 �̿��ϸ� DateŸ������ ��ȯ�� �����ϴ�	
		Calendar korea_time = Calendar.getInstance();
		System.out.println(korea_time.getTime());
		
		System.out.println("DateŬ������ toString() - " + now);
		//å���� ����
		System.out.println("simple format�� ��� - " + simple.format(now));
		System.out.println("simple format�� ��� - " + simple.format(korea_time.getTime()));
	
		
	
	
	}
	
}
