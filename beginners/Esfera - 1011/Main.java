import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		double raio = Double.parseDouble(scan.nextLine());
		double volume = (4/3.0) * 3.14159 * (raio*raio*raio);
		System.out.printf("VOLUME = %.3f\n", volume);
	}
}
