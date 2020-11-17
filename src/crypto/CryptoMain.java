package crypto;

public class CryptoMain {

	public void main(String[] args) {

		// ����ڰ� �޼����� Ű���� �����ϰ� ���ϴ� ��ȣ �˰�������
		// ��ȣȭ / ��ȣȭ �۾��� �� �� �ִ� ���α׷��� ��������.

		String user_input = "Caesar";
		int user_input_key = 8;

		// ����� ���� Ŭ������ �Ϲ�ȭ(��ĳ����) ��Ű�� �뵵�� �ַ� ���� ����Ѵ�
		Cipher cipher = null;

		if (user_input.equals("Caesar")) {
			cipher = new CaesarCipher(user_input_key);
		} else if (user_input.equals("Transposition")) {
			cipher = new TranspositionCipher(user_input_key);
		}

		String result = cipher.encryption("ABCDEFAS AFABCDEFASAFABCDEFASAF");

		System.out.println(result);

	}
}

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("��ȣȭ �� ������ �Է��� �ּ��� > ");
//		String text = sc.nextLine();
//		
//		System.out.println("--------------------------");
//		
//		System.out.println("��ȣȭ �� Ű ���� �������� > ");
//		int key = sc.nextInt();
//		
//		System.out.println("--------------------------");
//		
//		System.out.println("� ��ȣ�� �Ͻðڽ��ϱ� > ");
//		System.out.println("1.���� ��ȣ");
//		System.out.println("2.��ġ ��ȣ");
//		int num = sc.nextInt();
//		
//		System.out.println("--------------------------");
//		
//		switch (num) {
//		case 1:
//			System.out.println("--------------------------");
//			System.out.println("��ȣȭ�� �޽��� > ");
//		String crypto_text = new CaesarCipher(key).encryption(text);
//			System.out.println(crypto_text);
//			System.out.println("--------------------------");
//		System.out.println("��ȣȭ >");
//		String decrypto = new CaesarCipher(key).decryption(crypto_text);
//			System.out.println(decrypto);
//			break;
//			
//		case 2:
//			System.out.println("--------------------------");
//			 System.out.println("��ȣȭ�� �޼��� > ");
//		String crypto_text2 = new TranspositionCipher(key).encryption(text);
//			System.out.println(crypto_text2);
//			System.out.println("��ȣȭ >");
//			String decrypto2 = new TranspositionCipher(key).decryption(crypto_text2);
//			System.out.println(decrypto2);
//			break;			
//		}
//		System.out.println("--------------------------");
//
//	}
