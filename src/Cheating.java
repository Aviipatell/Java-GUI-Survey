import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//from  w w  w  .  j av a 2s.c  o m
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cheating {
	  public static void main(String[] args) {
		  
	    JFrame frame = new JFrame();

	    frame.addWindowListener(new WindowAdapter() {
	      public void windowClosing(WindowEvent we) {
	        int result = JOptionPane.showConfirmDialog(frame,
	            "Do you want to Exit ?", "Exit Confirmation : ",
	            JOptionPane.YES_NO_OPTION);
	        if (result == JOptionPane.YES_OPTION)
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        else if (result == JOptionPane.NO_OPTION)
	          frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	      }
	    });

	    frame.setSize(300, 300);
	    frame.setVisible(true);

	  }
	}
