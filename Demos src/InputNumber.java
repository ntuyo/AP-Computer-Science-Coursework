import java.util.Scanner;

public class InputNumber
{

	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = console.nextLine();
		System.out.println("That word has " + word.length() + " characters.");
		
		System.out.print("Enter a number: ");
		int number = console.nextInt();
		System.out.println("Twice that number is " + number * 2);
	}

}
