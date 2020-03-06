import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

public class ImageTest {
	    public static void main(String[] args) {
	    JFrame f = new JFrame();
	    try {
	      f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("transparentsb.jpg")))));
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    f.setLayout(new FlowLayout(FlowLayout.CENTER));
	    f.setVisible(true);
	    
	    JLabel text = new JLabel("Welcome to our Survey!");
	    //text.setText("Welcome to our Survey!");
	    Font font = new Font("Serif", Font.BOLD, 30);
	    text.setFont(font);
	    f.add(text);
	    text.setBounds(200, 200, 200, 200);
	    text.setVerticalAlignment(SwingConstants.CENTER);

		//text.setForeground(Color.black);
	    /*text.setHorizontalAlignment(JLabel.CENTER);
	    text.setVerticalAlignment(JLabel.CENTER);
	    text.setLocation(300,300);*/
	    f.setVisible(true);
	    f.pack();
	    
	    
    }

}

