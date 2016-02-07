package ejercicios;

import javax.swing.JOptionPane;

public class Ej04 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Dame un numero entero(a)");
		String s1 = JOptionPane.showInputDialog("Dame otro numero entero(b)");
		
		int a = Integer.parseInt(s);
		int b = Integer.parseInt(s1);
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		JOptionPane.showMessageDialog(null, "a: " + a);
		JOptionPane.showMessageDialog(null, "b: " + b);
		
	}

}
