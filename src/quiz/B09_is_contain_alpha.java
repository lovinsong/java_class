package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {

	//����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ� ������ true�� ���
	//������ false�� ���
	
	public static void main(String[] args) {
//		
//		
		char some;
		boolean inclu = false;
		
		System.out.println("�Է� > ");
		String word = new Scanner(System.in).nextLine();
		
		//ī��Ʈ�̿�
		int count = 0;
		for(int i =0; i <word.length(); i++) {
			some = word.charAt(i);
			if((some >= 'a' && some <= 'z') || (some >= 'A' && some <= 'Z')) {
				count++;
				inclu = true;
			}
		}
		if(count>0) {
			System.out.println("true");
		}else
			System.out.println("false");

//		System.out.println("�˻� �� ���� >");
//		String str = new Scanner(System.in).nextLine();
		
//		boolean result = false;
//		for(int i =0, len = str.length(); i <len; ++i) {
//			char ch = str.charAt(i);
//			if((ch >='a' && ch <= 'z') || (ch >='A' && ch <='Z')){
//				result = true;
//				break;
//			}
//		System.out.println(result);
		
		// "a12345"
		
//		boolean result = false;
//		
//		// str.length()�� �ѹ��� ȣ���ϴ� ���
//		for(int i = 0, len =str.length(); i < str.length(); ++i) {
//			char ch = str.charAt(i);
//			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch >= 'Z')) {
//				result = true;
//				break; // ������ �ݺ����� ������.
//			}
//			System.out.println(result);
//			
//		}
		
		
	}
			
}