package GraphicsElements;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class BackgroundImage extends JPanel{
	

	private static final long serialVersionUID = 1L;
	
	private Image _bg; 
	private int _width, _lenght;
	private int _posx, _posy;
	
	public BackgroundImage(Image i, int width, int height){
		_bg = i;
		_width = width;
		_lenght = height;
		_posx = 0;
		_posy = 0;
	}
	
	public BackgroundImage(Image i, int width, int height,int posx, int posy){
		this(i,width,height);
		this._posx = posx;
		this._posy = posy;
	}
	  
     public void paintComponent(Graphics g) { 
            g.drawImage(_bg,_posx,_posy,_width, _lenght,null); 
    }  
}
