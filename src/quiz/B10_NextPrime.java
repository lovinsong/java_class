package quiz;

import java.util.Scanner;

public class B10_NextPrime{

	// ����ڷκ��� ���ڸ� �Է¹�����
	// �Է¹��� ������ �� ũ�ų� ���� ���� �Ҽ��� ã�Ƽ� ����غ�����

	public static void main(String[] args) {

		System.out.println("�� �Է� > ");
		int input = new Scanner(System.in).nextInt();
		// �Է��Ѽ� ���� ����
		for (int i = input; true; ++i) {
			// ���� ī��Ʈ�� ����
			int count = 0;
			// 2���� �Է��� �� �߰�������
			int sqrt = (int) Math.sqrt(i);
			for (int j = 2; j <= sqrt; ++j) {
				// �Է��� ������ �߰��� �������� 0�϶�
				if (i % j == 0) {
					// ī��Ʈ�� ����
					++count;
				}
			}
			// ī��Ʈ�� 0�̸� i�� ���
			if (count == 0) {
				System.out.printf("'%d'�� ���� �Ҽ��� '%d'�Դϴ�.\n", input, i);
				// �Ҽ��� ������ �ߴ�
				break;
			}
		}

	}

}
