package guiDemos;

import javax.swing.*;

public class BetterWorld extends JFrame
{
	public static void main(String[] args)
	{
		BetterWorld bw = new BetterWorld();
		bw.display();
	}
	
	public BetterWorld()
	{
		setTitle("The World");
		setSize(300, 300);
		JLabel label = new JLabel("A better world", SwingConstants.CENTER);
		add(label);
		JLabel label2 = new JLabel("An even better world", SwingConstants.CENTER);
		add(label2);
	}
	
	public void display()
	{
		setVisible(true);
	}
}