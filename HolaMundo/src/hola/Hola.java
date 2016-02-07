package hola;

public class Hola {

	public static void main(String[] args) {
		int n = 2;
		int a = 2;
		if(n < 3 && !(a == 0)){
			System.out.println("Es menor de 3");
		}
		
		while(a < 15){
			System.out.println(a);
			a+=2;
		}
		long tantes = System.currentTimeMillis();
		
		for(int z = 5;z < 1000000000; z++){
			a++;
		}
		System.out.println(System.currentTimeMillis()-tantes);
		System.out.println("Hola Mundo!" + a);
		
	}

}
