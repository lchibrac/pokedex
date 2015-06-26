
public class AttaqueDegat extends Attaque{
	
	public AttaqueDegat(String nom, Type t, int categorie, int puissance, int precision, int pp, int effet){
		super(nom,t,precision,pp);
		_puissance = puissance;
		_effet = effet;
		_categorie = categorie;
	}
	
	public AttaqueDegat(String nom, Type t, int categorie, int puissance, int precision, int pp, int effet, int priorite){
		super(nom,t,precision,pp,priorite);
		_puissance = puissance;
		_effet = effet;
		_categorie = categorie;
	}
	
	public int _puissance;
	public int _effet;
	public int _categorie;
	
	public String getCategorie(){
		if (_categorie > 1 || _categorie < 0){
			return new String("The int _categorie must be 0 or 1");
			
		}
		if (_categorie == 0){
			return new String("Physique");
		}
		else{
			return new String("Special");
		}
	}

	public void effet(PokemonEnCombat lanceur, PokemonEnCombat cible){
		String s = this._nom;
		int x = Probabilite.random(0, 100);
		int y = this._effet;
		switch(s){
		case "Lance-Flamme":
			if( x <= y){
				cible.setStatut(1);
			}
			break;
		case "Laser Glace":
			if( x <= y){
				cible.setStatut(4);
			}
			break;
		case "Harcelement":
			cible.peutChanger = false;
			break;
		case "Bomb-Beurk":
			if(cible._statut != 0 && x <= y ){
				cible.setStatut(3);
			}
			break;
		default :
			break;
		}
	}
	
	public static void main (String[] argv){
		
	}
}
