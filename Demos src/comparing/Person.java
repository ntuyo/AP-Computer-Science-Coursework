package comparing;

public class Person implements Comparable<Person>
{
	private String name;
	private int age;
	
	public Person(String n, int a)
	{
		name = n;
		age = a;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String toString()
	{
		return name + " the " + age + " year-old";
	}

	@Override
	public int compareTo(Person other)
	{
		return age - other.age;
	}
}
