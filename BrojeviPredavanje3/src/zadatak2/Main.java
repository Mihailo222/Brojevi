package zadatak2;

public class Main {

	public static void main(String[] args) {
		//poziv static metode(ne treba objekat)
		Brojevi.ispisiBrojeve(56);
		
		int suma = Brojevi.suma(100);
		System.out.println("                    ");
		System.out.println("Suma je:  " + suma);
		System.out.println("                    ");
		System.out.println("Faktorijel broja 10 je:  " + Brojevi.faktorijel(10));
		}
	
	

}
