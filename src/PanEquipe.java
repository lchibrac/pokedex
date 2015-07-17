import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PanEquipe extends JPanel {
	public static Combat _c;
	public static Equipe _equipe;
	
	public PanEquipe (final JFrame f){
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane);

		for(int i = 0 ; i < _equipe._team.length ; i++){
			JPanel pokemon = new JPanel ();
			
			JLabel _name = new JLabel(_equipe._team[i]._p.getFrenchNom());
			GridBagConstraints e1_name_gbc = new GridBagConstraints();
			
			
			pokemon.add(_name,e1_name_gbc);
			scrollPane.add(pokemon);
		}
		
	}
	
	public static void main(String[] argv) throws IOException{
		Equipe e1 = new Equipe(new PokemonEnCombat[]{new PokemonEnCombat(Pokemon1G.papilusion, new Attaque[]{ListeDesAttaques.abime, ListeDesAttaques.racines, ListeDesAttaques.halloween,ListeDesAttaques.lanceboue},0,new int[]{261,113,136,279,196,262},20), new PokemonEnCombat(Pokemon1G.abo, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20) , new PokemonEnCombat(Pokemon1G.goupix, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20),new PokemonEnCombat(Pokemon1G.amanox, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20) , new PokemonEnCombat(Pokemon1G.dardargnan, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20), new PokemonEnCombat(Pokemon1G.dodrio, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20)}, 1);
		Equipe e2 = new Equipe(new PokemonEnCombat[]{new PokemonEnCombat(Pokemon1G.aeromite, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20), new PokemonEnCombat(Pokemon1G.lamantine, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20),new PokemonEnCombat(Pokemon1G.kabuto, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20) , new PokemonEnCombat(Pokemon1G.caninos, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20), new PokemonEnCombat(Pokemon1G.machopeur, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20)}, 1);

		_c =  new Combat(e1,e2, true);
		_c._j1.getPokemon(0)._pvActuels = 50;
		_c._j1.getPokemon(2)._pvActuels = 0;
		_c._j1.getPokemon(3)._pvActuels = 0;
		
		_c._j2.getPokemon(0)._statut = 2;
		_c._j2.getPokemon(0)._choosedStats[0] = 254;
		_c._j2.getPokemon(0)._pvActuels = 25;
		//TMP fin

		JFrame f = new JFrame();
		if(_c.joueurActuel == 1){
			_equipe = _c._j1;
		}else{
			_equipe = _c._j2;
		}
		f.setSize(900, _equipe._team.length*100);

		f.setVisible(true);
		f.setTitle("Pokemon - Equipe");
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanEquipe pe = new PanEquipe(f);
		f.setContentPane(pe);
	}
	
}
