package ejercicios;

import javax.swing.JOptionPane;

public class Ej13 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Dame un número de 3 cifras:");
		int n = Integer.parseInt(s);
		
		int unidades = n % 10;
		int decenas = (n % 100)/10;
		int centenas = n / 100;
		
		JOptionPane.showMessageDialog(null, "unidades: " + unidades);
		JOptionPane.showMessageDialog(null, "decenas: " + decenas);
		JOptionPane.showMessageDialog(null, "centenas: " + centenas);
	}

}
