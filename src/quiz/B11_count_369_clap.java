package quiz;

public class B11_count_369_clap {

	// ����ڷκ��� ���� �ϳ��� �Է¹ް�
	// �ش� ���ڱ��� 369������ ���� �ȴٸ� �ڼ��� �� ��� �ľ��ϴ��� �������

	public static void main(String[] args) {

		// # ���ڸ� ����ϴ� ���
		
		// # ���α׷� ����ð� ����
//		long start_time = System.currentTimeMillis();
		
		
//		int user = 333;
//		int clap = 0;
//
//		boolean debugMode = true;
//
//		for (int i = 1; i <= user; ++i) {
//			int check = i;
//
//			// while���� Ż�� ���� �ذ�
//			if (debugMode)
//				System.out.printf("%d : ", i);
//			while (check != 0) {
//
//				int digit = check % 10;
//
//				if (digit % 3 == 0 && digit != 0) {
//					++clap;
//					if (debugMode)
//						System.out.print("¦");
//				}
//				check /= 10;
//
//			}
//			if (debugMode)
//				System.out.println();
//		}
//		System.out.println(clap + "ȸ");
//		
//		long end_time = System.currentTimeMillis();
//		
//		System.out.println("�ɸ� �ð� : " + (end_time - start_time));
//	}
//}

// # ���ڿ��� ����ϴ� ���
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
System.out.println("�ɸ� �ð� : " + (end_time - start_time));

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
//		System.out.println(count + "��");

//			continue;
//			user /= 10;
//			if (user / 10 * d == 3 || user / 10 * d == 6 || user / 10 * d == 9)
//				count++;
//			{
//				if (user == 3 || user == 6 || user == 9)
//					count++;
//			}
////			System.out.println(d + " ù��° ����: ����");
//			if(user - (10 * d) == 3 || user - (10 * d) == 6 || user - (10 * d) == 9) {
//					count++;	
//			}
//
//			d++;
//			if (user < 0) {
//				break;
//
//			}
//			System.out.println(count + "��");
