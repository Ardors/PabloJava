package arrays;

public class Ej06 {

	public static void main(String[] args) {
		int[] a = new int [100];	
		
		for(int x=0;x<100;x++){
			double d = Math.random();
			int i = (int) (d * 500 - 250);
			a[x]=i;
			}	
		int may =0;
		int men =0;
		int n = 0;
		int nmay =0;
		int nmen =0;
		
		while(n<a.length){
			if(a[n]<0){
				men = men+a[n];
				nmen++;
			}else{
				may = may+a[n];
				nmay++;
			}
			n++;
		}
		System.out.println("La media de los negativos es "+ (men/nmen));
		System.out.println("La media de los positivos es "+ (may/nmay));
	}
}
