
public abstract class Attaque {
	
	public Attaque(String nom, Type t, PokemonEnCombat lanceur, PokemonEnCombat cible, int precision){
		_nom = new String(nom);
		_t = t.clone();
		_lanceur = lanceur;
		_cible = cible;
		_precision = precision;
	}
	
	public String _nom;
	public Type _t;
	public PokemonEnCombat _lanceur;
	public PokemonEnCombat _cible;
	public int _precision;

}
