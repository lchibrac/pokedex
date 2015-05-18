
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PageAccueil extends JFrame implements ActionListener {
	

	private static final long serialVersionUID = 1L;
	
	JButton bouton = new JButton("Commencer"); 
	public void actionPerformed(ActionEvent e){ 
			if((JButton)e.getSource()==bouton) { 
				new PageRecherche(); 
				this.setVisible(false); 
		}
	}
	
	public PageAccueil(){
		super();
		setTitle("Pokédex");
		setSize(600,700);
		Image icone = Toolkit.getDefaultToolkit().getImage("images/dex.gif");
		setIconImage(icone);
		Color c = new Color(255, 175, 50, 50);
		getContentPane().setBackground(c);
		Panneau pan = new Panneau();
		pan.setBackground(Color.white);
		setContentPane(pan);
		setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setResizable(false);
		setVisible(true);
		setLayout(null);
		bouton.setBounds(200,300,200,50); 
		bouton.addActionListener(this); 
		pan.add(bouton); 
		} 
		
		
	public static void main(String[] args){
		new PageAccueil();
	}

}
