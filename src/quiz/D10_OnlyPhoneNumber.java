package quiz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class D10_OnlyPhoneNumber {

	// 사용자로부터 전화번호만 입력받아보세요.
	// 전화번호 형태가 아닐 경우 에러메세지와 함께 다시 입력

	public static void main(String[] args) {

		System.out.println("핸드폰 번호 를 입력하세요\n ex> 010-1111-1111");
		Scanner sc = new Scanner(System.in);

		String number = sc.nextLine();
		String phoneNumber = null;
		String regex = "01[01679]-[\\d]{3,4}-[\\d]{4}";
		
		while(true) {
			System.out.println("Tel > ");
			phoneNumber = sc.nextLine();
			
			if(Pattern.matches(regex, phoneNumber)){
				System.out.println("올바른 전화번호");
				break;
			}else {
				System.err.println("잘못된 전화번호");
			}
			
		}
		System.out.println("Tel : " + phoneNumber);
//		while (true) {
//			if (number.matches("[\\d]{3}.[\\d]{3,4}.[\\d]{3,4}")) {
//				System.out.println("맞는 전화번호 입니다.");
//				break;
//			}else
//			System.err.println("다시 입력하세요");
//			continue;
//		}

	}

}
