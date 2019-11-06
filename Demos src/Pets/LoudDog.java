package Pets;
public class LoudDog extends Dog
{	
	public LoudDog(String n)
	{
		super(n);
	}
	
	public String speak()
	{
		return super.speak() + " " + super.speak();
	}
	
	public static void main(String[] args)
	{
		LoudDog ralph = new LoudDog("Ralph");
		System.out.println(ralph + " says " + ralph.speak());
	}
}