
public class Point
{
	private int x;
	private int y;

	public Point(int initialX, int initialY)
	{
		x = initialX;
		y = initialY;
	}

	public int getX()
	{
		return x;
	}
	
	public void setX(int newX)
	{
		x = newX;
	}
	
	public void translate(int dx, int dy)
	{
		x += dx;
		y += dy;
	}

	public void invert()
	{
		int temp = x;
		x = y;
		y = temp;
	}
	
	public int manhattanDistance(Point other)
	{
		int xdist = Math.abs(x - other.x);
		int ydist = Math.abs(y - other.y);
		return xdist + ydist;
	}

	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
}