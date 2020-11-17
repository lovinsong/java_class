package myobj.machine;

public interface Code {

	void code();
	
	default void kpower() {
		System.out.println("한국에서 사용하는 전기는 220V를 받습니다");
	}
	
	default void apower() {
		System.out.println("외국에서 사용하는 전기는 110V를 받습니다");
	}
	
	default void kpower_code() {
		System.out.println("한국의 코드의 모양은 ( ㅇ ㅇ ) 입니다");
	}
	
	default void apower_code() {
		System.out.println("외국의 코드의 모양은 ( | | ) 입니다");
	}
	
}
