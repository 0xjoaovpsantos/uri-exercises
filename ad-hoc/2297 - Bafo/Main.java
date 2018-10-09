import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int R = Integer.parseInt(scan.nextLine());
		int numeroDaRodada = 0;
		int pontosDoAldo = 0;
		int pontosDoBeto = 0;
		
		while(R!=0){
			numeroDaRodada++;
			for(int cont = 0; cont<=R-1; cont++){
				pontosDoAldo += Integer.parseInt(scan.next());
				pontosDoBeto += Integer.parseInt(scan.next());
			}
			System.out.println("Teste " + numeroDaRodada);
			
			if(pontosDoAldo > pontosDoBeto)
				System.out.println("Aldo");	
			else
				System.out.println("Beto");
;
			System.out.println();
			
			pontosDoAldo = 0;
			pontosDoBeto = 0;
			
			R = Integer.parseInt(scan.next());
		}
		
	}
}

