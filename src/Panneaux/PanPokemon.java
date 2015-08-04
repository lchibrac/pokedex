package Panneaux;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ClassesObjets.Pokemon;
import GraphicsElements.Line;
import Listes.Pokemon2G;


public class PanPokemon extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public Pokemon tmp;
	public JFrame _f;

	public PanPokemon(Pokemon p,JFrame f){
		_f = f;
		tmp = p.clone();
		setBackground(Color.WHITE);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		
		PanPresentation pp = new PanPresentation(tmp);
		pp.setPreferredSize(new Dimension(570,200));
		add(pp);
		
		Line pl1 = new Line(600);
		pl1.setPreferredSize(new Dimension(f.getWidth(),13));
		add(pl1);
		
		PanTitle pt1 = new PanTitle("Affinite des Types",f);
		pt1.setPreferredSize(new Dimension(f.getWidth(),40));
		add(pt1);
		
		PanTableDesTypes ptdt = new PanTableDesTypes(p);
		ptdt.setPreferredSize(new Dimension(f.getWidth(),150));
		add(ptdt);
				
		Line pl2 = new Line(600);
		pl2.setPreferredSize(new Dimension(f.getWidth(),13));
		add(pl2);
		
		PanTitle pt2 = new PanTitle("Statistiques", f);
		pt2.setPreferredSize(new Dimension(f.getWidth(),40));
		add(pt2);
		
		PanStats ps = new PanStats(p);
		ps.setPreferredSize(new Dimension(f.getWidth(), 150));
		add(ps);
		
		Line pl3 = new Line(600);
		pl3.setPreferredSize(new Dimension(f.getWidth(),13));
		add(pl3);
		
		PanTitle pt3 = new PanTitle("Talents",f);
		pt3.setPreferredSize(new Dimension(f.getWidth(),40));
		add(pt3);
		
		PanTalents ptalent = new PanTalents(p);
		ptalent.setPreferredSize(new Dimension(600, 150));
		add(ptalent);
	}

	public static void main(String[] args){
		new PokedexPage(Pokemon2G.leuphorie);
	}

}
