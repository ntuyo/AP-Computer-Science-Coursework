
public class NestedForLoop
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 5; j ++)
			{
				System.out.println("Outer: " + i + " Inner: " + j + " Product: " + i * j);
			}
		}
	}
	
}