package karel;

import karel.CleverRobot;
import karel.MakeHurdles;
import kareltherobot.*;

public class Hurdles extends CleverRobot {
	public Hurdles(int street, int avenue, Direction dir, int beeps) {
		super(street, avenue, dir, beeps);
	}
	public void fullCircle()
	{
		if(frontIsClear())
		{
			move();
			nextToWall();
		}
		else
		{
			turnLeft();
			if(frontIsClear())
			{
				move();
				nextToWall();
			}
			else
			{
				turnLeft();
				if(frontIsClear())
				{
					move();
					nextToWall();
				}
			}
		}
		
	}
	
	public void nextToWall()
	{
		boolean nextToAWall = true;
		while (nextToAWall)
		{
			if(frontIsClear())
			{
				turnRight(); 
				if(frontIsClear())
				{
					nextToAWall = false;
					
				}
				else
				{
					nextToAWall = true;
					turnRight();
					turnRight();
					turnRight();
					move();
				
					
				}
			}
			else
			{
				nextToAWall = true;
				
			}
		}
	}
	public void lookForBeeper() 
	{
		boolean beeperNotFound = true;

		goToWall();
		while (beeperNotFound) 
		{
 
			if(frontIsClear())
			{
				move();
				if(!frontIsClear())
				{
					turnLeft();
					fullCircle();
				}
				
			 }
				
			else 
			{
				turnLeft();
				fullCircle();
			}
			if(nextToABeeper())
			{
				pickBeeper();
				beeperNotFound = false;
			}
				
		}

	}
	

	public static void main(String[] args) 
	{
		MakeHurdles.loadRandomWorld();
		World.setVisible(true);

		Hurdles betty = new Hurdles(1, 1, East, 0);
		World.setDelay(3);

		//
		// Add calls to methods that represent your plan for solving the problem

		betty.lookForBeeper();
		

	}
}