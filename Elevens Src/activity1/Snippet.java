package activity1;

public class Snippet
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
	
}

