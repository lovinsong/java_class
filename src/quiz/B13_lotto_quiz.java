package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_lotto_quiz {

	// 1부터 45사이의 중복없는 랜덤 숫자 6개로 이루어진 배열을 생성해보세요

	public static void main(String[] args) {

		// ※ 1 ~ 45의 숫자를 무작위로 섞은 뒤 순서대로 6개 뽑기
		Random ran = new Random();
		int[] lotto = new int[6];
		int[] number = new int[45];

		// 먼저 숫자를 45개 받는다.
		for (int i = 0; i < number.length; ++i) {
			number[i] = i + 1;
		}

		// 뒤섞고
		for (int i = 0; i < 5000; ++i) {
			int random_index = ran.nextInt(44) + 1;

			// 값을 저장해논다음 (카드 섞는거와 같음)
			int temp = number[0];
			number[0] = number[random_index];
			number[random_index] = temp;
		}
		// 차례대로 뽑는다
		for (int i = 0; i < 6; ++i) {
			System.out.print(number[i] + ", ");
		}

	}
}

// ※ 뽑았던 숫자는 기록해두기
//		Random ran = new Random();
//		int[] lotto = new int[6];
//		int[] number = new int[45];
//		
//		for (int i =0; i <number.length; ++i) {
//			number[i] =i +1;
//		}
//		int i = 0;
//		while (i != 6) {
//			int random_index = ran.nextInt(45);
//			
//			if(number[random_index] != -1) {
//				lotto[i] = number[random_index];
//				number[random_index] = -1;
//				++i;
//			}
//		}
//		System.out.println("숫자 상태 : " + Arrays.toString(number));
//	}
//}

// 풀이 1

// ※ 중복이 있으면 다시 뽑기
//		while (i != 6) {
//			boolean duple = false;
//			lotto[i++] = (int) (Math.random() * 45 + 1);
//
//			// 3까지 뽑았을 때 0, 1, 2와 비교를 해서
//			// 똑같은 값이 있다면 i를 증가시키지 않는다
//			for (int j = 0; j < i; ++j) {
//				if (lotto[i] == lotto[j]) {
//					duple = true;
//					break;
//				}
//
//			}
//			if (!duple) {
//				++i;
//			}
//		}
//
//		System.out.println(Arrays.toString(lotto));
//
//	}
//	
//}
//		// 수(배열) 뽑기
//		int[] lotto = new int[7];
//
//		// 랜덤값 배정
//		for (int i = 0; i < lotto.length; ++i) {
//			lotto[i] = (int) ((Math.random() * 45) + 1);
//
//			// 중복 제거
//			for (int j = 0; j < i; j++) {
//				if (lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//			// 뽑은 값 7개중 6개만 출력.
//		for (int i = 0; i < lotto.length - 1; i++) {
//			System.out.print(lotto[i] + " ");
//
//		}
//		System.out.println();
//		System.out.println("보너스 번호 : " + lotto[6]);
//			
//			if (i == 0) {
//			
//				su = num;
//				su2 = num;
//	
//			} else {
//				su = su != num ? num : su; 
//				
//				if(su != su2) {
//					su = num;
//				}
////				su2 = su2 != n
//			}

//System.out.print(j + " ");