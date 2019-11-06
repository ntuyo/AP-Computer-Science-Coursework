package karel;

//nazari tuyo

import kareltherobot.*;

public class TallHarvester extends UrRobot
{
	public TallHarvester(int street, int avenue, Direction dir, int beeps)
    {
        super(street, avenue, dir, beeps);
    }
	
	
	 public void collectBeeper()
	    { 
	    	
	    	pickBeeper();
	    	move();
	    	pickBeeper();
	    	move();
	    	pickBeeper();
	    	move();
	    	pickBeeper();
	    	move();
	    	pickBeeper();
	    }
	    
	public void turnRight()
	    {
		turnLeft();
		turnLeft();
		turnLeft();
	    }
	public void nextRowTwo()
	{
		turnLeft();
        move();
        turnLeft();
	}
	public void nextRowOne()
	{
		turnRight();
        move();
        turnRight();
	}
	           
	public static void main(String [] args)
    {
        World.readWorld("WorldFiles/fig3-3b.kwld");
        World.setVisible(true);

        TallHarvester Alex = new TallHarvester(2, 2, East, 0);
        World.setDelay(10);
        Alex.move();
        Alex.collectBeeper();
        Alex.nextRowTwo();
        Alex.collectBeeper();
        Alex.nextRowOne();
        Alex.collectBeeper();
        Alex.nextRowTwo();
        Alex.collectBeeper();
        Alex.nextRowOne();
        Alex.collectBeeper();
        Alex.nextRowTwo();
        Alex.collectBeeper();
        Alex.nextRowOne();
        Alex.collectBeeper();
        Alex.nextRowTwo();
        Alex.collectBeeper();
        Alex.nextRowOne();
        Alex.turnOff();
    }
        
        
        
   
	
}
