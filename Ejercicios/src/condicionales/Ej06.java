package condicionales;

import javax.swing.JOptionPane;

public class Ej06 {

	public static void main(String[] args) {
		
		int a[] = {
				Integer.parseInt(JOptionPane.showInputDialog("Dame un n�mero entero:")),
				Integer.parseInt(JOptionPane.showInputDialog("Dame otro n�mero entero:")),
				Integer.parseInt(JOptionPane.showInputDialog("Dame otro n�mero entero:"))
		};
		int max = a[0];
		for(int i =0;i<a.length;i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, "El mayor es "+max);
	}
}
