
// # imnport 
//	- �ٸ� ĳ������ �ִ� Ŭ������ ����ϱ� ���ؼ���
//	  �ش� Ŭ������ import�ؾ� �Ѵ�
//	�� �ٸ� ��Ű������ �̸� ������ �ҽ��� �����ͼ� ����� �� �ִ�
//	�� ���� ��Ű���� �̸� ������ �ҽ��� import���� �ʾƵ� �� �� �ִ�.
//	java.lang �� �⺻ ��Ű���̹Ƿ� import�� �Ⱥҷ��͵� ��� ����(math. , system. ...)
import java.util.Scanner;
//import quiz.A01_printQuiz;


public class B01_Scanner {

	// Scanner Ŭ����
	//	- ���α׷� �ܺηκ��� �Է��� ���� �� �ִ� ��ɵ��� ���ִ� Ŭ���� 
	//	- ��𿡼� �Է��� ������ ������ �� �پ��� ������� �Է¹��� �� �ִ�
	//	- �ַܼκ��� �Է��� ���� ���� system.in�� �̿��Ѵ�
	
	public static void main(String[] args) {
//		A01_printQuiz.main(null);
//		A00_Hello.main(null);
//		A01_Escape.main(null);
//		Math.pow(3, 5);
		
		// ���ο� ��ĳ�ʸ� ������ �� ���� sc�� ������ ��ĳ�ʸ� ��Ƴ��´�
		// ���ο� ��ĳ�ʸ� ������ �� ��𿡼� �Է¹������� ������ �� �ִ�
		//	System.out	: �ַܼ� ����ϴ� ���
		//	System.in	: �ֿܼ��� �Է¹޴� ���
		Scanner sc = new Scanner(System.in);
		
		// next()
		//	- ��ο� �����ϴ� ���� ���� �ϳ��� ������
		//	- Ÿ���� �ٲ��� �ʴ´� (String)
		//	- ��ο� �ƹ� ���� ���ٸ� �Է��� �ɶ����� ��ٸ���
		
		// nextŸ��()
		//	- ��ο� �����ϴ� ���� �������� �ϳ��� ���� �� �ش� Ÿ������ ��ȯ�Ѵ�
		//	- ��ο� �ƹ� ���� ���ٸ� �Է��� �ɶ����� ��ٸ���.
		//	- ��ο� �����ϴ� ���� ���� �ش� Ÿ���� �� �� ���ٸ� ������ �߻��Ѵ�
		
		// nextLine()
		//	- ��ο� �����ϴ� ���� �� �� ���� �����´�
		//	- �� ���� �����ϴ� ������ '\n' �̴�
		
		
		System.out.print("�ƹ� ���̳� �Է��� ������ > ");
		int num = sc.nextInt();
		
		System.out.println("�Է� ���� �� : " + num);
		System.out.println(num + 10);
		System.out.println(num * 10);
		System.out.println(num / 10);
		System.out.println(num / 10.0);
		System.out.println(Math.pow(num,2));
		
		int num2 = sc.nextInt();
		System.out.println("�ι� ° ��: " + num2);
	}
	
	
	
}
