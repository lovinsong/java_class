package kgtest;

public class test2 {

	public static void main(String[] args) {

//	1. int타입 변수 a가 홀수일 때 true
		int a = 11;

		System.out.println(a % 2 == 1);

//	2. char타입 변수 ch가 영문자가 아닐 때 true    

		char ch = '가';
		System.out.println(!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')));

//   3. boolean타입 변수 complete가 false일 때 true

		boolean complete = false;
		System.out.println(!complete);

//   4. String타입 참조변수 str이 "yes"일 때 true

		String str = "yes2";
		String str2 = "yes";
		System.out.println(str.equals(str2));

//   5. String타입 참조변수 command가 8글자일 때 true

		String command2 = "123456798";
		System.out.println(command2.length() == 8);

//   6. String타입 참조변수 command의 세 번째 글자가 대/소문자 관계없이 q일때 true

		String command = "as12as";

		char third_letter = command.charAt(2);
		if (third_letter == 'q' || third_letter == 'Q') {
			System.out.println("true");
		} else
			System.out.println("false");

	}
}
