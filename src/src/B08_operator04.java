
public class B08_operator04 {

	public static void main(String[] args) {
		
		// # ���� ����
		//	= : ������ ������ �������� ���� ����
		int num = 10;
		num = num + 5;
		System.out.println(num);
		
		// # ���� ���� ����
		//	- ������ ���� ����ִ� ���� ������Ű�� ����
		num = 10;
		System.out.println(num += 5); // num = num + 5 �� ���θ�.
		System.out.println(num -= 2); // num = num - 2
		System.out.println(num *= 2); // num = num * 2
		System.out.println(num /= 4); // num = num / 4
		System.err.println(num %= 3); // num = num % 3
		
		// # ���� ����
		num = 10;
		
		num++; // num = num + 1
		System.out.println(num);
		++num; // num = num + 1
		System.out.println(num);
		num--; // num = num - 1
		System.out.println(num);		
		--num; // num = num - 1
		System.out.println(num);
	
		// # ++, --�� ��ġ�� ���� ���� ����� �޶����⵵ �Ѵ�
		int a = 3, b = 10;
		int result = a * b;// a++�� ; ������ ���� ���Ѵ�
//		int result = ++a * b;// ++a�� ; �̸� ���Ѵ�.
	
		System.out.println(result);
		System.out.println("a�� �� :" + a );
	}
	
}
