package laPrueba;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{

	private static final long serialVersionUID = 1L;

	Ventana v;
	
	public Panel (Ventana v){
		setBackground(Color.BLACK);
		this.v = v;
		
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
		g.drawString("alto"+v.getHeight(), 10, 10);
	}
}
