package myobj.Student;

import java.util.ArrayList;

public class StudentList {
	public static void main(String[] args) {

		ArrayList<Student> group01 = new ArrayList<>();

		int num_of_students = 30;

		double sum = 0;
		for (int i = 0; i < 30; ++i) {
			group01.add(new Student());
//			System.out.println(group01.get(i).name);
			sum += group01.get(i).getAvg();
		}

		// println 함수는 사실 해당 객체의 toString() 메서드를 호출한다
		System.out.println(group01);
		System.out.println("반 평균  : " + sum / num_of_students);
	}

}
