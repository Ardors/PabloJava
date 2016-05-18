package circulo;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Ventana extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	Personaje c = new Personaje(30, 200,200);

	public Ventana(){
		setExtendedState(MAXIMIZED_BOTH);
		setContentPane(new Panel(this)); 
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addKeyListener (new KeyAdapter(){
			
			public void keyPressed (KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
					System.exit(0);
				}
				if(e.getKeyCode() == KeyEvent.VK_UP){
					c.arriba=true;
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN){
					c.abajo=true;
				}
				if(e.getKeyCode() == KeyEvent.VK_RIGHT){
					c.derecha=true;
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					c.izquierda=true;
				}
				if(e.getKeyCode() == KeyEvent.VK_SPACE){
					c.disparando = true;
				}
				if(e.getKeyCode() == KeyEvent.VK_B){
					c.frenando = true;
				}
			}
			public void keyReleased (KeyEvent e){
				
				if(e.getKeyCode() == KeyEvent.VK_UP){
					c.arriba=false;
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN){
					c.abajo=false;
				}
				if(e.getKeyCode() == KeyEvent.VK_RIGHT){
					c.derecha=false;
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					c.izquierda=false;
				}
				if(e.getKeyCode() == KeyEvent.VK_SPACE){
					c.disparando = false;
				}
				if(e.getKeyCode() == KeyEvent.VK_B){
					c.frenando = false;
					c.izquierda=false;
					c.derecha=false;
					c.abajo=false;
					c.arriba=false;
				}
			}
			
		});
	}
}
