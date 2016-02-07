package ejercicios;

import javax.swing.JOptionPane;

public class Ej10 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("km/h:");
		int v = Integer.parseInt(s);
		
		JOptionPane.showMessageDialog(null, "m/s: " + (v/3.6));

	}

}
