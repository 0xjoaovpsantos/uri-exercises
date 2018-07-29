import java.util.*;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int c = Integer.parseInt(scan.next());
		
		int maiorab = (a+b+Math.abs(a-b))/2;
		int maiornumero = (maiorab+c+Math.abs(maiorab-c))/2;
		
		System.out.println(maiornumero + " eh o maior");
	}
}
