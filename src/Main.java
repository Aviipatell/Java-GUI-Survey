import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Main extends JFrame implements ActionListener, KeyListener, MouseListener, ItemListener {

	public Main(String name)
	{
		if (name.equals("Welcome"))
		{
			setTitle(name);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLookAndFeel();
			setSize(650, 400);
			FlowLayout flo = new FlowLayout();
			setLayout(flo);
			JButton cont = new JButton("Continue");
			cont.addActionListener(this);
			add(cont);
			setVisible(true);
		}
		else if (name.equals("Authentication"))
		{
			setTitle(name);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLookAndFeel();
			setSize(650,400);
			setVisible(true);
		}
	}
	
	public void actionPerformed(ActionEvent event)
	{
		Object source = event.getSource();
		String cmd = event.getActionCommand();
		if (cmd.equals("cont"))
		{
			
		}
	}
	
	private void setLookAndFeel()
	{
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");	
		} catch (Exception exc) {
			//Ignore the error
		}
	}
	
	
	public static void main(String[] args) throws FileNotFoundException
	{
		/*Scanner file = new Scanner(new File("learnFileStuffEclispe.txt"));
		while (file.hasNextLine())
		{
			System.out.println(file.nextLine());
		}*/
		
		//boolean identity = checkIdentity();	
	
		//Main startPopUp = new Main("Welcome"); 
		
		//Main authen = new Main("Authentication");
		
		boolean identity = checkIdentity();
		
		
		
	}
	
	public static boolean checkIdentity() 
	{
		String iden = "";
		
		JFrame f = new JFrame("Authentication");
		f.setSize(400,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		f.getContentPane().setLayout(flo);
		JButton admin = new JButton("Admin");
		admin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				iden = "Admin";
			}
		});
		JButton stud = new JButton("Student");
		stud.addActionListener(this);
		f.getContentPane().add(admin);
		f.getContentPane().add(stud);
		
		if (iden.equals("Admin"))
		{
			JFrame a = new JFrame("Admin Authentication");
			a.setSize(400,300);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			FlowLayout flo = new FlowLayout();
			a.getContentPane().setLayout(flo);
			JTextfield 
		}
		
		
		f.setVisible(true);
		
		//super("Authentication");
		//Can swap for setSize(x,y);
		//pack();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		}
	
	
	
}
