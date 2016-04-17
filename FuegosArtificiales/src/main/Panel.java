package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Panel extends JPanel {

	private static final long serialVersionUID = 3350710760250147620L;
	
	private FuegoArtificial f;
	
	public Panel(){
		
		setBackground(Color.BLACK);
		f = new FuegoArtificial(400.0,400.0);
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					repaint();
				}
				
			}
		});
		
		t.start();
		
		addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				f = new FuegoArtificial(e.getX(),e.getY());
				super.mouseClicked(e);
			}
		});
	}

	@Override
	public void paint(Graphics g){
		super.paint(g);
		f.dibujar(g);
		
	}
	
	
	
}
