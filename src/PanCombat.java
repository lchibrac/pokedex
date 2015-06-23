import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanCombat extends JPanel{

	private static final long serialVersionUID = 1L;

	public PanCombat(Combat c, final JFrame f){
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		final JPanel match = new JPanel();
		match.setMaximumSize(new Dimension(900, 450));
		match.setBackground(new Color(255,255,182));
		
		final JPanel menu = new JPanel();
		menu.setMaximumSize(new Dimension(900, 250));
		menu.setBackground(new Color(150,170,182));
		
		final JPanel messages = new JPanel();
		messages.setMaximumSize(new Dimension(900,50));
		messages.setBackground(new Color(180,190,182));
		
		//MATCH
		
		//MESSAGE
		final JLabel jl = new JLabel("Bonjour et bienvenue dans la Ligue. Le match va commencer.");
		messages.add(jl);
		
		//MENU
		Button b = new Button();
		class Bouton implements ActionListener{
			public void actionPerformed(ActionEvent e){
				jl.setText("trololo");
			}
			
		}
		b.addActionListener(new Bouton());
		
		menu.add(b);
		

		

		
		
		this.add(match);
		this.add(menu);
		this.add(messages);
		
		
		
	}
	
	public static void main(String[] argv){
		
		//TMP
		Equipe e1 = new Equipe(new Pokemon[]{Pokemon1G.papilusion, Pokemon1G.abo, Pokemon1G.staross, Pokemon1G.goupix, Pokemon1G.crustabri, Pokemon1G.doduo}, 1);
		Equipe e2 = new Equipe(new Pokemon[]{Pokemon1G.aeromite, Pokemon1G.ferosinge, Pokemon1G.salameche, Pokemon1G.machoc, Pokemon1G.tadmorv, Pokemon1G.ossatueur}, 2);
		Combat c = new Combat(e1,e2);
		//
		
		JFrame f = new JFrame();
		PanCombat pgs = new PanCombat(c, f);
		f.setContentPane(pgs);
		f.setSize(900, 750);
		f.setVisible(true);
		f.setTitle("Pokemon - Combat");
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
}
