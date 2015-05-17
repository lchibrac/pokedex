import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanneauRecherche extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JComboBox<String> all1 = new JComboBox<String>();
	private JComboBox<String> all2 = new JComboBox<String>();
	
	public PanneauRecherche(final JTabbedPane onglets) {
		
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		setSize(600,1000);
		all1.setSize(new Dimension(100, 20));
		all2.setSize(100,20);

		for (int i = 0; i < poke.length; ++i) {
			all1.addItem(poke[i].getFrenchNom());
		}
		
		for(int i = 0 ; i < Stat.getIdStat().length ; ++i){
			all2.addItem(Stat.getIdStat()[i]);
		}
		all2.addItem("Reinitialiser");

		class Charger implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				new PokedexPage(Pokemon.getPokemon(all1.getSelectedItem().toString()));
			}	
		}
		
		class Trier implements ActionListener{
			public void actionPerformed(ActionEvent e){
				int index = all2.getSelectedIndex();
				JScrollPane scroll = new JScrollPane();
				scroll.setSize(600,1000);
				onglets.remove(1);
				if(index < 6){
					scroll.add(new PanneauListePokemon(TriPokemon.triRapide(liste, index),index));
					onglets.addTab("Liste des Pokemons par "+Stat.getIdStat()[index].toString(), scroll );
				}
				else{
					scroll.add(new PanneauListePokemon(PageRecherche.copie(),index));
					onglets.addTab("Liste des Pokemons", scroll );
				}				
			}
		}
	
		all1.addActionListener(new Charger());
		all2.addActionListener(new Trier());

		all1.setBounds(30,30,100,20);
		all2.setBounds(30,60,100,20);
		
		add(new JLabel("Rechercher un Pokemon dans la liste ci_dessous :"));
		add(all1);
		add(new JLabel("Trier les Pokemon par statistique puis se rendre sur l'autre onglet"));
		add(all2);

	}
	public Pokemon[] poke = PageRecherche.copie();
	public Pokemon[] liste = PageRecherche.copie();
}
