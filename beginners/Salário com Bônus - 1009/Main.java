import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String nomeFuncionario = scan.nextLine();
		double salarioFuncionario = Double.parseDouble(scan.nextLine());
		double valorVenda = Double.parseDouble(scan.nextLine());
		double totalReceber = salarioFuncionario + (valorVenda * 0.15);
		System.out.printf("TOTAL = R$ %.2f\n", totalReceber);
		
	}
}
