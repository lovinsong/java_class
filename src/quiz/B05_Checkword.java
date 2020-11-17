package quiz;

import java.util.Scanner;

public class B05_Checkword {

	// 사용자로부터 단어를 하나 입력받고
	// 첫 번째 글자와 마지막 글자가 일치하면 "OK"를 출력
	// 아니라면 "NOT OK"를 출력
	
	public static void main(String[] args) {
		
//		System.out.println("단어를 입력하시오 > ");
//		String word = new Scanner(System.in).next();
//		
//		System.out.printf("입력하신 단어는 %s 입니다.", word);
////		System.out.printf("입력하신 단어는" + word + "입니다.");
//		
//		if(word.charAt(0) == word.charAt(word.length() - 1))
//			System.out.println("OK");
//		else
//			System.out.println("NOT OK");
		
	
	
	//다른풀이
	String word = "A";
	
	// null : 아무값도 없는 상태
	if (word == null || word =="") {
		System.out.println("단어가 올바르지 않습니다.");
		return;
	}
	char first_letter = word.charAt(0);
	char last_letter = word.charAt(word.length() - 1);
	
	if (first_letter == last_letter)
		System.out.println("OK");
	else
		System.out.println("NOT OK");
		}
}
