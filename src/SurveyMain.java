import java.io.File;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SurveyMain extends JFrame implements ActionListener{

	public SurveyMain()
	{
		super("Welcome to our Survey!");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		JButton cont = new JButton("Continue");
		cont.addActionListener(this);
		add(cont);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		String cmd = event.getActionCommand();
		if (cmd.equals("Continue"))
		{
			//Set Authentication Class to Equal True
		}
	}
	
	public static void main(String[] args)
	{
		SurveyMain sMain = new SurveyMain();
	}
	
	
}
