
public class AttaqueDegat extends Attaque{
	
	public AttaqueDegat(String nom, Type t, int puissance, int precision, int effet,int categorie){
		super(nom,t,precision);
		_puissance = puissance;
		_effet = effet;
		_categorie = categorie;
	}
	
	public int _puissance;
	public int _effet;
	public int _categorie;
	
	public String getCategorie(){
		if (_categorie > 1){
			return new String("The int _categorie must be 0 or 1");
			
		}
		if (_categorie == 0){
			return new String("Physique");
		}
		else{
			return new String("Special");
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
