import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PageRecherche extends JFrame {

	private static final long serialVersionUID = 1L;

			
	public PageRecherche() {
		
		
		super();
		setSize(600, 1000);
		Image icone = Toolkit.getDefaultToolkit().getImage("images/dex.gif");
		setIconImage(icone);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setTitle("Pokedex");	
		setLocationRelativeTo(null);
		

	}
	

	public static void main(String[] argv) {
		new PageRecherche();
	}

}
