package kgtest;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		System.out.println("�ð� �Է� > ");
		int hour = new Scanner(System.in).nextInt();
		System.out.println("�� �Է� > ");
		int min = new Scanner(System.in).nextInt();

		System.out.println("�Է��� �ð� :" + hour + "��" + min + "��");
		if (hour >= 24 || min >= 60 || hour < 0 || min < 0) {
			System.err.println("����");
		} else if (hour >= 15) {
			System.out.println("�Ἦ");
		} else if (hour >= 9 && min >= 10) {
			System.err.println("����");
		} else
			System.out.println("����");
	}

}

