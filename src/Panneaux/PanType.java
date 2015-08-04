package Panneaux;
import java.awt.Graphics;

import javax.swing.JPanel;

import ClassesObjets.Pokemon;
import Listes.Type;

public class PanType extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public Pokemon _p;
	
	public PanType(Pokemon p){
		_p = p.clone();

	}
	
	public void paintComponent(Graphics g){
		g.drawString(new String("Type"), 60, 70);
		g.drawImage(_p.getType()[0]._image, 60, 100, null);
		if(!_p.getType()[1].equals(Type.zero)){
			g.drawImage(_p.getType()[1]._image, 60, 130, null);
		}
	}
	// cible 	eau *2 par plante
			//			acier *2 glace
					//	fee	*1 normal
					//	
			//
}
