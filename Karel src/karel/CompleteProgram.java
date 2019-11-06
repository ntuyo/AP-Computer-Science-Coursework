package karel;

import kareltherobot.*;

public class CompleteProgram extends UrRobot
{
    public CompleteProgram(int street, int avenue, Direction dir, int beeps)
    {
        super(street, avenue, dir, beeps);
    }

    public void turnRight()
	{
		turnLeft();
		turnLeft();
		turnLeft();
	}
	public void placeBeeper()
	{
		move();
		putBeeper();
		
	}
   
	public static void main(String[] args)
	{
		// World file (leave out the readWorld line if you just want a blank world)
		
		World.setVisible(true);
		
		UrRobot karel = new UrRobot(2,2,South, 28);
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnOff();
	}
		
}
