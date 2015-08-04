package Panneaux;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import ClassesObjets.Pokemon;

import javax.swing.JButton;


public class PanneauListePokemon extends JPanel {

	private static final long serialVersionUID = 1L;

	public void addPokeBouton(final Pokemon p, final JPanel jp, int i){
		String s = null;
		if( i < 6 ){
			s = new String(""+p.getStat().getStat()[i]);
		}
		else{
			s = new String("#"+p.numeroToString());
		}
		JButton j = new JButton(p.getFrenchNom()+
				" / "+p.getEnglishNom()+
				"   "+s,
				new ImageIcon(p._image.getScaledInstance(120, 120, Image.SCALE_DEFAULT)));
		class Charger2 implements ActionListener{
			public void actionPerformed (ActionEvent e){
				new PokedexPage(p);
			}
		}
		j.addActionListener(new Charger2());
		jp.add(j);

	}	

	public PanneauListePokemon(Pokemon[] liste, int affichage){	

		setBackground(Color.white);
		setLayout(new GridLayout(liste.length, 1));
		for(int i = 0 ; i < liste.length ; ++i ){
			addPokeBouton(liste[i], this, affichage);
		}
		

	}	

}
