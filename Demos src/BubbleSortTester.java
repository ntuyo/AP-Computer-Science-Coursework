

import java.util.Arrays;

// allows you to write a selection sort and verify that it works
public class BubbleSortTester 
{
	// keeps track of the approximate number of operations it takes to
	// do a selection sort
	private static int operations = 0;
	
	// sorts numbers using the selection sort algorithm
	private static void bubbleSort(int[] numbers)
	{
		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 0; j < numbers.length - i - 1; j++)
			{
				operations++;
				if (numbers[j] > numbers[j+1])
				{
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
	}
	
	// creates an unsorted array and sorts it using your selection sort method
	// and the Arrays.sort method, then compares the result to see if you got
	// your selection sort correct. You don't need to modify anything from
	// here down, though you can feel free to look at it.
	public static void main(String[] args) 
	{
		// if you want a bigger or smaller array for testing, you can change the parameters
		// to createRandomNumberArray. The first parameter is how many elements go into
		// the array.
		int[] yourNumbers = createRandomNumberArray(10, 0, 100);
		int[] myNumbers = Arrays.copyOf(yourNumbers, yourNumbers.length);
		
		System.out.println("Array to be sorted: " + Arrays.toString(yourNumbers));
		System.out.println();

		bubbleSort(yourNumbers);
		Arrays.sort(myNumbers);
		
		System.out.println("Your sorted array:  " + Arrays.toString(yourNumbers));
		System.out.println("My sorted array:    " + Arrays.toString(myNumbers));
		System.out.println();
		System.out.println("Your sort took about " + operations + " operations.");
		System.out.println();

		verifySorting(yourNumbers, myNumbers);
	}

	// creates an array with random numbers in it
	private static int[] createRandomNumberArray(int size, int minValue, int maxValue)
	{
		int[] result = new int[size];
		for (int i = 0; i < size; i++)
			result[i] = (int)(Math.random() * (maxValue - minValue)) + minValue;
		
		return result;
	}
	
	// checks to see that two arrays line up and prints the result
	private static void verifySorting(int[] yours, int[] mine)
	{
		boolean foundError = false;
		for (int i = 0; i < yours.length; i++)
		{
			if (yours[i] != mine[i])
			{
				System.out.println("Your array is not sorted correctly. The element at index " + i + " is wrong.");
				foundError = true;
				break;
			}
		}
		
		if (!foundError)
			System.out.println("Good job! The sorted arrays match.");
	}
}
