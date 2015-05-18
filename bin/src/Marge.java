import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;


public class Marge extends JPanel {
	
	public Marge(Color c, Dimension d){
		_d = (Dimension)d.clone();
		setForeground(c);
		setBackground(c);
	}
	
	public Dimension getDimension(){
		return (Dimension) _d.clone();
	}
	
	private Dimension _d;
}
