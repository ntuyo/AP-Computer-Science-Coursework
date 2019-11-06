package fracCalc2;

import java.util.Scanner;

public class FractionalCalculator
{
	public static boolean hasUnderscore(String argument)
	{
		if (argument.contains("_"))
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	public static String convertToFraction(String input)

	{
		
		if (hasUnderscore(input) == true)
		{

			int lastChar = input.length();
			int space = input.indexOf(" ");
			int underscore = input.indexOf("_");
			int slash = input.indexOf("/");
			
			if(input.contains("-"))
			{
				int dividend = Integer.parseInt(input.substring(slash + 1, lastChar));

				int newFraction = Integer.parseInt(input.substring(1, underscore));

				int newNumerator = Integer.parseInt(input.substring(underscore + 1, slash));

				if (newFraction >= 1)
				{
					int newOperand = newFraction * dividend;
					input = "-" + (newOperand + newNumerator) + "/" + dividend;
				}

				return input;
			}
			else
			{
			int dividend = Integer.parseInt(input.substring(slash + 1, lastChar));

			int newFraction = Integer.parseInt(input.substring(0, underscore));

			int newNumerator = Integer.parseInt(input.substring(underscore + 1, slash));

			if (newFraction >= 1)
			{
				int newOperand = newFraction * dividend;
				input = newOperand + newNumerator + "/" + dividend;
			}

			return input;
			}
		}
		
		if(input.contains("/"))
		{
			
			return input;
		}
		else
		{
			return input + "/1";
		}
		
		

	}

	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to the Fraction Calculator!");
		
		System.out.print("Enter an expression (or \"quit\"): ");
		String expression = console.nextLine();

		while (!expression.equals("quit"))
		{
			int lastChar = expression.length();
			int space = expression.indexOf(" ");

			String leftOperand = (expression.substring(0, space)); // everything before the space
			String operator = (expression.substring(space, space + 2)); // the character in between the space
			String rightOperand = (expression.substring(space + 3, lastChar)); // everything after the space
			rightOperand = convertToFraction(rightOperand);
			leftOperand = convertToFraction(leftOperand);

			// String returnWholeNumFraction = ;

			System.out.println("Left operand: " + leftOperand);
			System.out.println("Operator:" + operator);
			System.out.println("Right operand: " + rightOperand);
			System.out.print("Enter an expression (or \"quit\"): ");
			expression = console.nextLine();

		}

		System.out.println("Goodbye!");

	}

}
