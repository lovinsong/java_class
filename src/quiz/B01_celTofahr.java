package quiz;

import java.util.Scanner;

public class B01_celTofahr {

	public static void main(String[] args) {
//		사용자로부터 섭씨 온도를 입력받으면
//		화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
//		( 변환 공식은 알아서 검색, 출력은 소수 첫째 자리까지)
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 온도(°C)를 입력하세요 : ");
		int temp = sc.nextInt();
		
		System.out.println("입력하신 온도는 " + temp + "°C 입니다.");
		System.out.println("화씨의 온도는 " + ((float)temp * 9 / 5 + 32) + "°F" + " 입니다.");
		System.out.println();

		sc.close();
		// sc 를 다시 사용하지 않을 예정이기 때문에 따로 저장하지 않는다.
//		double fahr= (new Scanner(System.in).nextDouble() * 9 / 5) + 32;
		
//		System.out.println("원래 온도는 %.1f");
//		System.out.printf("변환된 온도는 %.1.f℉입니다.\n" , fahr);
//		
		
	}
}
