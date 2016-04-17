package main;

import javax.swing.JFrame;

public class Ventana extends JFrame{

	private static final long serialVersionUID = 1L;

	public Ventana(int ancho, int alto) {
		setSize(ancho,alto);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setContentPane(new Panel());
	}

}
