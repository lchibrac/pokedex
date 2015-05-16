import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanneauListePokemon extends JPanel {
	
	class ButtonPanel extends JPanel{
		public ButtonPanel(final Pokemon p){
			setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
			
			JButton j = new JButton("#"+p.numeroToString() 
					+ " " + p.getFrenchNom().toString()
					+ " / " + p.getEnglishNom());
			
			class Charger2 implements ActionListener{
				public void actionPerformed (ActionEvent e){
					new PokedexPage(p);
				}
			}

			j.addActionListener(new Charger2());
			j.setPreferredSize(new Dimension(400, 40));
			add(new PanImagePokemon(p));
			add(j);
		}
	}
	
	public PanneauListePokemon(Pokemon[] liste){
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		for (int i = 0; i < liste.length; ++i) {
			add(new ButtonPanel(liste[i]));
		}	
	}	
}
