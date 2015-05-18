
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;



public class PokedexPage extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public PokedexPage(Pokemon p){
		
		super();
		setResizable(false);
		PanPokemon pan = new PanPokemon(p);
		setContentPane(pan);
		String s = new String("#"+p.numeroToString()+" "+p.getFrenchNom()+" / "+p.getEnglishNom());
		setTitle(s);
		setSize(600,1000);
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
		new PokedexPage(Pokemon3G.charmillon);
	}
	

}
