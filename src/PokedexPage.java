
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;



public class PokedexPage extends JFrame{

	public PokedexPage(Pokemon p){
		
		super();
		setResizable(true);
		PanPokemon pan = new PanPokemon(p,this);
		pan.setSize(600, pan.HEIGHT);
		JScrollPane scroll = new JScrollPane(pan);
		add(scroll);
		//setContentPane(pan);
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
		new PokedexPage(Pokemon4G.chimpenfeu);
	}
	

}
