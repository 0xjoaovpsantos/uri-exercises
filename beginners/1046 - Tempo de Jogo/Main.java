import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int horaInicio = Integer.parseInt(scan.next());
		int horaFinal = Integer.parseInt(scan.next());
		int horasTotal = 0;
		
		for(int contador = 1; contador <= 24; contador++){
			horaInicio ++;
			
			if(horaInicio == 24){
				horaInicio = 0;
			}
			horasTotal++;
			
			if(horaInicio == horaFinal)
				break;
		}
		
		System.out.println("O JOGO DUROU " + horasTotal + " HORA(S)");
	}
}

