package fracCalc3;

import java.util.Scanner;

public class FractionalCalculator
{
	public static boolean hasUnderscore(String argument)
	{
		if (argument.contains("_"))
		{
			return true;
		} else
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

			if (input.contains("-"))
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
			} else
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

		if (input.contains("/"))
		{

			return input;
		} else
		{
			return input + "/1";
		}

	}

	public static String calculate(String leftOperand, String operator, String rightOperand)
	{
		String fraction = "";
		
		
		int leftOperandLastChar = leftOperand.length();
		int rightOperandLastChar = rightOperand.length();
		int leftSlash = leftOperand.indexOf("/");
		int rightSlash = rightOperand.indexOf("/");

		int leftNumerator = Integer.parseInt(leftOperand.substring(0, leftSlash));
		int rightNumerator = Integer.parseInt(rightOperand.substring(0, rightSlash));
		int leftDenominator = Integer.parseInt(leftOperand.substring(leftSlash + 1, leftOperandLastChar));
		int rightDenominator = Integer.parseInt(rightOperand.substring(rightSlash + 1 , rightOperandLastChar));

		int fractionNumerator = 0;
		int fractionDenominator = 0;

		// Math

		int newLeftNumerator = leftNumerator * rightDenominator;
		int newRightNumerator = rightNumerator * leftDenominator;
		int newLeftDenominator = leftDenominator * rightDenominator;
		int newRightDenominator = rightDenominator * leftDenominator;


		if (operator.equals("-"))
		{
			if (leftDenominator == rightDenominator)
			{
				fractionNumerator = leftNumerator - rightNumerator;
				fractionDenominator = leftDenominator;
			} else
			{
				fractionNumerator = newLeftNumerator - newRightNumerator;
				fractionDenominator = newLeftDenominator;
			}

		}
		if (operator.equals("+"))
		{
			if (leftDenominator == rightDenominator)
			{
				fractionNumerator = leftNumerator + rightNumerator;
				fractionDenominator = leftDenominator;

			} else
			{
				fractionNumerator = newLeftNumerator + newRightNumerator;
				fractionDenominator = newLeftDenominator;

			}
		}
		if (operator.equals("/"))
		{
			
				fractionNumerator = leftNumerator * rightDenominator;
				fractionDenominator = leftDenominator * rightNumerator;
		}
		
		if (operator.equals("*"))
		{
			if (leftOperand.equals("0/1") || rightOperand.equals("0/1"))
			{
				fraction = "0";
			}
			else
				{
					fractionNumerator = leftNumerator * rightNumerator;
					fractionDenominator = leftDenominator * rightDenominator;
					
					if(fractionNumerator % fractionDenominator == 0)
					{
						fraction = "" + (fractionNumerator/ fractionDenominator);
					}
					else
					{
					fraction = fractionNumerator + "/" + fractionDenominator;
					}
				} 
		}
		else
		{
			if(fractionNumerator % fractionDenominator == 0)
			{
				fraction = "" + (fractionNumerator/ fractionDenominator);
			}
			else
			{
			fraction = fractionNumerator + "/" + fractionDenominator;
			}
		}
		
		return fraction;
		
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
			String operator = (expression.substring(space, space + 2)).trim(); // the character in between the space
			String rightOperand = (expression.substring(expression.indexOf(operator) + 1, lastChar)).trim(); // everything
																												// after
																												// the
																												// //
																												// space
			rightOperand = convertToFraction(rightOperand);
			leftOperand = convertToFraction(leftOperand);

			String answer = calculate(leftOperand, operator, rightOperand);
			System.out.println(answer);

			System.out.print("Enter an expression (or \"quit\"): ");
			expression = console.nextLine();

		}

		System.out.println("Goodbye!");

	}

}
