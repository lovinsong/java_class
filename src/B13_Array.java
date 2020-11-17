import java.util.Arrays;

public class B13_Array {

	// 배열
	// - 같은 타입의 변수를 한번에 여러개 선언하는 방법
	// - 인덱스를 활용해 해당 번째의 값에 접근 할 수 있다
	// (반복문과 함께 활용하면 매우 편하다)
	// - 배열은 한번 크기가 정해지면 크기를 변경할 수 없다
	// - 배열은 초기화가 자동으로 되어있다
	// (정수 : 0, 실수 : 0.0, boolean : false, 참조형 : null)

	public static void main(String[] args) {
		int[] num = new int[10];
		System.out.println("num[5] : " + num[5]);
		// 정수형

		String[] fruits = new String[10];
		System.out.println(fruits[5]);
		// 참조형 ex

		// 변수 100개를 쉽게 만드는 방법

		int[] a = new int[100];

		a[0] = 10;
		a[1] = 55;
		a[2] = 'A';
		a[99] = 999999;
//		a[100] = 99; // ※ 100개를 만들었다면 인덱스는 99번 까지 있다.

//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[99]);

		// # 배열을 선언하는 방법
		// 1. 타입[] 배열이름 = new 타입[배열크기];
		// 2. 타입[] 배열이름 = {값1, 값2, 값3, ...};
		// 3. 타입[] 배열이름 = new 타입[] {값1, 값2, 값3, ...};
		String[] colors = { "Red", "blue", "green", "yellow" };
		double[] scores = { 9.9, 8.8, 7.7, 6.6, 5.5, 4.4, 99, 'B', 123.123f, 30000000000L };
		boolean[] testResults = new boolean[] { true, false, true, true, true, false, 1 > 0, 1 == 0, 1 != 1, 1 == 1 };

		// # 가끔 함수중에 배열을 요구하는 함수들이 있다.
		String result = Arrays.toString(new int[] { 1, 2, 3 });

		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);
		System.out.println(colors[3]);

		// # Arrays.toString(arr) : 전달받은 배열를 보기좋은 문자열로 반환한다.
		System.out.println(java.util.Arrays.toString(colors));
		System.out.println(Arrays.toString(testResults));
		String scoreStr = Arrays.toString(scores);
		System.out.println(scoreStr);

		// # 배열과 반복문 활용하기
		System.out.println("colors 배열의 길이 : " + colors.length);

//							0~3		  4
		for (int index = 0; index < colors.length; ++index) {
			System.out.printf("%d번째 색깔 : %s\n", index, colors[index]);
//												  몇번째		색
		}

		// # String을 char형 배열로 변환하기
		String msg = "hello, worldl!";

		char[] msgArr = msg.toCharArray();

		System.out.println(msg.charAt(0));
		System.out.println(msgArr[1]);
		System.out.println(msgArr[2]);
		System.out.println(msgArr[3]);
		System.out.println(msgArr[4]);
		System.out.println(msgArr[5]);

		for (int i = 0; i < msgArr.length; ++i) {
			System.out.print(msgArr[i]);
		}
		System.out.println();

	}

}
