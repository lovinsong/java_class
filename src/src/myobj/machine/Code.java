package myobj.machine;

public interface Code {

	void code();
	
	default void kpower() {
		System.out.println("�ѱ����� ����ϴ� ����� 220V�� �޽��ϴ�");
	}
	
	default void apower() {
		System.out.println("�ܱ����� ����ϴ� ����� 110V�� �޽��ϴ�");
	}
	
	default void kpower_code() {
		System.out.println("�ѱ��� �ڵ��� ����� ( �� �� ) �Դϴ�");
	}
	
	default void apower_code() {
		System.out.println("�ܱ��� �ڵ��� ����� ( | | ) �Դϴ�");
	}
	
}
