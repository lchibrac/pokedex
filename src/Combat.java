public class Combat {

	public Combat(Equipe j1, Equipe j2, boolean vsdresseur){
		_gagnant = 0;
		_j1 = j1.clone();
		_j2 = j2.clone();
		nb_tours = 0;
		joueurActuel = 1;
		_vs_dresseur = vsdresseur;
		_mega_evolution = false;
	}
	
	//pq boolean ?
	/*
	public boolean fin(){
		int min = Math.min(_j1.length(),_j2.length());
		for (int i = 0 ; i < min ; ++i ){
			
		}
	}*/
	
	public int fin(){
		//cas de fuite, abandon autre prévu plus tard...
		if(_gagnant != 0){
			return _gagnant;
		}
		int tmp = 0;
		for(int i = 0; i < _j1.length() ; i++){
			if (!_j1.getPokemon(i).estKO()){
				return 1;
			}
		}
		return 2;
	}
	
	public static void initialisation(){
		
	}
	
	//données générales => interessantes a conserver après ? 
	public boolean _vs_dresseur; //vs dresseur(true) != vs pokemon sauvage
	public Equipe _j1;
	public Equipe _j2;
	public int climat;
	public int nb_tours;
	public int _gagnant;
	public boolean _mega_evolution;
	
	//donnees durant combat
	public int joueurActuel;
	
	Equipe getEquipe(int i){
		if(i < 1 || i > 2){
			System.out.println("Vous avez demandé l'équipe "+i+" qui n'existe pas. Veuillez prendre contact avec le createur du jeu pour lui indiquer cette erreur.");
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
	
	public static void main(String[] argv){
//		
//		final PokemonEnCombat smogogo = new PokemonEnCombat(Pokemon1G.smogogo,
//				new Attaque[]{AttaqueDegat.bombbeurk, AttaqueDegat.harcelement, AttaqueDegat.lanceflamme,Attaque.toxic},
//				0,new int[]{334,194,339,226,176,156},100);
//		final PokemonEnCombat lamantine = new PokemonEnCombat(Pokemon1G.lamantine, 
//				new Attaque[]{Attaque.repos,Attaque.toxic,AttaqueDegat.laserglace,AttaqueDegat.surf},
//				0,new int[]{384,158,196,176,317,176} , 100);
//		
//		Combat c = new Combat(new Equipe(new Pokemon[]{lamantine}, 1), new Equipe(new Pokemon[]{smogogo}, 0));
//		
//		JFrame fight = new JFrame();
//			
//		PanCombat up = new PanCombat(c, fight);
//		
//		JPanel jp = new JPanel();
//		jp.setSize(up.getWidth(), up.getHeight()+100);
//		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
//		jp.add(up);
//			
//		JPanel attaques = new JPanel();
//		attaques.setLayout(new BoxLayout(attaques, BoxLayout.X_AXIS));
//		
//		class Att implements ActionListener{
//			public Att(int i){
//				_i =i;
//			}
//			
//			public final int _i;
//			public void actionPerformed(ActionEvent e){
//				PokemonEnCombat.attaque(lamantine._listeDesAttaques[_i], lamantine, smogogo);
//			}
//		}
//		
//		for(int i = 0 ; i < 4 ; ++i){
//			JButton jb = new JButton(lamantine._listeDesAttaques[i]._nom, new ImageIcon(lamantine._listeDesAttaques[i]._t._image));
//			jb.addActionListener(new Att(i));
//			jb.setMinimumSize(new Dimension(200, 50));
//			attaques.add(jb);
//		}
//		
//		jp.add(attaques);
//		fight.setContentPane(jp);
//		fight.setVisible(true);
//		fight.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		fight.setTitle("JGITZJIOZTYE");
//		fight.setSize(900,900);
//		
	}

}
