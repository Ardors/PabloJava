package circulo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private Ventana v;
	long tu = System.currentTimeMillis();
	ArrayList <Estrella> estrellas = new ArrayList<Estrella>();

	public Panel(Ventana v){
		setBackground(Color.BLACK);
		setDoubleBuffered(true);
		this.v = v;
		
		for(int i=0;i<1000;i++){
			//System.out.println(Ventana.screenSize.width);
			estrellas.add(new Estrella((float)(Math.random()*Ventana.screenSize.width),(float)(Math.random()*Ventana.screenSize.height)));
		}
		
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		float tt=(System.currentTimeMillis()-tu);
		tu = System.currentTimeMillis();
		v.c.mover(tt);
		v.c.dibujar(g,tt); 
		for(Estrella e:estrellas){
			e.mover(-v.c.vx,-v.c.vy,tt);
			e.dibujar(g);
		}
			
		repaint();
	}
}
