import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanneauRecherche extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JComboBox<String> all1 = new JComboBox<String>();

	
	
	public static Pokemon[] copie() {
		int l = Allpokemon.allpkmn.length;
		Pokemon[] poke = new Pokemon[l];
		for (int i = 0; i < l; ++i) {
			poke[i] = Allpokemon.allpkmn[i].clone();
		}
		return poke;
	}
	
	
	public PanneauRecherche() {
		
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		all1.setPreferredSize(new Dimension(100, 20));

		for (int i = 0; i < poke.length; ++i) {
			all1.addItem(poke[i].getFrenchNom());
		}

		class Charger implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				new PokedexPage(Pokemon.getPokemon(all1.getSelectedItem().toString()));
			}	
		}
	
		all1.addActionListener(new Charger());

		all1.setBounds(this.getWidth() / 2, 50, 170, 30);
		add(all1);


	}
	public Pokemon[] poke = copie();
	public Pokemon[] liste = copie();
}
