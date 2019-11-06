package karel;

import kareltherobot.*;

public class ThreeB extends UrRobot
{
    public ThreeB(int street, int avenue, Direction dir, int beeps)
    {
        super(street, avenue, dir, beeps);
    }
    public void turnRight()
	{
		turnLeft();
		turnLeft();
		turnLeft();
	}
	    
	    
	public static void main(String[] args)
	{
		// World file (leave out the readWorld line if you just want a blank world)
		
		World.setVisible(true);
		
		UrRobot karel = new UrRobot(2,5,North, 10);
		karel.putBeeper();
		karel.turnRight();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.turnRight();
		karel.move();
		karel.putBeeper();
		karel.turnRight();
		karel.move();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.move();
		karel.putBeeper();
		karel.turnRight();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnRight();
		karel.turnOff();		
	}
}