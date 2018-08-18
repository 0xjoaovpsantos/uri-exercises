import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero = Integer.parseInt(scan.nextLine());
		
		for(int cont = 1; cont<10000; cont++){
			if(cont%numero == 2)
				System.out.println(cont);
		}
	}
}

