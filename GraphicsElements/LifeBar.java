import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class LifeBar extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public boolean _left;
	public int _x;
	public int _y;
	public int _height;
	public int _width;
	public int _fore_width;
	public Color _c;
	public Color _fore_c;
	
	public LifeBar(int fore_width, Color fore_c){
		_left = true;
		_x = 0;
		_y = 0;
		_fore_width = fore_width;
		_width = 350;
		_height = 15;
		_c = Color.BLACK;
		_fore_c = fore_c;

		this.setPreferredSize(new Dimension(_width,_height));
		
	}

	public LifeBar(int fore_width, int height, Color fore_c, Color c){
		this(fore_width,fore_c);
		_height = height;
		_c = c;
		
		this.setPreferredSize(new Dimension(_width,_height));
	}
	
	public LifeBar(int x, int y, int fore_width, int width, int height, Color fore_c , Color c, boolean left){
		
		this(fore_width,height,fore_c,c);
		_x = x;
		_y = y;
		
		_left = left;
		_width = width;
	
		Dimension d = new Dimension(_width,_height);
		/*this.setSize(d);
		this.setMinimumSize(d);
		this.setPreferredSize(d);*/
	}
	
	public Color getColor(){
		return _c;
	} 
	
	public Color getForeColor(){
		return _fore_c;
	} 
	
	public Dimension getPreferredSize(){
		return new Dimension(_fore_width,_height);
	}
	
	public Dimension getMinimumSize(){
		return new Dimension(_fore_width,_height);
	}
	
	
	public void paintComponent(Graphics g){

		this.setSize(new Dimension(_width,_height));
		//this.setPreferredSize(new Dimension(_width,_height));
		
		//super.paintComponent(g);
		g.setColor(_c);
		g.fillRect(_x, _y, _width, _height);
		g.setColor(_fore_c);
		if(_left){
			g.fillRect(_x, _y, _fore_width, _height);
		}else{
			g.fillRect(_x+(_width-_fore_width), _y, _fore_width, _height);
		}
		
	}

}
