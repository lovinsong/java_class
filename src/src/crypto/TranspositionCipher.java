package crypto;

public class TranspositionCipher extends Cipher{

	// # ��ġ ��ȣ
	// - �޼����� Key�� ��ŭ�� ���̷� ������ �ٸ� �������� �о ��ȣȭ �ϴ� ���

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

	// encryption �޼����� ������ ������ȣ�� ��ġ��Ű�� ���� ����
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

			// �� ���� �ݺ��ɶ����� FullLine�� ��� �÷���ŭ �ε��� ����
			// FullLine�� �ƴ� ��� �÷� -1 ��ŭ �ε��� ����
			for (int row = 0; row < key; ++row) {
				builders[column].append(crypto.charAt(crypto_index));
				
				if (row < numofFull) {
					crypto_index += columnSize;
				}else {
					crypto_index += columnSize - 1;
				}
				// �߰��� index�� ������ �÷��̸鼭 ���ÿ� ������ FullLine�� ���
				if(column == columnSize - 1 && row == numofFull - 1) {
					break;
				}else
					// ������ ���ڸ� �߰��ߴٸ� ������.
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
//		// JAVA�� forEach��� �ݺ��� (�迭�� ������ ������� �����鼭 �ݺ�)
//		�� �߸��� �ҽ� (�ӽú������� ������ ������)
		// - �ӽ� ������ builder�� ���ο� �ν��Ͻ��� ����� �ִ� ���̱� ������
		// ������ �ȴ�
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
//		// �� ���� �ȵɰ��
//		if (text[PLAIN] == null || text[PLAIN].length() == 0) {
//			System.err.println("���� ���� ���õ��� �ʾҽ��ϴ�.");
//			return null;
//		}
//		// �Լ�����
//		int len = text[PLAIN].length();
//
//		// ��ġ�� �ڵ带 �߰��ϸ� �Լ��� �����ش�(�����丵)
//		StringBuilder[] builders = makeBuilders(key);
//		// Ű����ŭ
////		for (int i = 0; i < key; ++i) {
////			builders[i] = new StringBuilder();
////		} // Ű ����ŭ �������� ���Ѵ�
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
//			System.err.println("���� ��ȣ���� ���õ��� �ʾҽ��ϴ�.");
//			return null;
//		}
//
//		// ��ȣ���� ���̿� Ű���� �̿��� �� ���ھ� ���� �о�� �ϴ����� �� �� �ִ�
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
//	// StringBuilder�� columnSize�� text������ ���޹�����
//	// ��ġ�� String�� �ϼ��ؼ� ��ȯ�ϴ� �Լ�
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
//	// Ŭ���� ���ο����� ����ϴ� ����/�ڿ��տ� ���̸� �ܺο��� �� �� ���� ��
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
//		// ������ Ŭ������ ��/Ű���� �ٸ� ���� �ν��Ͻ���
//		// �����ϰ� ����� �� �ֱ� ������ �򹮰� Ű�� static�� �ƴϴ�.
//
//		TranspositionCipher cipher = new TranspositionCipher(8);
//		cipher.setPlain("Common sense is not so common.");
//		String crypto = cipher.encryption();
//		System.out.println(crypto);
//
//		TranspositionCipher cipher2 = new TranspositionCipher(8);
//		cipher2.setPlain("�ȳ��ϼ��� �ݰ����ϴ� �� �̸��� ��μ��Դϴ�.");
//		crypto = cipher2.encryption();
//		System.out.println(crypto);
//	}
}
