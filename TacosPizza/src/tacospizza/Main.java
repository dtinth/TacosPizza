package tacospizza;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;

		System.out.print("Enter A: ");
		a = scanner.nextInt();
		System.out.print("Enter B: ");
		b = scanner.nextInt();
		
		System.out.println("A + B = " + (a - b));
		scanner.close();
		
	}

}
