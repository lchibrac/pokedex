import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;



public class Type {
	public Type (String nom , int nb, File image){
		_nom = nom;
		_nb = nb;
		try {
			_image = ImageIO.read(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Type (String nom , int nb, Image image){
		_nom = nom;
		_nb = nb;
		_image = image;
	}
	
	public static void drawType(Graphics g,Type[] t,int x,int y, JPanel pan){
		if (t[1]==zero){
			g.drawImage(t[0]._image, x, y, pan);
		}
		else{
			g.drawImage(t[0]._image, x, y-t[0]._image.getWidth(pan), pan);
			g.drawImage(t[1]._image, x, y+t[1]._image.getWidth(pan), pan);
		}
	}
	
	public Type clone(){
		return new Type(new String(_nom),_nb,_image);
	}
	
	public String toString(){
		return this._nom + " " + this._nb + " " + this._image;
	}
	
	public static double[] sensibilites ( Type type ){
		if ( type._nb == -1 )
			return new double[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		double[] tmp = new double[18];
		for ( int i = 0 ; i < 18 ; ++i ){
			tmp[i] = table[i][type._nb];
		}
		return tmp;
	}
	
	public static double[][] maketable (){
		double[][] table = new double[18][18];
		table[0][0] = 1;
		table[0][1] = 1;
		table[0][2] = 1;
		table[0][3] = 1;
		table[0][4] = 1;
		table[0][5] = 1;
		table[0][6] = 1;
		table[0][7] = 1;
		table[0][8] = 1;
		table[0][9] = 1;
		table[0][10] = 1;
		table[0][11] = 1;
		table[0][12] = 0.5 ;
		table[0][13] = 0;
		table[0][14] = 1;
		table[0][15] = 1;
		table[0][16] = 0.5;
		table[0][17] = 1;
		table[1][0] = 1;
		table[1][1] = 0.5;
		table[1][2] = 0.5;
		table[1][3] = 1;
		table[1][4] = 2;
		table[1][5] = 2;
		table[1][6] = 1;
		table[1][7] = 1;
		table[1][8] = 1;
		table[1][9] = 1;
		table[1][10] = 1;
		table[1][11] = 2;
		table[1][12] = 0.5;
		table[1][13] = 1;
		table[1][14] = 0.5;
		table[1][15] = 1;
		table[1][16] = 2;
		table[1][17] = 1;
		table[2][0] = 1;
		table[2][1] = 2;
		table[2][2] = 0.5;
		table[2][3] = 1;
		table[2][4] = 0.5;
		table[2][5] = 1;
		table[2][6] = 1;
		table[2][7] = 1;
		table[2][8] = 2;
		table[2][9] = 1;
		table[2][10] = 1;
		table[2][11] = 1;
		table[2][12] = 2;
		table[2][13] = 1;
		table[2][14] = 0.5;
		table[2][15] = 1;
		table[2][16] = 1;
		table[2][17] = 1;
		table[3][0] = 1;
		table[3][1] = 1;
		table[3][2] = 2;
		table[3][3] = 0.5;
		table[3][4] = 0.5;
		table[3][5] = 1;
		table[3][6] = 1;
		table[3][7] = 1;
		table[3][8] = 0;
		table[3][9] = 2;
		table[3][10] = 1;
		table[3][11] = 1;
		table[3][12] = 1;
		table[3][13] = 1;
		table[3][14] = 0.5;
		table[3][15] = 1;
		table[3][16] = 1;
		table[3][17] = 1;
		table[4][0] = 1;
		table[4][1] = 0.5;
		table[4][2] = 2;
		table[4][3] = 1;
		table[4][4] = 0.5;
		table[4][5] = 1;
		table[4][6] = 1;
		table[4][7] = 0.5;
		table[4][8] = 2;
		table[4][9] = 0.5;
		table[4][10] = 1;
		table[4][11] = 0.5;
		table[4][12] = 2;
		table[4][13] = 1;
		table[4][14] = 0.5;
		table[4][15] = 1;
		table[4][16] = 0.5;
		table[4][17] = 1;
		table[5][0] = 1;
		table[5][1] = 0.5;
		table[5][2] = 0.5;
		table[5][3] = 1;
		table[5][4] = 2;
		table[5][5] = 0.5;
		table[5][6] = 1;
		table[5][7] = 1;
		table[5][8] = 2;
		table[5][9] = 2;
		table[5][10] = 1;
		table[5][11] = 1;
		table[5][12] = 1;
		table[5][13] = 1;
		table[5][14] = 2;
		table[5][15] = 1;
		table[5][16] = 0.5;
		table[5][17] = 1;
		table[6][0] = 2;
		table[6][1] = 1;
		table[6][2] = 1;
		table[6][3] = 1;
		table[6][4] = 1;
		table[6][5] = 2;
		table[6][6] = 1;
		table[6][7] = 0.5;
		table[6][8] = 1;
		table[6][9] = 0.5;
		table[6][10] = 0.5;
		table[6][11] = 0.5;
		table[6][12] = 2;
		table[6][13] = 0;
		table[6][14] = 1;
		table[6][15] = 2;
		table[6][16] = 2;
		table[6][17] = 0.5;
		table[7][0] = 1;
		table[7][1] = 1;
		table[7][2] = 1;
		table[7][3] = 1;
		table[7][4] = 2;
		table[7][5] = 1;
		table[7][6] = 1;
		table[7][7] = 0.5;
		table[7][8] = 0.5;
		table[7][9] = 1;
		table[7][10] = 1;
		table[7][11] = 1;
		table[7][12] = 0.5;
		table[7][13] = 0.5;
		table[7][14] = 1;
		table[7][15] = 1;
		table[7][16] = 0;
		table[7][17] = 2;
		table[8][0] = 1;
		table[8][1] = 2;
		table[8][2] = 1;
		table[8][3] = 2;
		table[8][4] = 0.5;
		table[8][5] = 1;
		table[8][6] = 1;
		table[8][7] = 2;
		table[8][8] = 1;
		table[8][9] = 0;
		table[8][10] = 1;
		table[8][11] = 0.5;
		table[8][12] = 2;
		table[8][13] = 1;
		table[8][14] = 1;
		table[8][15] = 1;
		table[8][16] = 2;
		table[8][17] = 1;
		table[9][0] = 1;
		table[9][1] = 1;
		table[9][2] = 1;
		table[9][3] = 0.5;
		table[9][4] = 2;
		table[9][5] = 1;
		table[9][6] = 2;
		table[9][7] = 1;
		table[9][8] = 1;
		table[9][9] = 1;
		table[9][10] = 1;
		table[9][11] = 2;
		table[9][12] = 0.5;
		table[9][13] = 1;
		table[9][14] = 1;
		table[9][15] = 1;
		table[9][16] = 0.5;
		table[9][17] = 1;
		table[10][0] = 1;
		table[10][1] = 1;
		table[10][2] = 1;
		table[10][3] = 1;
		table[10][4] = 1;
		table[10][5] = 1;
		table[10][6] = 2;
		table[10][7] = 2;
		table[10][8] = 1;
		table[10][9] = 1;
		table[10][10] = 0.5;
		table[10][11] = 1;
		table[10][12] = 1;
		table[10][13] = 1;
		table[10][14] = 1;
		table[10][15] = 0;
		table[10][16] = 0.5;
		table[10][17] = 1;
		table[11][0] = 1;
		table[11][1] = 0.5;
		table[11][2] = 1;
		table[11][3] = 1;
		table[11][4] = 2;
		table[11][5] = 1;
		table[11][6] = 0.5;
		table[11][7] = 0.5;
		table[11][8] = 1;
		table[11][9] = 0.5;
		table[11][10] = 2;
		table[11][11] = 1;
		table[11][12] = 1;
		table[11][13] = 0.5;
		table[11][14] = 1;
		table[11][15] = 2;
		table[11][16] = 0.5;
		table[11][17] = 0.5;
		table[12][0] = 1;
		table[12][1] = 2;
		table[12][2] = 1;
		table[12][3] = 1;
		table[12][4] = 1;
		table[12][5] = 2;
		table[12][6] = 0.5;
		table[12][7] = 1;
		table[12][8] = 0.5;
		table[12][9] = 2;
		table[12][10] = 1;
		table[12][11] = 2;
		table[12][12] = 1;
		table[12][13] = 1;
		table[12][14] = 1;
		table[12][15] = 1;
		table[12][16] = 0.5;
		table[12][17] = 1;
		table[13][0] = 0;
		table[13][1] = 1;
		table[13][2] = 1;
		table[13][3] = 1;
		table[13][4] = 1;
		table[13][5] = 1;
		table[13][6] = 1;
		table[13][7] = 1;
		table[13][8] = 1;
		table[13][9] = 1;
		table[13][10] = 2;
		table[13][11] = 1;
		table[13][12] = 1;
		table[13][13] = 2;
		table[13][14] = 1;
		table[13][15] = 0.5;
		table[13][16] = 1;
		table[13][17] = 1;
		table[14][0] = 1;
		table[14][1] = 1;
		table[14][2] = 1;
		table[14][3] = 1;
		table[14][4] = 1;
		table[14][5] = 1;
		table[14][6] = 1;
		table[14][7] = 1;
		table[14][8] = 1;
		table[14][9] = 1;
		table[14][10] = 1;
		table[14][11] = 1;
		table[14][12] = 1;
		table[14][13] = 1;
		table[14][14] = 2;
		table[14][15] = 1;
		table[14][16] = 0.5;
		table[14][17] = 0;
		table[15][0] = 1;
		table[15][1] = 1;
		table[15][2] = 1;
		table[15][3] = 1;
		table[15][4] = 1;
		table[15][5] = 1;
		table[15][6] = 0.5;
		table[15][7] = 1;
		table[15][8] = 1;
		table[15][9] = 1;
		table[15][10] = 2;
		table[15][11] = 1;
		table[15][12] = 1;
		table[15][13] = 2;
		table[15][14] = 1;
		table[15][15] = 0.5;
		table[15][16] = 1;
		table[15][17] = 0.5;
		table[16][0] = 1;
		table[16][1] = 0.5;
		table[16][2] = 0.5;
		table[16][3] = 0.5;
		table[16][4] = 1;
		table[16][5] = 2;
		table[16][6] = 1;
		table[16][7] = 1;
		table[16][8] = 1;
		table[16][9] = 1;
		table[16][10] = 1;
		table[16][11] = 1;
		table[16][12] = 2;
		table[16][13] = 1;
		table[16][14] = 1;
		table[16][15] = 1;
		table[16][16] = 0.5;
		table[16][17] = 2;
		table[17][0] = 1;
		table[17][1] = 0.5;
		table[17][2] = 1;
		table[17][3] = 1;
		table[17][4] = 1;
		table[17][5] = 1;
		table[17][6] = 2;
		table[17][7] = 0.5;
		table[17][8] = 1;
		table[17][9] = 1;
		table[17][10] = 1;
		table[17][11] = 1;
		table[17][12] = 1;
		table[17][13] = 1;
		table[17][14] = 2;
		table[17][15] = 2;
		table[17][16] = 0.5;
		table[17][17] = 1;
		return table;
	}
	
	// cible 	eau *2 par plante
			//			acier *2 glace
					//	fee	*1 normal
					//	
			//
	
	public static void afficherTableau2D( double[][] t ){
		for (int i = 0 ; i < t.length ; ++i){
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("|"+t[i][0]+"|"+t[i][1]+"|"+t[i][2]+"|"+t[i][3]+"|"+t[i][4]+"|"+t[i][5]+"|"+t[i][6]+"|"+t[i][7]+"|"+t[i][8]+"|"+t[i][9]+"|"+t[i][10]+"|"+t[i][11]+"|"+t[i][12]+"|"+t[i][13]+"|"+t[i][14]+"|"+t[i][15]+"|"+t[i][16]+"|"+t[i][17]+"|");
			
		}
		System.out.println("-------------------------------------------------------------------------");
	}
	
	// Ingredients
	public static double[][] table = maketable();
	public String _nom;
	public int _nb;
	public Image _image;
	
	
	// Variables 
	public static Type normal = new Type ("Normal", 0, new File("images/types/0.png"));
	public static Type feu = new Type ("Feu", 1 , new File ("images/types/1.png"));
	public static Type eau = new Type ("Eau", 2 , new File ("images/types/2.png"));
	public static Type electrique = new Type ("Electrique", 3 , new File ("images/types/3.png"));
	public static Type plante = new Type ("Plante", 4 , new File ("images/types/4.png"));
	public static Type glace = new Type ("Glace", 5 , new File ("images/types/5.png"));
	public static Type combat = new Type ("Combat", 6 , new File ("images/types/6.png"));
	public static Type poison = new Type ("Poison", 7 , new File ("images/types/7.png"));
	public static Type sol = new Type ("Sol", 8 , new File ("images/types/8.png"));
	public static Type vol = new Type ("Vol", 9 , new File ("images/types/9.png"));
	public static Type psy = new Type ("Psy", 10 , new File ("images/types/10.png"));
	public static Type insecte = new Type ("Insecte", 11 , new File ("images/types/11.png"));
	public static Type roche = new Type ("Roche", 12 , new File ("images/types/12.png"));
	public static Type spectre = new Type ("Spectre", 13 , new File ("images/types/13.png"));
	public static Type dragon = new Type ("Dragon", 14 , new File ("images/types/14.png"));
	public static Type tenebres = new Type ("T�n�bres", 15 , new File ("images/types/15.png"));
	public static Type acier = new Type ("Acier", 16 , new File ("images/types/16.png"));
	public static Type fee = new Type ("F�e", 17 , new File ("images/types/17.png"));
	public static Type[] alltypes = {normal,feu,eau,electrique,plante,glace,combat,poison,sol,vol,psy,insecte,roche,spectre,dragon,tenebres,acier,fee};
	public static Type zero = new Type("-",-1,new File("images/mimetex.gif"));
	//Retourne le type d'un pokemon
	public static void main ( String[] args ){
		System.out.println(alltypes[0].toString());
	}
		
}

