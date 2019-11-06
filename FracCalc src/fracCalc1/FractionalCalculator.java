package fracCalc1;

import java.util.Scanner;
public class FractionalCalculator
{
	
	
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to the Fraction Calculator!");
		// 
		System.out.print("Enter an expression (or \"quit\"):");
		String expression = console.nextLine();
		int lastChar = expression.length() - 1 ;
		int space = expression.indexOf(" ");
		String leftOperand = ("Left operand: " + expression.substring(0 , space)); // everything before the space
		String operator = ("Operator:" + expression.substring(space , space + 2 )); // the character in between the space
		String rightOperand =  ("Right operand:" + expression.substring(space + 2, lastChar + 1));  //everything after the space
		System.out.println(leftOperand);
		System.out.println(operator);
		System.out.println(rightOperand);
		System.out.println("Goodbye!");
	
		

		

	}

}

