package karel;

import kareltherobot.*;

public class ThreeC extends UrRobot
{
    public ThreeC(int street, int avenue, Direction dir, int beeps)
    {
        super(street, avenue, dir, beeps);
    }
    
    public void placeBeeper()
    {
    	putBeeper();
    move();
   
    }
    public void turnRight()
   	{
   		turnLeft();
   		turnLeft();
   		turnLeft();
   	}
    
    public static void main(String [] args)
    {
    	World.readWorld("WorldFiles/fig3-8.kwld");
    	
    	World.setVisible(true);

        ThreeC betty = new ThreeC(2, 2, South, 0);
        World.setDelay(5);

        //
        // Add calls to methods that represent your plan for solving the problem
        //
        betty.turnLeft();
        betty.move();
        betty.move();
        betty.move();
        betty.placeBeeper();
        betty.turnLeft();
        betty.placeBeeper();
        betty.placeBeeper();
        
        
        
     
    }
}