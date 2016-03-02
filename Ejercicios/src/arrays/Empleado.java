package arrays;

import javax.swing.JOptionPane;

public class Empleado {

	private int sueldo; //min 100 max 500
	private String nombre;
	
	public void showInfo(){
		System.out.println(sueldo);
		System.out.println(nombre);
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getSueldo(){
		return sueldo;
	}
	
	public boolean setSueldo(int nuevoSueldo){
		if(nuevoSueldo<500 && nuevoSueldo>100){
			sueldo = nuevoSueldo;
			return true;
		}else{
			System.out.println("ERROR El sueldo " +nuevoSueldo+ "no es valido. Debe estar entre 100 y 500");
			return false;
		}
	}
	
	public boolean askForSueldo(){
		String s = JOptionPane.showInputDialog("Dame un sueldo:");
		int nuevoSueldo = Integer.parseInt(s);
		if(nuevoSueldo<500 && nuevoSueldo>100){
			sueldo = nuevoSueldo;
			return true;
		}else{
			System.out.println("ERROR El sueldo " +nuevoSueldo+ " no es valido. Debe estar entre 100 y 500.");
			return false;
		}
	}
	
	public void setNombre(String nuevoNombre){
		int n = 0;
		while(n<nuevoNombre.length()){
			char c = nuevoNombre.charAt(n);
			if((c<91 && c>64)||(c<123 && c>96)||c==241||c==209 ||c==32){
				n++;
			}else{
				System.out.println("ERROR El nombre " +nuevoNombre+ " no es valido. Sólo puede usar letras(sin tildes) y espacios.");	
				return;
			}
		}
		nombre = nuevoNombre;
	}
	
	public void askForNombre(){
		String nuevoNombre = JOptionPane.showInputDialog("Dame un nombre:");
		int n = 0;
		while(n<nuevoNombre.length()){
			char c = nuevoNombre.charAt(n);
			if((c<91 && c>64)||(c<123 && c>96)||c==241||c==209 ||c==32){
				n++;
			}else{
				System.out.println("ERROR El nombre " +nuevoNombre+ " no es valido. Sólo puede usar letras(sin tildes) y espacios.");	
				return;
			}
		}
		nombre = nuevoNombre;
	}	
}





	
	


