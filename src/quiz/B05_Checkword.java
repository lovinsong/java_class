package quiz;

import java.util.Scanner;

public class B05_Checkword {

	// ����ڷκ��� �ܾ �ϳ� �Է¹ް�
	// ù ��° ���ڿ� ������ ���ڰ� ��ġ�ϸ� "OK"�� ���
	// �ƴ϶�� "NOT OK"�� ���
	
	public static void main(String[] args) {
		
//		System.out.println("�ܾ �Է��Ͻÿ� > ");
//		String word = new Scanner(System.in).next();
//		
//		System.out.printf("�Է��Ͻ� �ܾ�� %s �Դϴ�.", word);
////		System.out.printf("�Է��Ͻ� �ܾ��" + word + "�Դϴ�.");
//		
//		if(word.charAt(0) == word.charAt(word.length() - 1))
//			System.out.println("OK");
//		else
//			System.out.println("NOT OK");
		
	
	
	//�ٸ�Ǯ��
	String word = "A";
	
	// null : �ƹ����� ���� ����
	if (word == null || word =="") {
		System.out.println("�ܾ �ùٸ��� �ʽ��ϴ�.");
		return;
	}
	char first_letter = word.charAt(0);
	char last_letter = word.charAt(word.length() - 1);
	
	if (first_letter == last_letter)
		System.out.println("OK");
	else
		System.out.println("NOT OK");
		}
}
