import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = Double.parseDouble(scan.nextLine());
		double b = Double.parseDouble(scan.nextLine());
		double MEDIA = ((a*3.5) + (b*7.5))/11;
		System.out.printf("MEDIA = %.5f\n", MEDIA);
	}
}
