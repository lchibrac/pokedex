package Panneaux;
import java.awt.Graphics;

import javax.swing.JPanel;

import ClassesObjets.Pokemon;

public class PanImagePokemon extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public PanImagePokemon(Pokemon p){
		_p = p.clone();	
	}
	
	public void paintComponent( Graphics g){
		g.drawImage(_p._image,20,20,this);
		g.drawRect(20, 20, _p._image.getWidth(this)+1, _p._image.getHeight(this)+1);
		g.drawRect(20, 20, _p._image.getWidth(this), _p._image.getHeight(this));
	}
	
	public void paintComponent( Graphics g, int x, int y){
		g.drawImage(_p._image,x,y,this);
		g.drawRect(x, y, _p._image.getWidth(this)+1, _p._image.getHeight(this)+1);
		g.drawRect(x, y, _p._image.getWidth(this), _p._image.getHeight(this));
	}
	
	public Pokemon _p;
	
}
