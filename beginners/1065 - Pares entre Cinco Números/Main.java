import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		int quantidadeNumerosPares = 0;
		
		for(int cont = 1; cont <= 5; cont++){
			numero = Integer.parseInt(scan.nextLine());
			if(numero % 2 == 0)
				quantidadeNumerosPares++;
		}
		
		System.out.println(quantidadeNumerosPares + " valores pares");
	}
}

