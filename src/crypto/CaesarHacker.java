package crypto;

public class CaesarHacker {

	// ��ȣ���� charset�� �˰����� ������ȣ ������� �˰� �ִٰ� ������ ���·�
	// ��ȣ���� �̿��Ͽ� ���� �����غ�����
	
	// �� ��ȣ�� �������� ���� �� ���� 3������ ��� �����ڰ� �˰��ִٰ� �����Ѵ�
	
	static char[] charset = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ"
			+ " !@#$,abcdefghijklmnopqrstuvwxyz").toCharArray();
	
	static String hijacked = "uryyBmhJBEyqi";
	
	public static void main(String[] args) {
		for( int key = 0; key < charset.length; ++key) {
			CaesarCipher cipher = new CaesarCipher(key);
			System.out.println(cipher.decryption(hijacked));
			
		}
	}

}