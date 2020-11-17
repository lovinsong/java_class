
public class A04_varNaming {

	public static void main(String[] args) {
		
		// # �츮�� ������ ����ؾ� �ϴ� ����
		//	1. ���� �ѹ��� ������ �� �ִ�
		//		- ���� ������ ã�ƴٴϸ鼭 ���� �� �ʿ䰡 ��������
		//	2. ���� �ǹ̸� �ο��ؼ� �ҽ� �ڵ��� �������� �ø� �� �ִ�
		//		- ������ �̸��� �� ���°��� �ſ� �߿��ϴ�
		int apple_count = 45;
		int apple_price = 485;
		int apple_gram = 50;
		int apple_calorie = 112;
		
		System.out.println("����� �� ������ " + apple_count * apple_price + "�� �Դϴ�.");
		System.out.println("����� �� ���Դ� " + apple_count * apple_gram + "g �Դϴ�.");
		System.out.println("����� �� Į�θ��� " + apple_count * apple_calorie + "kcal �Դϴ�.");
		
		/*
		 	# ���� �۸� ��Ģ (�������)
		 	
		 	(1) �� �ܾ� �̻��� �̾���� �������� ����� �� _�� Ȱ���Ѵ� (snake_case)
		 		ex: apple_count, apple_calorie
		 		
		 	(2) �� �ܾ� �̻��� �̾���� �������� ����� �� �빮�ڸ� Ȱ���Ѵ� (CamelCase)
		 		ex: appleCount, appleCalorie
		 
		 	(3) ������ ù ���ڴ� �ҹ��ڸ� ����Ѵ� (Ŭ������ ù ���ڿ� �빮�ڸ� ���)
		 	
		 	(4) ���α׷� ������ ���� ������ ���� ����(���) ��� �빮�ڸ� ����Ѵ�
		 		ex: APPLE_PRICE
		 		
		 	(5) ������ ������ ������ �� �ִ� ������ �ܾ �������
		 	
		 	# ���� �۸� ��Ģ (�ʼ�)
		 	
		 	(1) ������ ù ��° ���ڴ� ���ڰ� �� �� ����
		 		ex: 4pple, 1st, 2nd ...
		 		
		 	(2) ���� ���̿��� ������ ����� �� ����
		 	
		 	(3) Ư�����ڴ� _�� $�� ����� �� �ִ�
		 		ex: apple_$, $_apple, _apple$ ...
		 	
		 	(4) �̹� �ڹٿ��� ����ϰ� �ִ� Ű����� ���������� ����� �� ����
		 		ex: int, static, public, void. class ...
		 		
		 */
	}
}
