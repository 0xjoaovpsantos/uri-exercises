import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double x1 = Double.parseDouble(scan.next());
		double y1 = Double.parseDouble(scan.next());
		double x2 = Double.parseDouble(scan.next());
		double y2 = Double.parseDouble(scan.next());
		
		double distancia = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
		
		System.out.printf("%.4f\n", distancia);
	}
}
