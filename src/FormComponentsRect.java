import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;


public class FormComponentsRect extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public boolean _left;
	public int _x;
	public int _y;
	public int _height;
	public int _width;
	public int _fore_width;
	public Color _c;
	public Color _fore_c;
	
	public FormComponentsRect(int fore_width, Color c){
		_left = true;
		_x = 0;
		_y = 0;
		_fore_width = fore_width;
		_width = 350;
		_height = 15;
		_c = Color.BLACK;
		_fore_c = c;
		setSize(new Dimension(_width,_height));
	}
	
	public FormComponentsRect(int fore_width, int height, Color fore_c, Color c){
		_x = 0;
		_y = 0;
		_fore_width = fore_width;
		_width = 350;
		_height = height;
		_c = c;
		_fore_c = fore_c;
		setSize(new Dimension(_width,_height));
	}
	
	public FormComponentsRect(int x, int y, int fore_width, int width, int height, Color fore_c , Color c, boolean left){
		_left = left;
		_x = x;
		_y = y;
		_fore_width = fore_width;
		_width = width;
		_height = height;
		_c = c;
		_fore_c = fore_c;
		setSize(new Dimension(_width,_height));
	}
	
	public Color getColor(){
		return _c;
	} 
	
	public Color getForeColor(){
		return _fore_c;
	} 
	
	
	public void setPreferredSize(Dimension d){
		_fore_width = d.width;
		_height = d.height;
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(_fore_width,_height);
	}
	
	public Dimension getMinimumSize(){
		return new Dimension(_fore_width,_height);
	}
	
	
	public void paintComponent(Graphics g){
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
