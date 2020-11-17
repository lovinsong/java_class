package quiz;

import java.util.Scanner;

public class B10_GCD {

	// 두 숫자를 입력받으면 두 숫자의 최대공약수를 구해보세요
	// ※ 최대 공약수 : 두 숫자의 공약 수중 가장 큰 공약수

	public static void main(String[] args) {

		// 유클리드 호제법
		// 1.임의의 두 자연수 a, b가 주어졌을때 둘 중 큰 값이 a라고 가정

		// 2.a를 b로 나눈 나머지를 n이라고 하면 (a%b = n)
		// n이 0일때 b가 최대공약수(GCD)이다.

		// 3.만약 n이 0이 아니라면,
		// a에 b값을 다시 넣고
		// b에 n을 대입 한 후 다시 n = a% b

		int a = 50;
		int b = 100;

		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}

		int n = -1;

		for (; n != 0;) {
			n = a % b;
			a = b;
			b = n;
		}
		System.out.println("최대 공약수는 " + a + "입니다.");

//		int num1 = 50;
//		int num2 = 100;
//
//		// num1이 더 크면 위치를 바꾼다
//		if (num1 > num2) {
//			int temp = num1;
//			num1 = num2;
//			num1 = temp;
//		}
//
//		int gcd = 1;
//		for (int i = num1; i > 0; --i) {
//			if (num1 % i == 0 && num2 % i == 0) {
//				gcd = i;
//				break;
//			}
//		}
//		System.out.printf("'%d'과 '%d'의 최대공약수는 '%d'입니다.\n", num1, num2, gcd);
	}

}

//System.out.println("두 수 입력 > ");
//Scanner sc = new Scanner(System.in);
//int input = sc.nextInt();
//int input2 = sc.nextInt();
//
//// 변수 선언 
//int gcd = 1;
//
//for (int i = 1; i <= input; ++i) {
//	if (input % i == 0)
////		System.out.println(i);
////	System.out.println();
//		for (int j = 1; j <= input2; ++j) {
//			if (input2 % j == 0)
////			System.out.println(j);
////			System.out.println();
//				for (int g = 1; g <= (i + j) / 2; ++g)
//					if (i == j)
//							//g는 계속 갱신이 되면서 마지막 값을 업데이트함.
//						gcd = g;
//		}
//}
//System.out.println(gcd);
