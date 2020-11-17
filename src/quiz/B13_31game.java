package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {

	// # 31게임을 만들어보세요

	// 1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택한다 (1, 2, 3)

	// 2. 컴퓨터는 랜덤으로 숫자를 선택한다

	// 3. 마지막에 31이상의 숫자를 만드는 사람 혹은 컴퓨터가 패배한다

	// 진행 예 :

	// 컴퓨터 > 2
	// 현재숫자 : 2
	// 사람 > 3
	// 현재 숫자 : 5
	// ...
	// 컴퓨터 > 3
	// 현재숫자 : 32
	// 컴퓨터의 패배입니다.

	public static void main(String[] args) {
		// 초기화 부분
		Scanner user = new Scanner(System.in);
		Random ran = new Random();

		int game_num = 0;

		boolean computer_turn = ran.nextBoolean();

		System.out.printf("<%s>의 선공입니다.\n", computer_turn ? "컴퓨터" : "유저");

		while (true) {
			// 입력 부분
			int num;

			if (computer_turn) {

				// 컴퓨터의 AI 추가
				// 컴퓨터가 game_num을 본 후 , 2, 6, 10, 14, 18, 22, 26, 30을 만들면 무조건이김
				//game_num == 0 || game_num == 4 || game_num == 8
				if (game_num % 4 ==0) {
					num = 2;
				} else if (game_num % 4 == 3) {
					num = 3;
				} else if (game_num % 4 == 1) {
					num = 1;
				} else {
					num = ran.nextInt(3) + 1;
				}
//				num = ran.nextInt(3) + 1;

				System.out.println("컴퓨터 >" + num);
			} else {
				System.out.println("유저 > ");
				num = user.nextInt();

				if (num > 3 || num < 1) {
					System.out.println("\t1 ~ 3만 입력하셔야 합니다.");
					continue;
				}
			}

//			System.out.println("\t방금 고른 숫자 : " + num);
			// 처리 부분
			game_num += num;

			// 출력 부분
			if (game_num >= 31) {
				System.out.println("\t패배 : " + game_num);
				break;
			}
			System.out.println("\t 현재 상황 : " + game_num);

			computer_turn = !computer_turn;

		}

		System.out.printf("<%s>의 승리\n", computer_turn ? "유저" : "컴퓨터");
	}
}

//		Random ran = new Random();
//
//		Scanner sc = new Scanner(System.in);
//		int com = new Random().nextInt();
//		int comsu = (ran.nextInt(1) + 3);
//		int hum = new Scanner(System.in).nextInt();
//		int count = 0;
//		int sum = 0;
//		boolean pan = false;
//
//		while (true) {
//			System.out.println("1. 게임 시작하기");
//			System.out.println("2. 게임 종료하기");
//			System.out.println(" > ");
//			int cmd = sc.nextInt();
//
//			switch (cmd) {
//			case 1:
//				System.out.println("게임을 시작합니다.");
//				break;
//			case 2:
//				System.out.println("게임을 종료합니다.");
//				break;
//			default:
//				System.out.println("다시 선택하십시오");
//				continue;
//			}
//			// 선공권을 위한 숫자 대결
//			System.out.println();
//			System.out.println("선공을 위해 1~3을 입력하십시오");
//			System.out.print("숫자가 같다면 컴퓨터의 선공입니다.");
//
////			System.out.println(comsu);
//			// 선공 결정
//			if (comsu == hum)
//				System.out.println("컴퓨터가 선공합니다.");
//			else
//				System.out.println("사람이 선공합니다.");
//			continue;
//
//			// 게임의 조건 만들기
//
//			// 31 이상이 될떄까지 계속 진행되며
//			// 1~3의 숫자만 입력 후 적용
//			// 카운트를 점점 센다.
//			// 넘으면 짐
//		}
//		while(sum++ < 31)
//			if()
