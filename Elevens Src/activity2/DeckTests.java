package activity2;
/**********************************************************
 * Assignment: Deck Tests
 *
 * Author: Nazari Tuyo
 *
 * Description: Tests the deck class
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * received help from Sofia in designing and debugging
 * my program.
 **********************************************************/

import java.util.ArrayList;

import org.junit.Test;

import testHelp.verify;

public class DeckTests
{
	String[] ranks = { "Jack", "Queen", "King", "Ace" };
	String[] suits = { "Hearts", "Clubs", "Spades" };
	int[] values = { 11, 12, 13, 1 };
	String[] ranks1 = { "Seven" };
	String[] suits1 = { "Hearts" };
	int[] values1 = { 7 };

	@Test
	public void DeckConstructorShouldNotCrash()
	{
		Deck test = new Deck(ranks, suits, values);
		verify.that(test).isOfType(Deck.class);
	}

	@Test
	public void DeckConstructorShouldHandleSingleCard()
	{
		Deck test = new Deck(ranks1, suits1, values1);
		verify.that(test.getCardsLeft()).isEqualTo(1);
	}

	@Test
	public void DealReturnsCorrectCardInOneCardDeck()
	{
		Deck test = new Deck(ranks1, suits1, values1);
		Card expected = new Card("Seven", "Hearts", 7);
		verify.that(test.deal()).isEqualTo(expected);
	}

	@Test
	public void DeckShouldReturnCorrectSizeWithMultipleCards()
	{
		Deck test = new Deck(ranks, suits, values);
		verify.that(test.getCardsLeft()).isEqualTo(12);
	}

	// Constructor should work for a single card
	@Test
	public void ConstructorWorksForASingleCard()
	{
		Deck test = new Deck(ranks, suits, values);
		verify.that(test.getCardsLeft()).equals(12);
	}

	// Deal should return correct card
	@Test
	public void DeckDealReturnsCorrectCard()
	{
		Card expected = new Card("Seven", "Hearts", 7);

		Deck d = new Deck(ranks1, suits1, values1);

		Card dealt = d.deal();
		verify.that(dealt.equals(expected)).isTrue();
	}

	@Test
	public void ShuffleShouldRearrangeCards()
	{
		ArrayList<Card> shuffledCards = new ArrayList<Card>();
		ArrayList<Card> unshuffledCards = new ArrayList<Card>();
		Deck tester = new Deck(ranks, suits, values);
		tester.shuffle();
		int size = tester.getCardsLeft();
		for (int i = 0; i < size; i++)
		{
			shuffledCards.add(tester.deal());
		}
		Deck secondTester = new Deck(ranks, suits, values);
		for (int i = 0; i < size; i++)
		{
			unshuffledCards.add(secondTester.deal());
		}
		verify.that(shuffledCards).isEquivalentTo(unshuffledCards);
	}

	// Size should be zero after dealing all cards
	@Test
	public void SizeShouldBeZeroAfterDeal()
	{
		Deck d = new Deck(ranks1, suits1, values1);
		d.deal();
		verify.that(d.getCardsLeft() == 0).isTrue();
	}

	// Size should be correct after dealing one card
	@Test
	public void SizeShouldBeCorrectAfterDealingOneCard()
	{
		Deck deck = new Deck(ranks, suits, values);
		deck.deal();
		verify.that(deck.getCardsLeft() == 11);
	}

	// Deal should deal all cards
	@Test
	public void DealShouldDeal()
	{
		Deck deck = new Deck(ranks, suits, values);
		deck.deal();
		verify.that(deck.getCardsLeft() == 12);
	}

	// Deal should return null if deck is empty
	@Test
	public void DealShouldReturnNull()
	{
		Deck deck = new Deck(ranks, suits, values);
		deck.deal();
		verify.that(deck.deal() == null);
	}

	// Deck should be empty after all cards are dealt
	@Test
	public void DeckShouldBeEmptyAfterDeal()
	{
		Deck deck = new Deck(ranks, suits, values);
		deck.deal();
		verify.that(deck.isEmpty() == true);
	}

	@Test
	public void DeckShouldNotBeEmpty()
	{
		Deck deck = new Deck(ranks, suits, values);
		verify.that(deck.isEmpty() == false);
	}

	// Shuffle should reset size of deck
	@Test
	public void ShuffleShouldResetDeckSize()
	{
		Deck deck = new Deck(ranks, suits, values);
		deck.deal();
		deck.shuffle();
		verify.that(deck.getCardsLeft() == 12);
	}

	@Test
	public void DealReturnsNull()
	{
		Deck deck = new Deck(ranks, suits, values);
		deck.deal();
		verify.that(deck.deal() == null);
	}

}