import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class PageRecherche extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public static Pokemon[] copie() {
		int l = Allpokemon.allpkmn.length;
		Pokemon[] poke = new Pokemon[l];
		for (int i = 0; i < l; ++i) {
			poke[i] = Allpokemon.allpkmn[i].clone();
		}
		return poke;
	}
			
	public PageRecherche() {
		
		
		super();
		setSize(600, 1000);
		Image icone = Toolkit.getDefaultToolkit().getImage("images/dex.gif");
		setIconImage(icone);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Pokedex");	
		setLocationRelativeTo(null);
		
		JPanel jp = new JPanel();
		
		JTabbedPane onglets = new JTabbedPane(SwingConstants.TOP);
		onglets.setSize(600, 1000);
		
		PanneauRecherche pr = new PanneauRecherche(onglets);
		pr.setSize(600, 1000);
		JScrollPane scroll1 = new JScrollPane(pr);
		scroll1.setSize(600,1000);
		onglets.addTab("Recherche", scroll1);
		
		PanneauListePokemon plp = new PanneauListePokemon(copie(),7);
		plp.setSize(new Dimension(600,1000));
		JScrollPane scroll2 = new JScrollPane();
		scroll2.setSize(new Dimension(600,1000));
		scroll2.add(plp);
		onglets.addTab("Liste des Pokemons",scroll2);
		
		onglets.setOpaque(true);
		jp.add(onglets);
		this.getContentPane().add(jp);
		setVisible(true);

	}
	

	public static void main(String[] argv) {
		new PageRecherche();
	}

}
