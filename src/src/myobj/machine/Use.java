package myobj.machine;

public interface Use extends Charge {
	
	void use();

	@Override
	default void computer() {
		System.out.println("������ �����մϴ�");
		System.out.println("������ �����մϴ�");
	}
	
	@Override
	default void refrigerator() {
		System.out.println("������ �����ŵ�ϴ�");
		System.out.println("������ �õ���ŵ�ϴ�");
	}

	@Override
	default void television() {
		System.out.println("ä���� �ø��ϴ�");
		System.out.println("ä���� �����ϴ�");
	}

	@Override
	default void airconditioner() {
		System.out.println("���⸦ ���� ����ϴ�");
	}

	
}
