package circulo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Ventana extends JFrame{

	private static final long serialVersionUID = 1L;
	
	Circulo c = new Circulo(50, 200,200);

	public Ventana(){
		setExtendedState(MAXIMIZED_BOTH);
		setContentPane(new Panel(c));
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addKeyListener (new KeyAdapter(){
			
			public void keyPressed (KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
					System.exit(0);
				}
				if(e.getKeyCode() == KeyEvent.VK_UP){
					c.vy=-1;
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN){
					c.vy=+1;
				}
				if(e.getKeyCode() == KeyEvent.VK_RIGHT){
					c.vx=+1;
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					c.vx=-1;
				}
			}
			public void keyReleased (KeyEvent e){
				
				if(e.getKeyCode() == KeyEvent.VK_UP){
					c.vy=0;
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN){
					c.vy=0;
				}
				if(e.getKeyCode() == KeyEvent.VK_RIGHT){
					c.vx=0;
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					c.vx=0;
				}
			}
			
		});
	}
}
