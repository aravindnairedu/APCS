package edu.kyleknobloch.APCS.CaseStudy.ElevensLab.Activity9;

import java.util.List;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	private static final int BOARD_SIZE = 9;
	private static final String[] RANKS =
			{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	private static final String[] SUITS =
			{"Spades", "Hearts", "Diamonds", "Clubs"};
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }


	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {

		return (selectedCards.size() < 3 &&
				(super.cardAt(selectedCards.get(0)).pointValue() + super.cardAt(selectedCards.get(1)).pointValue()) == 11) ||
			   (selectedCards.size() < 4 &&
				(super.cardAt(selectedCards.get(0)).pointValue() + super.cardAt(selectedCards.get(1)).pointValue() + super.cardAt(selectedCards.get(2)).pointValue()) == 0);

	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		return containsPairSum11(super.cardIndexes()) || containsJQK(super.cardIndexes());
	}


	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		for(int i = 0; i < 9; ++i) {
			if(cardAt(i) != null) {
				for (int k = i + 1; k < 9; ++k) {
					if (cardAt(k) != null && cardAt(i).pointValue() + cardAt(k).pointValue() == 11)
						return true;
				}
			}
		}

		return false;
	}


	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		boolean K, Q, J;
		K = Q = J = false;

		for (int i = 0; i < selectedCards.size(); i++) {
			if (super.cardAt(i).rank().equalsIgnoreCase("King"))
				K = true;
			else if (super.cardAt(i).rank().equalsIgnoreCase("Queen"))
				Q = true;
			else if (super.cardAt(i).rank().equalsIgnoreCase("Jack"))
				J = true;
		}

		return K && J && Q;

	}
}
