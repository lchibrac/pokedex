import java.awt.Color;
import java.awt.Graphics;



import java.awt.GridLayout;

import javax.swing.JPanel;


public class PanPokemon extends JPanel{

	
	public Pokemon tmp;
	public PanPokemon(Pokemon p){
		tmp = p.clone();
		setLayout(new GridLayout(4, 1));

		
		PanPresentation pp = new PanPresentation(tmp);
		
		add(pp);
		
		
	}
	public static void drawDouble (Graphics g, double d, int x, int y){
		if ( d == 1 ){
			g.drawString("     ", x, y);
		}
		else{
			g.drawString(" "+d+" ", x, y);
		}
	}
	public void paintComponent (Graphics g){

		g.drawLine(10,249,590,249);
		g.drawLine(10,251,590,251);
//		
//		
//		for (int i = 0 ; i < 9 ; ++i){
//			g.drawImage(Type.alltypes[i]._image, 50+Type.alltypes[i]._image.getWidth(this)*i,tmp._image.getHeight(this)+60 , this);
//			drawDouble(g,tmp.getSensibilites()[i],65+Type.alltypes[i]._image.getWidth(this)*i,tmp._image.getHeight(this)+90 );
//			g.drawImage(Type.alltypes[i+9]._image, 50+Type.alltypes[i]._image.getWidth(this)*i, tmp._image.getHeight(this)+100, this);
//			drawDouble(g,tmp.getSensibilites()[i+9],65+Type.alltypes[i]._image.getWidth(this)*i,tmp._image.getHeight(this)+130 );
//			g.drawLine(Type.alltypes[i]._image.getWidth(this)*(i+1),tmp._image.getHeight(this)+60 , Type.alltypes[i]._image.getWidth(this)*(i+1), tmp._image.getHeight(this)+140);
//		}
//		
//		g.drawLine(Type.alltypes[0]._image.getWidth(this)*10,tmp._image.getHeight(this)+60 , Type.alltypes[0]._image.getWidth(this)*10, tmp._image.getHeight(this)+140);
//		g.drawLine(50, tmp._image.getHeight(this)+60, 49+Type.alltypes[0]._image.getWidth(this)*9, tmp._image.getHeight(this)+60);
//		g.drawLine(50, tmp._image.getHeight(this)+100, 49+Type.alltypes[0]._image.getWidth(this)*9, tmp._image.getHeight(this)+100);
//		g.drawLine(50, tmp._image.getHeight(this)+141, 49+Type.alltypes[0]._image.getWidth(this)*9, tmp._image.getHeight(this)+141);
//		g.drawLine(25, tmp._image.getHeight(this)+150, 25, tmp._image.getHeight(this)+150);
//		
//		for ( int i = 0 ; i < 6 ; ++i ){
//			g.fillRect(180, tmp._image.getHeight(this)+170+30*i, tmp.getStat().getStat()[i]*2, 15);
//			g.drawString(Stat.getIdStat()[i]+" : ", 25, tmp._image.getHeight(this)+180+30*i);
//			g.drawString(tmp.getStat().getStat()[i]+"", 150, tmp._image.getHeight(this)+180+30*i);
//		}
//		
//		g.drawLine(25,  tmp._image.getHeight(this)+200+25*6, 575,  tmp._image.getHeight(this)+200+25*6);
//		
//		for ( int i = 0 ; i < 3 ; ++i ){
//			g.drawString(tmp._talents[i].toString(), 25, tmp._image.getHeight(this)+220+25*6+i*20);
//		}
//		
		}

}
