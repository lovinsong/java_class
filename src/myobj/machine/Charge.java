package myobj.machine;

public interface Charge {

	void charge();
	
	default void computer() {
		System.out.println("매 분 200W 씩 소비합니다");
	}
	
	default void refrigerator() {
		System.out.println("매 분 400W 씩 소비합니다");
	}
	
	default void television() {
		System.out.println("매 분 50W 씩 소비합니다");
	}

	default void airconditioner() {
		System.out.println("매 분 500W 씩 소비합니다");
	}
	
	
	
}
