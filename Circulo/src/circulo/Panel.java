package circulo;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private Ventana v;

	public Panel(Ventana v){
		setBackground(Color.BLACK);
		this.v = v;
		
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		v.c.mover(g);
		v.c.dibujar(g);
		
		repaint();
	}
}
