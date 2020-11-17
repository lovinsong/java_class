package myobj.fruit;

import java.util.Random;

public class Mango implements Comparable<Mango> {

	public int sweet, calorie;
	String number;
	public int id;

	static int mango_count = 1;
	private static int mango_id = 0;

	// 비교 대상용 망고를 생성하는 생성자
	public Mango(int calorie, int sweet, int id) {
		this.calorie = calorie;
		this.sweet = sweet;
		this.id = id;
	}
	
	
	public Mango() {
		Random ran = new Random();
		sweet = ran.nextInt(100) + 1;
		calorie = (int) ran.nextInt(100) + 99;
		number = String.format("망고%03d", mango_count++);

		// 해당 인스턴스를 유일하게 구분해줄수 있는 값
		id = mango_id++;
		System.out.printf("%d번 망고가 생성되었습니다.\n", id);
	}

	@Override
	public int hashCode() {
		// 이 객체를 유일하게 구분하려면 어떻게 해야할까요?를 정의하는 곳
		// (기본 동작은 이 인스턴스의 주소값을 해시화 하는 것)
		return id;

	}

	@Override
	public String toString() {
//		return String.format("\n%s번 망고의 당도 : %02d 와 %02d 칼로리 ", number, sweet, calorie);
		return String.format("%04d: 칼로리: %d 당도: %d \n", id, calorie, sweet);

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
