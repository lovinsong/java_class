package myobj.machine;

public interface Charge {

	void charge();
	
	default void computer() {
		System.out.println("�� �� 200W �� �Һ��մϴ�");
	}
	
	default void refrigerator() {
		System.out.println("�� �� 400W �� �Һ��մϴ�");
	}
	
	default void television() {
		System.out.println("�� �� 50W �� �Һ��մϴ�");
	}

	default void airconditioner() {
		System.out.println("�� �� 500W �� �Һ��մϴ�");
	}
	
	
	
}
