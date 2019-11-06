import java.util.Scanner;

public class LoopFun
{

	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		String output = "";
		System.out.print("Enter a letter: ");
		String letter = console.nextLine();
		while (!letter.equals("done"));
		{
			output = output + letter;
			System.out.print("Enter a letter: ");
			letter = console.nextLine();
		}
		System.out.println(output);
	}

}
