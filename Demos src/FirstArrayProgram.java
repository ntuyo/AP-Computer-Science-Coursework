
public class FirstArrayProgram
{
	public static void main(String[] args)
	{
		int[] bunchOfInts = new int[30];

		for (int i = 0; i < bunchOfInts.length; i++)
		{
			bunchOfInts[i] = 10;
		}

		for (int i = 1; i < bunchOfInts.length; i++)
		{
			bunchOfInts[i] = bunchOfInts[i] + bunchOfInts[i - 1];
		}

		for (int i = 0; i < bunchOfInts.length; i++)
		{
			System.out.print(bunchOfInts[i] + " ");
		}

	}
}