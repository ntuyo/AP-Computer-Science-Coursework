import java.util.*;

public class ReduceToLowestTerms 

{
	static Scanner console = new Scanner(System.in);
	String input = console.nextLine();
		
	public static void main(String[] args)
	{
		System.out.print("Please enter a fraction numerator: ");
		int numerator = console.nextInt();
		System.out.print("Please enter a fraction denominator: ");
		int denominator = console.nextInt();
		
		String firstFraction =  numerator + "/"+ denominator ;
		String newFraction = "";
	
		for (int i = 1; i <= numerator; i++)
		{
			int greatestSoFar = 1;
			if (numerator % i == 0 && denominator % i == 0 )
			{
				greatestSoFar = i;
				int newNumerator = numerator / i;
				int newDenominator = denominator / i;
				newFraction = newNumerator + "/" + newDenominator;	
			}
		}
		System.out.println(firstFraction + " reduced is " + newFraction) ;
	}
}
