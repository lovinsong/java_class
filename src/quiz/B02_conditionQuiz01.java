package quiz;

import java.util.Scanner;

public class B02_conditionQuiz01 {

	/*
		[ �˸��� �񱳿����� �������� ]
		    
		1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
		2. int�� ���� b�� ¦���� �� true		
		3. int�� ���� c�� 7�� ����� �� true
		4. int�� ���� hour�� 0�̻� 24�̻��� �ƴϰ� 12�̻��� �� true	
		5. int�� ���� d�� e�� ���̰� 30�� �� true	
		6. int�� ���� year�� 400���� ������ �������� true
		   �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
		7. �μ��� ö������ 2�� ������ true
		8. �μ��� ö������ ������ 3�� ������ true  
 		9. boolean�� ���� powerOn�� false�� �� true
		10. ���ڿ� �������� str�� "yes"�� �� true
		11. �ﰢ�� A�� �����ﰢ���̸� true
	*/
	
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
//	//1.
//		System.out.print("1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true \n���� �Է��ϼ��� > ");
//		int a = Sc.nextInt();
//		System.out.println("1." + (a > 10 && a < 20));
//		System.out.println("");
//	//2.
//		System.out.print("2. int�� ���� b�� ¦���� �� true \n2���� �Է��ϼ��� > ");
//		int b = Sc.nextInt();
//		System.out.println("2. " +  (b % 2 == 0) );
//		System.out.println("");	
//	//3.
//		System.out.print("3. int�� ���� c�� 7�� ����� �� true \n���� �Է��ϼ��� > ");
//		int c = Sc.nextInt();
//		System.out.println("3. " +  (c % 7 == 0));
//		System.out.println("");
//	//4.
//		System.out.print("int�� ���� hour�� 0�̻� 24�̻��� �ƴϰ� 12�̻��� �� true \n4���� �Է��ϼ��� > ");
//		int hour = Sc.nextInt();
//		System.out.println("4. " + ((!(hour < 0 || hour >= 24)) && hour >= 12 ));//����ǥ ��ȣ ����
//		System.out.println("");
//	//5.
//		System.out.print("int�� ���� d�� e�� ���̰� 30�� �� true \n5���� �� �� �Է��ϼ��� > ");
//		int d = Sc.nextInt();
//		int e = Sc.nextInt();
//		System.out.println("5. " + (Math.abs(e-d) == 30 ));
//		System.out.println("");
//	//6. 
//		System.out.print("int�� ���� year�� 400���� ������ �������� true
//		+ �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true \n���� �Է��ϼ��� > ");
//		int year = Sc.nextInt();
//		System.out.println("6. " + (year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ));
//		System.out.println("");
//	//7.
//		System.out.print("�μ��� ö������ 2�� ������ true \n�μ��� ���̸� �Է��ϼ��� >");
//		int min = Sc.nextInt();
//		System.out.println("ö���� ���̸� �Է��ϼ��� >");
//		int chul = Sc.nextInt();
//		System.out.println("7. " + (Math.abs(min - chul) == 2)); // �ʿ���� ���� ����
//		System.out.println("");
//	//8.
//		System.out.print("�μ��� ö������ ������ 3�� ������ true \n�μ��� ������ �Է��ϼ��� > ");
//		int minb = Sc.nextInt();
//		System.out.println("ö���� ������ �Է��ϼ��� >");
//		int chulb = Sc.nextInt();
//		System.out.println("8. " + (Math.abs(chulb - minb) == 3));
//		System.out.println("");
		
		
	//9.
		System.out.print("boolean�� ���� powerOn�� false�� �� true \npowerOn�� �Է��ϼ��� ");
		
		boolean powerOn = false;
		
		System.out.println("9. " + !powerOn);
		System.out.println("");
		
		
	//10.
//		System.out.println("���ڿ� �������� str�� yes�� �� true");
//		
//		String str123 = Sc.nextLine();
//
//		System.out.println("10. " + str.equals(yes));
//		System.out.println("");
		
		System.out.println("���ڿ� �������� str�� yes�� �� true");
		// �ҹ��ڷ� �����ϴ� Ÿ�� - ���� �����Ѵ�
		// �빮�ڷ� �����ϴ� Ÿ�� - �ּҸ� �����Ѵ� (������)
		
		String str = "yes";
		String str2 = "yes";
		String str3 = new String("yes");
		String str4 = str;
		
		System.out.println(str == str2); // �ּҸ� ���� ��1
		System.out.println(str == str3); // �ּҸ� ���� ��2
		
		System.out.println(str.equals(str3)); // ���� ���� ��
		
	//11.
		System.out.print("�ﰢ�� A�� �����ﰢ���̸� true \n�� ������ �Է��ϼ���.> ");

		int a1 = Sc.nextInt(); 
		int a2 = Sc.nextInt();
		int a3 = Sc.nextInt();
		
		System.out.println("11. " + (Math.pow(a1,2) + Math.pow(a2,2) == Math.pow(a3,2) || (Math.pow(a2, 2) + Math.pow(a3, 2) == Math.pow(a1, 2) || (Math.pow(a3, 2) + Math.pow(a2, 2) == Math.pow(a1, 2)))));

		//�� ������ Ǯ��
		
		int b1 = 50, b2 =40, b3 = 90;
		
		System.out.println(b1 + b2 + b3 == 180 &&
				(b1 == 90 || b2 == 90 || b3 == 90 &&
				b1 !=0 && b2 !=0 && b3 !=0));
		
		
	}
}