package Panneaux;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import ClassesObjets.Pokemon;
import Listes.GestionDesStats;
import Listes.Pokemon1G;
import Listes.Stat;
import Listes.GestionDesStats.Nature;

public class PanGestionDesStats extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public void setParameter(JSlider s){
		s.setMaximum(252);
		s.setMinimum(0);
		s.setSize(90,10);
		s.setMinorTickSpacing(1);
		s.setValue(0);
		
	}

	public PanGestionDesStats(final Pokemon p, final JFrame f){

		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		final JPanel jp = new JPanel();
		
		jp.setSize(500,300);
		jp.setLayout(new BoxLayout(jp, BoxLayout.X_AXIS));
		
		final int pv =Stat.allstats[p._numero].getStat()[0];
		final int atq =Stat.allstats[p._numero].getStat()[1];
		final int def =Stat.allstats[p._numero].getStat()[2];
		final int atqs =Stat.allstats[p._numero].getStat()[3];
		final int defs =Stat.allstats[p._numero].getStat()[4];
		final int vit =Stat.allstats[p._numero].getStat()[5];
				
		final JPanel first = new JPanel();
		first.setSize(200,300);
		first.setLayout(new BoxLayout(first,BoxLayout.Y_AXIS));
		
		PanImagePokemon pip = new PanImagePokemon(p);
		first.add(pip);
		
		JPanel level = new JPanel();
		level.setLayout(new BoxLayout(level, BoxLayout.X_AXIS));
		level.add(new JLabel("Niveau : "));
		
		final JTextField niveau = new JTextField();
		niveau.setText("100");
		niveau.setEditable(true);
		niveau.setMaximumSize(new Dimension(100,20));
		
		level.add(niveau);
		first.add(level);
		
		first.add(new JLabel("Nature : "));
		final JComboBox<GestionDesStats.Nature> nat = new JComboBox<GestionDesStats.Nature>();
		nat.setMaximumSize(new Dimension(150,20));
		for (int it = 0 ; it < GestionDesStats.Nature.allNatures.length ; ++it){
			nat.addItem(GestionDesStats.Nature.allNatures[it]);
		}
		first.add(nat);
		
		final JPanel second = new JPanel();
		second.setSize(50,300);
		second.setLayout(new BoxLayout(second, BoxLayout.Y_AXIS));
		second.add(new JLabel(""+pv));
		second.add(new JLabel(""+atq));
		second.add(new JLabel(""+def));
		
		second.add(new JLabel(""+atqs));
		second.add(new JLabel(""+defs));
		second.add(new JLabel(""+vit));
		
		
		final JPanel third = new JPanel();
		third.setSize(100, 300);
		third.setLayout(new BoxLayout(third,BoxLayout.Y_AXIS));
			
		final JSlider evpv = new JSlider();
		final JSlider evatq = new JSlider();
		final JSlider evdef = new JSlider();
		final JSlider evatqs = new JSlider();
		final JSlider evdefs = new JSlider();
		final JSlider evvit = new JSlider();
		
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
		
		
		final JPanel fourth = new JPanel();
		fourth.setSize(50,300);
		fourth.setLayout(new BoxLayout(fourth, BoxLayout.Y_AXIS));
		
		final int pv2 = GestionDesStats.statCalculator(pv, evpv.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), 100, 0);
		final int atq2 = GestionDesStats.statCalculator(atq, evatq.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), 100, 1);
		final int def2 = GestionDesStats.statCalculator(def, evdef.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), 100, 2);
		final int atqs2 = GestionDesStats.statCalculator(atqs, evatqs.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), 100, 3);
		final int defs2 = GestionDesStats.statCalculator(defs, evdefs.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), 100, 4);
		final int vit2 = GestionDesStats.statCalculator(vit, evvit.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), 100, 5);
		
		fourth.add(new JLabel(""+pv2));
		fourth.add(new JLabel(""+atq2));
		fourth.add(new JLabel(""+def2));
		fourth.add(new JLabel(""+atqs2));
		fourth.add(new JLabel(""+defs2));
		fourth.add(new JLabel(""+vit2));
		
		jp.add(first);
		jp.add(second);
		jp.add(third);
		jp.add(fourth);
		
		
		
		class Refresh implements ActionListener{
			public void actionPerformed(ActionEvent e){
				int niv = Integer.parseInt(niveau.getText());
				
				jp.removeAll();
				jp.repaint();
				jp.add(first);
				jp.add(second);
				jp.add(third);
				
				fourth.removeAll();
				
				
				int pv3 = GestionDesStats.statCalculator(pv, evpv.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), niv, 0);
				int atq3 = GestionDesStats.statCalculator(atq, evatq.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), niv, 1);
				int def3 = GestionDesStats.statCalculator(def, evdef.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), niv, 2);
				int atqs3 = GestionDesStats.statCalculator(atqs, evatqs.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), niv, 3);
				int defs3 = GestionDesStats.statCalculator(defs, evdefs.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), niv, 4);
				int vit3 = GestionDesStats.statCalculator(vit, evvit.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), niv, 5);
				
				fourth.add(new JLabel(""+pv3));
				fourth.add(new JLabel(""+atq3));
				fourth.add(new JLabel(""+def3));
				fourth.add(new JLabel(""+atqs3));
				fourth.add(new JLabel(""+defs3));
				fourth.add(new JLabel(""+vit3));
				fourth.repaint();
				
				jp.add(fourth);
				
				f.setSize(501,301);
				f.setSize(500,300);

			}
		}

		class Recalcul implements ChangeListener{
			public void stateChanged(ChangeEvent e){
				
				int niv = Integer.parseInt(niveau.getText());
				
				jp.removeAll();
				jp.repaint();
				jp.add(first);
				jp.add(second);
				jp.add(third);
				
				fourth.removeAll();
				
				int pv3 = GestionDesStats.statCalculator(pv, evpv.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), niv, 0);
				int atq3 = GestionDesStats.statCalculator(atq, evatq.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), niv, 1);
				int def3 = GestionDesStats.statCalculator(def, evdef.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), niv, 2);
				int atqs3 = GestionDesStats.statCalculator(atqs, evatqs.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), niv, 3);
				int defs3 = GestionDesStats.statCalculator(defs, evdefs.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), niv, 4);
				int vit3 = GestionDesStats.statCalculator(vit, evvit.getValue(), 31, (GestionDesStats.Nature)nat.getSelectedItem(), niv, 5);
				
				fourth.add(new JLabel(""+pv3));
				fourth.add(new JLabel(""+atq3));
				fourth.add(new JLabel(""+def3));
				fourth.add(new JLabel(""+atqs3));
				fourth.add(new JLabel(""+defs3));
				fourth.add(new JLabel(""+vit3));
				fourth.repaint();
				
				jp.add(fourth);

				f.setSize(501,301);
				f.setSize(500,300);

						
			}
		}
		
		evpv.addChangeListener(new Recalcul());
		evatq.addChangeListener(new Recalcul());
		evdef.addChangeListener(new Recalcul());
		evatqs.addChangeListener(new Recalcul());
		evdefs.addChangeListener(new Recalcul());
		evvit.addChangeListener(new Recalcul());
		
		if(evpv.getValue()+evatq.getValue()+evdef.getValue()+evatqs.getValue()+evdefs.getValue()+evvit.getValue() >= 508){
		
		}

		nat.addActionListener(new Refresh());
		niveau.addActionListener(new Refresh());
		add(jp);
	}
	
	public static void main(String[] argv){
		
		JFrame f = new JFrame();
		PanGestionDesStats pgs = new PanGestionDesStats(Pokemon1G.smogogo,f);
		f.setContentPane(pgs);
		f.setSize(500, 300);
		f.setVisible(true);
		f.setTitle("essai");
		f.setLocationRelativeTo(null);
		f.setResizable(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	

}
