import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextArea;


public class PanTalents extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public PanTalents(Pokemon p){
		setBackground(Color.WHITE);
		setForeground(Color.BLACK);
		
		Font font = new Font("Dialog",Font.BOLD,14);
		
		JTextArea label1 = new JTextArea();
		label1.setText(p.getTalent()[0].toString());
		label1.setEnabled(false);
		label1.setLineWrap(true);
		label1.setSize(570,50);
		label1.setWrapStyleWord(false);
		label1.setFont(font);
		label1.setDisabledTextColor(Color.BLACK);
		
		JTextArea label2 = new JTextArea();
		label2.setForeground(Color.BLACK);
		label2.setText(p.getTalent()[1].toString());
		label2.setEnabled(false);
		label2.setLineWrap(true);
		label2.setSize(570, 50);
		label2.setWrapStyleWord(false);
		label2.setFont(font);
		label2.setDisabledTextColor(Color.BLACK);
		
		JTextArea label3 = new JTextArea();
		label3.setForeground(Color.BLACK);
		label3.setText("(DreamWorld) "+p.getTalent()[2].toString());
		label3.setEnabled(false);
		label3.setLineWrap(true);
		label3.setSize(570, 50);
		label3.setWrapStyleWord(false);
		label3.setFont(font);
		label3.setDisabledTextColor(Color.BLACK);

		add(label1);
		add(label2);
		add(label3);
	}
}
