import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = Integer.parseInt(scan.nextLine());
		int B = Integer.parseInt(scan.nextLine());
		int X = A + B;
		System.out.println("X = " + X);
	}
}
