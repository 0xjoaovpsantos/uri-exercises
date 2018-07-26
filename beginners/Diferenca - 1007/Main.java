import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);	
		int A = Integer.parseInt(scan.nextLine());
		int B = Integer.parseInt(scan.nextLine());
		int C = Integer.parseInt(scan.nextLine());
		int D = Integer.parseInt(scan.nextLine());
		int DIFERENCA = (A * B - C * D);
		System.out.println("DIFERENCA = " + DIFERENCA);
	}
}

