package circulo;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	Circulo c;

	public Panel(Circulo c){
		setBackground(Color.BLACK);
		this.c = c;
		
		Thread t = new Thread(new Runnable(){
			@Override
			public void run(){
				while(true){
					repaint();
				}
			}
		});
		t.start();	
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		c.mover(g);
		c.dibujar(g);
	}
}
