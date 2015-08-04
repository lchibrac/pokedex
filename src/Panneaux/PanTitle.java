package Panneaux;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanTitle extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public PanTitle(String title, JFrame frame){
		
		setMaximumSize(new Dimension(frame.getWidth(),30));
		setBackground(Color.white);
		
		JLabel l = new JLabel(title);
		Font font = new Font("Dialog",Font.BOLD,20);
		l.setFont(font);
		add(l,BorderLayout.CENTER);
		
	}
	
}
