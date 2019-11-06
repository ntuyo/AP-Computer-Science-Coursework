/**********************************************************
	 * Assignment: (Array List Example)
	 *
	 * Author: (Nazari Tuyo)
	 *
	 * Description: Changes the values in a list without moving the lines of code around.
	 * 
	 * Academic Integrity: I pledge that this program represents my own work. I
	 * did not receive help of any kind for this program. 
	 * 
	 **********************************************************/


import java.util.ArrayList;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        ArrayList<String> motto = new ArrayList<String>();
        motto.add("Diversity");
        motto.add("Opportunity");
        motto.add("Respect");
        
        motto.add(0, motto.remove(1)); 
        System.out.println(motto);
        
        // add lines of code to fix the motto without
        // changing the original add statements

    }
}