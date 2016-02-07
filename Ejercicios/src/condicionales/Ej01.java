package condicionales;

import javax.swing.JOptionPane;

public class Ej01 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Dame un número entero:");
		int b = Integer.parseInt(s);
		
		if(b>=0){
			JOptionPane.showMessageDialog(null, "Es positivo");
		}else{
			JOptionPane.showMessageDialog(null, "Es negativo");
		}
	}

}
