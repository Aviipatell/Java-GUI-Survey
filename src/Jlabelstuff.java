import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Jlabelstuff extends JFrame{

	public static void main(String[] args)
	{
		JLabel title = new JLabel("Want a Raise?");
		title.setForeground(Color.white);
		JFrame titlePanel = new JFrame();
		titlePanel.getContentPane().setBackground(Color.blue);
		titlePanel.add(title);  // adds to center of panel's default BorderLayout.
		titlePanel.setVisible(true);
		titlePanel.pack();
				
				
	}
	
	
}
