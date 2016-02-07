package condicionales;

import javax.swing.JOptionPane;

public class Ej04 {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("Dame una letra");
		char c = s1.charAt(0);

		if(c<91 && c>64 || c==209){
			JOptionPane.showMessageDialog(null, "Es mayúscula");
		}else{
			if(c<123 && c>96 || c==241){
				JOptionPane.showMessageDialog(null, "Es minúscula");
			}else{
				JOptionPane.showMessageDialog(null, c + " no es una letra");
			}
		}
	}
}
