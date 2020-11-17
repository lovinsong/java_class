package quiz;

public class B13_count_letter_case {

	// 사용자로부터 문장을 하나 입력받았다 치고
	// 해당 문장에 어떤 문자가 몇번 등장 했는지 세어서 출력해보세요
	// (대문자, 소문자, 숫자만 집계한다)
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

		
		// 2차원 배열을 반복문으로 조회하기
		for (int i = 0; i < 26; ++i) {
			if (count_a[i] > 0)
				System.out.printf("%c가 등장한 횟수는 %d번\n", i + 'a', count_a[i]);
		}
		for (int e = 0; e < 26; ++e) {
			if (count_A[e] > 0)
				System.out.printf("%c가 등장한 횟수는 %d번\n", e + 'A', count_A[e]);
		}
		for (int f = 0; f < 10; ++f) {
			if (count_1[f] > 0)
				System.out.printf("%c가 등장한 횟수는 %d번\n", f + '0', count_1[f]);
		}
	}
}
