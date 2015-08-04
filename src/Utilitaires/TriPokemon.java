package Utilitaires;
import ClassesObjets.Pokemon;
import Listes.Stat;
import Listes.Type;

public class TriPokemon {
	
	public static void echanger ( Pokemon[] t , int i , int j ){
		Pokemon k = t[i].clone();
		t[i] = t[j].clone();
		t[j] = k.clone();
	}
	
	public static Pokemon[] inverserTableau ( Pokemon[] t ){
		int l = t.length;
		Pokemon[] tab = new Pokemon[l];
		for(int i = 0 ; i < l ; ++i ){
			tab[i] = t[l-i-1];
		}
		return tab;
	}
	
	public static Pokemon[] triRapide(Pokemon[] poke, int s){
		int l = poke.length;
		triRapide(poke,0,l-1,s);
		return poke;
	}

	private static int partition(Pokemon[] poke,int deb,int fin,int s){
		int compt = deb;
		Pokemon pivot = poke[deb];
		for(int i = deb+1;i<=fin;i++){
			if (Stat.allstats[poke[i]._numero].getStat()[s] < Stat.allstats[pivot._numero].getStat()[s]){
				compt++;
				echanger(poke,compt,i);
			}
		}
		echanger(poke,deb,compt);
		return(compt);
	}

	private static void triRapide(Pokemon[] poke,int deb,int fin,int s)	{
		if(deb<fin)		{
			int positionPivot=partition(poke,deb,fin,s);
			triRapide(poke,deb,positionPivot-1,s);
			triRapide(poke,positionPivot+1,fin,s);
		}
	}
	
	public static Pokemon[] triType( Pokemon[] tab , Type type ){
		int nb = 0;
		int l = tab.length;
		for (int i = 0 ; i < l ; ++i){
			if ( tab[i].getType()[0].equals(type) || tab[i].getType()[1].equals(type)){
				++nb;
			}
		}
		Pokemon[] res = new Pokemon[nb];
		int nb2 = nb;
		for (int i = 0 ; nb2 > 0 || i < l ; ++i){
			if ( tab[i].getType()[0].equals(type) || tab[i].getType()[1].equals(type)){
				res[nb - nb2] = tab[i];
				--nb2;
			}
		}
		return res;
	}	
}
