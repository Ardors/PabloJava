package recursividad;

public class Ej02 {

	public static void main(String[] args) {
		// Calcular el cociente de dos números enteros de forma recursiva. 
		
		System.out.println(binary(120));
		
	}
	
	public static String binary(int a){
		if(a == 1){
			return "1";
		}
		if(a<=0){
			return "0";
		}
		if(a%2==0)
			return binary(a/2) + "0";
		else
			return binary(a/2) + "1";
		
	}

}
