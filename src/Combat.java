
public class Combat {

	public Combat(Equipe j1, Equipe j2){
		_j1 = j1.clone();
		_j2 = j2.clone();
		nb_tours = 0;
	}
	
//	public boolean fin(){
//		boolean fin = true;
//		int min = Math.min(_j1.length(),_j2.length());
//		for (int i = 0 ; i < min ; ++i ){
//			
//		}
//	}
	
	public Equipe _j1;
	public Equipe _j2;
	public int climat;
	public int nb_tours;
	
	Equipe getEquipe(int i){
		if(i < 1 || i > 2){
			System.out.println("Vous avez demandé l'équipe "+i+" qui n'existe pas. Veuillez prendre contact avec le createur du jeu pour lui indiquer cete erreur.");
			return null;
		}
		if(i == 1){
			return _j1;
		}
		else{
			return _j2;
		}
	}
	
	public int getnbTours(){
		return nb_tours;
	}
	
	public int getClimat(){
		return climat;
	}
}
