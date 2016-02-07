package ejercicios;

import javax.swing.JOptionPane;

public class Ej03 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Dame un numero entero");
		
		int x = Integer.parseInt(s);
		
		x= x+55;
		JOptionPane.showMessageDialog(null, "x+55 vale: " + (x));
		
		x=x-30;
		JOptionPane.showMessageDialog(null, "x+55-30 vale: " + (x));
		
		x=x*2;
		JOptionPane.showMessageDialog(null, "(x+55-30)*2vale: " + (x));

	}

}
