/**********************************************************
 * Assignment: selection sort
 *
 * Author: Sofia Mrowka, Nazari
 *
 * Description: Orders the numbers in a list from smallest to largest
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * received help from Mr. McGlathery, and Nazari in designing and debugging
 * my program.
 * 
 * Paragraph: The complexity of the selection sort is On^2 becuase there is a for loop 
 * inside a for loop and each loop runs roughly n units of time and there for the total time
 * is n^2.
 **********************************************************/
//Sofia and Nazari
/* TODO: include a comment here with the driver/navigator names and a 
 * description (1-3 sentences) of what the complexity of selection sort
 * is and why you think so. Your paragraph should include a Big-O expression
 * for selection sort's complexity.
 */
//
import java.util.Arrays;

// allows you to write a selection sort and verify that it works
public class SelectionSortTester
{
	// keeps track of the approximate number of operations it takes to
	// do a selection sort
	private static int operations = 0;

	// sorts numbers using the selection sort algorithm
	private static void selectionSort(int[] numbers)
	{
		// TODO: write your code to sort numbers here. Remember,
		// selection sort finds the next smallest number in the array
		// and swaps it into the next available location, after the
		// part of the array that is already sorted. Be sure to
		// increment operations each time you access an array
		// element (e.g. to compare it or copy it).

		for (int i = 0; i < numbers.length - 1; i++)
		{
			int min = i;
			for (int j = i + 1; j < numbers.length; j++)
			{
				if (numbers[j] < numbers[min])
				{
					min = j;

				}
				operations ++;
			}
			
			if (min != i)
			{
				int temp = numbers[min];
				numbers[min] = numbers[i];
				numbers[i] = temp;
			}
		}
	}

	// creates an unsorted array and sorts it using your selection sort method
	// and the Arrays.sort method, then compares the result to see if you got
	// your selection sort correct. You don't need to modify anything from
	// here down, though you can feel free to look at it.
	public static void main(String[] args)
	{
		// if you want a bigger or smaller array for testing, you can change the
		// parameters
		// to createRandomNumberArray. The first parameter is how many elements go into
		// the array.
		int[] yourNumbers = createRandomNumberArray(10, 0, 100);
		int[] myNumbers = Arrays.copyOf(yourNumbers, yourNumbers.length);

		System.out.println("Array to be sorted: " + Arrays.toString(yourNumbers));
		System.out.println();

		selectionSort(yourNumbers);
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
			result[i] = (int) (Math.random() * (maxValue - minValue)) + minValue;

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