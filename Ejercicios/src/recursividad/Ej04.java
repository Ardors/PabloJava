package recursividad;

public class Ej04 {

	public static void main(String[] args) {
		// Calcular el n�mero de cifras de un n�mero entero de forma recursiva.
		
		System.out.println(cif(15002));
		
	}
	
	public static int cif(int n){
		if(n/10 < 1)
			return 1;
		return 1 + cif(n/10);
	}

}