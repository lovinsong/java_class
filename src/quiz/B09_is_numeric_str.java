package quiz;

import java.util.Scanner;

public class B09_is_numeric_str {

	// �Է¹��� ���ڿ��� ���ڸ� ���ԵǾ� ������ ����� 1�� ����
	// �ٸ� ���ڰ� ���ԵǾ� �ִٸ� 0�� ����
	// �� ���ڿ��� ����������� ����� 2
	
//	public static void main(String[] args) {
//				
//
//		//1.���� ���� ����
//		String in;
//		int out = 2;
//
//		
//		System.out.println("�Է� >");
//		in = new Scanner(System.in).nextLine();
//		for(int i = 0, len = in.length(); i < len; ++i) {
//			
//			//2.in�� ���� ���� ����
//			if(!(in.charAt(i) >= '0' && in.charAt(i) <= '9')) {
//				out = 0;
//				//3. ���ǿ� �����ϸ� break�� ������
//				break;
//			}
//			else
//				out = 1;
//		}
//
//		System.out.println(out);
//		}
//	
//}
	public static void main(String[] args) {
	
		System.out.println("�˻��� ���� >");
		String str = ""; //new Scanner(System.in).nextLine();
		
		// # ���ڿ��� �̻��� ��� 3����
		//	- null : str�� ����Ű�� �ּҰ� ���� ���
		//	- str�� ���� ""�ΰ��
		//	- str�� ���̰� 0�� ���
		int status = 1;
//								��	��������	��
//		if (str == null || str ==" " || str.length() == 0) {
		if (str == null || str.length() == 0) {
			status = 2;
			
		} else {
			for(int i = 0, len = str.length(); i < len; ++i) {
				char ch = str.charAt(i);
			
			if(ch < '0' || ch > '9') {
				status = 0;
				break;
			}

		}

	}
		System.out.println("���ڿ� ���� : " +status);
	}
}

//		
//String senten = "1 23";
//String result1 = "1";
//String result2 = "0";
//String result3 = "2";
//
//for(int i = 0, len = senten.length(); i <senten.length(); ++i) {
//	
//	char numb = senten.charAt(i);
//	
//	if(numb == ' ' || numb == '\t') 
//		System.out.print(result3);
//	
//	else if(numb >= '0' && numb <= '9') 
//		System.out.print(result1);
//	
//	else if(numb >= '0' || numb <= '9') 
//		System.out.print(result2);
//	
		
