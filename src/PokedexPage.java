
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;



public class PokedexPage extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public PokedexPage(Pokemon p){
		
		super();

		setResizable(false);
		
		setSize(new Dimension(600,1000));
		PanPokemon pan = new PanPokemon(p,this);
		pan.setSize(600,1000);
		JScrollPane scroll = new JScrollPane(pan);
		add(scroll);

		String s = new String("#"+p.numeroToString()+" "+p.getFrenchNom()+" / "+p.getEnglishNom());
		setTitle(s);
		
		Image icone = Toolkit.getDefaultToolkit().getImage("images/dex.gif");
		setIconImage(icone);
		setVisible(true);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
	        public void windowClosing(java.awt.event.WindowEvent evt) {
	               	setVisible(false);
	        } 
	} );
		setLocationRelativeTo(null);
		setForeground(Color.black);


		
	}

	public static void main(String[] args){
		new PokedexPage(Pokemon5G.clamiral);
	}
	

}
