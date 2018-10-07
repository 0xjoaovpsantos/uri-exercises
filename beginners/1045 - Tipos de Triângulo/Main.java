import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double A = Double.parseDouble(scan.next());
		double B = Double.parseDouble(scan.next());
		double C = Double.parseDouble(scan.next());
		double aux = 0;
		
		if(B > A){
			aux = A;
			A = B;
			B = aux;
		}
		
		if(C > A){
			aux = A;
			A = C;
			C= aux;
		}
		
	
		
		if(A >= B+C)
			System.out.println("NAO FORMA TRIANGULO");
		else{
		
		if((A*A) == ((B*B) + (C*C)))
			System.out.println("TRIANGULO RETANGULO");
			
		if((A*A) > ((B*B) + (C*C)))
			System.out.println("TRIANGULO OBTUSANGULO");
			
		if((A*A) < ((B*B) + (C*C)))
			System.out.println("TRIANGULO ACUTANGULO");
			
		if(A == B && B == C)
			System.out.println("TRIANGULO EQUILATERO");
		
		if((A == B && B != C) || (A == C && C != B) || (B == C && C != A))
			System.out.println("TRIANGULO ISOSCELES");
			
		}
	}
}

