import java.util.Scanner;

/**********************************************************
 * Assignment: (A Row Of Boxes)
 *
 * Author: (Nazari Tuyo)
 *
 * Description: Takes in two numbers, one determines size, one determines the number of boxes. Then it prints it out.
 * 
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * did not receive help of any kind for this program. 
 * 
 **********************************************************/


public class aRowOfBoxes
{
	static Scanner console = new Scanner(System.in);
	String input = console.nextLine();
	
	public static void boxBuilder(int boxes, int size)
	{
		String equalSigns = repeatedChar('=', size);
		for(int i = 0; i < boxes; i++)
		{
		String firstRow = "o" + equalSigns;
		System.out.print(firstRow);
		}
		System.out.print("o");
		
		System.out.println();
		
		String lines = repeatedChar(' ', size);
		lines = "|" + lines;
		for(int i = 0; i < boxes; i++)
		{
			System.out.print(lines);
		}
		
		System.out.print("|");

		
		System.out.println();
		for(int i = 0; i < boxes; i++)
		{
		String firstRow = "o" + equalSigns;
		System.out.print(firstRow);
		}
		System.out.print("o");
	}
	public static String repeatedChar(char c, int length)
	{
		String result = "";
		for(int i = 0; i < length; i++)
		{
			result = result + c;
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		System.out.print("How many boxes? ");
		int boxes = console.nextInt();
		System.out.print("What size? ");
		int size = console.nextInt();
		boxBuilder(boxes, size);
		
		
		
		
	}

}
