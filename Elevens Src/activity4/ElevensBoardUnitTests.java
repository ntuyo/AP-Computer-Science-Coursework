package activity4;

/**********************************************************
 * Assignment: Elevens Board Tests
 *
 * Author: Nazari Tuyo
 *
 * Description: Tests the elevens board (run multiple times)
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * received help from Sopia, Mr.McG in designing and debugging
 * my program.
 **********************************************************/
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import activity4.Deck;
import activity4.ElevensBoard;
import activity4.IBoard;
import testHelp.*;

public class ElevensBoardUnitTests
{
	String[] ranks = { "Jack", "Queen", "King", "Ace" };
	String[] suits = { "Hearts", "Clubs", "Spades" };
	int[] values = { 11, 12, 13, 1 };
	String[] ranks1 = { "Seven" };
	String[] suits1 = { "Hearts" };
	int[] values1 = { 7 };

	@Test
	public void BoardConstructorShouldNotThrow()
	{
		verify.that(() -> new ElevensBoard()).doesNotThrow();
	}

	@Test
	public void BoardShouldHoldNineCards()
	{
		IBoard board = new ElevensBoard();
		verify.that(board.getBoardSize()).isEqualTo(9);
	}

	@Test
	public void BoardShouldStartWithNineCards()
	{
		IBoard board = new ElevensBoard();
		verify.that(board.getCardIndices().size()).isEqualTo(9);
	}

	@Test
	public void NewGameShouldReplaceCards()
	{
		ElevensBoard game = new ElevensBoard();
		game.newGame();
		ArrayList<Card> first = getCards(game);
		game.newGame();
		ArrayList<Card> second = getCards(game);
		verify.that(first).isNotEqualTo(second);
	}

	@Test
	public void DealShouldReplaceCardAtFirstIndex()
	{
		// Create a new ElevensBoard, get the card at position 0,
		// deal to position 0 on the board, verify that the new
		// card at position 0 is not equal to the original card at 0
		IBoard game = new ElevensBoard();
		Card original = game.getCard(0);
		game.deal(0);
		verify.that(game.getCard(0)).isNotEqualTo(original);
	}

	@Test
	public void DealShouldReplaceCardAtLastIndex()
	{
		IBoard game = new ElevensBoard();
		Card original = game.getCard(8);
		game.deal(8);
		verify.that(game.getCard(8)).isNotEqualTo(original);
	}

	@Test
	public void GameIsWonIfDeckAndTableAreClear()
	{
		// Create an empty deck, create an ElevensBoard with this
		// deck, and verify that the game is won (since both the deck
		// and the board are empty)
		// Small deck, elevens board with the deck, use deal method to deal to every
		// position
		Deck deck = new Deck(ranks1, suits1, values1);
		IBoard board = new ElevensBoard(deck);
		board.deal(0);
		verify.that(board.gameIsWon()).isFalse();
	}

	@Test
	public void GameIsNotOverIfDeckContainsCards()
	{
		IBoard board = new ElevensBoard();
		verify.that(board.gameIsWon()).isFalse();
	}

	@Test
	public void GameIsNotOverIfTableHasCards()
	{
		Deck d = new Deck(new String[] { "rank1", "rank2" }, new String[] { "suit1" }, new int[] { 1, 2 });
		IBoard board = new ElevensBoard(d); // will have 2 cards on table, none left in deck
		verify.that(board.gameIsWon()).isFalse();
	}

	@Test
	public void WhenBoardIsPartiallyFullIsEmptyReturnsFalse()
	{
		Deck tester = new Deck(ranks, suits, values);
		IBoard test = new ElevensBoard(tester);
		verify.that(test.isEmpty()).isFalse();
	}

	@Test
	public void TableSlotsAreEmptyWhenDeckRunsOut()
	{
		Deck d = new Deck(new String[] { "rank1", "rank2" }, new String[] { "suit1" }, new int[] { 1, 2 });
		IBoard board = new ElevensBoard(d);
		verify.that(board.getCardsLeftInDeck()).isEqualTo(0);

		// there should be just two card indices, 0 and 1
		verify.that(board.getCardIndices()).isEqualTo(Arrays.asList(new Integer[] { new Integer(0), new Integer(1) }));
	}

	@Test
	public void WhenBoardIsFullIsEmptyReturnsFalse()
	{
		IBoard board = new ElevensBoard();
		verify.that(board.isEmpty()).isFalse();
	}

	@Test
	public void IsLegalReturnsFalseWhenSelectedCardsDoNotAddToEleven()
	{
		String[] falseRanks2 = { "Four", "Nine" };
		int[] falseValues2 = { 4, 9 };

		Deck test = new Deck(falseRanks2, suits1, falseValues2);
		IBoard board = new ElevensBoard(test);
		ArrayList<Integer> sCards = new ArrayList<Integer>();
		sCards.add(0);
		sCards.add(1);
		verify.that(board.isLegal(sCards)).isFalse();
	}

	private static ArrayList<Card> getCards(IBoard board)
	{
		ArrayList<Card> cards = new ArrayList<Card>();
		for (Integer i : board.getCardIndices())
			cards.add(board.getCard(i));
		return cards;
	}



	@Test
	public void WhenSelectedCardsAreKingQueenAndJackIsLegalReturnsTrue()
	{
		String[] fCards = { "Jack", "Queen", "King" };
		int[] fValues = { 11, 12, 13 };
		Deck test = new Deck(fCards, suits1, fValues);
		IBoard board = new ElevensBoard(test);
		ArrayList<Integer> sCards = new ArrayList<Integer>();
		sCards.add(0);
		sCards.add(1);
		sCards.add(2);
		verify.that(board.isLegal(sCards)).isTrue();
	}

	@Test
	public void GetCardReturnsACard()
	{
		IBoard test = new ElevensBoard();
		verify.that(test.getCard(3)).isOfType(Card.class);
	}

	@Test
	public void WhenNoCardsAreOnBoardIsEmptyReturnsTrue()
	{
		Deck tester = new Deck(ranks1, suits1, values1);
		IBoard board = new ElevensBoard(tester);
		board.deal(0);
		verify.that(board.isEmpty()).isTrue();
	}
	
	@Test
	public void WhenTwoCardsAddToElevenAnotherPlayIsPossibleReturnsTrue()
	{
		String[] ranks = { "One", "Three", "Four", "Five", "Seven", "Eight", "Ten", "Queen", "King" };
	    int[] values = { 1, 3, 4, 5, 7, 8, 10, 12, 13 };
		Deck test = new Deck(ranks, suits1, values);
		IBoard board = new ElevensBoard(test);
		verify.that(board.anotherPlayIsPossible()).isTrue();
	}

	@Test
	public void WhenSelectedCardsAddToElevenIsLegalReturnsTrue()
	{
		String[] ranks2 = { "Four", "Seven" };
		int[] values2 = { 4, 7 };

		Deck test = new Deck(ranks2, suits1, values2);
		IBoard board = new ElevensBoard(test);
		ArrayList<Integer> chosen = new ArrayList<Integer>();
		chosen.add(0);
		chosen.add(1);
		verify.that(board.isLegal(chosen)).isTrue();
	}
}