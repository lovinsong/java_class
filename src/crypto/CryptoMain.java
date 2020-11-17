package crypto;

public class CryptoMain {

	public void main(String[] args) {

		// 사용자가 메세지와 키값을 설정하고 원하는 암호 알고리즘으로
		// 암호화 / 복호화 작업을 할 수 있는 프로그램을 만들어보세요.

		String user_input = "Caesar";
		int user_input_key = 8;

		// 상속은 여러 클래스를 일반화(업캐스팅) 시키는 용도로 주로 많이 사용한다
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
//		System.out.println("암호화 할 문장을 입력해 주세요 > ");
//		String text = sc.nextLine();
//		
//		System.out.println("--------------------------");
//		
//		System.out.println("암호화 할 키 값을 넣으세요 > ");
//		int key = sc.nextInt();
//		
//		System.out.println("--------------------------");
//		
//		System.out.println("어떤 암호로 하시겠습니까 > ");
//		System.out.println("1.시저 암호");
//		System.out.println("2.전치 암호");
//		int num = sc.nextInt();
//		
//		System.out.println("--------------------------");
//		
//		switch (num) {
//		case 1:
//			System.out.println("--------------------------");
//			System.out.println("암호화된 메시지 > ");
//		String crypto_text = new CaesarCipher(key).encryption(text);
//			System.out.println(crypto_text);
//			System.out.println("--------------------------");
//		System.out.println("복호화 >");
//		String decrypto = new CaesarCipher(key).decryption(crypto_text);
//			System.out.println(decrypto);
//			break;
//			
//		case 2:
//			System.out.println("--------------------------");
//			 System.out.println("암호화된 메세지 > ");
//		String crypto_text2 = new TranspositionCipher(key).encryption(text);
//			System.out.println(crypto_text2);
//			System.out.println("복호화 >");
//			String decrypto2 = new TranspositionCipher(key).decryption(crypto_text2);
//			System.out.println(decrypto2);
//			break;			
//		}
//		System.out.println("--------------------------");
//
//	}
