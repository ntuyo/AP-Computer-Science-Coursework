import java.util.Scanner;

public class Accumulate
{

	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Sum up to what number? ");
		int countTo = console.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= countTo; i++)
		{
			sum = sum + i;
		}
		
		System.out.println("The sum is: " + sum);
	}

}
