package Strings;

import javax.swing.JOptionPane;

public class Ej01 {

	public static void main(String[] args) {
		String s =JOptionPane.showInputDialog("Dame una frase:");

		boolean anteriorNoEspacio = false;
		boolean actualEspacio;
		int p= 0;
		int n= 0;
		char c;

		while(n<s.length()){
			c = s.charAt(n);
			actualEspacio = (c == 32);
			if (actualEspacio && anteriorNoEspacio){
				p++;
			}
			anteriorNoEspacio = !actualEspacio;
			n++;
		}
		
		if (s.charAt(s.length()-1) != 32){
			p++;
		}
		System.out.println("Tu frase tiene "+p+" palabras.");
	}
}
