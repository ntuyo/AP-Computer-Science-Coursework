/**********************************************************
 * Assignment: (Frac Calc Extra Credit)
 *
 * Author: (Nazari Tuyo)
 *
 * Description: The extra credit part to the fraction calculator. Prints error messages when a user enters an invalid string.
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * did not receive help of any kind for this program. 
 * 
 **********************************************************/

package fracCalcExtraCredit;

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

		if (input.contains("/"))
		{

			return input;
		}
		else
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
		int rightDenominator = Integer.parseInt(rightOperand.substring(rightSlash + 1, rightOperandLastChar));

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
			}
			else
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

			}
			else
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

				if (fractionNumerator % fractionDenominator == 0)
				{
					fraction = "" + (fractionNumerator / fractionDenominator);
				}
				else
				{
					fraction = fractionNumerator + "/" + fractionDenominator;
				}
			}
		}
		else
		{
			if (fractionNumerator % fractionDenominator == 0)
			{
				fraction = "" + (fractionNumerator / fractionDenominator);
			}
			else
			{
				fraction = fractionNumerator + "/" + fractionDenominator;
			}
		}

		return fraction;

	}

	public static String convertToMixed(String reduced)
	{
		int lastChar = reduced.length();
		int slash = reduced.indexOf("/");
		String mixedNumber = "";

		if (slash == -1)
		{
			mixedNumber = reduced;
		}
		else
		{

			if (!reduced.contains("-"))
			{
				int answerNumerator = Integer.parseInt(reduced.substring(0, slash));
				int answerDenominator = Integer.parseInt(reduced.substring(slash + 1, lastChar));

				if (answerNumerator % answerDenominator == 0)
				{
					mixedNumber = answerNumerator / answerDenominator + "";
				}
				else
				{
					int remainder = answerNumerator % answerDenominator;
					int wholeNumber = (answerNumerator - remainder) / answerDenominator;
					if (wholeNumber == 0)
					{
						mixedNumber = remainder + "/" + answerDenominator;
					}
					else
					{
						mixedNumber = wholeNumber + "_" + remainder + "/" + answerDenominator;
					}
				}
			}

		}
		if (reduced.contains("-"))
		{

			int answerNumerator = Integer.parseInt(reduced.substring(1, slash));
			int answerDenominator = Integer.parseInt(reduced.substring(slash + 1, lastChar));

			if (answerNumerator % answerDenominator == 0)
			{
				mixedNumber = "-" + answerNumerator / answerDenominator + " ";
			}
			else
			{
				int remainder = answerNumerator % answerDenominator;
				int wholeNumber = (answerNumerator - remainder) / answerDenominator;

				if (wholeNumber == 0)
				{
					mixedNumber = remainder + "/" + answerDenominator;
				}
				else
				{
					mixedNumber = "-" + wholeNumber + "_" + remainder + "/" + answerDenominator;
				}
			}
		}
		return mixedNumber;
	}

	public static String reduce(String answer)
	{
		int lastChar = answer.length();
		int slash = answer.indexOf("/");

		String reduced = "";
		int greatestSoFar = 0;

		if (slash == -1)
		{
			reduced = answer;
		}
		else
		{
			if (answer.startsWith("0/"))
			{
				reduced = "0/";
			}
			
			else
			{
				if (answer.contains("-"))
				{
					int answerNumerator = Integer.parseInt(answer.substring(1, slash));
					int answerDenominator = Integer.parseInt(answer.substring(slash + 1, lastChar));

					for (int i = 1; i <= answerNumerator; i++)
					{
						if (answerNumerator % i == 0 && answerDenominator % i == 0)
						{
							greatestSoFar = i;
						}
					}
					answerNumerator = answerNumerator / greatestSoFar;
					answerDenominator = answerDenominator / greatestSoFar;

					reduced = "-" + answerNumerator + "/" + answerDenominator;
				}
				else
				{
					int answerNumerator = Integer.parseInt(answer.substring(0, slash));
					int answerDenominator = Integer.parseInt(answer.substring(slash + 1, lastChar));

					for (int i = 1; i <= answerNumerator; i++)
					{
						if (answerNumerator % i == 0 && answerDenominator % i == 0)
						{
							greatestSoFar = i;
						}
					}
					answerNumerator = answerNumerator / greatestSoFar;
					answerDenominator = answerDenominator / greatestSoFar;

					reduced = answerNumerator + "/" + answerDenominator;
				}
			}
		}

		return reduced;
	}

	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to the Fraction Calculator!");

		System.out.print("Enter an expression (or \"quit\"): ");
		String expression = console.nextLine();
		
		
		while (!expression.equals("quit"))
		{
			if(expression.matches(".*[a-z].*")) 
			{
				System.out.println("Sorry, but that expression is invalid. Try again.");
				System.out.print("Enter an expression (or \"quit\"): ");
				expression = console.nextLine();
			}
			else
			{
				int lastChar = expression.length();
				int space = expression.indexOf(" ");
				String leftOperand = (expression.substring(0, space)); // everything before the space
				String operator = (expression.substring(space, space + 2)).trim(); // the character in between the space
				String rightOperand = (expression.substring(expression.indexOf(operator) + 1, lastChar)).trim(); 
				rightOperand = convertToFraction(rightOperand);
				leftOperand = convertToFraction(leftOperand);
				String answer = calculate(leftOperand, operator, rightOperand);
				String reducedAnswer = reduce(answer);
				String simplifiedMixedAnswer = convertToMixed(reducedAnswer);
				System.out.println(simplifiedMixedAnswer);
				System.out.print("Enter an expression (or \"quit\"): ");
				expression = console.nextLine();
			}
			

		}

		System.out.println("Goodbye!");

	}

}
