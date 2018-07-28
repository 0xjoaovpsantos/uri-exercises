import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);	
		double raio = Double.parseDouble(scan.nextLine());
		double area = (raio*raio) * 3.14159;
		System.out.printf("A=%.4f\n",area); 
	}
}
