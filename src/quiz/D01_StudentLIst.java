package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class D01_StudentLIst {

	// �л� Ŭ������ ��ҷ� ���� ArrayList Group�� �����ϰ�
	// �л��� 30�� �߰��غ�����

	// 1. 30���� ������ �ڵ����� �����ǵ��� ��������

	// 2. ��� �л��� ��� ������ ���غ�����

	// 3. �� ����� ���غ�����

	// 4. �̸� ���� ��Ģ
	// �׽�Ʈ�л�0000
	// �׽�Ʈ�л�0001
	// �׽�Ʈ�л�0002

	public static void main(String[] args) {

//		ArrayList name = new ArrayList();
//		ArrayList kor = new ArrayList();
//		ArrayList eng = new ArrayList();
//		ArrayList math = new ArrayList();
//		ArrayList total = new ArrayList();
//		ArrayList avg = new ArrayList();
//
//		Random ran = new Random();
//
//		// �л� �̸�
//		for (int i = 0; i < 30; ++i) {
//			Collections.addAll(name, "�׽�Ʈ�л�" + i);
//
//		}
//		System.out.println(name);
//
//		// ���� ����
//		for (int i = 0; i < 30; ++i) {
//			Collections.addAll(kor, ran.nextInt(101));
//		}
//		System.out.println("�������� : " + kor);
//
//		// ���� ����
//		for (int i = 0; i < 30; ++i) {
//			Collections.addAll(eng, ran.nextInt(101));
//		}
//		System.out.println("�������� : " + eng);
//
//		// ���� ����
//		for (int i = 0; i < 30; ++i) {
//			Collections.addAll(math, ran.nextInt(101));
//		}
//		System.out.println("��������: " + math);

		ArrayList<Student> group01 = new ArrayList<>();

		int num_of_students = 30;
		
		double sum = 0;
		for (int i = 0; i < 30; ++i) {
			group01.add(new Student());
//			System.out.println(group01.get(i).name);
			sum += group01.get(i).avg;
		}

		// println �Լ��� ��� �ش� ��ü�� toString() �޼��带 ȣ���Ѵ�
		System.out.println(group01);
		System.out.println("�� ���  : " + sum / num_of_students );
	}

}

class Student {
	int kor, eng, math;
	int total;
	double avg;
	String name;

	final static int NUM_OF_SUBJECTS = 3;
	static int stu_count = 0;

	public Student() {
		Random ran = new Random();
		kor = ran.nextInt(51) + 50;
		eng = ran.nextInt(51) + 50;
		math = ran.nextInt(51) + 50;
		name = String.format("�׽�Ʈ�л�%04d", stu_count++);

		total = kor + eng + math;
		avg = total / (double) NUM_OF_SUBJECTS;

	}

	// toString()�� Object Ŭ������ �޼����̱� ������
	// ��� ��ü�� ������ �ִ�
	@Override
	public String toString() {
		// �� ��ü�� ���ڿ��� ǥ���Ѵٸ� �����ϱ�? �� ���� ���Ǹ� �ϴ� �޼���

		// String.fromat()
		// printfó�� ������ �̿��Ͽ� ���ϴ� ���ڿ��� �����ϴ� �޼���
//		 return "[" + name +" / " + total + " / " + avg + "]";

		// �� ����ƽ �޼���
		return String.format("\n{%s/%d/%.2f}", name, total, avg);
		
	}

}
