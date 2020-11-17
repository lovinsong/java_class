package quiz;

import java.util.Scanner;

public class B09_is_contain_alpha {

	//사용자가 입력한 문자열에 알파벳이 포함되어 있으면 true를 출력
	//없으면 false를 출력
	
	public static void main(String[] args) {
//		
//		
		char some;
		boolean inclu = false;
		
		System.out.println("입력 > ");
		String word = new Scanner(System.in).nextLine();
		
		//카운트이용
		int count = 0;
		for(int i =0; i <word.length(); i++) {
			some = word.charAt(i);
			if((some >= 'a' && some <= 'z') || (some >= 'A' && some <= 'Z')) {
				count++;
				inclu = true;
			}
		}
		if(count>0) {
			System.out.println("true");
		}else
			System.out.println("false");

//		System.out.println("검사 할 문자 >");
//		String str = new Scanner(System.in).nextLine();
		
//		boolean result = false;
//		for(int i =0, len = str.length(); i <len; ++i) {
//			char ch = str.charAt(i);
//			if((ch >='a' && ch <= 'z') || (ch >='A' && ch <='Z')){
//				result = true;
//				break;
//			}
//		System.out.println(result);
		
		// "a12345"
		
//		boolean result = false;
//		
//		// str.length()를 한번만 호출하는 방식
//		for(int i = 0, len =str.length(); i < str.length(); ++i) {
//			char ch = str.charAt(i);
//			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch >= 'Z')) {
//				result = true;
//				break; // 만나면 반복문을 끝낸다.
//			}
//			System.out.println(result);
//			
//		}
		
		
	}
			
}