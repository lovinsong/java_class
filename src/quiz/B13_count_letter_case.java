package quiz;

public class B13_count_letter_case {

	// ����ڷκ��� ������ �ϳ� �Է¹޾Ҵ� ġ��
	// �ش� ���忡 � ���ڰ� ��� ���� �ߴ��� ��� ����غ�����
	// (�빮��, �ҹ���, ���ڸ� �����Ѵ�)
	// A = 65 Z = 90 a = 97 z = 122
	public static void main(String[] args) {

		String msg = "abc12233444555";

		int[] count_A = new int[26];
		int[] count_a = new int[26];
		int[] count_1 = new int[10];
		
//		int[][] count = {count_A, count_a, count_1};
		
		

		for (int i = 0; i < msg.length(); ++i) {

			char ch = msg.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				count_a[ch - 'a'] += 1;
			}

			if (ch >= 'A' && ch <= 'Z') {
				count_A[ch - 'A'] += 1;
			}

			if (ch > '0' && ch <= '9') {
				count_1[ch - '0'] += 1;
			}
		}

		
		// 2���� �迭�� �ݺ������� ��ȸ�ϱ�
		for (int i = 0; i < 26; ++i) {
			if (count_a[i] > 0)
				System.out.printf("%c�� ������ Ƚ���� %d��\n", i + 'a', count_a[i]);
		}
		for (int e = 0; e < 26; ++e) {
			if (count_A[e] > 0)
				System.out.printf("%c�� ������ Ƚ���� %d��\n", e + 'A', count_A[e]);
		}
		for (int f = 0; f < 10; ++f) {
			if (count_1[f] > 0)
				System.out.printf("%c�� ������ Ƚ���� %d��\n", f + '0', count_1[f]);
		}
	}
}
