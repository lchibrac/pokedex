public class Attaque {
	
	public Attaque(String nom, Type t, int precision){
		_nom = new String(nom);
		_t = t.clone();
		_precision = precision;
	}
	
	public String _nom;
	public Type _t;
	public PokemonEnCombat _lanceur;
	public PokemonEnCombat _cible;
	public int _precision;
	
	
	public static Attaque berceuse = new Attaque("Berceuse", Type.normal , 50);
	
	public static void main(String[] argv){
		
		
		
		PokemonEnCombat grodoudou = new PokemonEnCombat(Pokemon1G.grodoudou, new Attaque[]{berceuse,null,null,null},0, new int[]{484,158,126,206,218,126},100);
		PokemonEnCombat prismillon = new PokemonEnCombat(Pokemon6G.prismillon,new Attaque[]{null,null,null,null},0,new int[]{301,126,136,306,136,277}, 100);
		
		
		
		for(int i = 0 ; i < 100 ; ++i){
			
			double x = Probabilite.random(0, 100);
			
			if(x <= 50){
				prismillon.setStatut(5);
			}
			else{
				prismillon.setStatut(0);
			}
			
			System.out.println(prismillon.getStatut());
			
		}
		
	}
	
	

}
