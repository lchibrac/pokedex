package Panneaux;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import ClassesObjets.Pokemon;
import Listes.Stat;
import Utilitaires.TriPokemon;

public class PanneauRecherche extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JComboBox<String> all1 = new JComboBox<String>();
	private JComboBox<String> all2 = new JComboBox<String>();
	
	
	public PanneauRecherche(final JTabbedPane onglets) {
		
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		setSize(600,1000);
		all1.setMaximumSize(new Dimension(500, 40));
		all2.setMaximumSize(new Dimension(500,40));

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
				onglets.remove(2);
				if(index < 6){
					PanneauListePokemon plp = new PanneauListePokemon(TriPokemon.inverserTableau(TriPokemon.triRapide(liste, index)),index);
					JScrollPane scroll = new JScrollPane(plp);
					scroll.setPreferredSize(new Dimension(500,900));
					scroll.getVerticalScrollBar().setUnitIncrement(40);
					onglets.addTab("Liste des Pokemons par "+Stat.getIdStat()[index].toString(), scroll );
				}
				else{
					PanneauListePokemon plp = new PanneauListePokemon(PageRecherche.copie(),7);
					JScrollPane scroll = new JScrollPane(plp);
					scroll.setPreferredSize(new Dimension(500,900));
					scroll.getVerticalScrollBar().setUnitIncrement(40);
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
