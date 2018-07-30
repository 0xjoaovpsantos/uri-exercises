import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int distanciapercorrida = Integer.parseInt(scan.nextLine());
		double combustivelgasto = Double.parseDouble(scan.nextLine());
		
		double consumoMedio = distanciapercorrida/combustivelgasto;
		
		System.out.printf("%.3f km/l\n", consumoMedio);
	}
}
