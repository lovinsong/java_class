package quiz;

import java.util.Scanner;

public class B06_monthToSeason {

		// switch-case���� �̿��Ͽ�
		// ����ڷκ��� ���� �Է� ������ �ش��ϴ� ������ ����Ͻÿ�
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("���ϴ� ���� �Է��Ͻÿ� > ");
	
	int month = sc.nextInt();
	
	switch(month) {
	 case 2: case 3: case 4:
		System.out.println("���Դϴ�.");
		break;
	case 5: case 6: case 7: case 8:
		System.out.println("�����Դϴ�.");
		break;
	case 9: case 10: case 11:
		System.out.println("�����Դϴ�.");
		break;
	case 12: case 1 :
		System.out.println("�ܿ��Դϴ�.");	
		break;
	default:
		System.out.println("�ٽ� �Է��ϼ���.");
	}
	
	}
}