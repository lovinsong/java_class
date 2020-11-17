
public class B00_operator01 {

	public static void main(String[] args) {
		
		// # ������ (operator)
		//	- ����� �� ����ϴ� ��
		
		// # ��� ������
		int a = 10, b = 3;
		double c = 7.0;
		
		System.out.printf("a : %d, b: %d\n", a, b);
		
		// �� ������ �켱 ������ ��Ģ ������ �켱������ ������
		System.out.println("+ : " + (a + b));	// ���ϱ�
		System.out.println("- : " + (a - b));	// ����
		System.out.println("x : " + a * b);	// ���ϱ�
		
		// �� �������� ������ �� ���´�
		System.out.println("/ : " + a / b);	// �������� ������
		// �� ������ �Ǽ��� ������ ��Ȯ�� ����� �Ѵ�
		System.out.println("������ �Ǽ� ������ : " + a / c);	// ������ �Ǽ� ���� ������
		System.out.println("������ �Ǽ� ������ : " + a / (double)b);	// ������ �Ǽ� ���� ������
		
		System.out.println("������ : " + a % b); // ������
		
		// ���� (��� double Ÿ��)
		System.out.println("���� : " + Math.pow(a, b)); 
		// ������
		System.out.println("������ : " + Math.sqrt(2));
		// ���밪
		System.out.println("���밪 : " + Math.abs(-20));
		// �ݿø�	
		System.out.println("�ݿø� : " + Math.round(1.1234));
		System.out.println("�ø� : " + Math.ceil(1.001));
		System.out.println("���� : " + Math.floor(1.999));
		System.out.println("�� ū ���� : " + Math.max(a, b));
		System.out.println("�� ���� ���� ���� : " + Math.min(a, b));
		
		//��Ʈ ����
		System.out.println("��Ʈ ���� : " + (a ^ b)); // ������ �ƴϴ� (XOR)
		
		// 10	: 1010
		// 7	: 0111 ^ (XOR)
		//		------ 
		//		  1101 ���� �ٸ��� 1 ������ 0
		//		8 + 4 + 1
		
		
		
		
	}
	
}
