package quiz;

import java.util.Scanner;

public class B09_is_numeric_str {

	// 입력받은 문자열에 숫자만 포함되어 있으면 결과에 1을 저장
	// 다른 문자가 포함되어 있다면 0을 저장
	// ※ 문자열이 비어있을때는 결과가 2
	
//	public static void main(String[] args) {
//				
//
//		//1.변수 지정 먼저
//		String in;
//		int out = 2;
//
//		
//		System.out.println("입력 >");
//		in = new Scanner(System.in).nextLine();
//		for(int i = 0, len = in.length(); i < len; ++i) {
//			
//			//2.in에 대한 조건 설정
//			if(!(in.charAt(i) >= '0' && in.charAt(i) <= '9')) {
//				out = 0;
//				//3. 조건에 부합하면 break로 나오기
//				break;
//			}
//			else
//				out = 1;
//		}
//
//		System.out.println(out);
//		}
//	
//}
	public static void main(String[] args) {
	
		System.out.println("검사할 문장 >");
		String str = ""; //new Scanner(System.in).nextLine();
		
		// # 문자열이 이상한 경우 3가지
		//	- null : str이 가리키는 주소가 없는 경우
		//	- str의 값이 ""인경우
		//	- str의 길이가 0인 경우
		int status = 1;
//								↓	같은거임	↓
//		if (str == null || str ==" " || str.length() == 0) {
		if (str == null || str.length() == 0) {
			status = 2;
			
		} else {
			for(int i = 0, len = str.length(); i < len; ++i) {
				char ch = str.charAt(i);
			
			if(ch < '0' || ch > '9') {
				status = 0;
				break;
			}

		}

	}
		System.out.println("문자열 상태 : " +status);
	}
}

//		
//String senten = "1 23";
//String result1 = "1";
//String result2 = "0";
//String result3 = "2";
//
//for(int i = 0, len = senten.length(); i <senten.length(); ++i) {
//	
//	char numb = senten.charAt(i);
//	
//	if(numb == ' ' || numb == '\t') 
//		System.out.print(result3);
//	
//	else if(numb >= '0' && numb <= '9') 
//		System.out.print(result1);
//	
//	else if(numb >= '0' || numb <= '9') 
//		System.out.print(result2);
//	
		
