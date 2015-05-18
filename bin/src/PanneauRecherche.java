import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanneauRecherche extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JComboBox<String> all1 = new JComboBox<String>();
	private JComboBox<String> all2 = new JComboBox<String>();
	
	
	public static Pokemon[] copie() {
		int l = Allpokemon.allpkmn.length;
		Pokemon[] poke = new Pokemon[l];
		for (int i = 0; i < l; ++i) {
			poke[i] = Allpokemon.allpkmn[i].clone();
		}
		return poke;
	}
	
	
	public PanneauRecherche() {
		
		this.setLayout(new BorderLayout());
		
		all1.setPreferredSize(new Dimension(100, 20));
		all2.setPreferredSize(new Dimension(100, 20));
		for (int i = 0; i < poke.length; ++i) {
			all1.addItem(poke[i].getFrenchNom());
		}
		for (int i = 0; i < 6; ++i) {
			all2.addItem(Stat.getIdStat()[i]);
		}
		
		class Charger implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				new PokedexPage(Pokemon.getPokemon(all1.getSelectedItem().toString()));
			}	
		}
		
		class Trier implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				liste = TriPokemon.triRapide(poke, Stat.getNbStat(all2.getSelectedItem().toString()));
			}
		}
		
		all1.addActionListener(new Charger());
		all2.addActionListener(new Trier());

		all1.setBounds(this.getWidth() / 2, 50, 170, 30);
		all2.setBounds(this.getWidth() / 2, 50 + all1.getHeight() + 50, 170, 30);
		this.add(all1,BorderLayout.PAGE_START);
		this.add(all2,BorderLayout.PAGE_END);

	}
	public Pokemon[] poke = copie();
	public Pokemon[] liste = copie();
}
