package quiz;

import java.util.Random;

public class B12_tempPassword {

	// 랜덤 4자리의 임시 비밀번호 문자열을 생성하는 프로그램을 만들어보세요.
	// (비밀번호를 구성하는 문자 - 알파벳 대문자, 숫자, 특수문자)
	// 0 1 2(3가지 일때 nextint사용)

	public static void main(String[] args) {

		StringBuilder temp_password = new StringBuilder();

		Random ran = new Random();

		for (int i = 0; i < 4; ++i) {
			char ch;

			int category = ran.nextInt(3);
			// true일때 영어를 추가, 아니면 숫자추가
			// 2가지일때 불린사용
			if (ran.nextBoolean()) {
				ch = (char) (ran.nextInt(26) + 'A');
			} else {
				ch = (char) (ran.nextInt(10) + '0');
			}

			temp_password.append(ch);
		}

		System.out.println(temp_password);

		// 풀이 1
//		Random ran = new Random();
//		StringBuilder temp_password = new StringBuilder();
//		
//		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//		
//		for(int i = 0; i <4; ++i ) {
//			// true일때 영어를 추가, 아니면 숫자추가
//			if(ran.nextBoolean()) {
//				
//				
//			}
//			char ch = charset.charAt(ran.nextInt(charset.length()));
//			temp_password.append(ch);
//		}
//		
//		System.out.println(temp_password);

		// 망 풀이 2
//		Random pass1 = new Random();
//		Random pass2 = new Random();
//		Random pass3 = new Random();
//		Random pass4 = new Random();
//
//		// 0 ~ 91번중 선택
//		int a = pass1.nextInt(91);
//		int b = pass1.nextInt(91);
//		int c = pass1.nextInt(91);
//		int d = pass1.nextInt(91);
//
////		System.out.println(ran.nextBoolean());
//		
//		
//		// A = '65' (int)'Z' = 90
////		System.out.print(pass1.nextInt(91));
////		System.out.print(pass2.nextInt(91));
////		System.out.print(pass3.nextInt(91));
////		System.out.print(pass4.nextInt(91));
//
//		for (int i = 0; i < 1; ++i) {
//
//			if (a >= 65 && a <= 90)
//				System.out.print((char) a);
//			else
//				System.out.print(a / 10);
//			if (b >= 65 && b <= 90)
//				System.out.print((char) b);
//			else
//				System.out.print(b / 10);
//			if (c >= 65 && c <= 90)
//				System.out.print((char) c);
//			else
//				System.out.print(c / 10);
//			if (d >= 65 && d <= 90)
//				System.out.print((char) d);
//			else
//				System.out.print(d / 10);
//		}
	}

}
