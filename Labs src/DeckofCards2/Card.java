package DeckofCards2;
/**********************************************************
 * Assignment: Deck of Cards (RESUBMITTED), I resubmitted the wrong code originally, sorry
 *
 * Author: Nazari Tuyo
 *
 * Description: This class creates cards
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * received help from no one in designing and debugging
 * my program.
 **********************************************************/
public class Card implements Comparable<Card>
{
	private int value;
	private String suit;

	public Card(int v, String s)
	{
		value = v;
		suit = s;
	}

	public String toString()
	{
		/*
		 * Remove the incorrect line below and insert code here that will
		 * convert a Card to a string.
		 * Examples: "4 of Hearts", "King of Spades", "Ace of Diamonds"
		 * Note: a King would have a value of 13, an Ace would have a value of 1
		 */
		if(value == 13)
		{
			return "king of " + suit;
		}
		if(value == 12)
		{
			return "queen of " + suit;
		}

		if(value == 11)
		{
			return "jack of " + suit;
		}

		if(value == 1)
		{
			return "Ace of " + suit;
		}
		else
		{
		return value + " of " + suit;
		}
	}


	// for testing purposes
	public static void main(String[] args)
	{
		for (int i = 0; i < 10; i++)
		{
			Card c = new Card((int) (Math.random() * 13 + 1), "Clubs");
			System.out.println(c);
		}
	}

	@Override
	public int compareTo(Card otherCard)
	{
		// TODO Auto-generated method stub
		int v = 0;
		if(this.value == otherCard.value)
		{
		return v;
		}
		if(this.value >= otherCard.value)
		{
			v = 1;
		}
		if(this.value <= otherCard.value)
		{
			v = -1;
		}
		return v;
	}

}