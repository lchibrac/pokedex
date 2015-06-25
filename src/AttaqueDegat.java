
public class AttaqueDegat extends Attaque{
	
	public AttaqueDegat(String nom, Type t, int precision, int puissance, int effet,int categorie){
		super(nom,t,precision);
		_puissance = puissance;
		_effet = effet;
		_categorie = categorie;
	}
	
	public AttaqueDegat(String nom, Type t, int precision, int priorite, int puissance, int effet,int categorie){
		super(nom,t,precision,priorite);
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
	
	
	public static final AttaqueDegat laserglace = new AttaqueDegat("Laser Glace", Type.glace, 100, 90, 10, 1);
	public static final AttaqueDegat lanceflamme = new AttaqueDegat("Lance-Flamme", Type.feu, 100, 90, 10, 1);
	public static final AttaqueDegat bombbeurk =  new AttaqueDegat("Bomb-Beurk", Type.poison, 100, 90, 30, 1);
	public static final AttaqueDegat harcelement = new AttaqueDegat("Harcelement", Type.insecte, 100, 20, 100, 1);
	public static final AttaqueDegat surf = new AttaqueDegat("Surf", Type.eau, 100, 95, 0, 1);

	
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
		
		PokemonEnCombat smogogo = new PokemonEnCombat(Pokemon1G.smogogo, new Attaque[]{null, null, null,null},0,new int[]{334,194,339,226,176,156},100);
		PokemonEnCombat noacier = new PokemonEnCombat(Pokemon5G.noacier, new Attaque[]{null, null, null, null},0,new int[]{352,246,298,129,331,76}, 100);
		
		AttaqueDegat lanceflamme = new AttaqueDegat("Lance-Flamme", Type.feu, 90, 100, 10, 1);
		
		for (int i = 0 ; i < 100 ; ++i){
			System.out.println(Probabilite.degats(lanceflamme, smogogo, noacier));

		}
	}
}
