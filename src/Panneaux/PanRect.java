package Panneaux;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import ClassesObjets.Pokemon;
import Listes.ColorStat;


public class PanRect extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public int _numero;
	public Pokemon _p;
	
	public PanRect(Pokemon p,int numero){
		_p = p.clone();
		_numero = numero;
		setSize(new Dimension(150,21));
	}
	
	public void paintComponent(Graphics g){
		setForeground(ColorStat.colorStat[_numero]);
		g.fillRect(1, 1, _p.getStat().getStat()[_numero], 20);		
	}

}
