package quiz;

import java.util.Scanner;

public class B01_celTofahr {

	public static void main(String[] args) {
//		����ڷκ��� ���� �µ��� �Է¹�����
//		ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
//		( ��ȯ ������ �˾Ƽ� �˻�, ����� �Ҽ� ù° �ڸ�����)
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �µ�(��C)�� �Է��ϼ��� : ");
		int temp = sc.nextInt();
		
		System.out.println("�Է��Ͻ� �µ��� " + temp + "��C �Դϴ�.");
		System.out.println("ȭ���� �µ��� " + ((float)temp * 9 / 5 + 32) + "��F" + " �Դϴ�.");
		System.out.println();

		sc.close();
		// sc �� �ٽ� ������� ���� �����̱� ������ ���� �������� �ʴ´�.
//		double fahr= (new Scanner(System.in).nextDouble() * 9 / 5) + 32;
		
//		System.out.println("���� �µ��� %.1f");
//		System.out.printf("��ȯ�� �µ��� %.1.f���Դϴ�.\n" , fahr);
//		
		
	}
}
