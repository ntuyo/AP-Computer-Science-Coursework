import java.util.Arrays;

public class PrintingAnArray
{

	public static void main(String[] args)
	{
		int[] numbers = {2,3,4, 5, 6,7,8,9, 10, 11}; // bad style
		
		// Two attempts to print this array
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
	}

}
