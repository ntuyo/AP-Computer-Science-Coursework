
public class ScopeErrorWithFor
{
	public static void printSquaresWithLoop()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("The square of " + i + " is: ");
			System.out.println(i * i);
		}
	}

	public static void printSquaresWithLoopOops()
	{
		for (int i = 0; i < 5; i++)
			System.out.println("The square of " + i + " is: ");
			System.out.println(i * i);
	}

	public static void main(String[] args)
	{
		printSquaresWithLoop();
	}

}
