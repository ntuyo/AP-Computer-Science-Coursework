package karel;

import kareltherobot.*;

public class sparseHarvester extends Robot
{
    public sparseHarvester(int street, int avenue, Direction dir, int beeps)
    {
        super(street, avenue, dir, beeps);
    }
    public void collectBeeper()
    { 
    	if(nextToABeeper())
    	{
    		pickBeeper();
    	}
    	
    	{
    		move();
    	}
    }
    
    public void turnRight()
    {
    			turnLeft();
            turnLeft();
            turnLeft();

        }
    public void beeperCollectorRow()
    {
       collectBeeper(); 
       collectBeeper();
       collectBeeper();
       collectBeeper();
       collectBeeper();
       collectBeeper();
    }
    public void nextRow()
    {
        turnLeft();
        move();
        turnLeft();
    }
    public void nextRowTwo()
    {
        turnRight();
        move();
        turnRight();
    }
    
    public static void main(String [] args)
    {
    	SparseWorld.loadRandomWorld();
    	World.setVisible(true);

        sparseHarvester betty = new sparseHarvester(2, 2, East, 0);
        World.setDelay(5);

        //
        // Add calls to methods that represent your plan for solving the problem
        //
        betty.beeperCollectorRow();
        betty.nextRow();
        betty.beeperCollectorRow();
        betty.nextRowTwo();
        betty.beeperCollectorRow();
        betty.nextRow();
        betty.beeperCollectorRow();
        betty.nextRowTwo();
        betty.beeperCollectorRow();
        betty.nextRow();
        betty.beeperCollectorRow();
        betty.nextRowTwo();
     
    }
}
