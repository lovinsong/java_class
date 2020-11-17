package quiz;

import java.util.Scanner;

public class B01_GuessAge {

	// 사용자로부터 올해의 년도와 태어난 년도를 입력 받으면
	// 한국 나이를 계산하여 몇살인지 알려주는 프로그램을 만들어보세요
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
		System.out.print("올해의 년을 입력하시요 > ");
		int year = sc.nextInt();
		System.out.println("올해는 " + year + "년 입니다.");
	
		System.out.print("태어난 년을 입력하시오 > ");
		int birth = sc.nextInt();
		System.out.println("태어난 년은 " + birth + "년 입니다.");
	
		System.out.println("올해 한국 나이는 " +  ((int)year - (int)birth + 1) +  "살 입니다." );
		
//		int age = year - birth + 1;
//		System.out.println("당신의 나이는 %d살 입니다. \n , age");
//		한번사용하고 버리지 않을경우 age도 변수 설정
		
		sc.close();
	}
	

	
}
