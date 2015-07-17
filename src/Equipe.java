
public class Equipe {
	
	public PokemonEnCombat[] _team = new PokemonEnCombat[]{};
	public int _joueur;
//	public Objet[] _inventaire;
	
	
	public Equipe(PokemonEnCombat[] team, int joueur){
		_team = new PokemonEnCombat[team.length];
		for(int i = 0 ; i < team.length ; ++i){
			_team[i] = team[i].clone();
		}
		_joueur = joueur;
	}
	
	public int length(){
		return _team.length;
	}
	
	public Equipe clone(){
		PokemonEnCombat[] _team2 = new PokemonEnCombat[this._team.length];
		for(int i = 0 ; i < this._team.length ; ++i){
			_team2[i] = _team[i].clone();
		}
		Equipe e = new Equipe(_team2, this._joueur);
		return e;
	}
	
	public PokemonEnCombat getPokemon(int i){
		if (_team.length >= i && i >= 0){
			return _team[i];
		}
		return null;
	}
	
	public int getJoueur(){
		return _joueur;
	}
	
	public void printEquipe(){
		System.out.println("l'Equipe du joueur "+_joueur +" est composée de ");
		for(int i = 0 ; i < _team.length ; ++i){
			System.out.print(_team[i].getFrenchNom());
			if(i < _team.length-1){
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
}
