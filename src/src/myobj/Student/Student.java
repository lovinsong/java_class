package myobj.Student;

import java.util.Random;

public class Student implements Comparable<Student> {
	// �ܺ� Ŭ�������� �ʵ��� ���� ������ ������� �ʴ°��� �� �� ��ü�������̴�
	// (�ܺ� Ŭ������ ���� �ִ� �͸� ����� �� �ְԲ� �����ϴ� ���� �̻����̴�)
	private int kor, eng, math;
	private String name;

	final static int NUM_OF_SUBJECTS = 3;
	static int stu_count = 0;

	public Student() {
		Random ran = new Random();
		kor = ran.nextInt(51) + 50;
		eng = ran.nextInt(51) + 50;
		math = ran.nextInt(51) + 50;
		name = String.format("�׽�Ʈ�л�%04d", stu_count++);

	}

	public int getTotal() {
		return kor + eng + math;
	}

	public double getAvg() {
		return (kor + eng + math) / (double) NUM_OF_SUBJECTS;
	}

	// toString()�� Object Ŭ������ �޼����̱� ������
	// ��� ��ü�� ������ �ִ�

	@Override
	public String toString() {
		// �� ��ü�� ���ڿ��� ǥ���Ѵٸ� �����ϱ�? �� ���� ���Ǹ� �ϴ� �޼���

		// String.fromat()
		// printfó�� ������ �̿��Ͽ� ���ϴ� ���ڿ��� �����ϴ� �޼���
//			 return "[" + name +" / " + total + " / " + avg + "]";

		// �� ����ƽ �޼���
		return String.format("\n{�̸�: %s ����: %d ����: %d ����: %d ���: %.2f}", name, kor, eng, math, getAvg());

	}

	@Override
	public int compareTo(Student next_student) {
		// "�� Ŭ������ ũ�� �񱳸� �̷������� �ϰڴ�"�� �����ϴ� ��
		// - ����� ���� : ���� ��ü�� ���� ��ü���� �� ŭ
		// - ������ ���� : ���� ��ü�� ���� ��ü���� �� ����
		// - 0�� ���� : ���� ��ü�� ���� ��ü�� ũ�Ⱑ ����

		// ���������� ���� ����� �� �տ� �������� �����ϼ���

//		if (this.math > next_student.math) {
//			// ���� ������ �� ū �л��� ���Ľ� �ڿ� �������� ���ڴٴ� ��
//			return 1;
//		} else if (this.math < next_student.math) {
//			// ���� ������ �� ���� �л��� ���Ľ� ������ �������� ���ڴٴ� ��
//			return -1;
//		} else {
//			// ���� ������ ������ �׳� ������ �ΰڴٴ� ��
//			return 0;
//		}

		if (this.eng > next_student.eng) {
			// ���� ������ �� ū �л��� ���Ľ� �ڿ� �������� ���ڴٴ� ��
			return 1;
		} else if (this.eng < next_student.eng) {
			// ���� ������ �� ���� �л��� ���Ľ� ������ �������� ���ڴٴ� ��
			return -1;
		} else {
			// ���� ������ ������ ���� ������ �Ǻ�
			if (this.math > next_student.math) {
				return 1;
			} else if (this.math < next_student.math) {
				return -1;
			} else {
				// ���� ������ ������ ���� ������ �Ǻ�
				if (this.kor > next_student.kor) {
					return 1;
				} else if (this.kor < next_student.kor) {
					return -1;
				} else {
					return 0;
				}
			}
		}

	}

}
