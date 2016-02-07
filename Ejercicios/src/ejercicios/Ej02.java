package ejercicios;

import javax.swing.JOptionPane;

public class Ej02 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Dame un numero entero");
		String s1 = JOptionPane.showInputDialog("Dame otro numero entero");
		String s2 = JOptionPane.showInputDialog("Dame un numero real");
		String s3 = JOptionPane.showInputDialog("Dame otro numero real");
		
		int x = Integer.parseInt(s);
		int y = Integer.parseInt(s1);
		double m = Double.parseDouble(s2);
		double n = Double.parseDouble(s3);
		
		JOptionPane.showMessageDialog(null, "x + m vale: " + (x+m));
		JOptionPane.showMessageDialog(null, "y - x vale: " + (y-x));
		JOptionPane.showMessageDialog(null, "x * n vale: " + (x*n));
		JOptionPane.showMessageDialog(null, "n - m vale: " + (n-m));
		JOptionPane.showMessageDialog(null, "n / x vale: " + (n/x));
		JOptionPane.showMessageDialog(null, "n + m vale: " + (n + m));
	}

}
