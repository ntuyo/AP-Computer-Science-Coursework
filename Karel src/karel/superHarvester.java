package karel;

import kareltherobot.*;

public class superHarvester extends CleverRobot {
	public superHarvester(int street, int avenue, Direction dir, int beeps) {
		super(street, avenue, dir, beeps);
	}
	// PreCondition: Robot is on street.
	// Post-Condition: Robot has collected all beepers and beeper piles.
	public void collectBeeper()
	{
		boolean continueCollecting = true;
		
		
		while(continueCollecting)
		{
			pickBeeperPile();
			move();
			while(nextToABeeper()) {
				pickBeeperPile();
				move();
				
			}
			nextRow();
			
			while(nextToABeeper()) {
				pickBeeperPile();
				move();
				
			} 
			pickBeeperPile();
			nextRowTwo();
			
			if(!nextToABeeper())
			{
				continueCollecting = false;
			}
				
		}
		
	}
	// PreCondition: Robot is in street facing East
	// Post-Condition: Robot is on street above facing West.
	public void nextRow() {
		turnLeft();
		move();
		turnLeft();
		move();
	}
	// PreCondition: Robot is in street facing West
	// Post-Condition: Robot is on street above facing East.
	public void nextRowTwo() {
		turnRight();
		move();
		turnRight();
		move();
	}

	public static void main(String[] args) {
		SuperField.loadRandomWorld();
		World.setVisible(true);

		superHarvester betty = new superHarvester(2, 2, East, 0);
		World.setDelay(1);

		betty.move();
		betty.collectBeeper();
		betty.turnOff();
	}
}


