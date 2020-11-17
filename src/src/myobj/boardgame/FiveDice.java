package myobj.boardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class FiveDice {

	private Random ran;
	private List<Integer> dices; // 5개의 주사위 눈이 저장될 리스트
	private List<Integer> counts; // 각 숫자가 몇번씩 등장했는지 세어 볼 리스트

	private String made;

	private static int NUM_OF_DICE = 5;
	private static int DICE_FACET = 6;

	private final static Set<Set<Integer>> LARGE_CASES;
	private final static Set<Set<Integer>> SMALL_CASES;

	static {
		LARGE_CASES = new HashSet<>(2);

		for (int i = 1; i <= 2; ++i) {
			Set<Integer> large = new HashSet<>(5);
			Collections.addAll(large, i, i + 1, i + 2, i + 3, i + 4);
			LARGE_CASES.add(large);

		}

		SMALL_CASES = new HashSet<>(3);

		for (int i = 1; i <= 3; ++i) {
			Set<Integer> small = new HashSet<>(4);
			Collections.addAll(small, i, i + 1, i + 2, i + 3);
			SMALL_CASES.add(small);

		}

	}

	public FiveDice() {
		ran = new Random();
		made = "UNCHECKED";

		// 주사위는 5개 이상으로 늘어나지 않기 때문에 컬렉션 용량을 5로 설정한다
		// ※ ArrayList는 초기 용량이 가득 차게되면 용량을 알아서 1.5배씩 증가시킨다
		dices = new ArrayList<>(NUM_OF_DICE);
		counts = new ArrayList<>(DICE_FACET);
		Collections.addAll(dices, 0, 0, 0, 0, 0);
		Collections.addAll(counts, 0, 0, 0, 0, 0, 0);

	}

	private void count() {
		for (int i = 0; i < DICE_FACET; ++i) {
			int dice_num = i + 1;

			counts.set(i, Collections.frequency(dices, dice_num));
		}
	}

	private String check() {
		// check by counts
		if (counts.contains(5)) {
			return "FIVE DEICE!!!!!!!!!!!!!!!!!!!";
		} else if (counts.contains(4)) {
			return "FOUR DICE!!";
		} else if (counts.contains(2) && counts.contains(3)) {
			return "FULL HOUSE!!!";
		}

		// check by dices
		for (Set<Integer> ls : LARGE_CASES) {
			if (dices.containsAll(ls)) {
				return "LARGE STRAIGHT!!!!!!";
			}
		}

		for (Set<Integer> ss : SMALL_CASES) {
			if (dices.containsAll(ss)) {
				return "SMALL STRAIGHT!!!";
			}
		}

		return "NO MATCHES";
	}

	public void print() {
		System.out.print(dices + " : ");

		if (made.equals("UNCHECKED")) {
			made = check();
		}
		System.out.println(made);
	}

	public void reroll(Set<Integer> rerolls) {

		if (rerolls.size() == 0) {
			System.out.println("NOTHING CHANGES");
			return;
		}

		made = "UNCHECKED";
		
		for (int i : rerolls) {
			int to_change = ran.nextInt(DICE_FACET) + 1;
			dices.set(i - 1, to_change);
			System.out.printf("DICE %d HAS CHANGED : %d\n", i, to_change);
		}

		count();
		print();

	}

	public void roll() {
		made= "UNCHECKED";
		
		for (int i = 0; i < NUM_OF_DICE; ++i) {
			dices.set(i, ran.nextInt(DICE_FACET) + 1);
		}
		count();
		check();

//		reroll();

	}

// 바꿀지 말지 1 or 0
// 몇개 바꿀지 선택 1 ~ 5
// 그다음 몇번을 바꿀지 숫자에 맞춰서 선택
// 바꾼값 보여주고 체크

//	public void reroll() {
//		System.out.println("바꾸고싶은 주사위 를 고르시오\n>");
//		Scanner sc = new Scanner(System.in);
//		int cmd = sc.nextInt();
//		while (true) {
//			switch (cmd) {
//			case 1:
//				dices.set(0, ran.nextInt(DICE_FACET) + 1);
//			case 2:
//				dices.set(1, ran.nextInt(DICE_FACET) + 1);
//			case 3:
//				dices.set(2, ran.nextInt(DICE_FACET) + 1);
//			case 4:
//				dices.set(3, ran.nextInt(DICE_FACET) + 1);
//			case 5:
//				dices.set(4, ran.nextInt(DICE_FACET) + 1);
//			default:
//				System.out.println("변경하지 않습니다");
//			}
//			break;
//		}
//	}

	public static void main(String[] args) {
//		FiveDice dice01 = new FiveDice();

	// 던진 후에 원하는 주사위를 여러개 (0 ~ 5개)
	// 골라서 다시 던질 수 있는 기능을 추가해보세요
//		dice01.roll();

//		for (int i = 0; i < 100; ++i) {
//			dice01.roll();
//		}

	}

}
