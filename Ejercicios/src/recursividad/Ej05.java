package recursividad;

public class Ej05 {

	public static void main(String[] args) {
		// Calcular el n�mero de cifras de un n�mero entero de forma recursiva.
		
		System.out.println(cif(6));
		
	}
	
	public static int cif(int n){
		if(n <= 0)
			return 0;
		return n + cif(n-1);
	}

}