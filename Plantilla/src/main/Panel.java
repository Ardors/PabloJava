package main;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel {

	private static final long serialVersionUID = 3350710760250147620L;
	
	public Panel(){
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
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
		
	}
	
}
