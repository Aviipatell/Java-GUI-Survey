import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;


public class name {
public static void main(String[]args){
	
	admincheck();
	
}

public static void admincheck (){ //asks if user is admin or student
	//Initialize GUI
	JFrame f = new JFrame ("Are you an admin?");
	
	
	
	JRadioButton stu = new JRadioButton("Student",false);
	JRadioButton admi = new JRadioButton("Admin",true);
	JButton submit = new JButton ("Submit");
	
	
	stu.setBounds(75,50,100,30);
	admi.setBounds(75,100,100,30);
	submit.setBounds(75,150,100,30);
	ButtonGroup bg = new ButtonGroup();
	bg.add(stu);
	bg.add(admi);
	
		f.add(stu);
	f.add(admi);
	f.add(submit);
	f.setSize(300, 300);
	f.setLayout(null);
	f.setVisible(true);
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  submit.addActionListener(new ActionListener(){  //checks if button is clicked
		  public void actionPerformed(ActionEvent e){  
		          
		  	 if(admi.isSelected()) {
        	
        		passwordCheck();
        		
		  	 }
        	 if(stu.isSelected()) {
        		//add the student survey here!!!!!
         		System.out.print("gay");
       		 
        	 }
        
        	f.setVisible(false); 
        		f.dispose();
        	
		  
		  }

		      });  
	
	
        }

	public static void passwordCheck(){
		//Initializes the GUI for admin password
		JFrame p = new JFrame("Admin Check");
		JButton submit = new JButton("Submit");
		JPasswordField pa = new JPasswordField();
		
		pa.setBounds(100,50,100,30);
		submit.setBounds(100, 150, 100, 30);;
		
		p.add(pa);
		p.add(submit);
		
		p.setSize(300,300);
		p.setLayout(null);
		p.setVisible(true);
		
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		  submit.addActionListener(new ActionListener(){  //check if button is clicked
			  public void actionPerformed(ActionEvent e){  
				 String check= pa.getText();
				
				  if(check.equals("password")) { //checks if password entered matches
					  System.out.println("Ur an admin");
					  
					  //open the files here!!!!!
				  }
				  else {
					  JOptionPane.showMessageDialog(null, "Incorect Login");
					  admincheck();
				  }
				   p.setVisible(false); 
	        		p.dispose();
				  
			  }
		  });
		
		  
	}

			
		}
