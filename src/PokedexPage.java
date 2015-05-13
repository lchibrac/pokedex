
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
		String s = "";
		if ( p._numero < 10 )
			s = new String("Pokemon 00"+p._numero+" "+p.getFrenchNom()+"/"+p.getEnglishNom());
		else if ( 10 < p._numero && p._numero < 100)
			s = new String("Pokemon 0"+p._numero+" "+p.getFrenchNom()+"/"+p.getEnglishNom());
		else
			s = new String("Pokemon "+p._numero+" "+p.getFrenchNom()+"/"+p.getEnglishNom());
		setTitle(s);
		setSize(600,700);
		Image icone = Toolkit.getDefaultToolkit().getImage("images/dex.gif");
		setIconImage(icone);
		setVisible(true);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
	        public void windowClosing(java.awt.event.WindowEvent evt) {
	               	setVisible(false);
	        } 
	} );
		setLocationRelativeTo(null);
		setResizable(true);
		setVisible(true);
		
	}
	
	public static void main(String[] args){
		new PokedexPage(Pokemon1G.salameche);
	}
	

}
