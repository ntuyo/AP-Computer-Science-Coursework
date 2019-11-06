package karel;

import kareltherobot.*;

public class Gardener extends UrRobot
{
    public Gardener(int street, int avenue, Direction dir, int beeps)
    {
        super(street, avenue, dir, beeps);
    }
    
	public static void main(String[] args)
	{
		// World file (leave out the readWorld line if you just want a blank world)
	 	World.readWorld("WorldFiles/fig3-8.kwld");
		World.setVisible(true);
		World.setDelay(5);
		UrRobot betty = new UrRobot(2,2,South, 28);
		betty.turnLeft();
        betty.move();
        betty.move();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.turnLeft();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.turnLeft();
        betty.turnLeft();
        betty.turnLeft();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.turnLeft();
        betty.move();
        betty.putBeeper();
        betty.turnLeft();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.turnLeft();
        betty.turnLeft();
        betty.turnLeft();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.turnLeft();
        betty.move();
        betty.putBeeper();
        betty.turnLeft();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.turnLeft();
        betty.turnLeft();
        betty.turnLeft();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.turnLeft();
        betty.move();
        betty.putBeeper();
        betty.turnLeft();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.turnLeft();
        betty.turnLeft();
        betty.turnLeft();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.putBeeper();
        betty.move();
        betty.turnLeft();
        betty.turnLeft();
        betty.turnLeft();
        betty.move();
        betty.move();
        betty.move();
        betty.turnLeft();
        betty.turnOff();
        
       
        
	}
}