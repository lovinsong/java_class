package myobj.poker;

public enum Rank {

	// ACE의 값이 제일 크다

	DEUCE(0, "2"), THREE(1, "3"), FOUR(2, "4"), FIVE(3, "5"), SIX(4, "6"), SEVEN(5, "7"), EIGHT(6, "8"), NINE(7, "9"),
	TEN(8, "10"), JACK(9, "J"), QUEEN(10, "Q"), KING(11, "K"), ACE(12, "A");

	public static final int NUM_OF_RANKS = 13;
	
	private int rankValue;
	private String simpleName;

	private Rank(int rankValue, String simpleName) {
		this.rankValue = rankValue;
		this.simpleName = simpleName;
	}

	public int getRankValue() {
		return rankValue;
	}

	public String getSimpleName() {
		return simpleName;
	}

}
