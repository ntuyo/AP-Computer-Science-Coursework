package Pets;
public class Dog
{
	private String name;
	
	public Dog(String n)
	{
		name = n;
	}
	
	public String speak()
	{
		return "Ruff!";
	}
	
	public String toString()
	{
		return name + " the dog";
	}

}