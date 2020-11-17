package quiz;

public class B11_whileQuiz {

	// while 문을 이용하여

	// 1. 1부터 100까지의 3의 배수의 총합을 구해보세요

	// 2. 200부터 1까지 출력해보세요

	// 3. 1부터 200까지의 숫자 중
	// 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합을 구해보세요

	public static void main(String[] args) {

		// 1.
		int i = 0;
		int sum1 = 0;
		while (i++ < 100)
			if (i % 3 == 0) {
				sum1 = sum1 + i;
			}
		System.out.println("Q1의 답 " + sum1);
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
		System.out.println("Q3의 답 " + sum2);

	}

}
