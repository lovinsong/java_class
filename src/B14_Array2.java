
public class B14_Array2 {

	// �迭 �ȿ��� �迭�� ���� �� �ִ�

	public static void main(String[] args) {

		// ������ ���� Ÿ�Կ��� null�� �� �� �ִ�
		// �迭 ������ ���� �����ϴ� ���� �ƴ϶� �迭�� ���� �ּҸ� �����Ѵ�
		// ��, �迭�� ������ ���� Ÿ���̴�
		int score = 0;
		String str = null;
		int[] scores = { 99, 123, 456, 789 };

		int[][] arr2 = {
				new int[5], // ��� �ִ� 5��¥�� int[] �迭
				null, // ���� �迭�� ����
				{ 1, 2, 3, 4, 5, 6, 7 },
				new int[] { 1, 2, 3 },
				};

		System.out.println("arr2�� ����� �迭�� ��ΰ���? " + arr2.length);
		System.out.println("arr2�� ����� �迭 �� 0��° �迭�� ���� : " + arr2[0].length);
//		System.out.println(arr2[1].length);
		System.out.println("arr2�� ����� �迭 �� 2��° �迭�� ���� : " + arr2[2].length);
		System.out.println("arr2�� ����� �迭 �� 3��° �迭�� ���� : " + arr2[3].length);

		// ���̸� Ȱ���Ͽ� n���� �迭�� n�� �ݺ������� ��� Ž���� �� �ִ�
		for (int i = 0; i < arr2.length; ++i) {
			System.out.print(i + "��° �迭 : ");
			int[] arr = arr2[i];

			if (arr != null) {
				for (int j = 0; j < arr.length; ++j) {
					System.out.print(arr2[i][j] + " ");
//					System.out.print(arr[j]);
				}
			}else {
				System.out.println("null");
			}
			System.out.println();

		}

		// Ȱ�� ��
		int[][] scores2 = { 
				{80, 90, 100},
				{50, 60, 70},
				{90, 90, 90},
				{70, 70, 70}
		};

		//1 : ���׶��
		//2 : �׸�
		//3 : X
		int[][] map = {
				{ 2, 2, 3, 3, 3, 5, 5, 5, 5 ,5, 5, 5 },
				{ 2, 2, 2, 3, 3 },
				{ 2, 2, 2, 3, 3, 5, 5, 5, 5, 1, 2, 1 },
				{ 2, 2, 2, 3, 3 },
				{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
				{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
		};
		
		for(int i = 0; i < map.length; ++i)
			for(int j = 0; j <map[i].length; ++j) {
				switch(map[i][j]) {
				case 1:
					System.out.print("�� ");
					break;
				case 2:
					System.out.print("�� ");
					break;
				case 3:
					System.out.print("  ");
					break;
				case 4:
					System.out.print("  ");
					break;
				default:
					System.out.print("  ");
					break;
				}
			}
		System.out.println();
	}

}
