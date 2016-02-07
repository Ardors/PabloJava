package ejercicios;

import javax.swing.JOptionPane;

public class Ej01 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Dame un numero");
		String s1 = JOptionPane.showInputDialog("Dame una letra");
		String s2 = JOptionPane.showInputDialog("Dame otro numero");
		int n = Integer.parseInt(s);
		char c = s1.charAt(0);
		double a = Double.parseDouble(s2);
		
		JOptionPane.showMessageDialog(null, "n vale: " + n);
		JOptionPane.showMessageDialog(null, "c es: " + c);		
		JOptionPane.showMessageDialog(null, "a vale: " + a);
		JOptionPane.showMessageDialog(null, "n+a vale: " + (a + n));
		JOptionPane.showMessageDialog(null, "a-n vale: " + (a - n));
	}

}
