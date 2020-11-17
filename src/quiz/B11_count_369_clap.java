package quiz;

public class B11_count_369_clap {

	// 사용자로부터 정수 하나를 입력받고
	// 해당 숫자까지 369게임이 진행 된다면 박수를 총 몇번 쳐야하는지 세어보세요

	public static void main(String[] args) {

		// # 숫자를 사용하는 방법
		
		// # 프로그램 실행시간 측정
//		long start_time = System.currentTimeMillis();
		
		
//		int user = 333;
//		int clap = 0;
//
//		boolean debugMode = true;
//
//		for (int i = 1; i <= user; ++i) {
//			int check = i;
//
//			// while문에 탈출 조건 준것
//			if (debugMode)
//				System.out.printf("%d : ", i);
//			while (check != 0) {
//
//				int digit = check % 10;
//
//				if (digit % 3 == 0 && digit != 0) {
//					++clap;
//					if (debugMode)
//						System.out.print("짝");
//				}
//				check /= 10;
//
//			}
//			if (debugMode)
//				System.out.println();
//		}
//		System.out.println(clap + "회");
//		
//		long end_time = System.currentTimeMillis();
//		
//		System.out.println("걸린 시간 : " + (end_time - start_time));
//	}
//}

// # 문자열을 사용하는 방법
		int user = 250;
		int clap = 0;

		long start_time = System.currentTimeMillis();

		
		for (int i = 1; i <= user; ++i) {
			String check = "" + i;
			int len = check.length();

			for (int j = 0; j < len; ++j) {
				if (check.charAt(j) == '3' || check.charAt(j) == '6' || check.charAt(j) == '9') {
					++clap;
				}
			}

		}
		long end_time = System.currentTimeMillis();
		System.out.println(clap);
System.out.println("걸린 시간 : " + (end_time - start_time));

	}
}







//		int user = 37;
//		int r;
//		int count = 0;
//
//		while (user > 0) {
//			user++;
//
//			r = user % 10;
//			if (r == 3 || r == 6 || r == 9)
//				count++;
//			r = user / 10;
//			if (r == 3 || r == 6 || r == 9)
//				count++;
//
//			if (r <= user)
//				break;
//
//		}
//		System.out.println(count + "번");

//			continue;
//			user /= 10;
//			if (user / 10 * d == 3 || user / 10 * d == 6 || user / 10 * d == 9)
//				count++;
//			{
//				if (user == 3 || user == 6 || user == 9)
//					count++;
//			}
////			System.out.println(d + " 첫번째 조건: 유저");
//			if(user - (10 * d) == 3 || user - (10 * d) == 6 || user - (10 * d) == 9) {
//					count++;	
//			}
//
//			d++;
//			if (user < 0) {
//				break;
//
//			}
//			System.out.println(count + "번");
