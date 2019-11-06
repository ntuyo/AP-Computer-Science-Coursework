import java.util.ArrayList;
import java.util.Arrays;

/**********************************************************
 * Assignment: Reverse List Looping using recursion
 *
 * Author: Nazari Tuyo
 *
 * Description: Reverses and Array list using recursion.
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * received help from Sophia in designing and debugging my program.
 **********************************************************/

public class ReverseListLooping
{

	public static void main(String[] args)
	{
		ArrayList<String> fred = new ArrayList<String>(Arrays.asList("have still you learn to much".split(" ")));
		System.out.println(fred.toString());
		reverse(fred);
		System.out.println(fred.toString());
	}

	public static ArrayList<String> reverse(ArrayList<String> arr)
	{

		if (arr.size() <= 1)
		{
			return arr;
		}
		else
		{
			String t = arr.remove(0);
			reverse(arr);
			arr.add(t);
		}
		return arr;

	}

}
