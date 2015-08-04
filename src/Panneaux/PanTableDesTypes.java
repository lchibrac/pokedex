package Panneaux;
import java.awt.Graphics;


import javax.swing.JPanel;

import ClassesObjets.Pokemon;
import Listes.Type;


public class PanTableDesTypes extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public Pokemon _p;

	
	public PanTableDesTypes(Pokemon p){
		_p = p.clone();
	}
	
	public static void drawDouble (Graphics g, double d, int x, int y){
		if ( d == 1 ){
			g.drawString("     ", x, y);
		}
		else{
			g.drawString(" "+d+" ", x, y);
		}
	}
	
	public void paintComponent(Graphics g){
		
		
		for (int i = 0 ; i < 9 ; ++i){
			g.drawImage(Type.alltypes[i]._image, 50+Type.alltypes[i]._image.getWidth(null)*i,0 , null);
			drawDouble(g,_p.getSensibilites()[i],65+Type.alltypes[i]._image.getWidth(null)*i,30);
			g.drawImage(Type.alltypes[i+9]._image, 50+Type.alltypes[i]._image.getWidth(null)*i,40, null);
			drawDouble(g,_p.getSensibilites()[i+9],65+Type.alltypes[i]._image.getWidth(null)*i,70 );
			g.drawLine(Type.alltypes[i]._image.getWidth(null)*(i+1),0 , Type.alltypes[i]._image.getWidth(null)*(i+1),80);
		}
		
		g.drawLine(Type.alltypes[0]._image.getWidth(null)*10,0, Type.alltypes[0]._image.getWidth(null)*10,80);
		g.drawLine(50,0, 49+Type.alltypes[0]._image.getWidth(null)*9,0);
		g.drawLine(50,40, 49+Type.alltypes[0]._image.getWidth(null)*9,40);
		g.drawLine(50,81, 49+Type.alltypes[0]._image.getWidth(null)*9,81);
		g.drawLine(25,90, 25,90);
		g.drawLine(50,17,499,17);
		g.drawLine(50,57,499,57);
		
	}
	
}
