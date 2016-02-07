package ejercicios;

import javax.swing.JOptionPane;

public class Ej12 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("radio esfera:");
		int r = Integer.parseInt(s);
		
		JOptionPane.showMessageDialog(null, "volumen esfera: " + (4.0/3.0)*Math.PI*r*r*r);
	}

}
