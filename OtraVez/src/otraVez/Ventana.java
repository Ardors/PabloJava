package otraVez;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel p;

	public Ventana(){
		setExtendedState(MAXIMIZED_BOTH);
		p = new Panel();
		setContentPane(p);
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Ventana(int ancho, int alto){
		setSize(ancho,alto);
		setContentPane(new Panel());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void setColor(Color c) {
		p.setBackground(c);
	}
	
	/**
	 * hkhkghvkjhbkj kjbhv ,hg,hb ,jhbv,jh.ujghjb.j jb.jb .kjb, 
	 * @param estado 0 para pantalla completa y 1 para lo otro
	 * 
	 * @returns true si todo ha ido bien
	 */
	public boolean setEstado(int estado){
		if(estado == 1){
			setVisible(false);
			dispose();
			setUndecorated(false);
			setExtendedState(JFrame.NORMAL);
			setSize(600,800);
			
			setVisible(true);
		}
		
		return true;
	}
}
