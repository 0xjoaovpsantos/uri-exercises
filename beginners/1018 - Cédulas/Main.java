import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dinheiro = Integer.parseInt(scan.nextLine());
		int aux = dinheiro;
		
		int NotasDeCem = (aux/100);
		aux%=100;
		
		int NotasDeCinquenta = (aux)/50;
		aux%=50;
		
		int NotasDeVinte = (aux)/20;
		aux%=20;
		
		int NotasDeDez = (aux)/10;
		aux%=10;
		
		int NotasDeCinco = (aux)/5;
		aux%=5;
		
		int NotasDeDois = (aux)/2;
		aux%=2;
		
		int NotasDeUm = (aux);

		System.out.println(dinheiro);
		System.out.println(NotasDeCem + " nota(s) de R$ 100,00");
		System.out.println(NotasDeCinquenta + " nota(s) de R$ 50,00");
		System.out.println(NotasDeVinte + " nota(s) de R$ 20,00");
		System.out.println(NotasDeDez + " nota(s) de R$ 10,00");
		System.out.println(NotasDeCinco + " nota(s) de R$ 5,00");
		System.out.println(NotasDeDois + " nota(s) de R$ 2,00");
		System.out.println(NotasDeUm + " nota(s) de R$ 1,00");
		
	}
}

