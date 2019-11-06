package DeckofCards2;
/**********************************************************
 * Assignment: (Deck of cards) (RESUBMITTED), I resubmitted the wrong code originally, sorry
 *
 * Author: Nazari Tuyo
 *
 * Description: This class creates and shuffles the deck, assigns cards to player 1 and 2, and checks to see who won.
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * received help from Sophia Mrowka in designing and debugging
 * my program.
 **********************************************************/
public class Deck
{
	public static final int CARDS_IN_DECK = 52;
	public static final int CARDS_IN_SUIT = 13;

	// declare deck as an array of Cards, but don't initialize it here
	Card[] deck;
	int undealt;
	public Deck()
	{
		// Uncomment and complete the line below to dimension deck
		deck = new Card[CARDS_IN_DECK];
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		int c = 0;
		for (String suit : suits)
		{
			for (int value = 1; value <= CARDS_IN_SUIT; value++)
			{
				// Uncomment the line below after you have declared deck
				deck[c] = new Card(value, suit);
				c++;
			}
		}
		// uncomment the line below after you have declared undealt;
		undealt = 0; // this will be the index of the next card to deal
	}

	public void print()
	{
		/*
		 * Insert code to print the entire deck, each card on a separate line.
		 */
		for(Card printDeck: deck)
		{
			System.out.println(printDeck);
		}
	}

	public void shuffle()
	{
		/*
		 * Insert code that rearranges the cards in the deck so they are in
		 * random order.
		 */
		for(int i = 0; i < CARDS_IN_DECK; i++)
		{
			int randomCard = (int)(Math.random() * CARDS_IN_DECK);
			Card switcher = deck[randomCard];
			deck[randomCard] = deck[i];
			deck[i] = switcher;
		}
	}

	public Card topCard()
	{
		/*
		 * Remove the incorrect line below and insert code to return the top
		 * (undealt) card from the deck and update the undealt instance
		 * variable.
		 */
		undealt++;
		return deck[undealt - 1];
		
		
	}

	public void deal(int n)
	{
		/*
		 * Insert code to print n cards from the deck by calling the topCard
		 * method.
		 */
		for(int i = 0; i < n; i ++)
		{
			System.out.println(topCard());
			undealt++;
		}
	}

	// for testing purposes
	public static void main(String[] args)
	{
		/*
		 * These lines should print
		 *   an unshuffled deck,
		 *   a shuffled deck,
		 *   and two five card "hands"
		 */
		Deck myDeck = new Deck();
		myDeck.shuffle();
		
		Card player1 = myDeck.topCard();
		System.out.println("Player 1: " + player1);
		Card player2 = myDeck.topCard();
		System.out.println("Player 2: " + player2);
		
		if(player1.compareTo(player2) == 0)
		{
			System.out.println( "There was a tie.");
		}
		if(player1.compareTo(player2) == 1)
		{
			System.out.println( "Player 1 wins.");
		}
		if(player1.compareTo(player2) == -1)
		{
			System.out.println( "Player 2 wins.");
		}
		
		System.out.println();
		
		
	}
}