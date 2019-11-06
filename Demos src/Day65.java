
public class Day65
{

	public static void main(String[] args)
	{
		printSomething("java");
	}

	private static void printSomething(String s)
	{
		if (s.length() > 0)
		{
			System.out.print(s.charAt(0));
			printSomething(s.substring(1));
			System.out.print(s.charAt(0));
		}
	}
}
