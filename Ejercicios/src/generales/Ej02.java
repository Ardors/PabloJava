package generales;

public class Ej02 {

	public static void main(String[] args) {

		int num = 1568;
		int u = num%10;
		int d = (num%100)/10;
		int c = (num%1000)/100;
		int m = num/1000;
		String[] nru = {"","I", "II", "III","IV","V","VI","VII","VIII","IX"};
		String[] nrd = {"","X", "XX", "XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] nrc = {"","C", "CC", "CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] nrm = {"","M", "MM", "MMM"};
		
		String sol = nrm[m] + nrc[c] + nrd[d] + nru[u];
		System.out.println(sol);
		
	}

}
