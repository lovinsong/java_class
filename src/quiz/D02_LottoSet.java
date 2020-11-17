package quiz;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class D02_LottoSet {

//	// 1���� 45������ �ߺ����� ���� ���� 6���� �̷���� HashSet�� �����غ�����
//
	public static Set<Integer> generate() {
		Random ran = new Random();

		Set<Integer> lotto = new HashSet<>();

		int count = 0;
		// Set�� �ߺ����� �߰����� �ʱ� ������ �˾Ƽ� ���̰� �þ�� �ʴ´�
		while (lotto.size() < 6) {
			lotto.add(ran.nextInt(45) + 1);
//			System.out.println(++count + "ȸ �̾ҽ��ϴ�.");
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
