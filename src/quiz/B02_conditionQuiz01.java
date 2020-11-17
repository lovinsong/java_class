package quiz;

import java.util.Scanner;

public class B02_conditionQuiz01 {

	/*
		[ 알맞은 비교연산을 만들어보세요 ]
		    
		1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		2. int형 변수 b가 짝수일 때 true		
		3. int형 변수 c가 7의 배수일 때 true
		4. int형 변수 hour가 0이상 24이상이 아니고 12이상일 때 true	
		5. int형 변수 d와 e의 차이가 30일 떄 true	
		6. int형 변수 year가 400으로 나누어 떨어지면 true
		   또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
		7. 민수가 철수보다 2살 많으면 true
		8. 민수가 철수보다 생일이 3달 빠르면 true  
 		9. boolean형 변수 powerOn이 false일 때 true
		10. 문자열 참조변수 str이 "yes"일 때 true
		11. 삼각형 A가 직각삼각형이면 true
	*/
	
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
//	//1.
//		System.out.print("1. int형 변수 a가 10보다 크고 20보다 작을 때 true \n값을 입력하세요 > ");
//		int a = Sc.nextInt();
//		System.out.println("1." + (a > 10 && a < 20));
//		System.out.println("");
//	//2.
//		System.out.print("2. int형 변수 b가 짝수일 때 true \n2값을 입력하세요 > ");
//		int b = Sc.nextInt();
//		System.out.println("2. " +  (b % 2 == 0) );
//		System.out.println("");	
//	//3.
//		System.out.print("3. int형 변수 c가 7의 배수일 때 true \n값을 입력하세요 > ");
//		int c = Sc.nextInt();
//		System.out.println("3. " +  (c % 7 == 0));
//		System.out.println("");
//	//4.
//		System.out.print("int형 변수 hour가 0이상 24이상이 아니고 12이상일 때 true \n4값을 입력하세요 > ");
//		int hour = Sc.nextInt();
//		System.out.println("4. " + ((!(hour < 0 || hour >= 24)) && hour >= 12 ));//느낌표 괄호 주의
//		System.out.println("");
//	//5.
//		System.out.print("int형 변수 d와 e의 차이가 30일 떄 true \n5값을 두 번 입력하세요 > ");
//		int d = Sc.nextInt();
//		int e = Sc.nextInt();
//		System.out.println("5. " + (Math.abs(e-d) == 30 ));
//		System.out.println("");
//	//6. 
//		System.out.print("int형 변수 year가 400으로 나누어 떨어지면 true
//		+ 또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true \n값을 입력하세요 > ");
//		int year = Sc.nextInt();
//		System.out.println("6. " + (year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ));
//		System.out.println("");
//	//7.
//		System.out.print("민수가 철수보다 2살 많으면 true \n민수의 나이를 입력하세요 >");
//		int min = Sc.nextInt();
//		System.out.println("철수의 나이를 입력하세요 >");
//		int chul = Sc.nextInt();
//		System.out.println("7. " + (Math.abs(min - chul) == 2)); // 필요없는 수식 삭제
//		System.out.println("");
//	//8.
//		System.out.print("민수가 철수보다 생일이 3달 빠르면 true \n민수의 생일을 입력하세요 > ");
//		int minb = Sc.nextInt();
//		System.out.println("철수의 생일을 입력하세요 >");
//		int chulb = Sc.nextInt();
//		System.out.println("8. " + (Math.abs(chulb - minb) == 3));
//		System.out.println("");
		
		
	//9.
		System.out.print("boolean형 변수 powerOn이 false일 때 true \npowerOn을 입력하세요 ");
		
		boolean powerOn = false;
		
		System.out.println("9. " + !powerOn);
		System.out.println("");
		
		
	//10.
//		System.out.println("문자열 참조변수 str이 yes일 때 true");
//		
//		String str123 = Sc.nextLine();
//
//		System.out.println("10. " + str.equals(yes));
//		System.out.println("");
		
		System.out.println("문자열 참조변수 str이 yes일 때 true");
		// 소문자로 시작하는 타입 - 값을 저장한다
		// 대문자로 시작하는 타입 - 주소를 저장한다 (참조형)
		
		String str = "yes";
		String str2 = "yes";
		String str3 = new String("yes");
		String str4 = str;
		
		System.out.println(str == str2); // 주소를 통한 비교1
		System.out.println(str == str3); // 주소를 통한 비교2
		
		System.out.println(str.equals(str3)); // 값을 통한 비교
		
	//11.
		System.out.print("삼각형 A가 직각삼각형이면 true \n값 세번을 입력하세요.> ");

		int a1 = Sc.nextInt(); 
		int a2 = Sc.nextInt();
		int a3 = Sc.nextInt();
		
		System.out.println("11. " + (Math.pow(a1,2) + Math.pow(a2,2) == Math.pow(a3,2) || (Math.pow(a2, 2) + Math.pow(a3, 2) == Math.pow(a1, 2) || (Math.pow(a3, 2) + Math.pow(a2, 2) == Math.pow(a1, 2)))));

		//내 각으로 풀기
		
		int b1 = 50, b2 =40, b3 = 90;
		
		System.out.println(b1 + b2 + b3 == 180 &&
				(b1 == 90 || b2 == 90 || b3 == 90 &&
				b1 !=0 && b2 !=0 && b3 !=0));
		
		
	}
}