package crypto;

// �߻� Ŭ���� : Ŭ���� ���ο� �߻� �޼��带 ���� Ŭ����
abstract public class Cipher {

	// # �߻� �޼���
	//	- �Լ��� ���¸� ���س��� �ڽ� Ŭ�������� �������̵带 �����ϰ� �����
	//	- �ڽ� Ŭ�������� �������̵� ���� ������ ������ ������ �߻��Ѵ�
	//	- �ڽ� Ŭ������ ���� ������ �ش� �޼��尡 100% �����ϴ� ���� �����Ѵ�
	//	- ��ĳ���� ���� �� �ڽ� Ŭ������ ������ �ڵ带 ����ϰ� �ȴ�
	
	// �ڽ� Ŭ�������� ���¸� �̸� ������ ��
	// �ڽ� Ŭ�������� �޼��带 �������̵� �Ͽ� ������ �����
	public String encryption(String plain) {
		System.out.println("�ݵ�� �������̵� �ؼ� ������ּ���!!");
		return null;
	}

	abstract public String decryption(String crypto); 
	
}

class MyAlgo extends Cipher{

	@Override
	public String encryption(String plain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String decryption(String crypto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}