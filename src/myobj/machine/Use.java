package myobj.machine;

public interface Use extends Charge {
	
	void use();

	@Override
	default void computer() {
		System.out.println("게임을 실행합니다");
		System.out.println("음악을 실행합니다");
	}
	
	@Override
	default void refrigerator() {
		System.out.println("음식을 냉장시킵니다");
		System.out.println("음식을 냉동시킵니다");
	}

	@Override
	default void television() {
		System.out.println("채널을 올립니다");
		System.out.println("채널을 내립니다");
	}

	@Override
	default void airconditioner() {
		System.out.println("공기를 차게 만듭니다");
	}

	
}
