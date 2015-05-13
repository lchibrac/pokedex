import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanneauListePokemon extends JPanel {
	
	public void addPokeBouton(final Pokemon p){
		JButton j = new JButton(p.getFrenchNom().toString(),new ImageIcon(p._image));
		
		
		class Charger2 implements ActionListener{
			public void actionPerformed (ActionEvent e){
				new PokedexPage(p);
			}
		}
		
		
		j.addActionListener(new Charger2());
		j.setPreferredSize(new Dimension(400, 120));
		add(j,p._numero);
	}
	
	
	public PanneauListePokemon(Pokemon[] liste){
		this.setLayout(new GridLayout(720,1));
		for (int i = 0; i < liste.length; ++i) {
			addPokeBouton(liste[i]);
		}	
	}	
}
