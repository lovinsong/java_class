package quiz;

import java.util.Scanner;

public class B01_wonToDollar {

		// �ѱ� ���� �Է��ϸ�
		// �޷� ���Ž� �󸶸� �ް� �Ǵ��� ������ִ� ���α׷��� ����� ������
		// (ȯ���� �˻�, �Ҽ� ��° �ڸ����� ���, ȯ�� ������ 1.75%)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ѱ� ���� �Է��Ͻÿ� > ");
		double won = sc.nextInt();
		
		double dollor = 1138.90;
		
		double charge = 0.0175;
		
		double trans = won / dollor - (won / dollor * charge);
		
		System.out.printf("���� ������ " + Math.ceil(trans*100)/100+ "$�� ������ �ֽ��ϴ�.");

		System.out.printf("���� ������ " + String.format("%.2f", trans)+ "$�� ������ �ֽ��ϴ�.");		
		
		
		
//		// Ǯ��2
//		System.out.print("�󸶸� ȯ��?");
//		
//		int won = new Scanner(System.in).nextInt();
//		
//		double ex_fee_rate = 0.0175;
//		//������ ���� ��
//		double dollar = won / 1138.96;
//		
//		//������
//		double ex_fee = dollar * ex_fee_rate;
//		
//		//������ ���� �� 
//		dollar = dollar - ex_fee;
//		
//		System.out.printf("%d������ %.2f�޷��� �����߽��ϴ�.\n", won, dollar);
//		System.out.printf("(������ : %.2f �޷�)" , ex_fee);
		
		
		
		
		
		
		
	}
	
}
