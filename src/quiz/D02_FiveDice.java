package quiz;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import myobj.boardgame.FiveDice;

public class D02_FiveDice {

	// �������� 5���� �ֻ����� ���� ������ (�ֻ����� ���� 1 ~ 6)

	// Ǯ�Ͽ콺 (���� ���ڰ� 2��/3��)
	// ���� ��Ʈ����Ʈ (1234/2345/3456)
	// ���� ��Ʈ����Ʈ (12345/23456)
	// 4���̽� (���� ���� 4��)
	// 5���̽� (���� ���� 5��)

	// �� �����ϴ� Ŭ������ �ۼ��ϰ� �׽�Ʈ�غ�����

	// �� �ٸ����Ͽ� �ۼ��ϰ� ���⼭�� ���� ���⸸ �� ��
	public static void main(String[] args) throws InterruptedException {
		FiveDice dice = new FiveDice();

		Scanner sc = new Scanner(System.in);

		while (true) {
			dice.roll();
			System.out.print("�ٲٱ� �׽�Ʈ > ");

			Set<Integer> rerolls = new HashSet<>();
			int i = -1;
			while ((i = sc.nextInt()) != -1) {
				rerolls.add(i);
			}
			System.out.println("�ٽ� �������ϴ� �ε��� : " + rerolls);
			dice.reroll(rerolls);

//			System.out.println("�ѹ� �� �����ðڽ��ϱ�? Y/N");

			Thread.sleep(2000); // Exception
		}
	}
}
