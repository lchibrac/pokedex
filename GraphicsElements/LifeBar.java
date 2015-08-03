import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class LifeBar extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public boolean _left;
	public int _x;
	public int _y;
	public int _width;
	public int _height;
	public int _total_life;
	public int _actual_life;
	public Color _c;
	public Color _fore_c;
	
	public LifeBar(int actual_life, Color fore_c){
		_left = true;
		_x = 0;
		_y = 0;
		_actual_life = actual_life;
		_total_life = 350;
		_width = 350;
		_height = 15;
		_c = Color.BLACK;
		_fore_c = fore_c;

		this.setSize(new Dimension(_width,_height));
		this.setPreferredSize(new Dimension(_width,_height));
		
	}

	public LifeBar(int actual_life, int height, Color fore_c, Color c){
		this(actual_life,fore_c);
		_height = height;
		_width = 350;
		_c = c;
		
		this.setSize(new Dimension(_width,_height));
		this.setPreferredSize(new Dimension(_width,_height));
	}
	
	public LifeBar(int x, int y, int actual_life, int total_life,int width, int height, Color fore_c , Color c, boolean left){
		
		this(actual_life,height,fore_c,c);
		_x = x;
		_y = y;
		
		_left = left;
		_total_life = total_life;
		
		_width = width;
		
		this.setSize(new Dimension(_width,_height));
		this.setPreferredSize(new Dimension(_width,_height));
	}
	
	public Color getColor(){
		return _c;
	} 
	
	public Color getForeColor(){
		return _fore_c;
	} 
	
	public void paintComponent(Graphics g){
		
		this.setSize(new Dimension(_width ,_height));
		this.setPreferredSize(new Dimension(_width,_height));
		
		
		//barre sombre = nbPVActuels * nbPVdeBase / TailleTotale
		System.out.println("tailles : "+_total_life+" "+_height); //TMP
		System.out.println("dimension : "+this.getSize()+" "+this.getPreferredSize()); //TMP
		
		//super.paintComponent(g);
		g.setColor(_c);
		g.fillRect(_x, _y, _width, _height);
		
		g.setColor(_fore_c);
		if(_left){
			g.fillRect(_x, _y, (_actual_life*_total_life)/_width, _height);
		}else{
			g.fillRect(_x+(_width-((_actual_life*_total_life)/_width)), _y, (_actual_life*_total_life)/_width, _height);
		}
		
	}

}
