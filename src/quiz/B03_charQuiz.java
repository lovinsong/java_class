package quiz;

import java.util.Scanner;

public class B03_charQuiz {

	/*
	 [ 알맞은 조건식을 만들어 보세요]
	 
	 1. char형 변수 a가 'q' 또는 'Q'일 때 true
	 2. char형 변수 b가 공백이나 탭이 아닐 때 true
	 3. char형 변수 c가 문자('0' ~ '9')일 때 true
	 4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	 5. char형 변수 e가 한글일 때 true
	 6. char형 변수 f가 일본어 일때 true

	 */
	
	public static void main(String[] args) {
		
	      //1. char형 변수 a가 'q' 또는 'Q'일 때 true
	      char a = 'Q';
	      System.out.println(a == 'q' || a == 'Q');
	      
	      //1(2)다른풀이.
//	      System.out.println((int)'Q');
//	      System.out.println(a == 113 || a == '81');
	      //대문자로 시작하는 타입은 equals 로 비교 해야함.
	      
	      
	      //2.char형 변수 b가 공백이나 탭이 아닐 때 true
	      char b = '밥';
	      System.out.println(!(b == ' ' || b == '\t'));
	      
	      //2(2)다른풀이.
//	      System.out.println(b != '\t' && b != ' ');
	      
	      //3. char형 변수 c가 문자('0' ~ '9')일 때 true
	      char c = '4';
	      System.out.println(c >= '0' && c <= '9');
	      
	      //4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	      char d = 'K';
	      System.out.println((d >= 'a' && d <= 'z') ||
	    		  (d >= 'A' && d <= 'Z'));
	      
	      //5. char형 변수 e가 한글일 때 true
	      char e = '훙';
	      System.out.println((e >= '가' && e <= '힣') || (e >= 'ㄱ' && e <= 'ᅙ'));
	      
	      //5(2). 다른풀이
	      // Char e = '힁';
	      
	      // Hangul Jamo : 0x1100 - 0x11FF
	      // Hangul Syllables : 0xAC00 - 0xD7A3
	      
	      // System.out.println((e >= 0xAC00 && e <=0xD7A3) || (e >= 0x1100 %% e <= 0x11FF);
	      
	      //6. char형 변수 f가 일본어 일때 true
	      char f = 'レ';
	      System.out.println((f >= 'ぁ' && f <= 'ゟ') || (f >'゠' && f <= 'ヿ'));
	      
	      //6(2). 다른풀이
//	      System.out.println((f >= 0x3041 && f <= 0x309F) || (f >= 0x30A0 && f <= 0x30FF));
	      	      
	}
	
	
}
