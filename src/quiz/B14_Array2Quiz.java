package quiz;

import java.util.Arrays;

public class B14_Array2Quiz {

	public static void main(String[] args) {

		int[][] numArr = { { 10, 10, 10, 10 }, { 90, 50, 30, 70 }, { 800, 500 }, { 300, 300, 300 } };

//		 1. numArr�� ���հ� ���(�Ҽ��� ��°�ڸ�)�� ���ؼ� ����غ�����
		int sum = 0;
		double item_count = 0;
		double avg = 0;
		for (int i = 0; i < numArr.length; ++i) {

			item_count += numArr[i].length;

			for (int j = 0; j < numArr[i].length; ++j) {
//				System.out.println(numArr[i][j] +" ");
				sum = sum + numArr[i][j];
			}

		}
		avg = (double) sum / 13;
//		System.out.println("���� : " + sum);
//		System.out.printf("��� : %.2f\n", avg);

		System.out.printf("�� �� : %d\n��� : %.2f\n", sum, sum / (double) item_count);

		// 2. numArr�� �� ���� �հ� ���� ���� ��� ���ؼ� ����غ�����
		// 0���� �� : 10 + 10 + 10 + 10
		// 0���� �� : 10 + 90 + 800 +300

		System.out.println();

		int[] rowsum = new int[numArr.length];
		int[] colsum = new int[4];

		for (int i = 0; i < numArr.length; ++i) {
			for (int j = 0; j < numArr[i].length; ++j) {
				rowsum[i] += numArr[i][j];
				colsum[j] += numArr[i][j];
			}

		}
		System.out.println("���� ��: " + Arrays.toString(rowsum));
		System.out.println("���� ��: " + Arrays.toString(colsum));
	}

}

//			column_sum = column_sum + numArr[i][j];
//			System.out.println(i + "���� ��: " + column_sum);