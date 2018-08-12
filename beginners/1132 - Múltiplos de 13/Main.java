import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero1 = Integer.parseInt(scan.next());
		int numero2 = Integer.parseInt(scan.next());
		
		int contador = 0;
		int limite = 0;
		int somaDosNumeros = 0;
		
		if(numero1 > numero2){
			contador = numero2;
			limite = numero1;
		}else if(numero2 > numero1){
			contador = numero1;
			limite = numero2;
		}else{
			contador = numero1;
			limite = numero1;
		}
		
		for(; contador <= limite; contador++){
			if(contador%13 != 0)
				somaDosNumeros+=contador;
		}
		
		System.out.println(somaDosNumeros);
	}
}

