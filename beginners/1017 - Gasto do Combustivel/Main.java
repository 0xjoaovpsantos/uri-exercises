import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tempoViagem = Integer.parseInt(scan.nextLine());
		int velocidadeMedia = Integer.parseInt(scan.nextLine());
		
		double litrosNecessarios = (tempoViagem * velocidadeMedia)/12.0;
		
		System.out.printf("%.3f\n", litrosNecessarios);
	}
}
