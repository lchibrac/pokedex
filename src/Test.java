import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Test extends JFrame{

    public Test() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);

        JScrollPane jScrollPane = new javax.swing.JScrollPane();

        JPanel jPanel = new javax.swing.JPanel();
        jPanel.setPreferredSize(new Dimension(700, 1000));

        jPanel.add(new JLabel("coucou"));

        jScrollPane.setViewportView(jPanel);
        getContentPane().add(jScrollPane, java.awt.BorderLayout.CENTER);
    }


    public static void main(String args[]) {
        new Test().setVisible(true);
    }
}
