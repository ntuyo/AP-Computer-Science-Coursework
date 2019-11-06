

import Pets.Dog;

public class LoudDog extends Dog 
{
	public LoudDog(String name)
	{
		super(name);
	}
	
	public String speak()
	{
		return super.speak() + " " + super.speak();
	}
	
	//////////////////////////////////////////
	public static void main(String[] args)
	{
		LoudDog d = new LoudDog("Bowser");
		System.out.println(d + " says " + d.speak());
	}
}