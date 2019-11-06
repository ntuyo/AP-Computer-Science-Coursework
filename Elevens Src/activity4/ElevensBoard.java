package activity4;
/**********************************************************
 * Assignment: Elevens Board
 *
 * Author: Nazari Tuyo
 *
 * Description: Creates the elevens board
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * received help from (enter the names of others that helped with the
 * assignment, write no one if you received no help) in designing and debugging
 * my program.
 **********************************************************/

import java.util.ArrayList;
import java.util.List;

public class ElevensBoard implements IBoard
{
	private Deck cards;
	private Card[] onBoard = new Card[9];

	public ElevensBoard()
	{
		String[] suits = { "Diamonds", "Hearts", "Spades", "Clubs" };
		int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		cards = new Deck(ranks, suits, values);
		newGame();
	}

	public ElevensBoard(Deck d)
	{
		cards = d;
		newGame();
	}

	@Override
	public void newGame()
	{
		cards.shuffle();
		for (int j = 0; j < onBoard.length; j++)
		{
			deal(j);
		}
	}

	@Override
	public int getBoardSize()
	{
		return onBoard.length;
	}

	@Override
	public boolean isEmpty()
	{
		return (getCardIndices().size() == 0);
	}

	@Override
	public void deal(int k)
	{
		if (cards.isEmpty() == true)
		{
			onBoard[k] = null;
		}
		else
		{
			onBoard[k] = cards.deal();
		}
	}

	@Override
	public int getCardsLeftInDeck()
	{
		// TODO Auto-generated method stub
		return cards.getCardsLeft();
	}

	@Override
	public Card getCard(int k)
	{
		// TODO Auto-generated method stub
		return onBoard[k];
	}

	@Override
	public void replaceSelectedCards(List<Integer> selectedCards)
	{
		for (int i = 0; i < selectedCards.size(); i++)
		{
			deal(selectedCards.get(i));
		}
	}

	@Override
	public List<Integer> getCardIndices()
	{
		ArrayList<Integer> indices = new ArrayList<Integer>();
		for (int l = 0; l < onBoard.length; l++)
		{
			if (onBoard[l] != (null))
			{
				indices.add(l);
			}
		}
		return indices;
	}

	@Override
	public boolean gameIsWon()
	{
		// TODO Auto-generated method stub
		return (cards.isEmpty() && isEmpty());
	}

	@Override
	public boolean isLegal(List<Integer> sCards)
	{
		if (sCards.size() == 2 || sCards.size() == 3)
		{
			if (sCards.size() == 2 && onBoard[sCards.get(0)].getValue() + onBoard[sCards.get(1)].getValue() == 11)
			{
				return true;
			}
		}
		if (sCards.size() == 3)
		{
			if (sCards.size() == 3 && onBoard[sCards.get(0)].getValue() + onBoard[sCards.get(1)].getValue()
					+ onBoard[sCards.get(2)].getValue() == 11 + 12 + 13)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean anotherPlayIsPossible()
	{
		boolean king = false;
		boolean queen = false;
		boolean jack = false;
		for (int i = 0; i < onBoard.length; i++)
		{
			if (onBoard[i].getValue() + onBoard[i+1].getValue() == 11)
			{
				return true;
			}
		}

		for (int i = 0; i < onBoard.length; i++)
		{
			if (onBoard[i].getValue() == 11)
			{
				jack = true;
			}
			if (onBoard[i].getValue() == 12)
			{
				queen = true;
			}
			if (onBoard[i].getValue() == 13)
			{
				king = true;
			}
			if (king && queen && jack == true)
			{
				return true;
			}
		}
		return false;
	}

	// additional methods would be here

}