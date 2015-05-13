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

	private PanneauRecherche pan = new PanneauRecherche();
	private PanneauListePokemon listpan = new PanneauListePokemon(pan.liste);

	public 	void setScrollPane (JScrollPane s, PanneauListePokemon p){
				s = new JScrollPane(p);
	}	
			
	public PageRecherche() {
		
		
		super();
		setSize(600, 1000);
		Image icone = Toolkit.getDefaultToolkit().getImage("images/dex.gif");
		setIconImage(icone);
		Color c = new Color(255, 255, 204);
		getContentPane().setBackground(c);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setTitle("Pokedex");	
		setLocationRelativeTo(null);
			
		
		pan.setBackground(c);	
		pan.setPreferredSize(new Dimension(500,50));
		
		listpan.setPreferredSize(new Dimension(300,pan.liste.length*120));
		
		JScrollPane s = new JScrollPane(listpan);
		s.setPreferredSize(new Dimension(300, this.getHeight()-pan.getHeight()-40));
		
		
		
		Dimension d_up = new Dimension(600,20);
		Dimension d_down = new Dimension(600,20);
		Dimension d_right = new Dimension(10,this.getHeight());
		Dimension d_left = new Dimension(10,this.getHeight());
		
		
		
		Marge up = new Marge(getBackground(),d_up);
		Marge down = new Marge(getBackground(),d_down);
		Marge left = new Marge(getBackground(),d_left);
		Marge right = new Marge(getBackground(),d_right);
		up.setPreferredSize(up.getDimension());
		down.setPreferredSize(down.getDimension());
		right.setPreferredSize(right.getDimension());
		left.setPreferredSize(left.getDimension());
		
		
		
		JPanel jp = new JPanel();
		jp.add(pan,BorderLayout.NORTH);
		jp.add(s,BorderLayout.SOUTH);
		jp.setPreferredSize(new Dimension(500,600));
		
		
		
		Container pane = getContentPane();
		pane.setBackground(c);
		pane.add(up,BorderLayout.NORTH);
		pane.add(down,BorderLayout.SOUTH);
		pane.add(right,BorderLayout.EAST);
		pane.add(left,BorderLayout.WEST);
		pane.add(jp,BorderLayout.CENTER);
		setContentPane(pane);
		
	}
	
//	public void paintComponent(Graphics g) {
//		g.drawRoundRect(5, 5, this.getWidth() - 10, this.getHeight() - 10, 30,
//				30);
//		g.drawString("Sélectionnez un Pokémon : ", this.getWidth() / 2, 30);
//		g.drawLine(50, 40, this.getWidth() - 50 , 40);
//	}

	public static void main(String[] argv) {
		new PageRecherche();
	}

}
