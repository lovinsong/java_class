import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {

	// # 정규 표현식 (Regular Expression)
	// - 문자열의 패턴을 표현하는 표현식
	// - 해당 패턴과 일치하는 문자열을 검색할 수 있다

	// # Pattern 클래스
	// - 정규표현식을 다루는 클래스

	// # Matcher 클래스
	// - 패턴을 이용하여 대상 문자열을 검색할 때 사용하는 클래스

	public static void main(String[] args) {

		System.out.println(Pattern.matches("sleep", "sleep"));

		// [] : 해당 위치의 한 글자에 어떤 문자들이 올 수 있는지 정의한다
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "saeep"));

		// [] 내부에 정의할 수 있는 것들
		// 1. abc : a or b or c abc만 허용
		// 2. ^abc : !(a or b or c) abc를 제외한 모두를 허용
		// 3. a-z : a부터 z까지 허용
		// 4. && : 교집합

		System.out.println(Pattern.matches("s[0-9]eep", "s0eep"));
		System.out.println(Pattern.matches("s[a-zA-Z0-9]eep", "s2eep"));
		System.out.println(Pattern.matches("s[aeiou]eep", "s2eep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));

		// # 여러 문자를 간단하게 표현하는 것들
		// 1. . : 해당 자리에 모든 문자를 허용 - ※ 밖에 써야 함
		// 2. \d : 해당 자리에 숫자들을 허용
		// 3. \D : 해당 자리에 숫자를 제외한 모든것을 허용
		// 4. \s : 해당 자리에 공백을 허용[\t\n\r.. 등의 모든 공백들]
		// 5. \S : 해당 자리에 공백을 제외한 모든것을 허용
		// 6. \w : 일반적인 문자들을 허용[a-zA-Z_0-9]
		// 7. \W : 일반적인 문자들을 제외한 모든것을 허용

		System.out.println(Pattern.matches("s.eep", "s$eep"));
		System.out.println(Pattern.matches("s\\deep", "s2eep"));
		System.out.println(Pattern.matches("s\\Deep", "s1eep"));
		System.out.println(Pattern.matches("s\\seep", "s eep"));
		System.out.println(Pattern.matches("s\\Seep", "s eep"));
		
		
		// # 해당 패턴이 적용 될 문자의 개수를 정의하는 방법 - ※ 공백이 없어야함
		//	1. Ex{n} : 앞에 있는 패턴이 n글자 일치해야 한다
		//	2. Ex{n,m} : 앞에 있는 패턴이 최소 n글자 이상 최대 m글자 일치해야 한다
		//	3. Ex{n,} : 앞에 있는 패턴이 최소 n글자 이상 일치해야 한다
		//	4. Ex? : 0번 혹은 한번
		//	5. Ex+ : 최소 한번 이상
		//	6. Ex* : 0번 혹은 여러번
		
		System.out.println(Pattern.matches("....[\\d]{4}", "abcd9701"));
		System.out.println("유효한 아이디 : " + Pattern.matches("[\\w]{2,12}", "a"));
		System.out.println("유효한 아이디 : " + Pattern.matches("[\\w가-힣]{2,12}", "한글아이디"));
		
		//?
		System.out.println(Pattern.matches("[@]?.+", "@@abc"));

		String email = "abc@kakao.co.kr";
		System.out.println("이메일 패턴 : " + Pattern.matches("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+", email));
		
		// # Patterrn.mathches(regex, str)
		//	- 전달한 문자열이 정규표현식과 일치하면 true

		// # Pattern.compile(regex)
		//	- 전달한 정규표현식을 이용해 생성한 인스턴스를 반환한다
		Pattern split_regex = Pattern.compile("/");
		
		// # 생성된 Pattern  인스턴스로 split하기
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		// # 생성된 Pattern 인스턴스로 matcher생성하기
		
		// # java.util.regex.Matcher 
		//	- 문자열을 처음부터 끝까지 검사하면서 
		//	해당 정규표현식과 일치하는 인덱스를 찾은 결과
//		Matcher matcher = split_regex.matcher("apple/banana/orange/kiwi");
		Pattern fruit_regex = Pattern.compile("[a-zA-Z[^/]]+");
		
		Matcher matcher = fruit_regex.matcher("apple/banana/orange/kiwi");
		
		// find : 정규표현식을 통해 찾은 것이 있다면 true
		while(matcher.find()) {	
			System.out.println("찾은 것 : " + matcher.group());
			System.out.println(matcher.start() + " to " + matcher.end());
		}
		
		
//		String str = "abc@naver.com";
		// CharSequence를 포함되어있으면 String

//		if(str.contains("@") && str.contains(".")) {
//			System.out.println("이메일입니다.");
//		}else {
//			System.out.println("이메일이 아닙니다. 형식을 맞춰주세요");
//		}

	}

}
