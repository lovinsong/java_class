package quiz;

import java.util.Scanner;

public class B06_monthToSeason {

		// switch-case문을 이용하여
		// 사용자로부터 달을 입력 받으면 해당하는 계절을 출력하시오
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("원하는 달을 입력하시오 > ");
	
	int month = sc.nextInt();
	
	switch(month) {
	 case 2: case 3: case 4:
		System.out.println("봄입니다.");
		break;
	case 5: case 6: case 7: case 8:
		System.out.println("여름입니다.");
		break;
	case 9: case 10: case 11:
		System.out.println("가을입니다.");
		break;
	case 12: case 1 :
		System.out.println("겨울입니다.");	
		break;
	default:
		System.out.println("다시 입력하세요.");
	}
	
	}
}