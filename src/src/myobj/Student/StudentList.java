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

		// println �Լ��� ��� �ش� ��ü�� toString() �޼��带 ȣ���Ѵ�
		System.out.println(group01);
		System.out.println("�� ���  : " + sum / num_of_students);
	}

}
