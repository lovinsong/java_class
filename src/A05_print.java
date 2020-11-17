
public class A05_print {

	public static void main(String[] args) {
		
		// # �ֿܼ� ����ϱ� ���� �������� �Լ���
		
		// 1. print()
		// - ���� �ڵ����� �ٲ��� ������ ����ϴ� �Լ� 
		System.out.print("1 Hello, world! ");
		System.out.print("2 Hello, world! ");
		System.out.print("3 Hello, world! ");
		
		// 2. println()
		// 	- ���� �ڵ����� �ٲٸ� ����ϴ� �Լ�
		// 	- ()�� ������ ������ �ǵڿ� '\n'�� �߰��Ͽ� ����Ѵ�
		//	- ()�� �ƹ��͵� �������� ������ '\n'�� ����Ѵ�
		System.out.println("4 Hello, world!");
		System.out.println("5 Hello, world!");
		System.out.println("6 Hello, world!");
	
		// 3. printf()
		//	- ���� ���ڸ� �̿��� ����� �� �ִ� �Լ�
		//	- ������ �̿��ϴ°� ���� ��찡 ����
		//	- ���� �ڵ����� �ٲ����� �ʴ´�
		
		// 2020�� 10�� 20��
		int year = 2020;
		int month = 10;
		int day = 20;
		System.out.println(year + "�� " + month + "�� " + day + "��");

		System.out.printf("%d�� %d�� %d��", year, month, day);
		System.out.println();
		
		// # printf�� ����ϴ� ���� ���ڵ�
		//		%d	: 10���� ���� (decimal)
		//		%x,X: 16���� ���� (hexa decimal)
		//		%o	: 8���� ���� (octal)
		//		%s	: ���ڿ� (String)
		//		%c	: ���� (Character)
		//		%f	: �Ǽ�
		System.out.printf("%x%x%x\n", 10, 11, 12);
		System.out.printf("%X%X%X\n", 10, 11, 12);
		System.out.printf("%.3f\n", 123.666151);
		
		System.out.printf("����� �ſ����� '%s' �Դϴ�.\n", "1���");
		System.out.printf("%d[%c], %x(16), %o(8)\n", 65, 65, 65, 65);
		System.out.printf("%d[%c], %x(16), %o(8)\n", 65, 'A', 65, 65);
		
		// # ���Ĺ��� �ɼ�
		//	�� d�� �־�� �ϴ� ���� �ƴ�
		
		//	%����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ������ �����Ͽ� ����Ѵ�
		System.out.printf("�̸� : %15s\n" , "Hong Gildong");
		System.out.printf("���� : %15d\n" , 15);

		// �ʹ� ��� ��ģ��
		System.out.printf("�̸� : %15s\n" , "My name is HongHong");
		
		// %-����d : ���ڸ�ŭ ĭ�� Ȯ���ѵ� ���� �����Ͽ� ����Ѵ�
		System.out.printf("%-10s : Hong Gildong\n", "Fullname");
		System.out.printf("%-10s : 15\n", "Age");
		System.out.println("");// ���Ʒ� �� 
		System.out.printf("%10s : Hong Gildong\n", "Fullname");
		System.out.printf("%10s : 15\n", "Age");
		
		// %0����d : ���ڸ�ŭ ĭ�� Ȯ���� �� �� ĭ�� 0�� ä�� ����Ѵ�
		System.out.printf("%010d\n", 123);
		System.out.printf("%020f\n", 123.321);
		
		// %+����d : ��� �տ��� ��ȣ�� ���̰� �ȴ�
		System.out.printf("������ �µ��� ���� %+d�� �Դϴ�.\n", -5);
		System.out.printf("������ �µ��� ���� %+d�� �Դϴ�.\n", 20);
		
		// %.����f : �Ҽ� �ڸ����� �����Ѵ�
		System.out.printf(".3\t:%.3f\n", 123.321);
		System.out.printf("default\t:%f\n", 123.321);
		System.out.printf(".10\t:%.10f\n", 123.321);
		System.out.printf(".20\t: %.20f\n", 123.321);
		System.out.printf(".255\t: %.255f\n", 123.321);
		
		
		
	}
	
}
