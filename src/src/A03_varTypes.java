
public class A03_varTypes {

		public static void main(String[] args) {
			// # ������ ����
			//	- Ÿ�� ������;	
			
			/*
			 	# ���� Ÿ�� (' '���� Ÿ�� ���� ���� ����� �޴´�)
			 	�� Ÿ�Ը��� �����͸� ������ �� �ִ� ũ�Ⱑ �ٸ���
			 						��sign bit(��ȣ��Ʈ) 0�̸� ���, 1�̸� ����
			 	- byte	(1byte)		0000 0000 ~ 1111 1111	-128 ~ +127
			 	- char	(2byte)								  0  ~ +65535 (65536��, ���ڿ� ����ȭ)
			 	- short	(2byte)							 -32768  ~ +32767 (65536��)
			 	- int	(4byte)				     	-2^16-1 -22�� ~ +2^16 21�� (2^32��) 
			 	- long	(8byte)						��û ū ����
			 */
			byte _byte = 127;	// ǥ���� �� �ִ� ���ڰ� ���� ��� ������ ������ �� �ִ�
			byte _byte2 = -128;
			
			char _char = 0;
			char _char2 = 65535;
			
			short _short = -32768;
			short _short2 = 32767;
			
			int _int = 210000000;//21�� 
			//int�� ������ ����� ���ڸ� ������ �ڿ� l/L�� �ٿ��� �Ѵ�
			long _long = 9000000000L;
			
			/*
			 	#�Ǽ� Ÿ�� (���� �׷��� ��꿡�� ���ȴ�)
				�� �ε��Ҽ��� ����� ����Ѵ�
				
				- float		(4byte)
				- double	(8byte)
			 */
			float _float = 123.123f;	// float���� ������ �ڿ� f/F�� �ٿ����Ѵ�
			double _double = 123.123;
			
			// # ���ͷ� (literal)
			//	- �׳� ���� ��
			//	- "", '', �Ҽ�, �Ҽ�f, ����, ����L ...
			//	- 0����(8), 0x����(16) 0b����(2)
			// 	- true, false
			System.out.println("111(10) : " + 111);		// 1 + 10^1 + 10^2
			System.out.println("111(8) : " + 0111);		// 1 + 8^1 + 8^2 
			System.out.println("111(16) : " + 0x111);	// 1 + 16^1 + 16^2
			System.out.println("111(2) : " + 0b111);	// 1 + 2^1 + 2^2
			// 2���� : 0 1 10 11 100 101 110 111 1000 ..
			// 8���� : 0 1 2 3 4 5 6 7 10 11 .. 16 17 20 21 .. 27 30 ..
			// 16���� : 0 1 2 3 4 5 6 7 8 9 A B C D E F 10 ..
			
			/*
			 	# ��/���� Ÿ��
			 	- boolean : true, false �� ������ ���� ������ �� �ִ� ���� Ÿ��
			 */
			boolean _boolean = true;
			boolean _boolean2 = false;
			boolean goonpil = false;
			boolean passExam = true;
			boolean complete = true;

			/*
			 	# ������ Ÿ�� (Ŭ���� Ÿ��)
			 	- String : ���ڿ�
			 	- �� �� ��� Ŭ������..
			 	�� �빮�ڷ� �����ϴ� ��� Ÿ�Ե��� ������ Ÿ���̴�
			 */
			String hiMsg ="Hi, nice to meet U!";
			String byeMsg = "bye ";
			
			System.out.println(hiMsg);
			System.out.println(byeMsg + byeMsg + byeMsg);
		}
	
}
