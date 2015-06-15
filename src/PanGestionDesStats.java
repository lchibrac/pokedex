import javax.swing.*;

public class PanGestionDesStats extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public void setParameter(JSlider s){
		s.setMaximum(252);
		s.setMinimum(0);
		s.setSize(90,10);
		s.setMinorTickSpacing(1);
	}
	
	public PanGestionDesStats(Pokemon p){
		setSize(500,500);
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		int pv =Stat.allstats[p._numero].getStat()[0];
		int atq =Stat.allstats[p._numero].getStat()[1];
		int def =Stat.allstats[p._numero].getStat()[2];
		int atqs =Stat.allstats[p._numero].getStat()[3];
		int defs =Stat.allstats[p._numero].getStat()[4];
		int vit =Stat.allstats[p._numero].getStat()[5];
		
		
		JPanel first = new JPanel();
		first.setSize(200,500);
		first.setLayout(new BoxLayout(first,BoxLayout.Y_AXIS));
		
		PanImagePokemon pip = new PanImagePokemon(p);
		first.add(pip);
		
		first.add(new JLabel("Niveau : 100"));
		first.add(new JLabel("Nature : "));
		
		
		JPanel second = new JPanel();
		second.setSize(50,500);
		second.setLayout(new BoxLayout(second, BoxLayout.Y_AXIS));
		second.add(new JLabel(""+pv));
		second.add(new JLabel(""+atq));
		second.add(new JLabel(""+def));
		second.add(new JLabel(""+atqs));
		second.add(new JLabel(""+defs));
		second.add(new JLabel(""+vit));
		
		
		JPanel third = new JPanel();
		third.setSize(100, 500);
		third.setLayout(new BoxLayout(third,BoxLayout.Y_AXIS));
			
		JSlider evpv = new JSlider();
		JSlider evatq = new JSlider();
		JSlider evdef = new JSlider();
		JSlider evatqs = new JSlider();
		JSlider evdefs = new JSlider();
		JSlider evvit = new JSlider();
		
		setParameter(evpv);
		setParameter(evatq);
		setParameter(evdef);
		setParameter(evatqs);
		setParameter(evdefs);
		setParameter(evvit);
		
		third.add(evpv);
		third.add(evatq);
		third.add(evdef);
		third.add(evatqs);
		third.add(evdefs);
		third.add(evvit);
		
		
		JPanel fourth = new JPanel();
		fourth.setSize(50,500);
		fourth.setLayout(new BoxLayout(fourth, BoxLayout.Y_AXIS));
		
		fourth.add(new JLabel(""+GestionDesStats.statCalculator(pv, evpv.getValue(), 31, GestionDesStats.Nature.serieux, 100, 0)));
		fourth.add(new JLabel(""+GestionDesStats.statCalculator(atq, evatq.getValue(), 31, GestionDesStats.Nature.serieux, 100, 1)));
		fourth.add(new JLabel(""+GestionDesStats.statCalculator(def, evdef.getValue(), 31, GestionDesStats.Nature.serieux, 100, 2)));
		fourth.add(new JLabel(""+GestionDesStats.statCalculator(atqs, evatqs.getValue(), 31, GestionDesStats.Nature.serieux, 100, 3)));
		fourth.add(new JLabel(""+GestionDesStats.statCalculator(defs, evdefs.getValue(), 31, GestionDesStats.Nature.serieux, 100, 4)));
		fourth.add(new JLabel(""+GestionDesStats.statCalculator(vit, evvit.getValue(), 31, GestionDesStats.Nature.serieux, 100, 5)));
	
		
		add(first);
		add(second);
		add(third);
		add(fourth);
	
	}
	
	public static void main(String[] argv){
		JFrame f = new JFrame();
		PanGestionDesStats pgs = new PanGestionDesStats(Pokemon1G.psykokwak);
		f.setContentPane(pgs);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setTitle("essai");
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
