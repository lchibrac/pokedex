import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Combat {

	public Combat(Equipe j1, Equipe j2){
		
	}
	
//	public boolean fin(){
//		boolean fin = true;
//		int min = Math.min(_j1.length(),_j2.length());
//		for (int i = 0 ; i < min ; ++i ){
//			
//		}
//	}
	
	public static void initialisation(){
		
	}
	
	public Equipe _j1;
	public Equipe _j2;
	
	public static void main(String[] argv){
		
		final PokemonEnCombat smogogo = new PokemonEnCombat(Pokemon1G.smogogo,
				new Attaque[]{AttaqueDegat.bombbeurk, AttaqueDegat.harcelement, AttaqueDegat.lanceflamme,Attaque.toxic},
				0,new int[]{334,194,339,226,176,156},100);
		final PokemonEnCombat lamantine = new PokemonEnCombat(Pokemon1G.lamantine, 
				new Attaque[]{Attaque.repos,Attaque.toxic,AttaqueDegat.laserglace,AttaqueDegat.surf},
				0,new int[]{384,158,196,176,317,176} , 100);
		
		Combat c = new Combat(new Equipe(new Pokemon[]{lamantine}, 1), new Equipe(new Pokemon[]{smogogo}, 0));
		
		JFrame fight = new JFrame();
			
		PanCombat up = new PanCombat(c, fight);
		
		JPanel jp = new JPanel();
		jp.setSize(up.getWidth(), up.getHeight()+100);
		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
		jp.add(up);
			
		JPanel attaques = new JPanel();
		attaques.setLayout(new BoxLayout(attaques, BoxLayout.X_AXIS));
		
		class Att implements ActionListener{
			public Att(int i){
				_i =i;
			}
			
			public final int _i;
			public void actionPerformed(ActionEvent e){
				PokemonEnCombat.attaque(lamantine._listeDesAttaques[_i], lamantine, smogogo);
			}
		}
		
		for(int i = 0 ; i < 4 ; ++i){
			JButton jb = new JButton(lamantine._listeDesAttaques[i]._nom, new ImageIcon(lamantine._listeDesAttaques[i]._t._image));
			jb.addActionListener(new Att(i));
			jb.setMinimumSize(new Dimension(200, 50));
			attaques.add(jb);
		}
		
		jp.add(attaques);
		fight.setContentPane(jp);
		fight.setVisible(true);
		fight.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fight.setTitle("JGITZJIOZTYE");
		fight.setSize(900,900);
		
	}
	
}
