package myobj.poker;

import java.util.Collections;
import java.util.LinkedList;

public class PokerDeck {
	LinkedList<PokerCard> deck;

//	public static final int DECKSIZE = 52;

	public PokerDeck() {
		deck = new LinkedList<>();

		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				deck.add(new PokerCard(rank, suit));

			}
		}
		Collections.shuffle(deck);
		System.out.println("[System] New deck created and shuffled");
	}
	
	public PokerCard draw() {
		// ArrayList의 remove()는 pop의 기능도 한다
		return deck.pop();
//		return deck.poll(); poll 도 가능
	}
	
	public static void main(String[] args) {
		new PokerDeck();
	}

}
