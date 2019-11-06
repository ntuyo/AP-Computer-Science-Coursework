import java.util.ArrayList;
import java.util.Arrays;

/**********************************************************
 * Assignment: Reverse List Looping using a for loop
 *
 * Author: Nazari Tuyo
 *
 * Description: Reverses and Array list using a for loop.
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * received help from Sophia in designing and debugging my program.
 **********************************************************/

public class ReverseListLoopingTwo
{

	public static void main(String[] args)
	{
		ArrayList<String> fred = new ArrayList<String>(Arrays.asList("have still you learn to much".split(" ")));
		System.out.println(fred.toString());
		reverse(fred);
		System.out.println(fred.toString());
	}

	public static void reverse(ArrayList<String> arr)
	{
		for (int i = 0; i < arr.size(); i++)
		{
			String temp = arr.get(i);
			arr.remove(i);
			arr.add(0, temp);
		}
	}

}
