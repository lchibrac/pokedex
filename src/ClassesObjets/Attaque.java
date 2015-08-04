package ClassesObjets;
import Listes.Type;

public class Attaque {
	
	public Attaque(String nom, Type t, int precision, int pp, int priorite){
		_nom = new String(nom);
		_t = t.clone();
		_precision = precision;
		_pp = pp;
		_priorite = priorite;
	}
	
	
	
	public Attaque(String nom, Type t, int precision, int pp){
		_nom = new String(nom);
		_t = t.clone();
		_precision = precision;
		_pp = pp;
		_priorite = 1;
	}
	
	public String _nom;
	public Type _t;
	public PokemonEnCombat _lanceur;
	public PokemonEnCombat _cible;
	public int _precision;
	public int _pp;
	public int _priorite;
	

	
	
	public void effet(PokemonEnCombat lanceur, PokemonEnCombat cible){
		String s = this._nom;
		switch(s){
		case "Berceuse":
			cible.setStatut(5);
			break;
		case "Toxic":
			if(!cible.getType()[0].equals(Type.poison) && !cible.getType()[1].equals(Type.poison)){
				cible.setStatut(3);
			}
			break;
		case "Repos":
			lanceur._pvActuels = lanceur._choosedStats[0];
			lanceur.setStatut(5);
			break;
		default :
			break;
		}
	}
	
	
	
	public static void main(String[] argv){
		
	
	}
	
	

}
