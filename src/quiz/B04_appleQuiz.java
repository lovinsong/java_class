package quiz;

//ctrl + Shift + 0 : 자동 import
import java.util.Scanner;

public class B04_appleQuiz {

	// 사과를 10개씩 담을 수 있는 바구니가 있다.
	// 사과의 개수를 입력하면 사과를 모두 담기 위해
	// 필요한 바구니의 개수를 출력해보세요.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("사과의 갯수를 입력하세요 > ");
//		double apple = sc.nextInt();
//		double baguni = apple / 10;
//	
//		if (apple <10 && apple > 0)
//			System.out.println("필요한 바구니는 1 개 입니다.");
//		else if(apple / 10 == 0) 
//			System.out.println("필요한 바구니는 " + baguni + " 개 입니다.");
//		else if (apple % 10 == 0) 
//			System.out.println("필요한 바구니는 " + (baguni+1) +" 개 입니다.");
//		else if (apple < 0) 
//			System.out.println("필요한 바구니는 없습니다.");
//		
		//다른 풀이
		
		// 변수 앞에 final : 수정이 불가능한 변수가 된다
		final double BASKET_SIZE = 10;	
//		BASEKT_SIZE = 99; 사용 불가

		System.out.println("사과 >");
		int appleCount = new Scanner(System.in).nextInt();
		
		if (appleCount < 0 ) {
			System.out.println("0이상의 숫자를 입력하시오");
		} else {
			int needBasket = (int) Math.ceil(appleCount / BASKET_SIZE);
			System.out.printf("필요한 바구니는 %d개 입니다.\n" ,needBasket);
		}
		
		System.out.println("프로그램을 종료합니다.");
//		
		//변수를 잘둬야 수정이 편하고 보기 좋다. 변수를 잘 설정하자.
		}
}
