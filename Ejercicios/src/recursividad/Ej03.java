package recursividad;

public class Ej03 {

	public static void main(String[] args) {
		// Calcular el cociente de dos números enteros de forma recursiva. 
		
		System.out.println(elev(32));
		
	}
	
	public static int elev(int n){
		if(n<=0)return 1;
		return 2 * elev(n-1);
	}

}