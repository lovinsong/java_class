package quiz;

import java.util.Scanner;

public class B09_strupcase {

	// 입력받은 문자열의 모든 알파벳을 대문자로 만들어보세요
	// ※ 원본이 훼손되지 않고, 새로운 문자열이 생성되어야함
	
	public static void main(String[] args) {

		System.out.println("문장 > ");
		String str = new Scanner(System.in).nextLine();
		
		StringBuilder strb = new StringBuilder();		
		
		for (int i = 0, len = str.length(); i < len; ++i) {
			char ch = str.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				// 소문자를 대문자로 변환하는 방법
				// ch -= Math.abs('a' - 'A');
				// ch = (char)(ch - 'a' +'A');
				ch -= 32;				
			}
			strb.append(ch);
		}
		System.out.println(strb);
	    }
	    
	}

//
//System.out.print("문자열 > ");
//
//String word= new Scanner(System.in).nextLine();
//
//char change[] = new char[word.length()]; 
//
//for(int i = 0; i < word.length(); i++){
//   change[i] = word.charAt(i);
//   if(change[i] >= 65 && change[i] <= 90)
//	   		change[i] += 32;
//   else if(change[i] >= 97 && change[i] <= 122)
//            change[i] -= 32;
//   System.out.print(change[i]);
//}
//    System.out.println();

//char Alph;
//
//System.err.println("입력 > ");
//Scanner sc = new Scanner(System.in);
//
//Alph = sc.nextLine().charAt(0);
//
//
//for(int i = 0 ; i < Alph; i++) {
//	if(Alph >= 'a' && Alph <= 'z')
//		break;
//}
//System.out.println((char)(Alph - ('a' - 'A')));
//
