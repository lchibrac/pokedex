
public class PokemonEnCombat extends Pokemon{

	public PokemonEnCombat(Pokemon p, Attaque[] listeDesAttaques, int talentChoisi, int[] stats,int niveau, int pvs){
		_p = p;
		_numero = p._numero;
		_nom[0] = p.getFrenchNom();
		_nom[1] = p.getEnglishNom();
		_type[0] = p.getType()[0];
		_type[1] = p.getType()[1];
		_stats = p.getStat().clone();		
		_image = p._image;
		_nbevolution = p._nbevolution;
		_estuneevolution = p._estuneevolution;
		_talents = p.getTalent().clone();
		_famille = new int[p._famille.length];
		for ( int i = 0 ; i < p._famille.length ; ++i ){
			_famille[i] = p._famille[i];
		}
		for (int i = 0 ; i < 4 ; ++i){
			_listeDesAttaques[i] = listeDesAttaques[i];
		}		
		_talentChoisi = talentChoisi;
		_pvActuels = pvs;
		for (int j = 0 ; j < 6 ; ++j){
			_choosedStats[j] = stats[j];
		}
		_statut = 0;
		_precision = 0;
		_esquive = 0;
		_niveau = niveau;
		peutAttaquer = true;
		peutChanger = true;
	}
	
	public PokemonEnCombat(Pokemon p, Attaque[] listeDesAttaques, int talentChoisi, int[] stats,int niveau){	
		_p = p;
		_numero = p._numero;
		_nom[0] = p.getFrenchNom();
		_nom[1] = p.getEnglishNom();
		_type[0] = p.getType()[0];
		_type[1] = p.getType()[1];
		_stats = p.getStat().clone();		
		_image = p._image;
		_nbevolution = p._nbevolution;
		_estuneevolution = p._estuneevolution;
		_talents = p.getTalent().clone();
		_famille = new int[p._famille.length];
		for ( int i = 0 ; i < p._famille.length ; ++i ){
			_famille[i] = p._famille[i];
		}
		for (int i = 0 ; i < 4 ; ++i){
			_listeDesAttaques[i] = listeDesAttaques[i];
		}		
		_talentChoisi = talentChoisi;
		_pvActuels = stats[0];
		for (int j = 0 ; j < 6 ; ++j){
			_choosedStats[j] = stats[j];
		}
		_statut = 0;
		_precision = 0;
		_esquive = 0;
		_niveau = niveau;
		peutAttaquer = true;
		peutChanger = true;
	}
	
	
	
	public PokemonEnCombat clone(){
		return new PokemonEnCombat(this._p.clone(), this._listeDesAttaques.clone(), this._talentChoisi, this._choosedStats, this._niveau, this._pvActuels);
	}
	
	public Pokemon _p;
	public Attaque[] _listeDesAttaques = new Attaque[] {null,null,null,null};
	public int _talentChoisi;
	public int _pvActuels;
	public int[] _changementDesStats = new int[] {0,0,0,0,0,0};
	public int[] _choosedStats = new int[] {0,0,0,0,0,0};
	public int _statut; 
	public int _precision;
	public int _esquive;
	public int _niveau;
	public boolean peutAttaquer;
	public boolean peutChanger;
	
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
		switch(_statut){
		case 1: 
			this._choosedStats[1] /= 2;
			break;
		case 2: 
			this._choosedStats[5] /= 4;
			break;
		case 4 :
		case 5 :
			this.peutAttaquer = false;
			break;
		default: 
				break;		
		}
	}
	
	public String getStatut(){
		int s = this._statut;
		switch(s){
			case 1: return new String("Brulure");
			case 2: return new String("Paralysie");
			case 3: return new String("Poison");
			case 4: return new String("Gel");
			case 5: return new String("Sommeil");
			default:return new String("None");
		}
	}
	
	public static void attaque(Attaque a, PokemonEnCombat lanceur, PokemonEnCombat cible){
		if(cible.getSensibilites()[a._t._nb] != 0){
			a.effet(lanceur, cible);
			if(a instanceof AttaqueDegat){
				int degats = Probabilite.degats((AttaqueDegat)a, lanceur, cible);
				cible._pvActuels -= degats;
				if(cible._pvActuels <= 0){
					cible._pvActuels = 0;
				}
			}
		}
		else{
			System.out.println("Wesh pas bonne idee !");
		}
		System.out.println(cible);
		System.out.println("-----------------------");
		System.out.println(lanceur);
	}
	
	
	public static float getAccuracy(PokemonEnCombat lanceur, PokemonEnCombat cible){
		int accuracy = lanceur._precision - cible._esquive;
		switch(accuracy){
		case -6:
			return 1/3;
		case -5:
			return 3/8;
		case -4:
			return 3/7;
		case -3:
			return 1/2;
		case -2:
			return 3/5;
		case -1:
			return 3/4;
		case 0:
			return 1;
		case 1:
			return 4/3;
		case 2:
			return 5/3;
		case 3:
			return 2;
		case 4:
			return 7/3;
		case 5:
			return 8/3;
		case 6:
			return 3;
		default:
			return 1;
		}
	}
	
	
	
	public String toString(){
		return new String (getFrenchNom()+"   "+_pvActuels+" / "+_choosedStats[0]+"   "+getStatut());
	}
	
	public static void main(String[] argv){
		//PokemonEnCombat papilusionc = new PokemonEnCombat(Pokemon1G.papilusion, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},100);


	}
	
	
	
	
}
