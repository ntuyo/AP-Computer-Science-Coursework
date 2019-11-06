package comparing;

import java.util.Scanner;

public class PersonMain
{

	public static void main(String[] args)
	{
		Person fred = new Person("Fred", 20);
		Person wilma = new Person("Wilma", 21);
		
		if (fred.compareTo(wilma) > 0)
		{
			System.out.println("Fred is older than Wilma");
		}
		else
		{
			System.out.println("Fred is not older than Wilma"); // accurate?
		}
	}

}
