import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a = Double.parseDouble(scan.next());
		double b = Double.parseDouble(scan.next());
		double c = Double.parseDouble(scan.next());
		
		double delta = (b*b)-(4*a*c);
		double r1 = 0;
		double r2 = 0;

		if(a != 0 && delta > 0){
			r1 = ((-b)+(Math.sqrt(delta)))/(2*a);
			r2 = ((-b)-(Math.sqrt(delta)))/(2*a);
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
		}else
			System.out.println("Impossivel calcular");
	}
}

