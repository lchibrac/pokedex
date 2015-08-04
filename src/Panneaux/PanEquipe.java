package Panneaux;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import ClassesObjets.Attaque;
import ClassesObjets.Combat;
import ClassesObjets.Equipe;
import ClassesObjets.PokemonEnCombat;
import GraphicsElements.LifeBar;
import Listes.ListeDesAttaques;
import Listes.Pokemon1G;

public class PanEquipe extends JFrame {

	private static final long serialVersionUID = 1L;
	public static Equipe _equipe;
	
	private JPanel create_pkm(JPanel pe, int i){
		JPanel pokemon = new JPanel ();
		pokemon.setLayout(new GridBagLayout());
		//pokemon.setForeground(Color.black); inutilisé, va savoir pourquoi...
		
		
		if(i == _equipe._pokemon_en_combat){
			pokemon.setBackground(new Color (87,105,138));
		}
		else{
			pokemon.setBackground(new Color (64,81,115));
		}

		//image
		
		ImageIcon img = new ImageIcon(_equipe._team[i]._image.getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		GridBagConstraints img_gbc = new GridBagConstraints();
		img_gbc.gridx = 0;
		img_gbc.gridy = 0;
		img_gbc.gridheight = 2;
		img_gbc.gridwidth = 2;
		img_gbc.anchor = GridBagConstraints.CENTER;
		img_gbc.fill = GridBagConstraints.BOTH;
		pokemon.add(new JLabel(img), img_gbc);
		
		//objet possédé
		
		GridBagConstraints img_obj_gbc = new GridBagConstraints();
		img_obj_gbc.gridx = 2;
		img_obj_gbc.gridy = 1;
		img_obj_gbc.fill = GridBagConstraints.BOTH;
			
		if(_equipe._team[i]._objet_equipe != null){
			JLabel img_obj = new JLabel();
			try {
				img_obj = new JLabel(new ImageIcon(ImageIO.read(new File("images/objets_pkm.png")).getScaledInstance(35, 40, Image.SCALE_DEFAULT)));
			} catch (IOException e) {
				e.printStackTrace();
			}
			pokemon.add(img_obj, img_obj_gbc);
		}
		else{
			//franchement dégueulasse mais je n'ai pas trouvée mieux avec le GridBagLayout... le BoxLayout propose des glue, struts et rigid area...
			pokemon.add(new JLabel("         "), img_obj_gbc);
		}


			
		
		//nom
		JLabel name = new JLabel(_equipe._team[i]._p.getFrenchNom());
		GridBagConstraints name_gbc = new GridBagConstraints();
		name_gbc.gridx = 2;
		name_gbc.gridy = 0;
		name_gbc.gridwidth = 3;
		name_gbc.insets = new Insets(7,0,0,0);
		name_gbc.fill = GridBagConstraints.BOTH;
		
		pokemon.add(name, name_gbc);
		
		//niveau
		JLabel level = new JLabel("N. "+Integer.toString(_equipe._team[i]._niveau));
		GridBagConstraints level_gbc = new GridBagConstraints();
		level_gbc.gridx = 3;
		level_gbc.gridy = 1;
		pokemon.add(level, level_gbc);
		
		//sexe
		JLabel img_sexe = null;
		try {
			if(_equipe._team[i]._sexe){
				img_sexe = new JLabel(new ImageIcon(ImageIO.read(new File("images/male.png")).getScaledInstance(18, 20, Image.SCALE_DEFAULT)));
			}
			else{
				img_sexe = new JLabel(new ImageIcon(ImageIO.read(new File("images/female.png")).getScaledInstance(18, 20, Image.SCALE_DEFAULT)));
			}
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		GridBagConstraints img_sexe_gbc = new GridBagConstraints();
		img_sexe_gbc.gridx = 4;
		img_sexe_gbc.gridy = 1;
		img_sexe_gbc.fill = GridBagConstraints.BOTH;
		img_sexe_gbc.insets = new Insets(0,5,0,5);
		pokemon.add(img_sexe, img_sexe_gbc);
		
		//PV
			//barre
		LifeBar lb = new LifeBar(0,0,_equipe._team[i]._pvActuels, _equipe._team[i]._choosedStats[0], 350, 15,new Color(0,102,0), new Color(51,204,51), true);
		GridBagConstraints lb_gbc = new GridBagConstraints();
		lb_gbc.gridx = 5;
		lb_gbc.gridy = 0;
		pokemon.add(lb, lb_gbc);
		
			//valeurs
		JLabel life_values = new JLabel(_equipe._team[i]._pvActuels+"/"+_equipe._team[i]._choosedStats[0]);
		GridBagConstraints life_values_gbc = new GridBagConstraints();
		life_values_gbc.gridx = 5;
		life_values_gbc.gridy = 1;
		life_values_gbc.anchor = GridBagConstraints.CENTER;
		pokemon.add(life_values, life_values_gbc);

		pokemon.setMaximumSize(new Dimension((int)Math.round(pokemon.getMaximumSize().getWidth()), 100));
		return pokemon;
	}
	
	private void create_menu(JPanel menu){
		menu.setLayout(new GridBagLayout());
		menu.setOpaque(false);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JButton undo = new JButton("retour");
		JButton select = new JButton("selectionner");
		JButton detail = new JButton("details");

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(5,0,5,0);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		menu.add(undo, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		menu.add(select,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weighty = 1;
		gbc.anchor = GridBagConstraints.PAGE_START;
		menu.add(detail,gbc);
		
	}
	
	public JPanel creerPage (){
		JPanel contenu = new JPanel();
		
		contenu.setLayout(new BoxLayout(contenu, BoxLayout.X_AXIS));
		contenu.setBackground(new Color (210,210,220));
		
		JPanel menu = new JPanel();
		JPanel list_pkm = new JPanel();
		
		//menu
		create_menu(menu);
		
		//liste
		list_pkm.setLayout(new BoxLayout(list_pkm, BoxLayout.Y_AXIS));
		list_pkm.setOpaque(false);
		
		list_pkm.add(Box.createRigidArea(new Dimension(0,5)));
		for(int i = 0 ; i < _equipe._team.length ; i++){
			list_pkm.add(create_pkm(list_pkm,i));
			list_pkm.add(Box.createRigidArea(new Dimension(0,5)));
		}
		list_pkm.add(Box.createVerticalGlue());
/*
		System.out.println(list_pkm.getPreferredSize()+" "+list_pkm.getMaximumSize()+" "+list_pkm.getMinimumSize());
		//list_pkm.setPreferredSize(new Dimension(533,105*_equipe._team.length+5));
		System.out.println(list_pkm.getPreferredSize()+" "+list_pkm.getMaximumSize()+" "+list_pkm.getMinimumSize());
		//list_pkm.setPreferredSize(preferredSize);*/
		
		contenu.add(menu);
		contenu.add(list_pkm);
		contenu.add(Box.createRigidArea(new Dimension(5,0)));
		return contenu;
	}
	
	public PanEquipe (Combat c){
		
		if(c.joueurActuel == 1){
			_equipe = c._j1;
		}else{
			_equipe = c._j2;
		}

		JPanel contenu = creerPage();
		
			//barre de defilement
		JScrollPane scrollPane = new JScrollPane(contenu);
		scrollPane.setViewportView(contenu);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setWheelScrollingEnabled(true); //défilement vertical avec molette de la souris
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		//si nb pokemons < 6, on adapte la taille de la fenetre et la barre de defilement n'apparaitra pas. Sinon, elle se mettra en place :)
		if(_equipe._team.length <= 6){
			setSize(800, Math.max( (int)Math.round(contenu.getPreferredSize().getHeight()+37),160));
		}else{	
			setSize(800, 750);
		}

		setVisible(true);
		setTitle("Pokemon - Equipe");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] argv) throws IOException{
		
		//TMP
		Equipe e1 = new Equipe(new PokemonEnCombat[]{
				new PokemonEnCombat(Pokemon1G.papilusion, new Attaque[]{ListeDesAttaques.abime, ListeDesAttaques.racines, ListeDesAttaques.halloween,ListeDesAttaques.lanceboue},0,new int[]{261,113,136,279,196,262},20), 
				new PokemonEnCombat(Pokemon1G.abo, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20) , 
				new PokemonEnCombat(Pokemon1G.goupix, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20),
				new PokemonEnCombat(Pokemon1G.amanox, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20) , 
				new PokemonEnCombat(Pokemon1G.dardargnan, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20), 
				new PokemonEnCombat(Pokemon1G.dodrio, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20),
				new PokemonEnCombat(Pokemon1G.dracaufeu, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20),
				new PokemonEnCombat(Pokemon1G.kokiyas, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20),
				new PokemonEnCombat(Pokemon1G.abra, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20)
				}
		, 1);

		
		Equipe e2 = new Equipe(new PokemonEnCombat[]{new PokemonEnCombat(Pokemon1G.aeromite, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20), new PokemonEnCombat(Pokemon1G.lamantine, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20),new PokemonEnCombat(Pokemon1G.kabuto, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20) , new PokemonEnCombat(Pokemon1G.caninos, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20), new PokemonEnCombat(Pokemon1G.machopeur, new Attaque[]{null, null, null,null},0,new int[]{261,113,136,279,196,262},20)}, 1);

		Combat c =  new Combat(e1,e2, true);
		c._j1.getPokemon(0)._pvActuels = 50;/*
		c._j1.getPokemon(2)._pvActuels = 20;
		c._j1.getPokemon(3)._pvActuels = 37;
		c._j1.getPokemon(1)._objet_equipe = new Objet();
		c._j1.getPokemon(1)._sexe = false;
		c._j1.getPokemon(2)._sexe = false;
		c._j1.getPokemon(3)._niveau = 25;
		c._j1.getPokemon(1)._niveau = 17;*/
//		c._j1.getPokemon(5)._niveau = 42;
		
		c._j2.getPokemon(0)._statut = 2;
		c._j2.getPokemon(0)._choosedStats[0] = 254;
		c._j2.getPokemon(0)._pvActuels = 25;
		//TMP fin
		
		new PanEquipe(c);

	}
	
}
