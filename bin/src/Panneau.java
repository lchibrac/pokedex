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

	public void paintComponent(Graphics g){                 
		g.setColor(Color.black);
		setBackground(Color.white);
	    g.drawRoundRect(5, 5, this.getWidth()-10, this.getHeight()-10, 30, 30);
	    try {
	        Image img = ImageIO.read(new File("images/logo.jpg"));
	        g.drawImage(img, 100, 50, this);
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	    g.drawString("Remerciments à :", 250, 400);
	    g.drawString("Kévin, Marin et Nathalie pour le Java,",50,450);
	    g.drawString("Bérénice pour la table des types,",50,500);
	    g.drawString("Jason pour ses blagues nulles,",50,550);
	    g.drawString("Benjamin, Pierre-Louis, Claude et Inès pour avoir cru en moi ....",50,600);
	    
	}

}
