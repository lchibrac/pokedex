package Panneaux;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import ClassesObjets.Attaque;
import ClassesObjets.PokemonEnCombat;
import GraphicsElements.LifeBar;
import Listes.ListeDesAttaques;
import Listes.Pokemon1G;

public class PanPokemonEnCombat  extends JFrame {

	private static final long serialVersionUID = 1L;
	public PokemonEnCombat _p;
	
	
	public class Line extends JPanel{

		public int _x1, _y1, _x2, _y2;
		private static final long serialVersionUID = 1L;

		public Line(int x1, int y1, int x2, int y2){
			_x1 = x1;
			_y1 = y1;
			_x2 = x2;
			_y2 = y2;
		}
		
 		public void paintComponent(Graphics g){ 
 			/*
 			this.setPreferredSize(new Dimension(Math.max(_x2 - _x1, 2), Math.max(_y2 - _y1, 2)));
 			this.setSize(new Dimension(Math.max(_x2 - _x1, 2), Math.max(_y2 - _y1, 2)));
 			*/
 			//System.out.println();
 			g.drawLine(_x1, _y1, _x2, _y2);
 		}
	}
	
	public JPanel segment1(){
		JPanel contenu = new JPanel();
		contenu.setLayout(new GridBagLayout());
		
		//img
		JLabel img = new JLabel(new ImageIcon(_p._image));
		GridBagConstraints img_gbc = new GridBagConstraints();
		img_gbc.gridx = 0;
		img_gbc.gridy = 0;
		img_gbc.gridheight = 3;
		img_gbc.insets = new Insets(5,5,5,5);
		img_gbc.anchor = GridBagConstraints.LINE_START;
		contenu.add(img, img_gbc);
		
		//nom
		JLabel name = new JLabel(_p.getFrenchNom());
		GridBagConstraints name_gbc = new GridBagConstraints();
		name_gbc.gridx = 1;
		name_gbc.gridy = 0;
		//name_gbc.insets = new Insets(10,0,0,0);
		name_gbc.anchor = GridBagConstraints.LINE_START;
		contenu.add(name, name_gbc);
		
		//sexe
		JLabel sex = new JLabel();
		try {
			if(_p._sexe){
				sex = new JLabel(new ImageIcon(ImageIO.read(new File("images/male.png")).getScaledInstance(18, 20, Image.SCALE_DEFAULT)));
			}
			else{
				sex = new JLabel(new ImageIcon(ImageIO.read(new File("images/female.png")).getScaledInstance(18, 20, Image.SCALE_DEFAULT)));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		GridBagConstraints sex_gbc = new GridBagConstraints();
		sex_gbc.gridx = 2;
		sex_gbc.gridy = 0;
		sex_gbc.insets = new Insets(0,5,0,5);
		sex_gbc.weightx = 1;
		sex_gbc.anchor = GridBagConstraints.CENTER;
		contenu.add(sex, sex_gbc);
		
		//level
		JLabel level = new JLabel("N. "+Integer.toString(_p._niveau));
		GridBagConstraints level_gbc = new GridBagConstraints();
		level_gbc.gridx = 3;
		level_gbc.gridy = 0;
		level_gbc.insets = new Insets(0,0,0,5);
		contenu.add(level, level_gbc);
		
		//talent
		JLabel talent = new JLabel("Talent : "+Listes.Talent.listeTalents[_p._talentChoisi]._fr);
		GridBagConstraints talent_gbc = new GridBagConstraints();
		talent_gbc.gridx = 1;
		talent_gbc.gridy = 1;
		talent_gbc.anchor =  GridBagConstraints.LINE_START;
		contenu.add(talent, talent_gbc);
		
		//Statut
		JLabel statut = new JLabel("Situation : "+_p.getStatut());
		GridBagConstraints statut_gbc = new GridBagConstraints();
		statut_gbc.gridx = 2;
		statut_gbc.gridy = 1;
		statut_gbc.gridwidth = 2;
		statut_gbc.anchor = GridBagConstraints.CENTER;
		contenu.add(statut, statut_gbc);
		
		//barre de vie
		LifeBar lifebar = new LifeBar(0,0,_p._pvActuels, _p._choosedStats[0] , 350, 15,new Color(0,102,0), new Color(51,204,51), true);
		GridBagConstraints lifebar_gbc = new GridBagConstraints();
		lifebar_gbc.gridx = 1;
		lifebar_gbc.gridy = 2;
		lifebar_gbc.gridwidth = 3;
//		lifebar_gbc.insets = new Insets(0,5,0,5);
		lifebar_gbc.anchor = GridBagConstraints.CENTER;
		contenu.add(lifebar,lifebar_gbc);
		
		//donnees vie
		JLabel life = new JLabel(_p._pvActuels+"/"+_p._choosedStats[0]);
		GridBagConstraints life_gbc = new GridBagConstraints();
		life_gbc.gridx = 1;
		life_gbc.gridy = 3;
		life_gbc.gridwidth = 3;
//		life_gbc.insets = new Insets(0,0,0,0);
		life_gbc.anchor = GridBagConstraints.CENTER;
		contenu.add(life,life_gbc);
		
		return contenu;
	}
	
	public JPanel segment2(){
		JPanel contenu = new JPanel();
		
		//attaques
		Object tmp[][] = {(Object [])_p._listeDesAttaques};
		
		
		
		JLabel esquive = new JLabel();
		
		
		return contenu;
	}
	
	public JPanel page(){
		JPanel page = new JPanel();
		page.setLayout(new BoxLayout(page,BoxLayout.Y_AXIS));
		
		JPanel segment1 = segment1();
		JPanel segment2 = segment2();
		JPanel objet = new JPanel();
		
		page.add(segment1);
		//page.add(new Line(30, (int)Math.round(segment1.getPreferredSize().getHeight()+1), (int)Math.round(page.getPreferredSize().getWidth()) -30 , (int)Math.round(segment1.getPreferredSize().getHeight()+1)));
		page.add(segment2);
		page.add(objet);
		return page;
	}
	
	public PanPokemonEnCombat(PokemonEnCombat pec){
		_p = pec;
		
		JPanel ppec = page();
		
		setContentPane(ppec);
		setSize(800, 700);
		setVisible(true);
		setTitle("Pokemon - "+pec.getFrenchNom());
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		//TMP
		PokemonEnCombat exemple = new PokemonEnCombat(Pokemon1G.papilusion, new Attaque[]{ListeDesAttaques.abime, ListeDesAttaques.racines, ListeDesAttaques.halloween,ListeDesAttaques.lanceboue},0,new int[]{261,113,136,279,196,262},20); 
		//FIN TMP

		new PanPokemonEnCombat(exemple);
		
	}

}
