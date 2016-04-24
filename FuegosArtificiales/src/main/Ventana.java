package main;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Ventana extends JFrame{

	private static final long serialVersionUID = 1L;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public Ventana(int ancho, int alto) {
		
		setUndecorated(true);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setContentPane(new Panel(this));
	}
	
	public int getAncho(){
		return screenSize.width;
	}
	public int getAlto(){
		return screenSize.height;
	}

}
