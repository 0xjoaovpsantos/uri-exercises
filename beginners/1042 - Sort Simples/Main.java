import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int vetor[] = new int[3];
		int aux = 0;
		
		vetor[0] = Integer.parseInt(scan.next());
		int n1 = vetor[0];
		vetor[1] = Integer.parseInt(scan.next());
		int n2 = vetor[1];
		vetor[2] = Integer.parseInt(scan.next());
		int n3 = vetor[2];
		
		for(int cont1 = 0; cont1 <= 2; cont1++){
			for(int cont2 = 0; cont2 <= 1; cont2++){
				if(vetor[cont2] > vetor[cont2+1]){
					aux = vetor[cont2+1];
					vetor[cont2+1] = vetor[cont2];
					vetor[cont2] = aux;
				}
			}
		}
		
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2] + "\n");
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
	}
}

