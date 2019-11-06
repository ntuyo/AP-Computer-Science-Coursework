package BinarySearch;
/**********************************************************
 * Assignment:(Binary Search Tester) resubmitted
 *
 * Author: Nazari Tuyo
 *
 * Description: Searches an array for a specific number. Complexity in big o notation is O(log n). Binary search takes 
 * logarithmically less time to run as the inputs size gets larger.
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * received help from Mr. McGlathery and collaborated with permission with Sophia Mrwoka in designing and debugging
 * my program.
 **********************************************************/
/* TODO: Insert a comment here with the names of the driver and navigator, and a  
 * paragraph explaining the complexity of binary search (what it is using big-O
 * notation, and why it is whatever it is). A good explanation in your own words
 * is 1/3 of your grade for this lab.
 */

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester
{
	// you'll increment this inside your binarySearch method every time you compare
	// something with one of the values in your array.
	private static int comparisons = 0;

	// use the binary search algorithm to find the value target in the array
	// numbers, and return its index. Return -1 if target isn't in the array.
	public static int binarySearch(int target, int[] numbers)
	{
		// TODO: delete the line below and write the code to use
		// a binary search to find the target in numbers and return
		// its index. Be sure to also increment comparisons each
		// time you compare something with an element in numbers.
		int left = 0;
		int right = numbers.length - 1;
		int mid = (left + right) / 2;
		while (left <= right && numbers[mid] != target)
		{
			if (target < numbers[mid])
			{
				right = mid - 1;
			}
			else
			{
				left = mid + 1;
			}
			mid = (left + right) / 2;
		}
		if (numbers[mid] == target)
		{
			return mid;
		}
		if (left == mid)
		{
			if (numbers[mid] == target)
			{
				return mid;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			return -1;
		}

	}

	// main method will test your binary search code. you don't need to change
	// anything
	// here or below, but feel free to look through the code below to see what it
	// does
	// if you're curious.
	public static void main(String[] args)
	{
		int n = 75;
		int limit = 100;
		int[] numbers = createSortedArray(n, limit);

		Scanner scanner = new Scanner(System.in);
		System.out.print("What number (between 1 and " + limit + ") would you like to find? ");
		int target = scanner.nextInt();

		int yourLocation = binarySearch(target, numbers);
		int myLocation = sequentialSearch(target, numbers);

		if (yourLocation == myLocation)
		{
			System.out.println("We both returned " + yourLocation + " as the location. Good job!");
			System.out.println("It took you " + comparisons + " comparisons to figure out if " + target
					+ " is in a list of " + n + " numbers.");
		}
		else
		{
			System.out.println("You said the index was " + yourLocation + ", but I found " + target + " at index "
					+ myLocation + ". Keep trying.");
		}
	}

	// this sequential search algorithm is used to verify your result.
	private static int sequentialSearch(int target, int[] numbers)
	{
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] == target)
				return i;
		}

		return -1;
	}

	// this utility method creates a sorted array with size elements in it, between
	// 1 and
	// limit, inclusive.
	private static int[] createSortedArray(int size, int limit)
	{
		// we don't want any repeats in the array (so the results from the sequential
		// and binary searches are consistent), so the size has to be less than or equal
		// to the limit.
		if (size > limit)
			throw new InvalidParameterException("The size of the array needs to be at least as large as the limit.");

		int[] result = new int[size];

		ArrayList<Integer> values = new ArrayList<Integer>();
		for (int i = 1; i <= limit; i++)
			values.add(i);

		for (int i = 0; i < size; i++)
		{
			int index = (int) (Math.random() * values.size());
			result[i] = values.get(index);
			values.remove(index);
		}

		Arrays.sort(result);
		return result;
	}
}