package condicionales;

import javax.swing.JOptionPane;

public class Ej10 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Dame un dividendo:");
		double a = Double.parseDouble(s);
		String s1 = JOptionPane.showInputDialog("Dame un divisor:");
		double b = Double.parseDouble(s1);
		
		if (b==0){
			JOptionPane.showMessageDialog(null, "Ja,ja. Muy gracioso");
		}else{
			JOptionPane.showMessageDialog(null, a+"/"+b+"="+(a/b));
		}
	}
}
