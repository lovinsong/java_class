package quiz;

import java.util.Scanner;

public class B01_GuessAge {

	// ����ڷκ��� ������ �⵵�� �¾ �⵵�� �Է� ������
	// �ѱ� ���̸� ����Ͽ� ������� �˷��ִ� ���α׷��� ��������
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���� �Է��Ͻÿ� > ");
		int year = sc.nextInt();
		System.out.println("���ش� " + year + "�� �Դϴ�.");
	
		System.out.print("�¾ ���� �Է��Ͻÿ� > ");
		int birth = sc.nextInt();
		System.out.println("�¾ ���� " + birth + "�� �Դϴ�.");
	
		System.out.println("���� �ѱ� ���̴� " +  ((int)year - (int)birth + 1) +  "�� �Դϴ�." );
		
//		int age = year - birth + 1;
//		System.out.println("����� ���̴� %d�� �Դϴ�. \n , age");
//		�ѹ�����ϰ� ������ ������� age�� ���� ����
		
		sc.close();
	}
	

	
}
