package quiz;

import java.util.Scanner;

public class B09_Palindrome {
 
	// 사용자로부터 단어를 하나 입력받고
	// 해당 단어가 회문이라면 "PALINDROME"를 출력
	// 회문이 아니라면 "NOT OK"를 출력
	
	// ※ ABBA, MADAM, BRROWORROB
	
	public static void main(String[] args) {
		
		System.out.println("문장 > ");
		final String word = new Scanner(System.in).nextLine();

//		StringBuilder strb = new StringBuilder(word);
//		String reverse = strb.reverse().toString();
		
		// # StringBuilder.reverse()
		//	- 여태까지 빌드한 문자열을 거꾸로 뒤집어준다
//		int half = word.length() / 2;
//		
//		boolean palin = true;
//		
//		for(int i = 0; i < half; ++i) {
//			if (word.charAt(i) != reverse.charAt(i)) {
//				palin = false;
//				break;
//		}
//	}
//		System.out.println(palin ? "PALUINDROME" : " NOT PALINDROME");
		
		StringBuilder reverse = new StringBuilder();
		for(int i = word.length() - 1; i >= 0; i--) {
		
			reverse.append(word.charAt(i));
		}
					//StringBilder는 toString으로 반드시 변환!
		if(word.equals(reverse.toString()))
			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
	}
	
	}
		

			//다른풀이2
	//	boolean palin = true;
	//	for (int i = 0, len = word.length(); i < len / 2 ; ++i ) {
	//	char ch1 = word.charAt(i);
	//	char ch2 = word.charAt(len - 1 - i);
//		if (ch1 != ch2) {
//			palin = false;
//		break;
//			}
//		}
//		if(palin) {
//			System.out.println("PALINDROME");
//		}else {
//			System.out.println("NOT PALINDROME");
//		}





