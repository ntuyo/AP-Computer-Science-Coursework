package guiDemos;
/**********************************************************
 * Assignment: (Button that changes it's name)
 *
 * Author: Nazari Tuyo
 *
 * Description: (Gives a random inspirtational after button is clicked)
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * received help from Mr.McG in designing and debugging
 * my program.
 **********************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActiveButtonTwo extends JFrame implements ActionListener
{
	private JButton button;
	
	public static void main(String[] args)
	{
		ActiveButtonTwo ab = new ActiveButtonTwo();
		ab.display();
	}
	
	public ActiveButtonTwo()
	{
		
		button = new JButton("CLICK HERE FOR A INSPIRATIONAL QUOTE");
		button.addActionListener(this);
		
		add(button);
		
		setTitle("Inspirational Quotes");
		setSize(400, 200);
	}
	
	public void display()
	{
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String[] respond = {"Don't let yesterday take up too much of today.",
				"You learn more from failure than from success.", 
				"“In the middle of every difficulty lies opportunity.”", 
				"It is not the mountain we conquer but ourselves", 
				"If you don’t like the road you’re walking, start paving another one.”"};
		if(e.getActionCommand().equals("CLICK HERE FOR A INSPIRATIONAL QUOTE"))
		{
			button.setText(respond[(int) (Math.random() * respond.length)] + "");	
		}
		else
		{
			button.setText("CLICK HERE FOR A INSPIRATIONAL QUOTE");
		}
	}
}
