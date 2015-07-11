import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test {
	

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
		
		public FormComponentsRect(int fore_width, Color fore_c){
			_left = true;
			_x = 0;
			_y = 0;
			_fore_width = fore_width;
			_width = 350;
			_height = 15;
			_c = Color.BLACK;
			_fore_c = fore_c;
			setSize(new Dimension(_width,_height));
		}
		
		public FormComponentsRect(int fore_width, int height, Color fore_c, Color c){
			this(fore_width,fore_c);
			_height = height;
			_c = c;
			
			System.out.println("a la creation : "+_fore_width+" "+_width+"  "+_height);
			
			setSize(new Dimension(_width+1,_height+1));
		}
		
		public FormComponentsRect(int x, int y, int fore_width, int width, int height, Color fore_c , Color c, boolean left){
			
			//this(fore_width,height,fore_c,c);
			

			_fore_width = fore_width;
			_c = c;
			_fore_c = fore_c;
			_height = height;
			
			
			_x = x;
			_y = y;
			
			_left = left;
			_width = width;
			
			System.out.println("a la creation 2 : "+_fore_width+" "+_width+"  "+_height);
			
			setSize(new Dimension(500,500));
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
			this.getMinimumSize();
			//tmp
			System.out.println("1 "+_width+" "+_height);
			//tmp
			
			
			g.setColor(_c);
			g.fillRect(_x, _y, _width, _height);
			g.setColor(_fore_c);
			g.drawRect(_x, _y, _width, _height);
			//g.setColor(_fore_c);
			//if(_left){
				//g.fillRect(_x, _y, _fore_width, _height);
			//}else{
			//	g.fillRect(_x+(_width-_fore_width), _y, _fore_width, _height);
			//}
			
		}
		
	}
	
	public Test(final JFrame f) throws IOException{
		JPanel jp = new JPanel();
		
		jp.setBackground(new Color(182, 180,190));
		jp.setPreferredSize(new Dimension (500,500));
		
		FormComponentsRect fc2 = new FormComponentsRect(5,5, 25, 250, 20,new Color(0,102,0), new Color(51,204,51), false);
		jp.add(fc2);
		
		
		f.add(jp);
		
	}
	
	
	public static void main(String[] argv) throws IOException{
				
		JFrame f = new JFrame();
		Test pgs = new Test(f);
		//f.setContentPane(pgs);
		f.setSize(900, 750);
		f.setVisible(true);
		f.setTitle("Pokemon - Combat");
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
