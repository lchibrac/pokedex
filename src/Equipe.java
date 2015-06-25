
public class Equipe {
	
	public Equipe(Pokemon[] team, int joueur){
		for(int i = 0 ; i < team.length ; ++i){
			_team[i] = team[i].clone();
		}
		_joueur = joueur;
	}
	
	public int length(){
		int cpt = 0;
		while(!this._team[cpt].equals(null)){
			++cpt;
		}
		return cpt;
	}
	
	public Pokemon[] _team = new Pokemon[]{null,null,null,null,null,null};
	public int _joueur;
}
