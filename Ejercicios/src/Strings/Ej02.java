package Strings;

import javax.swing.JOptionPane;

public class Ej02 {

	public static void main(String[] args) {
		String s =JOptionPane.showInputDialog("Dame una frase:");
		
		int ultimo = 0;
		boolean anteriorEspacio = true;
		char c;
		int n = 0;
		
		while(n<s.length()){
			c = s.charAt(n);
			if (c!=32 && anteriorEspacio == true){
				ultimo = n;
				anteriorEspacio = false;
			}else{
				if(c==32){
					anteriorEspacio = true;
				}
			}
			n++;
		}

		
		
		
		System.out.println(s.substring(0, ultimo));
		

		
	}

}
