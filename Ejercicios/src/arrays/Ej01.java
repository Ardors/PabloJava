package arrays;

public class Ej01 {

	public static void main(String[] args) {
		int[] a = new int [100];
		
		
		for(int x=0;x<100;x++){
			double d = Math.random();
			int i = (int) (d * 500 +500);
			a[x]=i;
			}	
		int y = 0;
		int n = 0;
		int max = 0;
		int min = 1001;
		
		while (n < a.length){
			if (a[n]>max){
				max = a[n];
			}
			if (a[n]<min){
				min = a[n];
			}
			y=y+a[n];
			n++;
		}
		n=0;
		
		int media = y/a.length;
			
		System.out.println("La media es "+(media));
		System.out.println("El mayor es "+(max));
		System.out.println("El menor es "+(min));
		
		while(n < a.length){
			if(a[n]>media){
				System.out.println(a[n]);	
			}
			n++;
		}	
	}
}	
