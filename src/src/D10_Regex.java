import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {

	// # Á¤±Ô Ç¥Çö½Ä (Regular Expression)
	// - ¹®ÀÚ¿­ÀÇ ÆĞÅÏÀ» Ç¥ÇöÇÏ´Â Ç¥Çö½Ä
	// - ÇØ´ç ÆĞÅÏ°ú ÀÏÄ¡ÇÏ´Â ¹®ÀÚ¿­À» °Ë»öÇÒ ¼ö ÀÖ´Ù

	// # Pattern Å¬·¡½º
	// - Á¤±ÔÇ¥Çö½ÄÀ» ´Ù·ç´Â Å¬·¡½º

	// # Matcher Å¬·¡½º
	// - ÆĞÅÏÀ» ÀÌ¿ëÇÏ¿© ´ë»ó ¹®ÀÚ¿­À» °Ë»öÇÒ ¶§ »ç¿ëÇÏ´Â Å¬·¡½º

	public static void main(String[] args) {

		System.out.println(Pattern.matches("sleep", "sleep"));

		// [] : ÇØ´ç À§Ä¡ÀÇ ÇÑ ±ÛÀÚ¿¡ ¾î¶² ¹®ÀÚµéÀÌ ¿Ã ¼ö ÀÖ´ÂÁö Á¤ÀÇÇÑ´Ù
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "saeep"));

		// [] ³»ºÎ¿¡ Á¤ÀÇÇÒ ¼ö ÀÖ´Â °Íµé
		// 1. abc : a or b or c abc¸¸ Çã¿ë
		// 2. ^abc : !(a or b or c) abc¸¦ Á¦¿ÜÇÑ ¸ğµÎ¸¦ Çã¿ë
		// 3. a-z : aºÎÅÍ z±îÁö Çã¿ë
		// 4. && : ±³ÁıÇÕ

		System.out.println(Pattern.matches("s[0-9]eep", "s0eep"));
		System.out.println(Pattern.matches("s[a-zA-Z0-9]eep", "s2eep"));
		System.out.println(Pattern.matches("s[aeiou]eep", "s2eep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));

		// # ¿©·¯ ¹®ÀÚ¸¦ °£´ÜÇÏ°Ô Ç¥ÇöÇÏ´Â °Íµé
		// 1. . : ÇØ´ç ÀÚ¸®¿¡ ¸ğµç ¹®ÀÚ¸¦ Çã¿ë - ¡Ø ¹Û¿¡ ½á¾ß ÇÔ
		// 2. \d : ÇØ´ç ÀÚ¸®¿¡ ¼ıÀÚµéÀ» Çã¿ë
		// 3. \D : ÇØ´ç ÀÚ¸®¿¡ ¼ıÀÚ¸¦ Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë
		// 4. \s : ÇØ´ç ÀÚ¸®¿¡ °ø¹éÀ» Çã¿ë[\t\n\r.. µîÀÇ ¸ğµç °ø¹éµé]
		// 5. \S : ÇØ´ç ÀÚ¸®¿¡ °ø¹éÀ» Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë
		// 6. \w : ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Çã¿ë[a-zA-Z_0-9]
		// 7. \W : ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë

		System.out.println(Pattern.matches("s.eep", "s$eep"));
		System.out.println(Pattern.matches("s\\deep", "s2eep"));
		System.out.println(Pattern.matches("s\\Deep", "s1eep"));
		System.out.println(Pattern.matches("s\\seep", "s eep"));
		System.out.println(Pattern.matches("s\\Seep", "s eep"));
		
		
		// # ÇØ´ç ÆĞÅÏÀÌ Àû¿ë µÉ ¹®ÀÚÀÇ °³¼ö¸¦ Á¤ÀÇÇÏ´Â ¹æ¹ı - ¡Ø °ø¹éÀÌ ¾ø¾î¾ßÇÔ
		//	1. Ex{n} : ¾Õ¿¡ ÀÖ´Â ÆĞÅÏÀÌ n±ÛÀÚ ÀÏÄ¡ÇØ¾ß ÇÑ´Ù
		//	2. Ex{n,m} : ¾Õ¿¡ ÀÖ´Â ÆĞÅÏÀÌ ÃÖ¼Ò n±ÛÀÚ ÀÌ»ó ÃÖ´ë m±ÛÀÚ ÀÏÄ¡ÇØ¾ß ÇÑ´Ù
		//	3. Ex{n,} : ¾Õ¿¡ ÀÖ´Â ÆĞÅÏÀÌ ÃÖ¼Ò n±ÛÀÚ ÀÌ»ó ÀÏÄ¡ÇØ¾ß ÇÑ´Ù
		//	4. Ex? : 0¹ø È¤Àº ÇÑ¹ø
		//	5. Ex+ : ÃÖ¼Ò ÇÑ¹ø ÀÌ»ó
		//	6. Ex* : 0¹ø È¤Àº ¿©·¯¹ø
		
		System.out.println(Pattern.matches("....[\\d]{4}", "abcd9701"));
		System.out.println("À¯È¿ÇÑ ¾ÆÀÌµğ : " + Pattern.matches("[\\w]{2,12}", "a"));
		System.out.println("À¯È¿ÇÑ ¾ÆÀÌµğ : " + Pattern.matches("[\\w°¡-ÆR]{2,12}", "ÇÑ±Û¾ÆÀÌµğ"));
		
		//?
		System.out.println(Pattern.matches("[@]?.+", "@@abc"));

		String email = "abc@kakao.co.kr";
		System.out.println("ÀÌ¸ŞÀÏ ÆĞÅÏ : " + Pattern.matches("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+", email));
		
		// # Patterrn.mathches(regex, str)
		//	- Àü´ŞÇÑ ¹®ÀÚ¿­ÀÌ Á¤±ÔÇ¥Çö½Ä°ú ÀÏÄ¡ÇÏ¸é true

		// # Pattern.compile(regex)
		//	- Àü´ŞÇÑ Á¤±ÔÇ¥Çö½ÄÀ» ÀÌ¿ëÇØ »ı¼ºÇÑ ÀÎ½ºÅÏ½º¸¦ ¹İÈ¯ÇÑ´Ù
		Pattern split_regex = Pattern.compile("/");
		
		// # »ı¼ºµÈ Pattern  ÀÎ½ºÅÏ½º·Î splitÇÏ±â
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		// # »ı¼ºµÈ Pattern ÀÎ½ºÅÏ½º·Î matcher»ı¼ºÇÏ±â
		
		// # java.util.regex.Matcher 
		//	- ¹®ÀÚ¿­À» Ã³À½ºÎÅÍ ³¡±îÁö °Ë»çÇÏ¸é¼­ 
		//	ÇØ´ç Á¤±ÔÇ¥Çö½Ä°ú ÀÏÄ¡ÇÏ´Â ÀÎµ¦½º¸¦ Ã£Àº °á°ú
//		Matcher matcher = split_regex.matcher("apple/banana/orange/kiwi");
		Pattern fruit_regex = Pattern.compile("[a-zA-Z[^/]]+");
		
		Matcher matcher = fruit_regex.matcher("apple/banana/orange/kiwi");
		
		// find : Á¤±ÔÇ¥Çö½ÄÀ» ÅëÇØ Ã£Àº °ÍÀÌ ÀÖ´Ù¸é true
		while(matcher.find()) {	
			System.out.println("Ã£Àº °Í : " + matcher.group());
			System.out.println(matcher.start() + " to " + matcher.end());
		}
		
		
//		String str = "abc@naver.com";
		// CharSequence¸¦ Æ÷ÇÔµÇ¾îÀÖÀ¸¸é String

//		if(str.contains("@") && str.contains(".")) {
//			System.out.println("ÀÌ¸ŞÀÏÀÔ´Ï´Ù.");
//		}else {
//			System.out.println("ÀÌ¸ŞÀÏÀÌ ¾Æ´Õ´Ï´Ù. Çü½ÄÀ» ¸ÂÃçÁÖ¼¼¿ä");
//		}

	}

}
