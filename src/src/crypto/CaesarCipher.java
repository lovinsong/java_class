package crypto;

public class CaesarCipher extends Cipher {

	// # ��ȣ��?
	// - ��� �޼����� �ְ�ޱ� ���� ��
	// - ��ȣȭ(Encryption)
	// ��(�Ϲ� �޼���)�� ��ȣ��(��� �޼���)�� �ٲٴ� ��
	// - ��ȣȭ(decryption)
	// ��ȣ���� ������ �ǵ����� ��
	// - Ű(Key)
	// ��ȣȭ�� ��ȣȭ�� ���Ǵ� ��� ��

	// # ����(ī�̻縣) ��ȣ
	// - ���ĺ��� Ű(Key)�� ��ŭ ���������� �̵���Ű�� ��ȣ ���
	// - ��ȣȭ : ���� Ű ����ŭ ���������� �̵���Ų��
	// - ��ȣȭ : ��ȣ���� Ű �� ��ŭ �������� �̵���Ų��

	// # ��/��ȣȭ ��

	// ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$,abcdefghijklmnopqrstuv...

	// # Key���� 3�� ��� ��ȣȭ (+3)
	// "Hello, World!" => "Khoorc#Zruog$";

	// # Key ���� 3�� ��� ��ȣȭ (-3)
	// "Khoorc#Zruog$" => "Hello, World!";

	int key;
	// ���� ������ �����̴ϱ� ����
	char[] charset = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ"
			+ " !@#$,abcdefghijklmnopqrstuvwxyz").toCharArray();
	// Ű��
	public CaesarCipher(int key) {
		this.key = key % charset.length;
	}
	// �ε��� ����
	public int indexOf(char ch) {
		for (int i = 0; i < charset.length; ++i) {
			if (ch == charset[i]) {
				return i;
			}
		}
		return -1;
	}

	public String encryption(String plain_text) {
		// �Ű������� ���� ���� ��ȣȭ �Ͽ� �����ϴ� �Լ��� ������ ������

		//��Ʈ�� ���� �ȿ��� ���� ������ ���� �ι� ��µ� ���� �ִ�.
		StringBuilder crypto = new StringBuilder();

		for (int i = 0, len = plain_text.length(); i < len; ++i) {
			char ch = plain_text.charAt(i);

			int index = indexOf(ch);

			// ��� ���ڿ� ����
			if (index != -1) {
				// ã�� ��� ch�� ��ȣȭ
				// ex) z + 3 = 60 % charset.length(58)
				crypto.append(charset[(index + key) % charset.length]);
			} else {
				// ��ã�� ��� ch�� �״�� ����
				crypto.append(ch);
			}
		}
		
		return crypto.toString();

	}

	public String decryption(String crypto_text) {
		// �Ű������� ���� ��ȣ���� ��ȣȭ�Ͽ� �����ϴ� �Լ��� �����غ�����

		StringBuilder plain = new StringBuilder();

		for (int i = 0, len = crypto_text.length(); i < len; ++i) {
			char ch = crypto_text.charAt(i);

			int index = indexOf(ch);

			if (index != -1) {
				// charset�� �ִ� ���ڴ� ��ȣȭ
				int plain_index = index - key;
				plain_index = index - key < 0 ?
						plain_index + charset.length : plain_index;

				plain.append(charset[plain_index]);
			} else {
				// charset�� ���� ���ڴ� �״�� ����
				plain.append(ch);
			}
		}
		return plain.toString();
	}

	public static void main(String[] args) {

		String crypto = new CaesarCipher(3).encryption("Hello, World!");

		System.out.println(crypto);

		String text = new CaesarCipher(3).decryption(crypto);

		System.out.println(text);

	}

}
