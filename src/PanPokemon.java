import java.awt.Graphics;



import javax.swing.JPanel;


public class PanPokemon extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Pokemon tmp;
	public PanPokemon(Pokemon p){
		tmp = p.clone();
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
		
		g.drawRoundRect(5, 5, this.getWidth()-10, this.getHeight()-10, 30, 30);	
		g.drawImage(tmp._image,20,20,this);
		g.drawRect(20, 20, tmp._image.getWidth(this), tmp._image.getHeight(this));
		
		g.drawString("Nom Français : "+tmp.getFrenchNom()+"          Nom Anglais : "+tmp.getEnglishNom(), 50+tmp._image.getWidth(this), 75);
		String s = "";
		
		if ( tmp._numero < 10 )
			s = new String("00"+tmp._numero);
		else if ( 10 < tmp._numero && tmp._numero < 100)
			s = new String("0"+tmp._numero);
		else
			s = new String(""+tmp._numero);
		g.drawString("Numéro National : "+s,50+tmp._image.getWidth(this),105);
		
		g.drawString("Type : ", 200+tmp._image.getWidth(this), 105);
		
		if ( !tmp.getType()[1].equals(Type.zero) ){
			g.drawImage(tmp.getType()[0]._image, 250+tmp._image.getWidth(this), 68+tmp.getType()[1]._image.getHeight(this), this);
			g.drawImage(tmp.getType()[1]._image, 250+tmp._image.getWidth(this), 88+tmp.getType()[1]._image.getHeight(this), this);
		}
		
		else {
			g.drawImage(tmp.getType()[0]._image, 250+tmp._image.getWidth(this), 95+tmp.getType()[1]._image.getHeight(this), this);
		}
		
		
		g.drawLine(25, tmp._image.getHeight(this)+50, 550, tmp._image.getHeight(this)+50);
		
		
		for (int i = 0 ; i < 9 ; ++i){
			g.drawImage(Type.alltypes[i]._image, 50+Type.alltypes[i]._image.getWidth(this)*i,tmp._image.getHeight(this)+60 , this);
			drawDouble(g,tmp.getSensibilites()[i],65+Type.alltypes[i]._image.getWidth(this)*i,tmp._image.getHeight(this)+90 );
			g.drawImage(Type.alltypes[i+9]._image, 50+Type.alltypes[i]._image.getWidth(this)*i, tmp._image.getHeight(this)+100, this);
			drawDouble(g,tmp.getSensibilites()[i+9],65+Type.alltypes[i]._image.getWidth(this)*i,tmp._image.getHeight(this)+130 );
			g.drawLine(Type.alltypes[i]._image.getWidth(this)*(i+1),tmp._image.getHeight(this)+60 , Type.alltypes[i]._image.getWidth(this)*(i+1), tmp._image.getHeight(this)+140);
		}
		
		g.drawLine(Type.alltypes[0]._image.getWidth(this)*10,tmp._image.getHeight(this)+60 , Type.alltypes[0]._image.getWidth(this)*10, tmp._image.getHeight(this)+140);
		g.drawLine(50, tmp._image.getHeight(this)+60, 49+Type.alltypes[0]._image.getWidth(this)*9, tmp._image.getHeight(this)+60);
		g.drawLine(50, tmp._image.getHeight(this)+100, 49+Type.alltypes[0]._image.getWidth(this)*9, tmp._image.getHeight(this)+100);
		g.drawLine(50, tmp._image.getHeight(this)+141, 49+Type.alltypes[0]._image.getWidth(this)*9, tmp._image.getHeight(this)+141);
		g.drawLine(25, tmp._image.getHeight(this)+150, 25, tmp._image.getHeight(this)+150);
		
		for ( int i = 0 ; i < 6 ; ++i ){
			g.fillRect(180, tmp._image.getHeight(this)+170+30*i, tmp.getStat().getStat()[i]*2, 15);
			g.drawString(Stat.getIdStat()[i]+" : ", 25, tmp._image.getHeight(this)+180+30*i);
			g.drawString(tmp.getStat().getStat()[i]+"", 150, tmp._image.getHeight(this)+180+30*i);
		}
		
		g.drawLine(25,  tmp._image.getHeight(this)+200+25*6, 575,  tmp._image.getHeight(this)+200+25*6);
		
		for ( int i = 0 ; i < 3 ; ++i ){
			g.drawString(tmp._talents[i].toString(), 25, tmp._image.getHeight(this)+220+25*6+i*20);
		}
		
		}

}
