package condicionales;

import javax.swing.JOptionPane;

public class Ej12 {

	public static void main(String[] args) {
		
		int longi = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros deseas introducir?"));
		
		int a [] = new int[longi];
		
		for(int j= 0; j<longi; j++){
			a [j] = Integer.parseInt(JOptionPane.showInputDialog("Dame un número entero ("+(j+1)+"):"));
		}
		
		int x = 0;
		
		for(int i = 0;i<a.length;i++){
			if(a[i]%10==2){
				x++;
			}
		}	
		JOptionPane.showMessageDialog(null, x +" de los "+a.length+" números introducidos acaban en dos.");
	}
}
