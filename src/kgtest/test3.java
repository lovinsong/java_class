package kgtest;

import java.util.Random;
import java.util.Scanner;

public class test3 {

//	��ǻ�Ͱ� 0���� 1000 ������ ������ �����ϸ�
//	����ڰ� ���ڸ� �Է��Ͽ� ������ ���ߴ� ������ ��������
//
//	����ڰ� ���ڸ� �Է����� �� ��Ȳ���� �˸��� ������ ����ؾ� �մϴ�
//	����ڰ� ������ ���ڰ� ���亸�� ���� ������ ��� - UP!
//	����ڰ� ������ ���ڰ� ���亸�� ���� ������ ��� - DOWN!
//	����ڰ� ������ ������ - ����!
//
//	���� ����� �����̾��� ���ڿ� ���±����� �� �õ�Ƚ���� ����ؾ� �մϴ�.
//	����� > 5
//	UP!
//	����� > 577
//	DOWN!
//	����� > 400

	public static void main(String[] args) {

		Random ran = new Random();
		// 0 ~ 1000 ����
		int computer_ran = (int) (Math.random() * 1000 + 1);
		int count = 1;
		while (true) {
			System.out.println("����� > :");
			int user_input = new Scanner(System.in).nextInt();
			if (computer_ran > user_input) {
				System.out.println("UP!");
				count++;
			} else if (computer_ran < user_input) {
				System.out.println("DOWN!");
				count++;
			} else if (computer_ran == user_input) {
				System.out.println("����!");
				System.out.println("������ ����: " + computer_ran);
				System.out.println("�õ�Ƚ�� : " + count);
				System.exit(0);

			}
		}

	}

}
