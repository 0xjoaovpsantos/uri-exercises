import java.util.Scanner;
public class Main {	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int codigoPecaA = Integer.parseInt(scan.next());
		int quantidadePecasA = Integer.parseInt(scan.next());
		double valorPecaA = Double.parseDouble(scan.next());
		int codigoPecaB = Integer.parseInt(scan.next());
		int quantidadePecasB = Integer.parseInt(scan.next());
		double valorPecaB = Double.parseDouble(scan.next());
		double valorPagar = (quantidadePecasA * valorPecaA) + (quantidadePecasB * valorPecaB);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPagar);
	}
}
