package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class D01_StudentLIst {

	// 학생 클래스를 요소로 갖는 ArrayList Group를 생성하고
	// 학생을 30명 추가해보세요

	// 1. 30명의 점수가 자동으로 설정되도록 만들어보세요

	// 2. 모든 학생의 평균 점수를 구해보세요

	// 3. 반 평균을 구해보세요

	// 4. 이름 생성 규칙
	// 테스트학생0000
	// 테스트학생0001
	// 테스트학생0002

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
//		// 학생 이름
//		for (int i = 0; i < 30; ++i) {
//			Collections.addAll(name, "테스트학생" + i);
//
//		}
//		System.out.println(name);
//
//		// 국어 점수
//		for (int i = 0; i < 30; ++i) {
//			Collections.addAll(kor, ran.nextInt(101));
//		}
//		System.out.println("국어점수 : " + kor);
//
//		// 영어 점수
//		for (int i = 0; i < 30; ++i) {
//			Collections.addAll(eng, ran.nextInt(101));
//		}
//		System.out.println("영어점수 : " + eng);
//
//		// 수학 점수
//		for (int i = 0; i < 30; ++i) {
//			Collections.addAll(math, ran.nextInt(101));
//		}
//		System.out.println("수학점수: " + math);

		ArrayList<Student> group01 = new ArrayList<>();

		int num_of_students = 30;
		
		double sum = 0;
		for (int i = 0; i < 30; ++i) {
			group01.add(new Student());
//			System.out.println(group01.get(i).name);
			sum += group01.get(i).avg;
		}

		// println 함수는 사실 해당 객체의 toString() 메서드를 호출한다
		System.out.println(group01);
		System.out.println("반 평균  : " + sum / num_of_students );
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
		name = String.format("테스트학생%04d", stu_count++);

		total = kor + eng + math;
		avg = total / (double) NUM_OF_SUBJECTS;

	}

	// toString()은 Object 클래스의 메서드이기 때문에
	// 모든 객체가 가지고 있다
	@Override
	public String toString() {
		// 이 객체를 문자열로 표현한다면 무엇일까? 에 대한 정의를 하는 메서드

		// String.fromat()
		// printf처럼 서식을 이용하여 원하는 문자열을 생성하는 메서드
//		 return "[" + name +" / " + total + " / " + avg + "]";

		// ↓ 스태틱 메서드
		return String.format("\n{%s/%d/%.2f}", name, total, avg);
		
	}

}
