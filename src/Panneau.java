import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;



public class Panneau extends JPanel{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Panneau(){
		setBackground(Color.WHITE);
		
	}
	public void paintComponent(Graphics g){                 
		
	    try {
	        Image img = ImageIO.read(new File("images/logo.jpg"));
	        g.drawImage(img, 300 - (img.getWidth(null)/2), 10, this);
	      } catch (IOException e) {
	        e.printStackTrace();
	      }

	}

}
