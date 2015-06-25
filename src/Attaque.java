public class Attaque {
	
	public Attaque(String nom, Type t, int precision,int priorite){
		_nom = new String(nom);
		_t = t.clone();
		_precision = precision;
		_priorite = priorite;
	}
	
	public Attaque(String nom, Type t, int precision){
		_nom = new String(nom);
		_t = t.clone();
		_precision = precision;
		_priorite = 1;
	}
	
	public String _nom;
	public Type _t;
	public PokemonEnCombat _lanceur;
	public PokemonEnCombat _cible;
	public int _precision;
	public int _priorite;
	
	public static final Attaque toxic = new Attaque("Toxic", Type.poison, 90);
	public static final Attaque repos = new Attaque("Repos", Type.psy, 100);
	
	
	
	
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
	
	public static Attaque berceuse = new Attaque("Berceuse", Type.normal , 50);
	
	public static void main(String[] argv){
		
		
		
		//PokemonEnCombat grodoudou = new PokemonEnCombat(Pokemon1G.grodoudou, new Attaque[]{berceuse,null,null,null},0, new int[]{484,158,126,206,218,126},100);
		//PokemonEnCombat prismillon = new PokemonEnCombat(Pokemon6G.prismillon,new Attaque[]{null,null,null,null},0,new int[]{301,126,136,306,136,277}, 100);
		
	}
	
	

}
