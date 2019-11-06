
public class PointMain
{

	public static void main(String[] args)
	{
		Point p1 = new Point(3, 5);
		Point p2 = new Point(7, 20);
		p1.translate(4, 1);
		p2.invert();
		Point p3 = new Point(0, 0);
	//	p3.x = p1.x * 2;
		p3.setX(p1.getX() * 2);
		p3.y = p1.y * 2;
		int mandist = p2.manhattanDistance(p3);
		System.out.println("p1 is at " + p1);
		System.out.println("p2 is at " + p2);
		System.out.println("p3 is at " + p3);
		System.out.println("The \"Manhattan Distance\" between the p2 and p3 is " + mandist);
	}

}
