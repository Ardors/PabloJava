package arrays;

public class Ej08 {

	public static void main(String[] args) {
		//Leer el nombre y sueldo de 6 empleados y mostrar el nombre y sueldo del empleado que más gana.
		
		Empleado[] empleados = new Empleado[6];
		
		for(int i=0;i<6;i++){
			empleados[i] = new Empleado();
			empleados[i].askForNombre();
			empleados[i].askForSueldo();
		}
		int max=0;
		for(int i=0;i<6;i++){
			if(empleados[i].getSueldo()>empleados[max].getSueldo()){
				max=i;
			}
		}			
		System.out.println("El empleado con mayor sueldo es "+empleados[max].getNombre()+"("+empleados[max].getSueldo()+").");
	}
}
