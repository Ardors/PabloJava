package otraVez;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	private double x;
	
	public Panel (){
		setBackground(Color.BLACK);
		
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
		g.drawString("alto", (int)(x+=0.1), 10);
	}
}
