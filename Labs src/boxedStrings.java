	/**********************************************************
	 * Assignment: Boxed Strings
	 *
	 * Author: Nazari Tuyo
	 *
	 * Description: User enters a string, and the program returns a string with "boxes" around it.
	 *
	 * Academic Integrity: I pledge that this program represents my own work. I
	 * received help from my father, (Mike Tuyo) in designing and debugging
	 * my program.
	 **********************************************************/

import java.util.Scanner;

public class boxedStrings
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter a string (or \"quit\"):");
		String text = console.nextLine();
		while (!text.equals("quit"))
		{
			int outside = text.length();

			String fence = ("|");
			String topOfFence = ("--");
			int numOfDashes = 3 * outside;

			System.out.println();
			System.out.print("-");
			for (int i = 0; i < outside; i++)
			{
				System.out.print(topOfFence);
			}
			System.out.println();
			System.out.print("|");
			for (int i = 0; i < outside; i++)
			{
				System.out.print((text.charAt(i)) + ("|"));
			}
			System.out.println();
			System.out.print("-");
			for (int i = 0; i < outside; i++)
			{
				System.out.print(topOfFence);
			}
			System.out.println();
			System.out.print("Enter a string (or \"quit\"):");
			text = console.nextLine();

		}
		System.out.println("Goodbye");

	}
}
