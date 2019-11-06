package activity1;
/**********************************************************
 * Assignment: (Card Tests)
 *
 * Author: Nazari Tuyo
 *
 * Description: (Tests the Card class)
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * received help from no one in designing and debugging
 * my program.
 **********************************************************/
import org.junit.Test;

import testHelp.verify;

public class CardTests
{

	@Test
	public void CardConstructorShouldNotCrash()
	{
		Card test = new Card("Two", "Hearts", 2);
		verify.that(test).isOfType(Card.class);
	}

	@Test
	public void CardShouldReturnRank()
	{
		Card test = new Card("Two", "Hearts", 2);
		verify.that(test.getRank()).isEqualTo("Two");
	}

	@Test
	public void CardShouldReturnSuit()
	{
		Card test = new Card("Two", "Hearts", 2);
		verify.that(test.getSuit()).isEqualTo("Hearts");
	}

	@Test
	public void CardShouldReturnValue()
	{
		Card test = new Card("Two", "Hearts", 2);
		verify.that(test.getValue()).isEqualTo(2);
	}

	@Test
	public void differentValueReturnsFalseForEquals()
	{
		Card a = new Card("Ace", "Spades", 1);
		Card b = new Card("Ace", "Spades", 2);
		verify.that(a.equals(b)).isFalse("because value is different");
	}

	@Test
	public void toStringReturnsPropervalue() // needs fixing
	{
		Card a = new Card("Ace", "Spades", 1);
		verify.that(a.toString()).isEqualTo("[Ace] of [Spades] (point value = [1])");
	}

	@Test
	public void trueWhenRankSuitValueAreEqual()
	{
		Card a = new Card("Ace", "Spades", 1);
		Card b = new Card("Ace", "Spades", 1);
		verify.that(a.equals(b)).isTrue("becasue value is the same");
	}

	@Test
	public void falseWhenRankIsNotEqual()
	{
		Card a = new Card("Ace", "Spades", 1);
		Card b = new Card("Ten", "Spades", 1);
		verify.that(a.equals(b)).isFalse("becasue rank is not the same");
	}

	@Test
	public void falseWhenSuitIsNotEqual()
	{
		Card a = new Card("Ace", "Spades", 1);
		Card b = new Card("Ace", "Clubs", 1);
		verify.that(a.equals(b)).isFalse("becasue suit is not the same");
	}

	@Test
	public void falseWhenValueIsNotEqual()
	{
		Card a = new Card("Ace", "Spades", 1);
		Card b = new Card("Ace", "Spades", 2);
		verify.that(a.equals(b)).isFalse("becasue value is not the same");
	}

	@Test
	public void falseWhenRankAndSuitAreNotEqual()
	{
		Card a = new Card("Ace", "Clubs", 1);
		Card b = new Card("Ten", "Spades", 10);
		verify.that(a.equals(b)).isFalse("becasue rank and suit are not the same");
	}

	@Test
	public void falseWhenSuitAndValueAreNotEqual()
	{
		Card a = new Card("Ace", "Clubs", 1);
		Card b = new Card("Ace", "Spades", 2);
		verify.that(a.equals(b)).isFalse("becasue suit and value are not the same");
	}

	@Test
	public void falseWhenRankAndValueAreNotEqual()
	{
		Card a = new Card("Ace", "Clubs", 1);
		Card b = new Card("Ten", "Spades", 10);
		verify.that(a.equals(b)).isFalse("becasue rank and value are not the same");
	}

	@Test
	public void falseWhenAlloAreNotEqual()
	{
		Card a = new Card("Ace", "Clubs", 1);
		Card b = new Card("Ten", "Spades", 10);
		verify.that(a.equals(b)).isFalse("becasue rank, value, and suit are not the same");
	}

	@Test
	public void falseWhenTwoAreNotEqual()
	{
		Card a = new Card("Ace", "Clubs", 1);
		Card b = new Card("Ten", "Spades", 1);
		verify.that(a.equals(b)).isFalse("becasue rank is not the same");
	}

	@Test
	public void falseWhenObjectIsNotACard()
	{
		Card a = new Card("Ace", "Clubs", 1);
		verify.that(a.equals("String")).isFalse("becasue object is not a card");
	}

	@Test
	public void falseWhenCardIsNull()
	{
		Card a = new Card("Ace", "Clubs", 1);
		Card b = null;
		verify.that(a.equals(b)).isFalse("becasue card is null");
	}

	@Test
	public void falseCardIsComparedToItself()
	{
		Card a = new Card("Ace", "Clubs", 1);
		Card b = new Card("Ace", "Clubs", 1);
		verify.that(a.equals(b)).isTrue("becasue card is compared to itself");
	}

	// other unit tests would go here
}