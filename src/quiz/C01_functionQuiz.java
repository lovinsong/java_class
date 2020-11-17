package quiz;


public class C01_functionQuiz {

	// # ���� �Լ��� �����غ�����
	// 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	// 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	// 3. ���ڸ� �� �� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	// 4. ������ ���ڰ� �Ҽ����� �ƴ��� �Ǻ����ִ� �Լ� (boolean)
	// 5. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	// factorial : (n)*(n-1)(n-2)...3*2*1
	// 6.���� �ΰ�(a,b)�� �����ϸ� a�� b������ ��ȯ�ϴ� �Լ�
	// (0������ 1�� ��ȯ�ؾ���, Math.pow����)

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
		return e % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";

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
	// ���Ϻ��� �ϰ� ����.
	public static int facto(int f) {

		int result = 1;

		for (int i = f; i >= 1; i--)
			result = result * i;
		return result;

	}

	// 6.
	// ����Լ� �ڱ� �ڽ��� �θ��� �Լ� ( ���� ������, �б� ����, �Ӹ� ����)
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
		
			
			//2�� ¦���϶�
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
		// 4. true�϶� �Ҽ�
		System.out.println(prime(4));
		// 5.
		System.out.println(facto(4));
		System.out.println(recursive_factorial(5));
		System.out.println(recursive_pow(2, 3));
	}
}
