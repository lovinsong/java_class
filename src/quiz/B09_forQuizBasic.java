package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {

	// ����ڰ� ���ڸ� �Է����� ��
	// 1. 10���� �Է��� ���ڱ����� �� ���� ���غ�����
	// 2. 1���� �Է��� ���� ������ 3�� ����� ��� ����ϰ�
	//	  �� �� �� ������ ����� ������
	
	public static void main(String[] args) {
	//1.
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("���ڸ� �Է��ϼ���");
//		
//		int sum = 0;
//		
//	for(int i = sc.nextInt(); i > 10; --i) {
//		sum += i;
//	}
//		System.out.println("������ " + sum);
	
	//1.�� ����Ǯ��
		
//		System.out.println("���� > ");
		int user = new Scanner(System.in).nextInt();
//		
//		int start = 10;
//		int end = user;
//		
//		if (start > end) {
//			int temp = start;
//			start = end;
//			end = temp;
//		
		int sum = 0;
//		for (int i = start; i <= end; ++i) {
//			System.out.println(i);
//			sum += i;
//		}
		
		//2.������
		int start2 = 1;
		int end2 = user;
		
		if (start2 > end2) {
			int temp2 = start2;
			start2 = end2;
			end2 = temp2;
		}
	
		int count = 0;
		System.out.print("[");
		for (int i = start2; i <= end2; ++i) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
				count += 1;
			}
		}
		System.out.print("]\n");
		System.out.println("Q1. 3�� ����� ���� - " + sum);
		System.out.println("Q2. 3�� ����� ���� - " + count + "��");
	}
}
		
	//2.
//		int count = 0;
//		System.out.println("2������ ���ڸ� �Է��ϼ��� > ");
//	for (int i = sc.nextInt(); i >= 0; i -= 3) {
//		if(i % 3 == 0)
//			System.out.println(i);
//		else if(i % 3 == 1)
//			System.out.println(i - 1);
//		else if(i % 3 == 2)
//			System.out.println(i - 2);
//		else if(i % -3 == -1)
//			System.out.println(i + 1);
//		else if(i % -3 == -2)
//			System.out.println(i + 2);
//	}
//	}
//}
//	
	//2�� ���� Ǯ��.
		