package otraVez;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {

	public static void main(String[] args) {
		Ventana v = new Ventana();
		
		v.addKeyListener(new KeyAdapter(){
			
			@Override
			public void keyPressed(KeyEvent e){
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
					System.exit(0);
				}
				if (e.getKeyCode() == KeyEvent.VK_F4){
					v.setColor(Color.RED);
				}
				if (e.getKeyCode() == KeyEvent.VK_F5){
					v.setColor(Color.BLUE);
				}
				if (e.getKeyCode() == KeyEvent.VK_F6){
					v.setEstado(1);
				}
				
			}
		});
			
	}

}
