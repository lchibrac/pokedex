package Panneaux;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ClassesObjets.Pokemon;


public class PanLabelPresentation extends JPanel {

	private static final long serialVersionUID = 1L;
	public Pokemon _p;
	public PanLabelPresentation(Pokemon p){
		_p = p.clone();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.white);

		
		JLabel num =new JLabel(new String("Numero national : "+_p.numeroToString()));
		JLabel fr = new JLabel(new String("Nom francais    : "+_p.getFrenchNom()));
		JLabel en = new JLabel(new String("Nom anglais     : "+_p.getEnglishNom()));
		
		add(num);
		add(fr);
		add(en);
	}
	

}
