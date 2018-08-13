import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int contador = 1; contador<=100; contador++){
			if(contador%2 == 0)
				System.out.println(contador);
		}
	}
}

