package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_lotto_quiz {

	// 1���� 45������ �ߺ����� ���� ���� 6���� �̷���� �迭�� �����غ�����

	public static void main(String[] args) {

		// �� 1 ~ 45�� ���ڸ� �������� ���� �� ������� 6�� �̱�
		Random ran = new Random();
		int[] lotto = new int[6];
		int[] number = new int[45];

		// ���� ���ڸ� 45�� �޴´�.
		for (int i = 0; i < number.length; ++i) {
			number[i] = i + 1;
		}

		// �ڼ���
		for (int i = 0; i < 5000; ++i) {
			int random_index = ran.nextInt(44) + 1;

			// ���� �����س���� (ī�� ���°ſ� ����)
			int temp = number[0];
			number[0] = number[random_index];
			number[random_index] = temp;
		}
		// ���ʴ�� �̴´�
		for (int i = 0; i < 6; ++i) {
			System.out.print(number[i] + ", ");
		}

	}
}

// �� �̾Ҵ� ���ڴ� ����صα�
//		Random ran = new Random();
//		int[] lotto = new int[6];
//		int[] number = new int[45];
//		
//		for (int i =0; i <number.length; ++i) {
//			number[i] =i +1;
//		}
//		int i = 0;
//		while (i != 6) {
//			int random_index = ran.nextInt(45);
//			
//			if(number[random_index] != -1) {
//				lotto[i] = number[random_index];
//				number[random_index] = -1;
//				++i;
//			}
//		}
//		System.out.println("���� ���� : " + Arrays.toString(number));
//	}
//}

// Ǯ�� 1

// �� �ߺ��� ������ �ٽ� �̱�
//		while (i != 6) {
//			boolean duple = false;
//			lotto[i++] = (int) (Math.random() * 45 + 1);
//
//			// 3���� �̾��� �� 0, 1, 2�� �񱳸� �ؼ�
//			// �Ȱ��� ���� �ִٸ� i�� ������Ű�� �ʴ´�
//			for (int j = 0; j < i; ++j) {
//				if (lotto[i] == lotto[j]) {
//					duple = true;
//					break;
//				}
//
//			}
//			if (!duple) {
//				++i;
//			}
//		}
//
//		System.out.println(Arrays.toString(lotto));
//
//	}
//	
//}
//		// ��(�迭) �̱�
//		int[] lotto = new int[7];
//
//		// ������ ����
//		for (int i = 0; i < lotto.length; ++i) {
//			lotto[i] = (int) ((Math.random() * 45) + 1);
//
//			// �ߺ� ����
//			for (int j = 0; j < i; j++) {
//				if (lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//			// ���� �� 7���� 6���� ���.
//		for (int i = 0; i < lotto.length - 1; i++) {
//			System.out.print(lotto[i] + " ");
//
//		}
//		System.out.println();
//		System.out.println("���ʽ� ��ȣ : " + lotto[6]);
//			
//			if (i == 0) {
//			
//				su = num;
//				su2 = num;
//	
//			} else {
//				su = su != num ? num : su; 
//				
//				if(su != su2) {
//					su = num;
//				}
////				su2 = su2 != n
//			}

//System.out.print(j + " ");