
public class GreatestCommonFactor
{
	// finds and returns the greatest common factor
	// between num1 and num2
	public static int gcf(int num1, int num2)
	{
		int greatestSoFar;

		for (int i = 1; i <= num1; i++)
		{
			if (num1 % i == 0 && ?????????????)
			{
			    greatestSoFar = ??;
			}
		}
		return greatestSoFar;
	}

	public static void main(String[] args)
	{
		int num1 = 24;
		int num2 = 54;
		int answer;

		System.out.print("The greatest common factor between " + num1 + " and " + num2 + " is ");
		answer = gcf(num1, num2);
		
		System.out.println(answer);
	}

}
