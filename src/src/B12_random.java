import java.util.Random;

public class B12_random {

	public static void main(String[] args) {

		// # JAVA���� ������ ���� �����ϱ�

		// 1. Math.random() :
		// - doubleŸ���� 0 <= x < 1�� ���� �Ҽ��� �����Ѵ�
		// - �� �Ҽ��� �̿��Ͽ� ���ϴ� ���ڸ� ���� ����� �� �ִ�.

		// # ���ϴ� ���ڸ� ����� ���� ( ex : 80 ~ 100)
		// (1) ���ϴ� ������ ������ ���Ѵ�.
		// 0 * 21 <= x < 1 * 21 ==> 0 <= x < 21
		
		// (2) ���ϴ� ���� �� ���� ���� ���ڸ� ���Ѵ�
		// 0 +80 <= x < 21 + 80
		
		// (3) �Ҽ��� �Ʒ��� �����Ѵ�
//		for (int i = 0; i < 100; ++i) {
//			System.out.println((int)(Math.random() * 21 + 80));
//		}

		// 2. Random  Ŭ���� �̿�
		//	- ������ �� �õ��ȣ�� ������ �� �ִ�
		//	- ���� �õ� ��ȣ�� �����ϸ� ���� ���� ���´�
		//	- �õ��ȣ�� �������� ������ �������� �õ尡 ���õȴ�
		
		
		// # ���ο� ���� �õ� ���� 
		Random ran = new Random();
		Random ran2 = new Random();
		
		System.out.println("ran : " + ran.nextInt());
		System.out.println("ran2 : " + ran2.nextInt());

		// # Random.nextInt(bound) 
		//	- 0 ~ bound�̸��������� ��ȯ�Ѵ�
		//	- bound �� �������� ������ int���� ��ü���� ���� ������ ���õȴ�.
		
		System.out.println(ran.nextInt(30));	// 0 ~ 29 �� ����
		System.out.println(ran.nextInt());		// int��ü ���� �� ����
		System.out.println(ran.nextInt(21) + 80);	// 80 ~ 100�� ����
		
		
		
		
		
		// ���� : 3000�̻� 5000������ ���� ������ 100�� �̰�
		// �׵��� ���Դ� ���� ū ���� ���� ���� ���� ����غ�����

		
//		int max = 0, min = 0;
//		
//		for (int i = 0; i < 100; ++i) {
//			int num = (int) (Math.random() * 2001 + 3000);
//			
//			// ó������ �񱳴���� �����Ƿ� �׳� ����
//			if (i == 0) {
//				max = num;
//				min = num;
//			}else {
//				// ���� ����� ������ �� ũ�� max���� ���� �Ʒ� 3���� ���
////				max = max < num ? num : max;
//				
//				max = Math.max(max, num);
//				
////				if (max < num) {
////					max = num;
////				}
//				
//				// ���� ����� ������ �� ������ min���� ����
////				min = min > num ? num : min;
//				min = Math.min(min, num);
//				
//			}
//		}
//		System.out.println(max);
//		System.out.println(min);

	}

}
