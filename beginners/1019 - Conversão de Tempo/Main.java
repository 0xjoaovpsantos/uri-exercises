import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine());
		
		int segundos = 0;
		int minutes = 0;
		int horas = 0;
		
		for(int cont = 0; cont<n; cont++){
			segundos++;		
			if(segundos == 60){
				segundos = 0;
				minutes++;
			}
			if(minutes == 60){
				minutes = 0;
				horas++;
			}			
		}
		
		System.out.println(horas + ":" + minutes + ":" + segundos);
		
	}
}

