package quiz;

public class B11_whileQuiz {

	// while ���� �̿��Ͽ�

	// 1. 1���� 100������ 3�� ����� ������ ���غ�����

	// 2. 200���� 1���� ����غ�����

	// 3. 1���� 200������ ���� ��
	// 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ������ ���غ�����

	public static void main(String[] args) {

		// 1.
		int i = 0;
		int sum1 = 0;
		while (i++ < 100)
			if (i % 3 == 0) {
				sum1 = sum1 + i;
			}
		System.out.println("Q1�� �� " + sum1);
		System.out.println();

		// 2.
		int e = 200;
		while (e > 0) {
			--e;
			System.out.printf("%-6d",e+1);
			if(e % 10 == 0)
			System.out.println();
		}
			System.out.println();
		// 3.
		int d = 0;
		int sum2 = 0;
		while (d++ < 200) {
//			System.out.println(d);
			if (d % 2 != 0 && d % 3 != 0) {
			}
			sum2 = sum2 + d;
		}
		System.out.println("Q3�� �� " + sum2);

	}

}
