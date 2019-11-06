package karel;

import kareltherobot.*;

public class Harvester extends UrRobot
{
    public Harvester(int street, int avenue, Direction dir, int beeps)
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
    public static void main(String [] args)
    {
        World.readWorld("WorldFiles/fig3-2.kwld");
        World.setVisible(true);

        Harvester betty = new Harvester(2, 2, East, 0);
        World.setDelay(20);

        //
        // Add calls to methods that represent your plan for solving the problem
        //
        betty.move();
        betty.collectBeeper(); 
        betty.turnLeft();
        betty.move();
        betty.turnLeft();
        betty.collectBeeper();
        betty.move();
        betty.turnRight();
        betty.move();
        betty.turnRight();
        betty.move();
        betty.collectBeeper();
        betty.move();
        betty.turnLeft();
        betty.move();
        betty.turnLeft();
        betty.move();
        betty.collectBeeper();
        betty.turnRight();
        betty.move();
        betty.turnRight();
        betty.collectBeeper();
        betty.turnLeft();
        betty.move();
        betty.turnLeft();
        betty.collectBeeper();
        betty.turnOff();
        
    }
}