package quiz;


public class C01_functionQuiz {

	// # 다음 함수를 정의해보세요
	// 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	// 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	// 3. 숫자를 한 개 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	// 4. 전달한 숫자가 소수인지 아닌지 판별해주는 함수 (boolean)
	// 5. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	// factorial : (n)*(n-1)(n-2)...3*2*1
	// 6.숫자 두개(a,b)를 전달하면 a의 b제곱을 반환하는 함수
	// (0제곱은 1을 반환해야함, Math.pow금지)

	// 1.
	public static boolean alpha(char i) {

		return (i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z');
//			return true;
//		} else {
//			return false;
//		}
	}

	// 2.
	public static boolean three(int i) {

		return i % 3 == 0;
//			return true;
//		} else {
//			return false;
//		}
	}

	// 3.
	public static String even(int e) {
		return e % 2 == 0 ? "짝수입니다" : "홀수입니다";

//		if (e % 2 == 0) {
//			return true;
//		} else {
//			return false;
//		}
	}

	// 4.
	public static boolean prime(int p) {
		if (p == 1) {
			return false;
		}

		double sqrt = Math.sqrt(p);

		for (int i = 2; i <= sqrt; ++i) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;

//		for (int i = 2; i <= p; ++i) {
//			int count = 0;
//
//			int sqrt = (int) Math.sqrt(i);
//			for (int j = 2; j <= sqrt; ++j) {
//				if (i % j == 0) {
//					++count;
//					return false;
//				}
//			}
//			if (count == 0) {
//			}
//
//		}
//		return true;
	}

	// 5.
	// 리턴부터 하고 시작.
	public static int facto(int f) {

		int result = 1;

		for (int i = f; i >= 1; i--)
			result = result * i;
		return result;

	}

	// 6.
	// 재귀함수 자기 자신을 부르는 함수 ( 성능 안좋음, 읽기 힘듬, 머리 아픔)
	public static int recursive_factorial(int num) {
		if (num == 1) {
			return 1;
		}

		return num * recursive_factorial(num - 1);

	}

	// 6-2.
	public static int recursive_pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		return a * recursive_pow(a, b - 1);
	}
		
			
			//2가 짝수일때
//		} else if (b % 2 == 0) {
//			int n = recursive_pow(a, b/2);
//			return n*n;
//		}else {
//			int n = recursive_pow(a, (b-1)/2);
//		return a*n*n;
//	}


	public static void main(String[] args) {

		// 1.
		System.out.println(alpha('a'));
		// 2.
		System.out.println(three(4));
		// 3.
		System.out.println(even(2));
		// 4. true일때 소수
		System.out.println(prime(4));
		// 5.
		System.out.println(facto(4));
		System.out.println(recursive_factorial(5));
		System.out.println(recursive_pow(2, 3));
	}
}
