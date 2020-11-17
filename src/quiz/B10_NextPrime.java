package quiz;

import java.util.Scanner;

public class B10_NextPrime{

	// 사용자로부터 숫자를 입력받으면
	// 입력받은 수보다 더 크거나 같은 다음 소수를 찾아서 출력해보세요

	public static void main(String[] args) {

		System.out.println("수 입력 > ");
		int input = new Scanner(System.in).nextInt();
		// 입력한수 부터 시작
		for (int i = input; true; ++i) {
			// 나온 카운트들 센다
			int count = 0;
			// 2부터 입력한 수 중간값까지
			int sqrt = (int) Math.sqrt(i);
			for (int j = 2; j <= sqrt; ++j) {
				// 입력한 수에서 중간값 나머지가 0일때
				if (i % j == 0) {
					// 카운트를 센다
					++count;
				}
			}
			// 카운트가 0이면 i를 출력
			if (count == 0) {
				System.out.printf("'%d'는 다음 소수는 '%d'입니다.\n", input, i);
				// 소수가 나오면 중단
				break;
			}
		}

	}

}
