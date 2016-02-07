package bucles;

import javax.swing.JOptionPane;

public class Ej01 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Dame un numero");
		int n = Integer.parseInt(s);
		
		int x = n;
		int cifras = 1;
		if(x < 0){
			
		}
		while(x/10 >= 1){
			cifras++;
			x=x/10;
		}
		JOptionPane.showMessageDialog(null, "Tiene " + cifras);
	}

}
