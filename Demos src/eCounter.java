
public class eCounter
{

	public static int eCount(String input)
	{
		int sum = 0;
		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(i) == 'e')
			{
				sum = sum + 1;
			}
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		System.out.println(eCount("hello there"));
	}

}
