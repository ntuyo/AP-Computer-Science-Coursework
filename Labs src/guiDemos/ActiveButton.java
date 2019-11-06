package guiDemos;

/**********************************************************
 * Assignment: (Button that changes it's name)
 *
 * Author: Nazari Tuyo
 *
 * Description: (Gives a random answer after button is clicked)
 *
 * Academic Integrity: I pledge that this program represents my own work. I
 * received help from [] in designing and debugging
 * my program.
 **********************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActiveButton extends JFrame implements ActionListener
{
	private JButton button;

	public static void main(String[] args)
	{
		ActiveButton ab = new ActiveButton();
		ab.display();
	}

	public ActiveButton()
	{

		JPanel bottom = new JPanel();

		JButton button = new JButton("Click Here");
		
		button.addActionListener(this);
		bottom.add(button, BorderLayout.CENTER);

		add(bottom, BorderLayout.CENTER);
		
		setTitle("ActiveButton");
		setSize(400, 400);
	}

	public void display()
	{
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String[] respond = { "Try something new today", "Don't let yesterday take up too much of today.",
				"You learn more from failure than from success.",
				"People Who Are Crazy Enough To Think They Can Change The World, Are The Ones Who Do.",
				"If You Are Working On Something That You Really Care About, You Don’t Have To Be Pushed. The Vision Pulls You." };
		if (e.getActionCommand().equals("cl1ck m3"))
			button.setText(respond[(int) (Math.random() * respond.length)] + "");

		else
			button.setText("Why didn't you click a button?");
	}
}
