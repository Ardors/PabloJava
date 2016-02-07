package condicionales;

import javax.swing.JOptionPane;

public class Ej05 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Dame una palabra");
		String s1 = JOptionPane.showInputDialog("Dame otra palabra");

		if (s.equals(s1)){
			JOptionPane.showMessageDialog(null, "Son iguales");
		}else{
			JOptionPane.showMessageDialog(null, "No son iguales");
		}
	}

}
