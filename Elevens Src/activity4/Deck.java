package activity4;
/**********************************************************
 * Assignment: Deck Class
 *
 * Author: Nazari Tuyo
 *
 * Description: Creates a deck
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * received help from Sofia in designing and debugging
 * my program.
 **********************************************************/
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards. It provides several
 * operations including initialize, shuffle, deal, and check if empty.
 */
public class Deck
{
	/**
	 * Creates a new Deck instance.
	 * 
	 * It pairs each element of ranks with each element of suits, and produces one
	 * of the corresponding card.
	 * 
	 * @param ranks
	 *            is an array containing all of the card ranks.
	 * @param suits
	 *            is an array containing all of the card suits.
	 * @param values
	 *            is an array containing all of the card point values.
	 */
	ArrayList<Card> Deck;
	String[] rank;
	String[] suit;
	int[] value;
	
	public Deck(String[] ranks, String[] suits, int[] values)
	{
		rank = ranks;
		suit = suits;
		value = values;
		shuffle();

	}

	/**
	 * Determines if this deck is empty (no undealt cards).
	 * 
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty()
	{
		if (getCardsLeft() >= 0)
		{
			return false;
		}
		else
		{
			return true;
		}

	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * 
	 * @return the number of undealt cards in this deck.
	 */
	public int getCardsLeft()
	{
		return Deck.size();
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}

	/**
	 * Randomly permute the given collection of cards and reset the size to
	 * represent the entire deck.
	 */
	public void shuffle()
	{
		Deck = new ArrayList<Card>();
		for (int i = 0; i < rank.length; i++)
		{
			for (int j = 0; j < suit.length; j++)
			{
				Deck.add(new Card(rank[i], suit[j], value[i]));
			}
		}
		for (int i = 0; i < Deck.size(); i++)
		{
			int randNum = (int) (Math.random() * Deck.size());
			Card temp = Deck.get(i);
			Deck.set(i, Deck.get(randNum));
			Deck.set(randNum, temp);
		}	
	
	}

	/**
	 * Deals a card from this deck.
	 * 
	 * @return the card just dealt, or null if all the cards have been previously
	 *         dealt.
	 */
	public Card deal()
	{
		// check to return null
		if(Deck.isEmpty())
		{
			return null;
		}
		else
		{
			return Deck.remove(0);
		}
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}
}