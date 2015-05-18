import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Line extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public int _w;
	public Line(int w){
		_w = w;
	}
	
	public void paintComponent(Graphics g){
		g.drawLine(10, 5, _w-40, 5);
		g.drawLine(10, 7, _w-40, 7);
	}
	
	public static void main(String[] argv){
		JFrame f = new JFrame();
		f.setSize(new Dimension(3,5));
		Line l = new Line(f.getWidth());
		System.out.println(f.getWidth());
		System.out.println(l._w);
	}
}
