import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;



import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class PanPokemon extends JPanel{

	
	public Pokemon tmp;
	public JFrame _f;

	public PanPokemon(Pokemon p,JFrame f){
		_f = f;
		tmp = p.clone();
		setLayout(new GridLayout(10, 1));

		
		PanPresentation pp = new PanPresentation(tmp);
		pp.setSize(new Dimension(f.getWidth(),250));
		add(pp);
		
		Line pl1 = new Line(f);
		pl1.setSize(new Dimension(f.getWidth(),3));
		add(pl1);
		
		PanTitle pt1 = new PanTitle("Affinite des Types",f);
		pt1.setSize(new Dimension(f.getWidth(),30));
		add(pt1);
		
		PanTableDesTypes ptdt = new PanTableDesTypes(p);
		ptdt.setSize(new Dimension(f.getWidth(),100));
		add(ptdt);
				
		Line pl2 = new Line(f);
		pl2.setSize(new Dimension(f.getWidth(),3));
		add(pl2);
		
		PanTitle pt2 = new PanTitle("Statistiques", f);
		pt2.setSize(new Dimension(f.getWidth(),30));
		add(pt2);
		
		PanStats ps = new PanStats(p);
		ps.setSize(f.getWidth(), 150);
		add(ps);
		
		Line pl3 = new Line(f);
		pl3.setSize(new Dimension(f.getWidth(),3));
		add(pl3);
		
		PanTitle pt3 = new PanTitle("Talents",f);
		pt3.setSize(new Dimension(f.getWidth(),30));
		add(pt3);
		
		PanTalents ptalent = new PanTalents(p);
		ptalent.setSize(600, 30);
		add(ptalent);
	}

}
