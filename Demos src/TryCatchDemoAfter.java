import java.util.Scanner;

public class TryCatchDemoAfter
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		try
		{
			int answer = console.nextInt();
		}
		catch (Exception e)
		{
			// "handles" the exception
			System.out.println("Looks like you didn't follow directions: " + e);
		}
		System.out.println("Thanks!");
	}

}
