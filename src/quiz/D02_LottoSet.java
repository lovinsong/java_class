package quiz;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class D02_LottoSet {

//	// 1부터 45사이의 중복없는 랜덤 숫자 6개로 이루어진 HashSet을 생성해보세요
//
	public static Set<Integer> generate() {
		Random ran = new Random();

		Set<Integer> lotto = new HashSet<>();

		int count = 0;
		// Set은 중복값을 추가하지 않기 때문에 알아서 길이가 늘어나지 않는다
		while (lotto.size() < 6) {
			lotto.add(ran.nextInt(45) + 1);
//			System.out.println(++count + "회 뽑았습니다.");
		}

		return lotto;
	}

	public static void main(String[] args) {
		System.out.println(generate());

//		HashSet<Integer> lotto = new HashSet<>();
//
//		ArrayList<String> lotto_num = new ArrayList<>();
//		Random ran = new Random();
//
//		while (lotto.size() < 6)
//			System.out.println(lotto.size());
//		for (int i = 0; i < 6; ++i) {
//			lotto_num.add(ran.nextInt(45) + 1);
//		}
//
//		System.out.println(lotto);
	}
}
