
public abstract class Attaque {
	
	public Attaque(String nom, Type t, PokemonEnCombat lanceur, PokemonEnCombat cible){
		_nom = new String(nom);
		_t = t;
		_lanceur = lanceur;
		_cible = cible;
	}
	
	public String _nom;
	public Type _t;
	public PokemonEnCombat _lanceur;
	public PokemonEnCombat _cible;

}
