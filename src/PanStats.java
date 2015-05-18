import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanStats extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public PanStats(final Pokemon p){	
			
		class PanStatsRect extends JPanel{
			private static final long serialVersionUID = 1L;
			public PanStatsRect(){
				this.setBackground(Color.white);
				this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
				add(new PanRect(p, 0));
				add(new PanRect(p, 1));
				add(new PanRect(p, 2));
				add(new PanRect(p, 3));
				add(new PanRect(p, 4));
				add(new PanRect(p, 5));
				
			}
		}
	
		class PanStatsString extends JPanel{
			private static final long serialVersionUID = 1L;
			public PanStatsString(){
				this.setBackground(Color.WHITE);
				this.setLayout(new GridLayout(6, 2));
		
				this.add(new JLabel("Points de Vie : "));
				this.add(new JLabel(""+p.getStat().getStat()[0]));
		
		
				this.add(new JLabel("Attaque : "));
				this.add(new JLabel(""+p.getStat().getStat()[1]));
				
		
				this.add(new JLabel("Defense : "));
				this.add(new JLabel(""+p.getStat().getStat()[2]));
				
		
				this.add(new JLabel("Attaque Speciale : "));
				this.add(new JLabel(""+p.getStat().getStat()[3]));
				
		
				this.add(new JLabel("Defense Speciale : "));
				this.add(new JLabel(""+p.getStat().getStat()[4]));
				
		
				this.add(new JLabel("Vitesse : "));
				this.add(new JLabel(""+p.getStat().getStat()[5]));
				
			}
		}
		
		PanStatsString pss = new PanStatsString();
		pss.setSize(150, 150);
		PanStatsRect psr = new PanStatsRect();

		setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		add(pss);
		add(psr);
		
	}
}
