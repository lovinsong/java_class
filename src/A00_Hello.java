
// �ּ� (Comment)
//	- ���α׷��Ӱ� �ϰ� ���� ���� �޸��صδ� ��

// ���ٸ� �ּ� ó�� �ȴ�

/*
 ������
 �ּ� ó��
 */

/**
 * ����ȭ �ּ� (��Ŭ������ �� ������ �о��ش�)
 */

// ctrl + [+, -] : ���� ũ�� ����
// ctrl + M 	 : ���� â ũ�� �ִ�/�ּ�ȭ 

// ctrl + Z : ��� �� �� ����ϱ�
// ctrl + Y : ��� ����� �� ����ϱ�
// ctrl + D : ������ �� �����ϱ�

// alt  + ���Ʒ� ȭ��ǥ : �� ���� �̵���Ű��
// ctrl + shift + f : �ڵ�����

// # ��� ���� ���� ����Ű
// ctrl  + A	: ���� ��ü �������
// shift + ����Ű : ����Ű�� �̿��� �������
// shift + HOME : Ŀ�� ��ġ���� ���� �� �ձ��� �������
// shift + END  : Ŀ�� ��ġ���� ���� �� �ڱ��� �������

// Tab			: �鿩����
// Shift + Tab  : �Ųٷ� �鿩����

// �� public class�� �̸��� �ݵ�� ���ϸ�� ���ƾ� �Ѵ�
public class A00_Hello{
// ���� ���� ������ �� �װ��� Ŀ���� �ΰ� F2�� ������
// �ش� ������ ���� ������ �ذ�å�� �� �� �ִ�
	
	// main ����� ��
	// main() �Լ�
	// - ���α׷��� ���� ���� 
	// - ���α׷��� �����ϸ� ���� ���� main() �Լ��� ã�Ƽ� �����Ų��
	// - main() �Լ��� ������ �߰�ȣ�� �����ȴ�
	public static void main(String[] args) {
		// ���α׷��� ���� ����
		
		// syso ����� ��
		// # System.out.println() �Լ�
		// - ()�ȿ� ������ �����͸� �ֿܼ� ����ϴ� �Լ�
		
		// # �Լ���?
		//	- � �ܾ� �ڿ� ()�� �پ� �ִ� ���� ��� �Լ���� �θ���
		
		// # �ܼ��̶�?
		//	- ���ڸ� ������ ���� ȭ�� (���� ��ǻ�� ȭ��)
		//	- Eclipse������ �׽�Ʈ������ �Ͼ� ������ �ܼ��� �����ϴ� �� ���̴�
		//	- ������ �츮�� �ۼ��� ���α׷��� ���� ȭ�鿡�� �����ϸ�
		//	  ���� ȭ�鿡 ��µȴ�
		System.out.println("Hello, world!"); // ctrl + F11
		System.out.println("Banana"); 
		System.out.println("Pineapple"); 
		
		System.out.println("����������������������������������������������");
		System.out.println("�� �١ڡ١ڡ١ڡ١ڡ١ڦ�");
		System.out.println("�� ��1.�����ϱ� 	    �ڦ�");
		System.out.println("�� ��2.�̾��ϱ�	    �ڦ�");
		System.out.println("�� ��3.������	    �ڦ�");
		System.out.println("�� �١ڡ١ڡ١ڡ١ڡ١ڦ�");
		System.out.println("����������������������������������������������");
		
		// # �ڹ��� �����͵�
		
		// 1. ""���̿� ���� �� : ���ڿ� (String)
		System.out.println("ABCDEFG�����ٶ󸶹ٻ�");
		System.out.println("�ȳ��ϼ���!@!@#");

		// 2. �׳� ���� : ���� (int, Integer)
		System.out.println(123);
		System.out.println(123456);
		System.out.println(123 + 2);
		System.out.println(123 * 15616163);
		
		// 3. �Ҽ� : �Ǽ� (/Double, Float)
		System.out.println(123.48858288);	// �Ⱥ��̸� double
		System.out.println(123.4885828f);	// f�� ���̸� float
		
		// 4 . ''���̿� ���� �� : ���� (Character), ���� �� �ϳ�
		// �� ���� ����ǥ���� ���ڸ� ������ ������ ������ �߻��Ѵ�
		System.out.println('��');
		System.out.println('X');
		System.out.println('ʫ');
		System.out.println('��');
		
		// # ���ڰ� ������ ������ �ִ� ���ڰ� ����
		System.out.println("'ʫ'	�� �ڵ尪 : " + (int)'ʫ');
		System.out.println("'$'	�� �ڵ尪 : " + (int)'$');
		System.out.println("'��'	�� �ڵ尪 : " + (int)'��');
		
		// # �ڵ尪���� ���� ����ϱ�
		System.out.println("'23478' �� ����  : " +(char)23478);
		System.out.println("'36'	�� ����  : " +(char)36);
		System.out.println("'40432' �� ����  : " +(char)44032);
		
		
		// �� �ٸ� Ÿ�� + ������ �����ϴ�
		
		// 1. ���ڿ� + ������ �̾���� ���ڿ��� �ȴ�
		System.out.println("123"+ 456);
		System.out.println("���ڿ� : "+ 456);
		
		// 2. �Ǽ� + ������ �Ǽ��� �ȴ�
		System.out.println(1234.56 + 30);
		
		// 3. ���� + ������ ���ڰ� �ȴ�
		System.out.println('��' + 90);
		System.out.println('A' + 90);
		
		// ; (�����ݷ�) : �� ��ɾ �������� �˸���.
		
		// ���α׷��� ��
	
		/////////
	}

}