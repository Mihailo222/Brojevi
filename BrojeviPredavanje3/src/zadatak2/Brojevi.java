package zadatak2;

public class Brojevi {
	
	
	//ispisi brojeve od 1 do n
	static void ispisiBrojeve(int n) {
		for(int i=1; i<=n; i++) {
			System.out.println(i);
			
		}
	}
	
	//suma brojeva od 1 do n
	
	static int suma(int n) {
		int suma = 0;
		int i =1;
		while(i<n) {
			suma=suma+i;
			i++;
			
		}
		return suma;
	}
	
	
	//izracunaj faktorijel
	static int faktorijel(int n) {
		int proizvod = 1;
		int i =1;
		do {
			proizvod = proizvod * i;
		}while(i<=n);
		
		return proizvod;
	}
	
	
	

}
