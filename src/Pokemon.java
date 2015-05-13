

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Pokemon {
	public Pokemon() {
		_numero = -1;
		_nom[0]= new String(".");
		_nom[1] = new String(".");
		_type[0] = Type.zero.clone();
		_type[1] = Type.zero.clone();
		_stats = new Stat(new int[] {0,0,0,0,0,0});
		try {
			_image = ImageIO.read(new File("images/mimetex.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		_nbevolution = 0;
		_estuneevolution = false;
		_talents[0] = Talent.zero.clone();
		_talents[1] = Talent.zero.clone();
		_talents[2] = Talent.zero.clone();
	}
	public Pokemon ( int numero , String[] nom , Type[] type , Stat stats , File image , int nbevolution , boolean estuneevolution , Talent[] talents, int[] famille ){
		_numero = numero;
		_nom[0] = new String(nom[0]);
		_nom[1] = new String(nom[1]);
		_type[0] = type[0].clone();
		_type[1] = type[1].clone();
		_stats = stats.clone();
		try {
			_image = ImageIO.read(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
		_nbevolution = nbevolution;
		_estuneevolution = estuneevolution;
		_talents = talents.clone();
		_famille = new int[famille.length];
		for ( int i = 0 ; i < famille.length ; ++i ){
			_famille[i] = famille[i];
		}
	}
	public Pokemon ( int numero , String[] nom , Type[] type , Stat stats , Image image , int nbevolution , boolean estuneevolution , Talent[] talents, int[] famille ) {
		_numero = numero;
		_nom[0] = new String(nom[0]);
		_nom[1] = new String(nom[1]);
		_type[0] = type[0].clone();
		_type[1] = type[1].clone();
		_stats = stats.clone();
		_image = image;
		_nbevolution = nbevolution;
		_estuneevolution = estuneevolution;
		_talents = talents.clone();
		_famille = new int[famille.length];
		for ( int i = 0 ; i < famille.length ; ++i ){
			_famille[i] = famille[i];
		}
	}
	public int _numero;
	public String[] _nom = new String[]{".","."};
	public Type[] _type = new Type[]{Type.zero,Type.zero};
	public Stat _stats;
	public Image _image;
	public int _nbevolution;
	public boolean _estuneevolution;
	public Talent[] _talents = new Talent[]{Talent.zero,Talent.zero,Talent.zero};
	public int[] _famille = new int[]{0};
	
	public Talent[] getTalent(){
		return new Talent[] { _talents[0].clone(), _talents[1].clone(), _talents[2].clone()};
	}
	
	public String toString(){
		return new String(this._numero +" "+this._nom.toString()+" "+this._type.toString()+" "+this._stats.toString()+" "+this._nbevolution+" "+this._estuneevolution+" "+this._talents.toString());		
	}
	
	public String[] getNom(){
		return new String[] {new String(_nom[0]),new String(_nom[1])};
	}
	
	public String getFrenchNom(){
		return new String(_nom[0]);
	}
	
	public String getEnglishNom(){
		return new String(_nom[1]);
	}
	
	public Type[] getType(){
		Type[] tmp = new Type[2];
		tmp[0] = _type[0].clone();
		tmp[1] = _type[1].clone();
		return tmp;
	}
	
	public Stat getStat (){
		return _stats.clone();
	}
	
	public int[] getFamille(){
		int[] tmp = new int[_famille.length];
		for ( int i = 0 ; i < tmp.length ; ++i ){
			tmp[i] = _famille[i];
		}
		return tmp;
	}
	
	public Pokemon clone(){
		return new Pokemon( _numero, getNom(), getType(), getStat(), _image, _nbevolution, _estuneevolution, getTalent(), getFamille());
	}
	
	public static Pokemon getPokemon (int i){
		return Allpokemon.allpkmn[i];
	}
	
	public static Pokemon getPokemon (String s){
		for ( int i = 0 ; i < Allpokemon.allpkmn.length ; ++i ){
			if ( Allpokemon.allpkmn[i].getFrenchNom().equals(s) || Allpokemon.allpkmn[i].getEnglishNom().equals(s)){
				return Allpokemon.allpkmn[i];
			}
		}
		return Pokemon1G.missingno;
	}
	
	public double[] getSensibilites (){
		double[] tmp = new double[18];
		for ( int i = 0 ; i < 18 ; ++i ){
			tmp[i] = Type.sensibilites(this._type[0])[i];
			if ( !this._type[1].equals(Type.zero)){
				tmp[i] = tmp[i]*Type.sensibilites(this._type[1])[i];
			}
		}
		return tmp;
	}
	
	public static void main(String[] args){
		
	}
	
}
