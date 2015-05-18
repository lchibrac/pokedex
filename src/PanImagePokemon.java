import java.awt.Graphics;

import javax.swing.JPanel;

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
	
	public Pokemon _p;
	
}
