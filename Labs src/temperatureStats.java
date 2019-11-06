import java.util.Scanner;

public class temperatureStats 
{
	
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) 
	{
		
		int sumOfTemperatures = 0;
		System.out.print("Type the number of days:");
		int days = console.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int averageTemp = 0;
		
		for (int i = 1; i <= days; i++)
		{
		System.out.print("Please enter the temperature:");
		int num = console.nextInt();
		sumOfTemperatures = sumOfTemperatures + num;
		averageTemp = sumOfTemperatures / days;
		if(num > max)
		{
			max = num;
		}
		
		if(num < min)
		{
			min = num;
		}
		}
		
		System.out.println("The sum of all temperatures is: " + sumOfTemperatures);
		System.out.println("The maximum is:" + max);
		System.out.println("The minimum is:" + min);
		System.out.println("The average is:" + averageTemp);
		}
		
		
	
}


