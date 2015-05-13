import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanneauListePokemon extends JPanel {
	
	public void paintComponent(Graphics g,Pokemon p){
		ImageIcon icon = new ImageIcon(p._image.getScaledInstance(60, 60, Image.SCALE_DEFAULT));
		g.drawImage(icon.getImage(), 0, 0, null);
		g.drawImage(p.getType()[0]._image, 70, 10, null);
		if(!p.getType()[1].equals(null)){
			g.drawImage(p.getType()[1]._image, 70, 40, null);
		}
	}
	
	public void addPokeBouton(final Pokemon p, final JPanel jp){
		JButton j = new JButton("#"+p._numero + " " +p.getFrenchNom().toString()+" / "+ p.getEnglishNom());
			
		class Charger2 implements ActionListener{
			public void actionPerformed (ActionEvent e){
				new PokedexPage(p);
			}
		}
			
		j.addActionListener(new Charger2());
		j.setPreferredSize(new Dimension(400, 40));
		jp.add(j,BorderLayout.NORTH);
	}
	
	public void buttonPanel(final Pokemon p){
		JPanel jp = new JPanel();
		addPokeBouton(p, jp);
		JPanel draw = new JPanel();
		draw.paintComponents(draw.getGraphics());
		jp.add(draw,BorderLayout.CENTER);
		add(jp,p._numero);
	
}
	
	public PanneauListePokemon(Pokemon[] liste){
		this.setLayout(new GridLayout(720,1));
		for (int i = 0; i < liste.length; ++i) {
			buttonPanel(liste[i]);
		}	
	}	
}
