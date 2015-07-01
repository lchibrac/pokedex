

public class PokemonEnCombat{
	
	
	
	public PokemonEnCombat(Pokemon p, Attaque[] listeDesAttaques, int talentChoisi, int[] stats){
		_p = p.clone();
		for (int i = 0 ; i < 4 ; ++i){
			_listeDesAttaques[i] = listeDesAttaques[i];
		}		
		_talentChoisi = talentChoisi;
		_pvActuels = stats[0];
		for (int j = 0 ; j < 6 ; ++j){
			_stats[j] = stats[j];
		}
		_statut = 0;
	}
	
	public PokemonEnCombat clone(){
		return new PokemonEnCombat(this._p, this._listeDesAttaques, this._talentChoisi, this._stats);
	}
	
	public Pokemon _p;
	public Attaque[] _listeDesAttaques = new Attaque[] {null,null,null,null};
	public int _talentChoisi;
	public int _pvActuels;
	public int[] _stats = new int[] {0,0,0,0,0,0};
	public int _statut; 
	public int[] _changementDesStats = new int[] {0,0,0,0,0,0};
	
	public boolean estKO(){
		return _pvActuels == 0;
	}
	
	public void setChangementDeStat (int statAChanger , int nombreDAlteration){
		if( -4 >= _changementDesStats[statAChanger]+nombreDAlteration){ 
			_changementDesStats[statAChanger] = -4;
		}
		else{
			if(_changementDesStats[statAChanger]+nombreDAlteration >= 4){
				_changementDesStats[statAChanger] = 4;
			}
		
			else{
				_changementDesStats[statAChanger] += nombreDAlteration;
			}
		}
	}
	
	public void setStatut(int statut){
		_statut = statut;
	}
	
	public String getStatut(){
		int s = this._statut;
		switch(s){
		case 1: return new String("Brulure");
		case 2: return new String("Paralysie");
		case 3: return new String("Poison");
		case 4: return new String("Gel");
		default:return new String("");
		}
	}
		
	public String toString(){
		StringBuffer bf = new StringBuffer();
		
		bf.append(this._p.getFrenchNom()+" : ");
		bf.append(" ");
		bf.append(_stats[0] -(_stats[0]-_pvActuels) +" ");
		for(int i = 1 ; i < 6 ; ++i){
			bf.append(_stats[i]*(1 + 0.5*_changementDesStats[i]));
			bf.append(" ");
		}
		bf.append(" ");
		bf.append(getStatut());
		return bf.toString();
	}
	
	public static void main(String[] argv){
		PokemonEnCombat papilusionc = new PokemonEnCombat(Pokemon1G.papilusion, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262});
		papilusionc.setStatut(1);
		papilusionc.setChangementDeStat(3, 2);
		papilusionc.setChangementDeStat(4, 2);
		papilusionc.setChangementDeStat(5, 2);
		
		System.out.println(papilusionc);
	}
	
	
	
	
}
