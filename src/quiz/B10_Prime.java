package quiz;

import java.util.Scanner;

public class B10_Prime {

	// ����ڷκ��� ���ڸ� �Է¹�����
	// 1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����

	// �� �Ҽ� : ����� 1�� �ڱ� �ڽŹۿ� ���� ����

	public static void main(String[] args) {

		System.out.println("���� > ");
		int user = new Scanner(System.in).nextInt();

		// i : �Ҽ����� �׽�Ʈ �غ� ����
		for (int i = 2; i <= user; ++i) {
			int count = 0;
			// j : i�� ������� �׽�Ʈ �غ� ����
			int sqrt = (int)Math.sqrt(i);
			for (int j = 2; j <= sqrt; ++j) {
				if (i % j == 0) {
					++count;
				}

			}
			if(count == 0) {
				System.out.printf("%d�� �Ҽ��Դϴ�.\n",i);
			}
		}
	}
}

//		System.out.println("�Ҽ� �Է� :");
//		int count;
//		int su = new Scanner(System.in).nextInt();
//
//		for (int e = 2 ; e <= su; e++) {
//			count = 0;
//			for (int i = 2; i <= e; i++) {
//	break;
//				if (i % e == 2 )
//					count++;
//			}
//				if (count == 0) 
//			System.out.println(i);
//	}