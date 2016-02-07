package ejercicios;

import javax.swing.JOptionPane;

public class Ej08 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Grados centígrados:");
		int c = Integer.parseInt(s);
		
		JOptionPane.showMessageDialog(null, "Grados Farenheit: " + (32+(9*c/5)));

	}

}
