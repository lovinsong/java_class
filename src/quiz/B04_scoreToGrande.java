package quiz;

import java.util.Scanner;

public class B04_scoreToGrande {

	//������ �Է¹����� �ش� ����� ������ִ� ���α׷��� �ۼ��غ�����.
	
	// 90�� �̻� : A���
	// 80�� �̻� : B���
	// 70�� �̻� : C���
	// 60�� �̻� : D���
	// �� �� : F���
	
	//  �� ������ 0�� ���� 100�� ���� �ֽ��ϴ�.
	
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("������ �Է��ϼ��� >");
	int score = sc.nextInt();
	
	if (score < 0 || score > 100)
		System.out.println("������ �ٽ� �Է��ϼ���");
		//return; // main()�� ������
		//System.exit(0); // ���α׷��� �����Ѵ�
	else if (score < 60)
		System.out.println("F ��� �Դϴ�.");
	else if (score < 70)
		System.out.println("D ��� �Դϴ�.");
	else if (score < 80)
		System.out.println("C ��� �Դϴ�.");
	else if (score < 90)
		System.out.println("B ��� �Դϴ�.");
	else
		System.out.println("A ��� �Դϴ�.");
	}
	//���� ������.
	
	//�ٸ� Ǯ��2
//	System.out.println("������ �Է��ϼ��� >");
//	int score = new Scanner(System.in).nextInt();
//	
//	if (score < 0 || score > 100)
//		System.out.println("������ �ٽ� �Է��ϼ���");
//	
//	char grade = 'F';
//	if (score >= 90)
//		grade ='A';
//	else if (score >=80)
//		grade ='B';
//	else if (score >=70)
//		grade ='C';
//	else if (score >=60)
//		grade ='D';
//		
//	System.out.printf("����� ���� : %d\n��� : %c\n", score, grade);

}
