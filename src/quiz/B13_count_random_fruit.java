package quiz;

import java.util.Random;

public class B13_count_random_fruit {

	// 1. ũ�� 100�� �迭�� ���� ���� ���ڿ��� �����غ�����
	// �����ϴ� ���� : apple. banana, orange, peach, kiwi

	// 2. �� ������ ��� �����ߴ��� ��� ����ϰ� ����غ�����

	public static void main(String[] args) {

		Random ran = new Random();
//		int[] fru = new int[5];
//		int[] count = new int[100];
		int size = 100;
		String[] fruitNames = { "apple", "banana", "orange", "peach", "kiwi" };
		String[] fruitBox = new String[100];

		int fruit_kind = fruitNames.length;

		// ������ �ڽ��� �־� 100�� ������
		for (int i = 0; i < size; ++i) {
			fruitBox[i] = fruitNames[(int) (Math.random() * 5)];
		}
		// fruitBox�迭�� ����Ǿ� �� ������ ��� �����ߴ��� ��� �������
		int[] count = new int[5];

		for (int i = 0; i < size; ++i) {

			for (int j = 0; j < fruit_kind; ++j) {

				// j�� ���� 5���� i�� ��
				if (fruitNames[j].equals(fruitBox[i])) {
					count[j] += 1;
					break;
				}
			}

		}

		// ���谡 ���� �� count�� ��� �ؾ� �Ѵ�
		for (int i = 0; i < count.length; ++i) {
			// fruitNames[0]�� apple�̴�.
			System.out.printf("%s : %dȸ\n", fruitNames[i], count[i]);
		}

		// # enum�� ����
		int apple = 0;
		int banana = 1;
		int orange = 2;

		System.out.println("�������� ��ȣ : " + orange);
		System.out.println("�������� ��� ����? " + count[orange]);
		System.out.println("������ �̸� : " + fruitNames[orange]);

	}
}

// ������ �ϳ��� ����
//		for(int i = 0; i < fruitNames.length; i++) {
//			
//			String temp = fruitBox[0];
//			fruitBox[0] = fruitBox[fruitNames];
//			fruitBox[fruitNames] = temp;

// ������ ���ϰ� ����Ѵ�

//		for(int i = 0; i <count.length; ++i) {
//			count[i] = i + 1;
//		}
//		
//		for(int i =0; i <5000; ++i);
//			int random_index = ran.nextInt(99) + 1;
//			
//			int temp = count[0];
//			count[0] = count[random_index];
//			count[random_index] = temp;
//			

//		for (int i = 0; i < 100; ++i) {
//			for (int j = 0; j < i; j++) {
//				if (count[i] == count[j])
//					i--;
//				break;
//			}
//
//		}
