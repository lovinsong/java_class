package quiz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class D10_OnlyPhoneNumber {

	// ����ڷκ��� ��ȭ��ȣ�� �Է¹޾ƺ�����.
	// ��ȭ��ȣ ���°� �ƴ� ��� �����޼����� �Բ� �ٽ� �Է�

	public static void main(String[] args) {

		System.out.println("�ڵ��� ��ȣ �� �Է��ϼ���\n ex> 010-1111-1111");
		Scanner sc = new Scanner(System.in);

		String number = sc.nextLine();
		String phoneNumber = null;
		String regex = "01[01679]-[\\d]{3,4}-[\\d]{4}";
		
		while(true) {
			System.out.println("Tel > ");
			phoneNumber = sc.nextLine();
			
			if(Pattern.matches(regex, phoneNumber)){
				System.out.println("�ùٸ� ��ȭ��ȣ");
				break;
			}else {
				System.err.println("�߸��� ��ȭ��ȣ");
			}
			
		}
		System.out.println("Tel : " + phoneNumber);
//		while (true) {
//			if (number.matches("[\\d]{3}.[\\d]{3,4}.[\\d]{3,4}")) {
//				System.out.println("�´� ��ȭ��ȣ �Դϴ�.");
//				break;
//			}else
//			System.err.println("�ٽ� �Է��ϼ���");
//			continue;
//		}

	}

}
