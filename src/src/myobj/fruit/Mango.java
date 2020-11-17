package myobj.fruit;

import java.util.Random;

public class Mango implements Comparable<Mango> {

	public int sweet, calorie;
	String number;
	public int id;

	static int mango_count = 1;
	private static int mango_id = 0;

	// �� ���� ���� �����ϴ� ������
	public Mango(int calorie, int sweet, int id) {
		this.calorie = calorie;
		this.sweet = sweet;
		this.id = id;
	}
	
	
	public Mango() {
		Random ran = new Random();
		sweet = ran.nextInt(100) + 1;
		calorie = (int) ran.nextInt(100) + 99;
		number = String.format("����%03d", mango_count++);

		// �ش� �ν��Ͻ��� �����ϰ� �������ټ� �ִ� ��
		id = mango_id++;
		System.out.printf("%d�� ���� �����Ǿ����ϴ�.\n", id);
	}

	@Override
	public int hashCode() {
		// �� ��ü�� �����ϰ� �����Ϸ��� ��� �ؾ��ұ��?�� �����ϴ� ��
		// (�⺻ ������ �� �ν��Ͻ��� �ּҰ��� �ؽ�ȭ �ϴ� ��)
		return id;

	}

	@Override
	public String toString() {
//		return String.format("\n%s�� ������ �絵 : %02d �� %02d Į�θ� ", number, sweet, calorie);
		return String.format("%04d: Į�θ�: %d �絵: %d \n", id, calorie, sweet);

	}

	@Override
	public int compareTo(Mango next_Mango) {
		if (this.calorie > next_Mango.calorie) {
			return 1;
		} else if (this.calorie < next_Mango.calorie) {
			return -1;
		} else {
			if (this.sweet > next_Mango.sweet) {
				return 1;
			} else if (this.sweet < next_Mango.sweet) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	// @Override
	// public int compareTo(Mango o){
	// int calorie_result = this.calorie - o.calorie;

	// return calorie_result == 0? this.sweet - o.sweet : calorie_result;
	// }

}
