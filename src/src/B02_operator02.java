
public class B02_operator02 {

	public static void main(String[] args) {
		
		// # �� ����
		//	- �� ������ ����� �� �Ǵ� �����̴�. (boolean Ÿ��)
		//	- ��� ����� �� ������ �Բ� ������ ��� ������ ���� ����Ѵ�
		//	a + b > 10 (��ȣ�� �ʿ� ����)
		
		int a = 5, b = 9;
	
		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : " + (a < b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a <= b : " + (a <= b));

		
		System.out.println("a == b : " + (a == b));	// ������ true
		System.out.println("a != b : " + (a != b));	// �ٸ��� true		
		
		// # �� ����
		//	- boolean ������ �ϴ� ����
		//	- && : �� ���� ��� true�� �� true (AND)
		//	- || : �� ���� �ϳ��� true���� true (OR)
		//	- !  : true�� false, false�� true (NOT)
		
		System.out.println("#### AND ####");
		System.out.println((a>4) && (b == 9)); //boolean �� ����� �� ���� ����
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("#### OR ####");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("#### NOT ####");// ����� �������ش�.
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(a < 10));
		
	}
}
