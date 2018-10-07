import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int D = Integer.parseInt(scan.nextLine());
		
		int anos = D/365;
		int meses = (D - (anos*365))/30;
		int dias = D - ((anos*365) + (meses*30));
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
	}
}

