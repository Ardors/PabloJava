package recursividad;

public class Ej01 {

	public static void main(String[] args) {
		// Calcular el cociente de dos números enteros de forma recursiva. 
		
		System.out.println(division(76,15));
		
	}
	
	public static int division(int a, int b){
		if(a-b<b)return a-b;
		return division(a-b, b);
	}

}
