package quiz;

import java.util.Scanner;

public class B09_printReverse {

	//사용자가 문장을 입력하면 그 문장을 거꾸로 출력해 보시오.
	public static void main(String[] args) {
				
		System.out.println("문장을 입력하세요");
		String word = new Scanner(System.in).nextLine();

		// # 누적 연산으로 문자열을 점차 완성시킬 수 있다
		//String str ="hello";
		//str += ", world";
		
		// # StringBuilder는 += 대신 append() 함수를 통해 문자열을 만든다
		StringBuilder str = new StringBuilder("hello");
		str.append(", world!");
		
		// 다 만들고 난 뒤에 String으로 변환해서 사용하면 된다
		String build_result = str.toString();
		System.out.println(build_result);
		
		// 거꾸로 만든 문자열을 저장할 변수
		StringBuilder reverse = new StringBuilder();
		for(int i = word.length() - 1; i >= 0; i--) {
		
			reverse.append(word.charAt(i));
//			System.out.print(word.charAt(i));
		}
		System.out.println(reverse);
			
		
	}
}