package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C12_inputRightThing {

	public static int input(String msg) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(msg);
			
			try {
				return sc.nextInt();
				
			} catch (InputMismatchException e) {
				System.err.println("���ڸ� �Է����ּ���");
				sc.nextLine();
			}
		}
	}

	public static void main(String[] args) {

		// ����ڷκ��� intŸ���� �����͸� �Է¹޾ƺ�����
		// �߸��� Ÿ���� �����Ͱ� �������� ���α׷��� ������� �ʾƾ��մϴ�
		// (�ùٸ��� int�� �Էµ� ��� ���α׷��� ����˴ϴ�

		int value = input("�ݵ�� ���ڸ� �Է����ּ��� >");
		
		System.out.println("�Է¹��� ���ڴ� " + value + " �Դϴ�.");

//		System.out.println("������ �Է� \n>");
//
//		while (true) {
//			try {
//				int data = new Scanner(System.in).nextInt();
//				System.out.println("�Է��� �� : " + data);
//				System.out.println("���α׷� ����");
//				System.exit(0);
//			} catch (Exception e) {
//				System.err.println("���α׷��� ������� �ʴ´�");
//				System.err.println("���ڸ� �Է��ض�");
//			}
//		}
	}
}
