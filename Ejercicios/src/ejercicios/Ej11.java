package ejercicios;

import javax.swing.JOptionPane;

public class Ej11 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("cateto a:");
		String s1 = JOptionPane.showInputDialog("cateto b:");
		
		int a = Integer.parseInt(s);
		int b = Integer.parseInt(s1);
		
		JOptionPane.showMessageDialog(null, "hipotenusa: " + Math.sqrt(Math.pow(a, 2)+Math.pow(b,2)));

	}

}
