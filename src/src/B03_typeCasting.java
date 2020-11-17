
public class B03_typeCasting {

	public static void main(String[] args) {
		
		// # Ÿ�� ĳ����
		//	- Ÿ���� �ڿ������� ���ϴ� ��� (������ ���� ������ ���� ��)
		//	- Ÿ���� ������ ��ȯ��Ű�� ��� (������ ��)
		
		// # Ÿ���� ũ��
		// ���� Ÿ�� : byte(1) < char, short(2) < int(4) < long(8)
		// �Ǽ� Ÿ�� : float(4) < double(8)
	
		byte _byte = 10;
		int _int = 20_0000_0000; 
		// �� ���� ���ͷ��� _�� ���� �ڸ��� ǥ���� �����ϴ�
		
		// 1.�ڿ������� Ÿ��ĳ����
		_int = _byte;
		System.out.println(_int);
		
		// 2. ���� �ջ�� ���� �ִ� ��쿡�� �����Ϸ��� ��� �Ѵ�
		_int = 2000000128;
		_byte = (byte)_int;
		System.out.println(_byte);
		
		long _long = 200000000000L;
		float _float = _long;
		System.out.println(_float);
		
		// 3. ���� Ÿ���� �� ���� ũ���� �Ǽ�Ÿ�Կ��� �� �� �ִ�.
		_float = 123.123f;
		_long = (long)_float; // �Ҽ��� �Ʒ��� ����� �� �����Ƿ� ���
		System.out.println(_long);

		// 4. ���� ���̴��� �ٸ��� �ؼ� �� �� �ִ� Ÿ���� ��쿡
		//	  Ÿ�� ĳ������ �ʿ��ϴ�
		int a = 70;
		System.out.println("a : " + a);
		System.out.println("(char) a : " + (char) a);
		System.out.println("(char) 70 : " + (char) 70);
		System.out.println("(int) 'F' : " + (int) 'F');
		
		// ���� 70 �̴��� � Ÿ���̳Ŀ� ���� �ؼ� ����� �޶�����
		// charŸ���̶�� ����ǥ(charset)�� ���� �ؼ��ϰ� �ǰ�
		// intŸ���̶�� �״�� ���ڷ� �޾Ƶ��δ�
		
		System.out.println((int)'��');
		System.out.println((int)'��');
		System.out.println((int)'��');
		
		// # charŸ���� �����ڵ带 �����ϱ� ���ϵ���
		//	 2byte ����� �����ϵ��� ����Ǿ� �ִ�
		
		// # charŸ���� ������ �������� ���ϰ� �ֱ� ������
		//	 ������ �����ϴ�
		System.out.println("K�� A���� ��ĭ ? " + ('K' - 'A') + "ĭ");
		System.out.println((char)('A' + 10));
		System.out.println("���ĺ��� ��� �� ��? " + ('Z' - 'A' + 1) + "��");
		System.out.println("������ ��� �� ��? " + ('��' - '��' + 1) + "��");
		System.out.println("������ ��� �� ��? " + ('��' - '��' + 1) + "��");
		
	
	
	}
	
	
}
