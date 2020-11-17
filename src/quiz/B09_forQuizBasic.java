package quiz;

import java.util.Scanner;

public class B09_forQuizBasic {

	// 사용자가 숫자를 입력했을 때
	// 1. 10부터 입력한 숫자까지의 총 합을 구해보세요
	// 2. 1부터 입력한 숫자 사이의 3의 배수만 모두 출력하고
	//	  총 몇 개 인지도 출력해 보세요
	
	public static void main(String[] args) {
	//1.
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요");
//		
//		int sum = 0;
//		
//	for(int i = sc.nextInt(); i > 10; --i) {
//		sum += i;
//	}
//		System.out.println("총합은 " + sum);
	
	//1.번 문제풀이
		
//		System.out.println("숫자 > ");
		int user = new Scanner(System.in).nextInt();
//		
//		int start = 10;
//		int end = user;
//		
//		if (start > end) {
//			int temp = start;
//			start = end;
//			end = temp;
//		
		int sum = 0;
//		for (int i = start; i <= end; ++i) {
//			System.out.println(i);
//			sum += i;
//		}
		
		//2.번문제
		int start2 = 1;
		int end2 = user;
		
		if (start2 > end2) {
			int temp2 = start2;
			start2 = end2;
			end2 = temp2;
		}
	
		int count = 0;
		System.out.print("[");
		for (int i = start2; i <= end2; ++i) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
				count += 1;
			}
		}
		System.out.print("]\n");
		System.out.println("Q1. 3의 배수의 총합 - " + sum);
		System.out.println("Q2. 3의 배수의 개수 - " + count + "개");
	}
}
		
	//2.
//		int count = 0;
//		System.out.println("2번문제 숫자를 입력하세요 > ");
//	for (int i = sc.nextInt(); i >= 0; i -= 3) {
//		if(i % 3 == 0)
//			System.out.println(i);
//		else if(i % 3 == 1)
//			System.out.println(i - 1);
//		else if(i % 3 == 2)
//			System.out.println(i - 2);
//		else if(i % -3 == -1)
//			System.out.println(i + 1);
//		else if(i % -3 == -2)
//			System.out.println(i + 2);
//	}
//	}
//}
//	
	//2번 문제 풀이.
		