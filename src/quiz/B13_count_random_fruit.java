package quiz;

import java.util.Random;

public class B13_count_random_fruit {

	// 1. 크기 100의 배열에 랜덤 과일 문자열을 저장해보세요
	// 등장하는 과일 : apple. banana, orange, peach, kiwi

	// 2. 각 과일이 몇번 등장했는지 모두 기록하고 출력해보세요

	public static void main(String[] args) {

		Random ran = new Random();
//		int[] fru = new int[5];
//		int[] count = new int[100];
		int size = 100;
		String[] fruitNames = { "apple", "banana", "orange", "peach", "kiwi" };
		String[] fruitBox = new String[100];

		int fruit_kind = fruitNames.length;

		// 과일을 박스에 넣어 100번 돌린다
		for (int i = 0; i < size; ++i) {
			fruitBox[i] = fruitNames[(int) (Math.random() * 5)];
		}
		// fruitBox배열에 저장되어 각 과일이 몇번 등장했는지 모두 세어보세요
		int[] count = new int[5];

		for (int i = 0; i < size; ++i) {

			for (int j = 0; j < fruit_kind; ++j) {

				// j에 과일 5개를 i와 비교
				if (fruitNames[j].equals(fruitBox[i])) {
					count[j] += 1;
					break;
				}
			}

		}

		// 집계가 끝난 후 count를 출력 해야 한다
		for (int i = 0; i < count.length; ++i) {
			// fruitNames[0]은 apple이다.
			System.out.printf("%s : %d회\n", fruitNames[i], count[i]);
		}

		// # enum의 시초
		int apple = 0;
		int banana = 1;
		int orange = 2;

		System.out.println("오렌지의 번호 : " + orange);
		System.out.println("오렌지가 몇번 등장? " + count[orange]);
		System.out.println("오렌지 이름 : " + fruitNames[orange]);

	}
}

// 과일을 하나씩 뺀다
//		for(int i = 0; i < fruitNames.length; i++) {
//			
//			String temp = fruitBox[0];
//			fruitBox[0] = fruitBox[fruitNames];
//			fruitBox[fruitNames] = temp;

// 과일을 비교하고 출력한다

//		for(int i = 0; i <count.length; ++i) {
//			count[i] = i + 1;
//		}
//		
//		for(int i =0; i <5000; ++i);
//			int random_index = ran.nextInt(99) + 1;
//			
//			int temp = count[0];
//			count[0] = count[random_index];
//			count[random_index] = temp;
//			

//		for (int i = 0; i < 100; ++i) {
//			for (int j = 0; j < i; j++) {
//				if (count[i] == count[j])
//					i--;
//				break;
//			}
//
//		}
