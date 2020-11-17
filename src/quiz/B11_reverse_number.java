package quiz;

import java.util.Scanner;

public class B11_reverse_number {

	// 사용자로부터 정수를 하나 입력받고
	// 그 정수를 일의 자리부터 순서대로 출력해 보세요

	// 123456789 -> 987654321
	public static void main(String[] args) {

		int user = 123456789;
		
		int reversed = 0;

		while (true) {
			// 10 으로 짜르고					10 -> 2이면 2진수
//			System.out.print(user % 10);
			
			reversed += user % 10;
			
			
			// 10 100 1000 ... 한자리씩 지울수 있다
			user /= 10;
			
			if (user <= 0) {
				break;

			}
			reversed *= 10;
		}
		System.out.println(reversed);
	}
}