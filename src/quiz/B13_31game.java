package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {

	// # 31������ ��������

	// 1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����Ѵ� (1, 2, 3)

	// 2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�

	// 3. �������� 31�̻��� ���ڸ� ����� ��� Ȥ�� ��ǻ�Ͱ� �й��Ѵ�

	// ���� �� :

	// ��ǻ�� > 2
	// ������� : 2
	// ��� > 3
	// ���� ���� : 5
	// ...
	// ��ǻ�� > 3
	// ������� : 32
	// ��ǻ���� �й��Դϴ�.

	public static void main(String[] args) {
		// �ʱ�ȭ �κ�
		Scanner user = new Scanner(System.in);
		Random ran = new Random();

		int game_num = 0;

		boolean computer_turn = ran.nextBoolean();

		System.out.printf("<%s>�� �����Դϴ�.\n", computer_turn ? "��ǻ��" : "����");

		while (true) {
			// �Է� �κ�
			int num;

			if (computer_turn) {

				// ��ǻ���� AI �߰�
				// ��ǻ�Ͱ� game_num�� �� �� , 2, 6, 10, 14, 18, 22, 26, 30�� ����� �������̱�
				//game_num == 0 || game_num == 4 || game_num == 8
				if (game_num % 4 ==0) {
					num = 2;
				} else if (game_num % 4 == 3) {
					num = 3;
				} else if (game_num % 4 == 1) {
					num = 1;
				} else {
					num = ran.nextInt(3) + 1;
				}
//				num = ran.nextInt(3) + 1;

				System.out.println("��ǻ�� >" + num);
			} else {
				System.out.println("���� > ");
				num = user.nextInt();

				if (num > 3 || num < 1) {
					System.out.println("\t1 ~ 3�� �Է��ϼž� �մϴ�.");
					continue;
				}
			}

//			System.out.println("\t��� �� ���� : " + num);
			// ó�� �κ�
			game_num += num;

			// ��� �κ�
			if (game_num >= 31) {
				System.out.println("\t�й� : " + game_num);
				break;
			}
			System.out.println("\t ���� ��Ȳ : " + game_num);

			computer_turn = !computer_turn;

		}

		System.out.printf("<%s>�� �¸�\n", computer_turn ? "����" : "��ǻ��");
	}
}

//		Random ran = new Random();
//
//		Scanner sc = new Scanner(System.in);
//		int com = new Random().nextInt();
//		int comsu = (ran.nextInt(1) + 3);
//		int hum = new Scanner(System.in).nextInt();
//		int count = 0;
//		int sum = 0;
//		boolean pan = false;
//
//		while (true) {
//			System.out.println("1. ���� �����ϱ�");
//			System.out.println("2. ���� �����ϱ�");
//			System.out.println(" > ");
//			int cmd = sc.nextInt();
//
//			switch (cmd) {
//			case 1:
//				System.out.println("������ �����մϴ�.");
//				break;
//			case 2:
//				System.out.println("������ �����մϴ�.");
//				break;
//			default:
//				System.out.println("�ٽ� �����Ͻʽÿ�");
//				continue;
//			}
//			// �������� ���� ���� ���
//			System.out.println();
//			System.out.println("������ ���� 1~3�� �Է��Ͻʽÿ�");
//			System.out.print("���ڰ� ���ٸ� ��ǻ���� �����Դϴ�.");
//
////			System.out.println(comsu);
//			// ���� ����
//			if (comsu == hum)
//				System.out.println("��ǻ�Ͱ� �����մϴ�.");
//			else
//				System.out.println("����� �����մϴ�.");
//			continue;
//
//			// ������ ���� �����
//
//			// 31 �̻��� �ɋ����� ��� ����Ǹ�
//			// 1~3�� ���ڸ� �Է� �� ����
//			// ī��Ʈ�� ���� ����.
//			// ������ ��
//		}
//		while(sum++ < 31)
//			if()
