package quiz;

import java.util.Scanner;

public class B10_GCD {

	// �� ���ڸ� �Է¹����� �� ������ �ִ������� ���غ�����
	// �� �ִ� ����� : �� ������ ���� ���� ���� ū �����

	public static void main(String[] args) {

		// ��Ŭ���� ȣ����
		// 1.������ �� �ڿ��� a, b�� �־������� �� �� ū ���� a��� ����

		// 2.a�� b�� ���� �������� n�̶�� �ϸ� (a%b = n)
		// n�� 0�϶� b�� �ִ�����(GCD)�̴�.

		// 3.���� n�� 0�� �ƴ϶��,
		// a�� b���� �ٽ� �ְ�
		// b�� n�� ���� �� �� �ٽ� n = a% b

		int a = 50;
		int b = 100;

		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}

		int n = -1;

		for (; n != 0;) {
			n = a % b;
			a = b;
			b = n;
		}
		System.out.println("�ִ� ������� " + a + "�Դϴ�.");

//		int num1 = 50;
//		int num2 = 100;
//
//		// num1�� �� ũ�� ��ġ�� �ٲ۴�
//		if (num1 > num2) {
//			int temp = num1;
//			num1 = num2;
//			num1 = temp;
//		}
//
//		int gcd = 1;
//		for (int i = num1; i > 0; --i) {
//			if (num1 % i == 0 && num2 % i == 0) {
//				gcd = i;
//				break;
//			}
//		}
//		System.out.printf("'%d'�� '%d'�� �ִ������� '%d'�Դϴ�.\n", num1, num2, gcd);
	}

}

//System.out.println("�� �� �Է� > ");
//Scanner sc = new Scanner(System.in);
//int input = sc.nextInt();
//int input2 = sc.nextInt();
//
//// ���� ���� 
//int gcd = 1;
//
//for (int i = 1; i <= input; ++i) {
//	if (input % i == 0)
////		System.out.println(i);
////	System.out.println();
//		for (int j = 1; j <= input2; ++j) {
//			if (input2 % j == 0)
////			System.out.println(j);
////			System.out.println();
//				for (int g = 1; g <= (i + j) / 2; ++g)
//					if (i == j)
//							//g�� ��� ������ �Ǹ鼭 ������ ���� ������Ʈ��.
//						gcd = g;
//		}
//}
//System.out.println(gcd);
