package crypto;

public class TranspositionCipher extends Cipher{

	// # 전치 암호
	// - 메세지를 Key값 만큼의 길이로 나눈뒤 다른 방향으로 읽어서 암호화 하는 방식

	// ex>

	// plain : Common sense is not so common.
	// key : 8

	// 0 1 2 3 4 5 6 7
	// ---------------
	// C o m m o n s
	// e n s e i s
	// n o t s o c
	// o m m o n .

	// Cenoonommstmme oo snnio. s s c

	// crypto : Ceno onom nmst mme oo snnio. s s c

	// 0 1 2 3
	// C e n o
	// o n o m
	// m s t m
	// m e o
	// o n s
	// n i o .
	// s X
	// s c X

	int key;

	public TranspositionCipher(int key) {
		this.key = key;
	}

	// encryption 메서드의 형식을 시저암호와 일치시키는 것이 좋다
	public String encryption(String plain) {
		StringBuilder[] builders = getBuilders(key);

		int len = plain.length();

		for (int i = 0; i < len; ++i) {
			builders[i % key].append(plain.charAt(i));
		}
		return joinBuilders(builders);
	}

	public String decryption(String crypto) {
		int len = crypto.length();
		int columnSize = len % key > 0 ? len / key + 1 : len / key;
		int numOfBlanks = columnSize * key - len;
		int numofFull = key - numOfBlanks;

		StringBuilder[] builders = getBuilders(columnSize);

		for (int column = 0; column < columnSize; ++column) {

			int crypto_index = column;

			// 한 줄이 반복될때마다 FullLine인 경우 컬럼만큼 인덱스 증가
			// FullLine이 아닌 경우 컬럼 -1 만큼 인덱스 증가
			for (int row = 0; row < key; ++row) {
				builders[column].append(crypto.charAt(crypto_index));
				
				if (row < numofFull) {
					crypto_index += columnSize;
				}else {
					crypto_index += columnSize - 1;
				}
				// 추가한 index가 마지막 컬럼이면서 동시에 마지막 FullLine인 경우
				if(column == columnSize - 1 && row == numofFull - 1) {
					break;
				}else
					// 마지막 글자를 추가했다면 나가라.
				if(crypto_index >= len) {
					break;
				}
			
			}

		}
		return joinBuilders(builders);
	}

	private String joinBuilders(StringBuilder[] builders) {
		StringBuilder result = new StringBuilder();
		for (StringBuilder builder : builders) {
			result.append(builder);
		}
		return result.toString();
	}

	private StringBuilder[] getBuilders(int columnSize) {
		StringBuilder[] builders = new StringBuilder[columnSize];

		for (int i = 0; i < builders.length; ++i) {
			builders[i] = new StringBuilder();
		}
//		// JAVA의 forEach방식 반복문 (배열의 내용을 순서대로 꺼내면서 반복)
//		※ 잘못된 소스 (임시변수여서 나가면 끝나서)
		// - 임시 변수인 builder에 새로운 인스턴스를 만들어 넣는 것이기 때문에
		// 문제가 된다
//		for(StringBuilder builder : builders) {
//			builder = new StringBuilder();
//		}
		return builders;
	}

	public static void main(String[] args) {

		String crypto = new TranspositionCipher(8).encryption("Common sense is not so common. Common sense is not so common.");
		System.out.println(crypto);
		String plain = new TranspositionCipher(8).decryption(crypto);
		System.out.println(plain);
	}
//	String[] text;
//	final static int CRYPTO = 1;
//	final static int PLAIN = 0;
//
//	public TranspositionCipher(int key) {
//		this.key = key;
//		text = new String[2];
//	}
//
//	public void setPlain(String plain) {
//		text[PLAIN] = plain;
//	}
//
//	public void setCryption(String crypto) {
//		text[CRYPTO] = crypto;
//	}
//
//	public String encryption() {
//		// 평문 셋이 안될경우
//		if (text[PLAIN] == null || text[PLAIN].length() == 0) {
//			System.err.println("아직 평문이 세팅되지 않았습니다.");
//			return null;
//		}
//		// 함수시작
//		int len = text[PLAIN].length();
//
//		// 겹치는 코드를 발견하면 함수로 묶어준다(리팩토링)
//		StringBuilder[] builders = makeBuilders(key);
//		// 키값만큼
////		for (int i = 0; i < key; ++i) {
////			builders[i] = new StringBuilder();
////		} // 키 값만큼 나눈것을 더한다
////		for (int i = 0; i < len; ++i) {
////			builders[i % key].text[PLAIN].charAt(i);
////		}
////
////		for (int i = 1; i < key; ++i) {
////			builders[0].append(builders[i]);
////		}
////
////		this.text[CRYPTO] = builders[0].toString();
////
////		return text[CRYPTO];
//		return transposition(builders, key, PLAIN);
//	}
//
//	public String decryption() {
//		if (text[CRYPTO] == null || text[CRYPTO].length() == 0) {
//			System.err.println("아직 암호문이 세팅되지 않았습니다.");
//			return null;
//		}
//
//		// 암호문의 길이와 키값을 이용해 몇 글자씩 끊어 읽어야 하는지를 알 수 있다
//		int nob = (int) Math.ceil(text[CRYPTO].length() / (double) (key));
//
//		StringBuilder[] builders = makeBuilders(nob);
//
//		for (int i = 0, len = text[CRYPTO].length(); i < len; ++i) {
//			builders[i % nob].append(text[CRYPTO].charAt(i));
//
//		}
//
//		return null;
//	}
//
//	// StringBuilder와 columnSize와 text종류를 전달받으면
//	// 전치된 String을 완성해서 반환하는 함수
//
//	private void transposition(StringBuilder[] builders, int columnSize, int code) {
//		for (int i = 0, len = text[code].length(); i < len; ++i) {
//			builders[i % columnSize].append(text[code].charAt(i));
//		}
//
//		for (int i = 1; i < columnSize; ++i) {
//			builders[0].append(builders[i]);
//		}
//
//		return builders[0].toString();
//	}
//
//	// 클래스 내부에서만 사용하는 변수/자원앞에 붙이면 외부에서 쓸 수 없게 됌
//	private StringBuilder[] makeBuilde
//
//	rs(int numOfBuilders) {
//		StringBuilder[] builders = new StringBuilder[numOfBuilders];
//
//		for (int i = 0; i < numOfBuilders; ++i) {
//			builders[i] = new StringBuilder();
//		}
//
//		return builders;
//	}
//
//	public static void main(String[] args) {
//		// 만들어둔 클래스로 평문/키값이 다른 여러 인스턴스를
//		// 생성하고 사용할 수 있기 때문에 평문과 키는 static이 아니다.
//
//		TranspositionCipher cipher = new TranspositionCipher(8);
//		cipher.setPlain("Common sense is not so common.");
//		String crypto = cipher.encryption();
//		System.out.println(crypto);
//
//		TranspositionCipher cipher2 = new TranspositionCipher(8);
//		cipher2.setPlain("안녕하세요 반갑습니다 제 이름은 김민수입니다.");
//		crypto = cipher2.encryption();
//		System.out.println(crypto);
//	}
}
