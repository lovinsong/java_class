package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C12_inputRightThing {

	public static int input(String msg) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(msg);
			
			try {
				return sc.nextInt();
				
			} catch (InputMismatchException e) {
				System.err.println("숫자만 입력해주세요");
				sc.nextLine();
			}
		}
	}

	public static void main(String[] args) {

		// 사용자로부터 int타입의 데이터를 입력받아보세요
		// 잘못된 타입의 데이터가 들어오더라도 프로그램이 종료되지 않아야합니다
		// (올바르게 int가 입력된 경우 프로그램이 종료됩니다

		int value = input("반드시 숫자만 입력해주세요 >");
		
		System.out.println("입력받은 숫자는 " + value + " 입니다.");

//		System.out.println("데이터 입력 \n>");
//
//		while (true) {
//			try {
//				int data = new Scanner(System.in).nextInt();
//				System.out.println("입력한 수 : " + data);
//				System.out.println("프로그램 종료");
//				System.exit(0);
//			} catch (Exception e) {
//				System.err.println("프로그램이 종료되지 않는다");
//				System.err.println("숫자를 입력해라");
//			}
//		}
	}
}
