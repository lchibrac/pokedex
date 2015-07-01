import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanCombat extends JPanel{

	private static final long serialVersionUID = 1L;

	public static Combat _c;
	public PokemonEnCombat _e1_p; //a decaller ds combat
	public PokemonEnCombat _e2_p; //a decaller ds combat
	public Image pokeball;
	
	/**
	 * inverse l'image du pokemon de la première équipe verticalement
	*/
	public void inverserPokemonVerticalement(){
		AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
		tx.translate(-_e1_p._p._image.getWidth(null), 0);
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		_e1_p._p._image = op.filter((BufferedImage) _e1_p._p._image, null);
	}
	
	public void BarrePokeballs (JPanel m, Equipe eq, boolean left){
		JPanel barre = new JPanel();
		barre.setLayout(new BoxLayout(barre, BoxLayout.X_AXIS));
		m.add(barre, BorderLayout.SOUTH);
		
		Image _pokeball = null;
		Image _pokeball_ko = null;
		int nb_pokemon = _c._j1.length();
		
		try {
			_pokeball_ko = ImageIO.read(new File("images/pokeball_ko.png"));
			_pokeball = ImageIO.read(new File("images/pokeball.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < nb_pokemon ; i++){
			ImageIcon tmp = new ImageIcon(_pokeball.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
			ImageIcon tmp_ko = new ImageIcon(_pokeball_ko.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
			if(left){
				if(_c._j1.getPokemon(i).estKO()){
					barre.add(new JLabel(tmp_ko));
				}
				else{
					barre.add(new JLabel(tmp));
				}
			}else{
				if(_c._j2.getPokemon(i).estKO()){
					barre.add(new JLabel(tmp_ko));
				}
				else{
					barre.add(new JLabel(tmp));
				}
			}
		}
		
		
	}

	public PanCombat(Combat c, final JFrame f) throws IOException{
				
		//init combat
		
		_e1_p = c.getEquipe(1).getPokemon(0);
		_e2_p = c.getEquipe(2).getPokemon(0);
		
		//init affichage
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		final JPanel match = new JPanel();
		match.setMaximumSize(new Dimension(900, 450));
		match.setLayout(new BoxLayout(match, BoxLayout.X_AXIS));
		
		
			//division verticale
		final JPanel match_left = new JPanel();
		match_left.setLayout(new BorderLayout(0,0));
		
		final JPanel match_middle = new JPanel();
		final JPanel match_right = new JPanel();
		match_right.setLayout(new BorderLayout(0,0));
		
		match_left.setPreferredSize(new Dimension(420,450));
		match_middle.setPreferredSize(new Dimension(60,450));
		match_right.setPreferredSize(new Dimension(420,450));

		
		match.add(match_left);
		match.add(match_middle);
		match.add(match_right);
		
			//composants
				//gauche
					//haut
		final JPanel match_left_top = new JPanel();
		match_left_top.setLayout(new BoxLayout(match_left_top, BoxLayout.Y_AXIS));
		match_left.add(match_left_top, BorderLayout.PAGE_START);
		
						//nom
		
		final JPanel match_left_top_name = new JPanel();
		match_left_top_name.setLayout(new BorderLayout());
		match_left_top.add(match_left_top_name);
		
		JLabel nom_pokemon_e1 = new JLabel(_e1_p._p.getFrenchNom());
		match_left_top_name.add(nom_pokemon_e1, BorderLayout.LINE_START);
		
						//barre de vie et effets
		FormComponentsRect fc = new FormComponentsRect(5,5,300,2 , 20,new Color(0,102,0), new Color(51,204,51), true);
		match_left_top.add(fc);
		
		JLabel effet_pokemon_e1 = new JLabel(); 
		String tmp = Integer.toString(_e1_p._pvActuels);
		if(_e1_p._statut != 0){
			tmp = tmp.concat(" - "+_e1_p.getStatut());
		}
		effet_pokemon_e1.setText(tmp);
		match_left_top.add(effet_pokemon_e1);
		
					//image
		inverserPokemonVerticalement();
		JLabel _e1_p_img = new JLabel(new ImageIcon(_e1_p._p._image));
		match_left.add(_e1_p_img, BorderLayout.CENTER);
		
		BarrePokeballs (match_left,_c._j1, true);
		
				//milieu
		
		JLabel nb_tours = new JLabel(Integer.toString(c.getnbTours()));
		match_middle.add(nb_tours);
		
		
				//droite
					//haut		
		final JPanel match_right_top = new JPanel();
		
		match_right_top.setLayout(new BoxLayout(match_right_top, BoxLayout.Y_AXIS));
		match_right.add(match_right_top, BorderLayout.PAGE_START);
		
						//nom
		final JPanel match_right_top_name = new JPanel();
		match_right_top_name.setLayout(new BorderLayout());
		match_right_top.add(match_right_top_name);
		
		JLabel nom_pokemon_e2 = new JLabel(_e2_p._p.getFrenchNom());
		match_right_top_name.add(nom_pokemon_e2, BorderLayout.LINE_END);
		
						//barre de vie et effets
		FormComponentsRect fc2 = new FormComponentsRect(65,5,100, 350, 20,new Color(0,102,0), new Color(51,204,51), false);
		match_right_top.add(fc2);
		
		JLabel effet_pokemon_e2 = new JLabel(); // on doit ajoute l'effet (dodo, empoisonne...) sur l'occurence du pokemon
		tmp = Integer.toString(_e2_p._pvActuels);
		if(_e2_p._statut != 0){
			tmp = tmp.concat(" - "+_e2_p.getStatut());
		}
		effet_pokemon_e2.setText(tmp);
		
		match_right_top.add(effet_pokemon_e2);
		
					//image
		JLabel _e2_p_img = new JLabel(new ImageIcon(_e2_p._p._image));
		match_right.add(_e2_p_img, BorderLayout.CENTER);
		
		BarrePokeballs (match_right,_c._j2, false);
		
		//MESSAGE

		final JPanel messages = new JPanel();
		messages.setMaximumSize(new Dimension(900,50));
		messages.setBackground(new Color(180,190,182));
				
		final JLabel message = new JLabel("Bonjour et bienvenue dans la Ligue. Le match va commencer.");
		messages.add(message);
		
		//MENU
		
		final JPanel menu = new JPanel();
		menu.setMaximumSize(new Dimension(900, 250));
		menu.setBackground(new Color(150,170,182));
		
		
		Button b = new Button();
		class Bouton implements ActionListener{
			public void actionPerformed(ActionEvent e){
				message.setText("ce fut un match passionnant, merci pour ce combat !");
			}
		}
		b.addActionListener(new Bouton());
		menu.add(b);
		

		this.add(match);	
		this.add(menu);
		this.add(messages);
		 
		
	}
	
	public static void main(String[] argv) throws IOException{
		
		//TMP
		Equipe e1 = new Equipe(new PokemonEnCombat[]{new PokemonEnCombat(Pokemon1G.papilusion, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262}), new PokemonEnCombat(Pokemon1G.abo, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262}) , new PokemonEnCombat(Pokemon1G.goupix, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262}),new PokemonEnCombat(Pokemon1G.amanox, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262}) , new PokemonEnCombat(Pokemon1G.dardargnan, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262}), new PokemonEnCombat(Pokemon1G.dodrio, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262})}, 1);
		Equipe e2 = new Equipe(new PokemonEnCombat[]{new PokemonEnCombat(Pokemon1G.aeromite, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262}), new PokemonEnCombat(Pokemon1G.grotadmorv, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262}) , new PokemonEnCombat(Pokemon1G.lamantine, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262}),new PokemonEnCombat(Pokemon1G.kabuto, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262}) , new PokemonEnCombat(Pokemon1G.caninos, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262}), new PokemonEnCombat(Pokemon1G.machopeur, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262})}, 1);

		_c =  new Combat(e1,e2);
		_c._j1.getPokemon(0)._pvActuels = 50;
		_c._j1.getPokemon(2)._pvActuels = 0;
		_c._j1.getPokemon(3)._pvActuels = 0;
		_c._j2.getPokemon(0)._statut = 2;
		
		JFrame f = new JFrame();
		PanCombat pgs = new PanCombat(_c, f);
		f.setContentPane(pgs);
		f.setSize(900, 750);
		f.setVisible(true);
		f.setTitle("Pokemon - Combat");
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
