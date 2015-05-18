
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class PanPresentation extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public PanPresentation(Pokemon p){
		setSize(new Dimension(600,200));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setBackground(Color.WHITE);

		
		PanImagePokemon im = new PanImagePokemon(p);
		im.setSize(250, 200);
		PanLabelPresentation plp = new PanLabelPresentation(p);
		plp.setSize(245, 200);
		PanType pty = new PanType(p);
		pty.setSize(75, 200);
		
		add(im);
		add(plp);
		add(pty);
	}

}
