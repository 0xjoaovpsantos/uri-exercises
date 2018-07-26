import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroFuncionario = Integer.parseInt(scan.nextLine());
		int horasTrabalhadas = Integer.parseInt(scan.nextLine());
		double valorHora = Double.parseDouble(scan.nextLine());
		double salarioFuncionario = horasTrabalhadas * valorHora;
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f\n", salarioFuncionario);
	}
}

