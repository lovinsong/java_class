package myobj.boardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CardDeck {

	private Random ran;
	private List<Integer> card; // 52개의 카드 값이 저장될 리스트
	private List<Integer> count; // 각 카드의 카운트 를 세어서 조건식 만들예정?

	private String made; // 카드의 족보

	private static int NUM_OF_CARD = 52; // 고정된 카드의 수
	private static int BASIC_GET_CARD = 5; // 처음에 받는 카드 수
	
	private static final Set<Set<Integer>> ROYAL_FLUSH = null;
	private static final Set<Set<Integer>> STRAIGT_FLUSH = null;
	private static final Set<Set<Integer>> FOUR_CARD = null;
	private static final Set<Set<Integer>> FLUSH = null;
	private static final Set<Set<Integer>> STRAIGT = null;
	private static final Set<Set<Integer>> TRIPLE = null;
	private static final Set<Set<Integer>> TWOPAIR = null;
	private static final Set<Set<Integer>> ONEPAIR = null;

	public CardDeck() {

		ran = new Random();
		made = "High Card";

		card = new ArrayList<>(NUM_OF_CARD);
		count = new ArrayList<>(NUM_OF_CARD);
		Collections.addAll(card, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Collections.addAll(count, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

	}

	private void count() {
		for (int i = 0; i < BASIC_GET_CARD; ++i) {
			int card = i + 1;

			count.set(i, Collections.frequency(this.card, card));
		}

	}

	
	
	private String check() {
		
		
		return null;
	
	}
	

	
	
	
	public void print() {
		System.out.println(card + " : ");
		
		if(made.equals("High Card")) {
			made = check();
		}
		System.out.println(made);
	}
	
	public void roll() {
		made = "High Card";
		
		for(int i = 0; i < NUM_OF_CARD; ++i) {
			card.set(i, ran.nextInt(NUM_OF_CARD) + 1);
		}
		count();
		check();
	}

}
