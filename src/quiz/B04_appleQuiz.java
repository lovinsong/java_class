package quiz;

//ctrl + Shift + 0 : �ڵ� import
import java.util.Scanner;

public class B04_appleQuiz {

	// ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
	// ����� ������ �Է��ϸ� ����� ��� ��� ����
	// �ʿ��� �ٱ����� ������ ����غ�����.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("����� ������ �Է��ϼ��� > ");
//		double apple = sc.nextInt();
//		double baguni = apple / 10;
//	
//		if (apple <10 && apple > 0)
//			System.out.println("�ʿ��� �ٱ��ϴ� 1 �� �Դϴ�.");
//		else if(apple / 10 == 0) 
//			System.out.println("�ʿ��� �ٱ��ϴ� " + baguni + " �� �Դϴ�.");
//		else if (apple % 10 == 0) 
//			System.out.println("�ʿ��� �ٱ��ϴ� " + (baguni+1) +" �� �Դϴ�.");
//		else if (apple < 0) 
//			System.out.println("�ʿ��� �ٱ��ϴ� �����ϴ�.");
//		
		//�ٸ� Ǯ��
		
		// ���� �տ� final : ������ �Ұ����� ������ �ȴ�
		final double BASKET_SIZE = 10;	
//		BASEKT_SIZE = 99; ��� �Ұ�

		System.out.println("��� >");
		int appleCount = new Scanner(System.in).nextInt();
		
		if (appleCount < 0 ) {
			System.out.println("0�̻��� ���ڸ� �Է��Ͻÿ�");
		} else {
			int needBasket = (int) Math.ceil(appleCount / BASKET_SIZE);
			System.out.printf("�ʿ��� �ٱ��ϴ� %d�� �Դϴ�.\n" ,needBasket);
		}
		
		System.out.println("���α׷��� �����մϴ�.");
//		
		//������ �ߵ־� ������ ���ϰ� ���� ����. ������ �� ��������.
		}
}
