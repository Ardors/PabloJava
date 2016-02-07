package condicionales;

import javax.swing.JOptionPane;

public class Ej02 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Dame un número entero:");
		int a = Integer.parseInt(s);
		
		if(a%2==0){
			JOptionPane.showMessageDialog(null, "Es par");
		}else{
			JOptionPane.showMessageDialog(null, "Es impar");
		}
	}

}
