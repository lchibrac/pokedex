
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
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

	public Image pokeball;
	final JLabel message = new JLabel();
	
	/**
	 * inverse l'image du pokemon de la premiere equipe verticalement
	*/
	public void inverserPokemonVerticalement(){
		AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
		tx.translate(-_c._j1._team[_c._e1_p]._p._image.getWidth(null), 0);
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		_c._j1._team[_c._e1_p]._p._image = op.filter((BufferedImage) _c._j1._team[_c._e1_p]._p._image, null);
	}
	
	public class FormComponentsRect extends JPanel{
		
		private static final long serialVersionUID = 1L;
		
		public boolean _left;
		public int _x;
		public int _y;
		public int _height;
		public int _width;
		public int _fore_width;
		public Color _c;
		public Color _fore_c;
		
		public FormComponentsRect(int fore_width, Color fore_c){
			_left = true;
			_x = 0;
			_y = 0;
			_fore_width = fore_width;
			_width = 350;
			_height = 15;
			_c = Color.BLACK;
			_fore_c = fore_c;
			setPreferredSize(new Dimension(_width,_height));
		}
		
		public FormComponentsRect(int fore_width, int height, Color fore_c, Color c){
			this(fore_width,fore_c);
			_height = height;
			_c = c;
			setPreferredSize(new Dimension(_width,_height));
		}
		
		public FormComponentsRect(int x, int y, int fore_width, int width, int height, Color fore_c , Color c, boolean left){
			
			this(fore_width,height,fore_c,c);
			_x = x;
			_y = y;
			
			_left = left;
			_width = width;
			setPreferredSize(new Dimension(_width,_height));
		}
		
		public Color getColor(){
			return _c;
		} 
		
		public Color getForeColor(){
			return _fore_c;
		} 
		
		public Dimension getPreferredSize(){
			return new Dimension(_fore_width,_height);
		}
		
		public Dimension getMinimumSize(){
			return new Dimension(_fore_width,_height);
		}
		
		
		public void paintComponent(Graphics g){

			g.setColor(_c);
			g.fillRect(_x, _y, _width, _height);
			g.setColor(_fore_c);
			if(_left){
				g.fillRect(_x, _y, _fore_width, _height);
			}else{
				g.fillRect(_x+(_width-_fore_width), _y, _fore_width, _height);
			}
			
		}
		
	}
	
	public class PokeballBar extends JPanel{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		public Equipe _e;
		public boolean _left;
		
		public PokeballBar(Equipe e, boolean left){
			_e = e;
			_left = left;
		}
		
		public void paintComponent(Graphics g){
			Image _pokeball = null;
			Image _pokeball_ko = null;
			Image _pokeball_affected = null;
			int nb_pokemon = _e._team.length;
			
			try {
				_pokeball_affected = ImageIO.read(new File("images/pokeball_affected.png"));
				_pokeball_ko = ImageIO.read(new File("images/pokeball_ko.png"));
				_pokeball = ImageIO.read(new File("images/pokeball.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			ImageIcon tmp = new ImageIcon(_pokeball.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
			ImageIcon tmp_ko = new ImageIcon(_pokeball_ko.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
			ImageIcon tmp_affected = new ImageIcon(_pokeball_affected.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
			
			for(int i = 0; i < nb_pokemon ; i++){
	
				if(_e.getPokemon(i).estKO()){
					add(new JLabel(tmp_ko));
				}
				else if(_e.getPokemon(i)._statut > 0){
					add(new JLabel(tmp_affected));
				}
				else{
					add(new JLabel(tmp));
				}
			}
		}
	}
	
	public void match(JPanel match){
		
		match.setMaximumSize(new Dimension(900, 450));
		match.setLayout(new GridBagLayout());
		
		// 3 * 5
		/*
		 *  nom        | nb tours | nom
		 *  barre vie  |          | barre vie
		 *  infos vie  |          | infos vie
		 *  
		 *  image      |          | image
		 *  
		 *  pokeballs  |          | pokeballs

		*/
		
		
		//gridheight,gridwidth => nb colonnes et lignes occupÈs par un composant
		//fill => redimensionne si on lui donne trop d'espace : none, horizontal, vertical both 
		//insets => marges en pixels autour du composant
		//weightx weighty => utilisation de l'espace supplÈmentaire
		//gridx, gridy => a redefinir avant de placer chaque element. Dit o˘ le placer.
		//ipadx, ipady => marges internes du composant
		//anchor =>point d'ancrage du composant dans sa/ses cellule(s)
		
		
			//gauche
				//nom
		JLabel e1_name = new JLabel(_c._j1._team[_c._e1_p]._p.getFrenchNom());
		GridBagConstraints e1_name_gbc = new GridBagConstraints();
		e1_name_gbc.gridx = 0;
		e1_name_gbc.gridy = 0;
		e1_name_gbc.insets = new Insets(10,0,0,0);
		e1_name_gbc.anchor = GridBagConstraints.PAGE_START;
		e1_name_gbc.weightx = 1;
		match.add(e1_name, e1_name_gbc);
				//barre de vie
		//PROBLEME DE TAILLE ... LA BARRE EST RESTRAINTE ! TMP
		FormComponentsRect e1_lifebar = new FormComponentsRect(5,5,_c._j1._team[_c._e1_p]._pvActuels, _c._j1._team[_c._e1_p]._choosedStats[0] , 20,new Color(0,102,0), new Color(51,204,51), true);
		e1_lifebar.setPreferredSize(new Dimension(450,30));
		e1_lifebar.setMinimumSize(new Dimension(450,30));
		GridBagConstraints e1_lifebar_gbc = new GridBagConstraints();
		e1_lifebar_gbc.gridx = 0;
		e1_lifebar_gbc.gridy = 1;
		e1_lifebar_gbc.insets = new Insets(0,5,0,0);
		e1_lifebar_gbc.anchor = GridBagConstraints.LINE_START;
		match.add(e1_lifebar,e1_lifebar_gbc);
				//effets
		JLabel effet_pokemon_e1 = new JLabel(); 
		String tmp = Integer.toString(_c._j1._team[_c._e1_p]._pvActuels);
		if(_c._j1._team[_c._e1_p]._statut != 0){
			tmp = tmp.concat(" - "+_c._j1._team[_c._e1_p].getStatut());
		}
		effet_pokemon_e1.setText(tmp);
		GridBagConstraints e1_effet_gbc = new GridBagConstraints();
		e1_effet_gbc.gridx = 0;
		e1_effet_gbc.gridy = 2;
		e1_effet_gbc.insets = new Insets(0,10,0,0);
		e1_effet_gbc.anchor = GridBagConstraints.LINE_START;
		match.add(effet_pokemon_e1, e1_effet_gbc);
		
			//image
		
		
		inverserPokemonVerticalement();
		JLabel e1_img = new JLabel(new ImageIcon(_c._j1._team[_c._e1_p]._p._image));
		GridBagConstraints e1_img_gbc = new GridBagConstraints();
		e1_img_gbc.gridx = 0;
		e1_img_gbc.gridy = 3;
		e1_img_gbc.weighty = 1;
		e1_img_gbc.anchor = GridBagConstraints.CENTER;
		match.add(e1_img, e1_img_gbc);
		
			//barre pokeballs
		PokeballBar e1_pb= new PokeballBar(_c._j1, true);
		GridBagConstraints e1_pb_gbc = new GridBagConstraints();
		e1_pb_gbc.gridx = 0;
		e1_pb_gbc.gridy = 4;
		e1_pb_gbc.anchor = GridBagConstraints.LAST_LINE_START;
		match.add(e1_pb,e1_pb_gbc);
		
			//milieu
		JLabel nb_tours = new JLabel(Integer.toString(_c.getnbTours()));
		GridBagConstraints nb_tours_gbc = new GridBagConstraints();
		nb_tours_gbc.gridx = 1;
		nb_tours_gbc.gridy = 0;
		nb_tours_gbc.anchor = GridBagConstraints.CENTER;
		match.add(nb_tours, nb_tours_gbc);
		
			//droite
				//name
		JLabel e2_name = new JLabel(_c._j2._team[_c._e2_p]._p.getFrenchNom());
		GridBagConstraints e2_name_gbc = new GridBagConstraints();
		e2_name_gbc.gridx = 2;
		e2_name_gbc.gridy = 0;
		e2_name_gbc.insets = new Insets(10,0,0,0);
		e2_name_gbc.anchor = GridBagConstraints.PAGE_START;
		e2_name_gbc.weightx = 1;
		match.add(e2_name, e2_name_gbc);
		
		//effets
		JLabel effet_pokemon_e2 = new JLabel(); 
		tmp = Integer.toString(_c._j2._team[_c._e2_p]._pvActuels);
		if(_c._j2._team[_c._e2_p]._statut != 0){
			tmp = tmp.concat(" - "+_c._j2._team[_c._e2_p].getStatut());
		}
		effet_pokemon_e2.setText(tmp);
		GridBagConstraints e2_effet_gbc = new GridBagConstraints();
		e2_effet_gbc.gridx = 2;
		e2_effet_gbc.gridy = 2;
		e2_effet_gbc.insets = new Insets(0,0,0,10);
		e2_effet_gbc.anchor = GridBagConstraints.LINE_END;
		match.add(effet_pokemon_e2, e2_effet_gbc);
		
			//image
		JLabel e2_img = new JLabel(new ImageIcon(_c._j2._team[_c._e2_p]._p._image));
		GridBagConstraints e2_img_gbc = new GridBagConstraints();
		e2_img_gbc.gridx = 2;
		e2_img_gbc.gridy = 3;
		e2_img_gbc.weighty = 1;
		e2_img_gbc.anchor = GridBagConstraints.CENTER;
		match.add(e2_img, e2_img_gbc);
		
			//barre pokeballs
		PokeballBar e2_pb= new PokeballBar(_c._j2, true);
		GridBagConstraints e2_pb_gbc = new GridBagConstraints();
		e2_pb_gbc.gridx = 2;
		e2_pb_gbc.gridy = 4;
		e2_pb_gbc.anchor = GridBagConstraints.LAST_LINE_END;
		match.add(e2_pb,e2_pb_gbc);
		
		/*
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
		
		JLabel nom_pokemon_e1 = new JLabel(_c._j1._team[_c._e1_p]._p.getFrenchNom());
		match_left_top_name.add(nom_pokemon_e1, BorderLayout.LINE_START);
		
						//barre de vie et effets
		FormComponentsRect fc = new FormComponentsRect(5,5,_c._j1._team[_c._e1_p]._pvActuels, _c._j1._team[_c._e1_p]._choosedStats[0] , 20,new Color(0,102,0), new Color(51,204,51), true);
		match_left_top.add(fc);
		
		JLabel effet_pokemon_e1 = new JLabel(); 
		String tmp = Integer.toString(_c._j1._team[_c._e1_p]._pvActuels);
		if(_c._j1._team[_c._e1_p]._statut != 0){
			tmp = tmp.concat(" - "+_c._j1._team[_c._e1_p].getStatut());
		}
		effet_pokemon_e1.setText(tmp);
		match_left_top.add(effet_pokemon_e1);
		
					//image
		inverserPokemonVerticalement();
		JLabel _e1_p_img = new JLabel(new ImageIcon(_c._j1._team[_c._e1_p]._p._image));
		match_left.add(_e1_p_img, BorderLayout.CENTER);
		
		BarrePokeballs (match_left,_c._j1, true);
		
				//milieu
		
		JLabel nb_tours = new JLabel(Integer.toString(_c.getnbTours()));
		match_middle.add(nb_tours);
		
		
				//droite
					//haut		
		final JPanel match_right_top = new JPanel();
		
		match_right_top.setLayout(new BorderLayout());
		match_right.add(match_right_top, BorderLayout.PAGE_START);
		
						//nom
		final JPanel match_right_top_name = new JPanel();
		match_right_top_name.setLayout(new BorderLayout());
		match_right_top.add(match_right_top_name, BorderLayout.NORTH);
		
		JLabel nom_pokemon_e2 = new JLabel(_c._j2._team[_c._e2_p]._p.getFrenchNom());
		match_right_top_name.add(nom_pokemon_e2, BorderLayout.LINE_END);
		
						//barre de vie et effets
		FormComponentsRect fc2 = new FormComponentsRect(5,5, _c._j2._team[_c._e2_p]._pvActuels, _c._j2._team[_c._e2_p]._choosedStats[0], 20,new Color(0,102,0), new Color(51,204,51), false);
		match_right_top.add(fc2,BorderLayout.CENTER );
		
		JLabel effet_pokemon_e2 = new JLabel(); // on doit ajoute l'effet (dodo, empoisonne...) sur l'occurence du pokemon
		tmp = Integer.toString(_c._j2._team[_c._e2_p]._pvActuels);
		if(_c._j2._team[_c._e2_p]._statut != 0){
			tmp = tmp.concat(" - "+_c._j2._team[_c._e2_p].getStatut());
		}
		effet_pokemon_e2.setText(tmp);
		
		match_right_top.add(effet_pokemon_e2, BorderLayout.SOUTH);
		
					//image
		JLabel _e2_p_img = new JLabel(new ImageIcon(_c._j2._team[_c._e2_p]._p._image));
		match_right.add(_e2_p_img, BorderLayout.CENTER);
		
		BarrePokeballs (match_right,_c._j2, false);
		*/
		
	}

	public void menu(JPanel menu){
		
		menu.setLayout(new GridLayout(2, 4));
		
		//ensemble des boutons, affich√©s ou non
		
		Button atq1 = new Button();
		Button atq2 = new Button();
		Button atq3 = new Button();
		Button atq4 = new Button();
		
		if(_c.joueurActuel == 1){
			atq1.setLabel(_c._j1._team[_c._e1_p]._listeDesAttaques[0]._nom);
			atq2.setLabel(_c._j1._team[_c._e1_p]._listeDesAttaques[1]._nom);
			atq3.setLabel(_c._j1._team[_c._e1_p]._listeDesAttaques[2]._nom);
			atq4.setLabel(_c._j1._team[_c._e1_p]._listeDesAttaques[3]._nom);
		}
		else{
			atq1.setLabel(_c._j2._team[_c._e2_p]._listeDesAttaques[0]._nom);
			atq2.setLabel(_c._j2._team[_c._e2_p]._listeDesAttaques[1]._nom);
			atq3.setLabel(_c._j2._team[_c._e2_p]._listeDesAttaques[2]._nom);
			atq4.setLabel(_c._j2._team[_c._e2_p]._listeDesAttaques[3]._nom);	
		}
		
		Button inventaire = new Button("Inventaire");
		Button chg_pkm = new Button("Changer de Pokemon");
		Button mega_evo = new Button("Mega-evolution");
		Button fuite = new Button("Fuite");
		
		//ligne 1
		menu.add(atq1);
		menu.add(atq2);
		menu.add(inventaire);
		menu.add(chg_pkm);
		//ligne 2
		menu.add(atq3);
		menu.add(atq4);
		menu.add(mega_evo);
		if(!_c._vs_dresseur){
			menu.add(fuite);
		}
		
		//actions des boutons
		
		class MegaEvolution implements ActionListener{
			public void actionPerformed(ActionEvent e){
				_c._mega_evolution = true;
				//va appliquer la modif du pokemon lors de l'attaque
				if(_c.joueurActuel == 1){
					
					_c._j1._team[_c._e1_p]._mega_evolution = true;
					// WARNING ! ON DOIT AJOUTER LE CHANGEMENT DE STATS ET TOUT!
				}
				else{
					_c._j2._team[_c._e2_p]._mega_evolution = true;
					// WARNING ! ON DOIT AJOUTER LE CHANGEMENT DE STATS ET TOUT!
				}

			}
		}
		mega_evo.addActionListener(new MegaEvolution());
		
		class Fuite implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if(_c.joueurActuel == 1){
					_c._gagnant = 2;
				}
				else{
					_c._gagnant = 1;
				}
			}
		}
		fuite.addActionListener(new Fuite());
		
		class ListePokemon implements ActionListener{
			public void actionPerformed(ActionEvent e){
				//ouvrir la liste des pokemons dans une nouvelle page. 
				//lorsqu'il a selectionn√©, changer le pokemon actil de la bonne equipe
			}
		}
		chg_pkm.addActionListener(new ListePokemon());
		
		class Inventaire implements ActionListener{
			public void actionPerformed(ActionEvent e){
				//ouvre le panneau de l'inventaire, a cr√©er :D
			}
		}
		inventaire.addActionListener(new Inventaire());
		
			//attaques
		class Atq1 implements ActionListener{

				public void actionPerformed(ActionEvent e) {
					if(_c.joueurActuel == 1){
						_c._j1._team[_c._e1_p]._listeDesAttaques[0].effet(_c._j1._team[_c._e1_p], _c._j2._team[_c._e2_p]);
					}
					else{
						_c._j2._team[_c._e2_p]._listeDesAttaques[0].effet(_c._j2._team[_c._e2_p], _c._j1._team[_c._e1_p]);
					}
				}
		}
		atq1.addActionListener(new Atq1());
		
		class Atq2 implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				if(_c.joueurActuel == 1){
					_c._j1._team[_c._e1_p]._listeDesAttaques[1].effet(_c._j1._team[_c._e1_p], _c._j2._team[_c._e2_p]);
				}
				else{
					_c._j2._team[_c._e2_p]._listeDesAttaques[1].effet(_c._j2._team[_c._e2_p], _c._j1._team[_c._e1_p]);
				}
			}
		}
		atq2.addActionListener(new Atq2());
		
		class Atq3 implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				if(_c.joueurActuel == 1){
					_c._j1._team[_c._e1_p]._listeDesAttaques[2].effet(_c._j1._team[_c._e1_p], _c._j2._team[_c._e2_p]);
				}
				else{
					_c._j2._team[_c._e2_p]._listeDesAttaques[2].effet(_c._j2._team[_c._e2_p], _c._j1._team[_c._e1_p]);
				}
			}
		}
		atq3.addActionListener(new Atq3());
		
		class Atq4 implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				if(_c.joueurActuel == 1){
					_c._j1._team[_c._e1_p]._listeDesAttaques[3].effet(_c._j1._team[_c._e1_p], _c._j2._team[_c._e2_p]);
				}
				else{
					_c._j2._team[_c._e2_p]._listeDesAttaques[3].effet(_c._j2._team[_c._e2_p], _c._j1._team[_c._e1_p]);
				}				
			}
		}
		atq4.addActionListener(new Atq4());
		
		//b.setToolTipText("Help text for the button");
		
		
		
		
		
		
		/*
		 * Pour les boutons d'attaque, je pense pas faire une classe ici, mais que l'on fasse une classe Attaques 
		 * qui regroupera les actions des differentes attaques
		*/
		
		/*
		Button b = new Button();
		class Bouton implements ActionListener{
			public void actionPerformed(ActionEvent e){
				message.setText("ce fut un match passionnant, merci pour ce combat !");
			}
		}
		b.addActionListener(new Bouton());
		menu.add(b);
		*/
	}
	
	public PanCombat(final JFrame f) throws IOException{

		//init affichage
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		final JPanel match = new JPanel();
		match(match);
		
		//MESSAGE

		final JPanel messages = new JPanel();
		messages.setMaximumSize(new Dimension(900,50));
		messages.setBackground(new Color(180,190,182));
				
		final JLabel message = new JLabel("Bonjour et bienvenue dans la Ligue. Le match va commencer.");
		messages.add(message);
		
		//MENU
		
		final JPanel menu = new JPanel();
		menu.setMaximumSize(new Dimension(900, 250));
		menu.setBackground(new Color(211,211,211));//(255,235,205));
		
		menu(menu);
		
		
		
		//Assemblage des differentes categories.
		this.add(match);
		this.add(menu);
		this.add(messages);
	}
	
	public static void main(String[] argv) throws IOException{
		
		//TMP
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
		PanCombat pgs = new PanCombat(f);
		f.setContentPane(pgs);
		f.setSize(900, 750);
		f.setVisible(true);
		f.setTitle("Pokemon - Combat");
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
