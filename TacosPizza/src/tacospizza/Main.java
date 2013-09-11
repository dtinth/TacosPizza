package tacospizza;

import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("This is my User Interface");
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to my softspec class eieieieieiei!!");
		System.out.println("======================");
		
		int a;
		int b;

		System.out.print("Enter A: ");
		a = scanner.nextInt();
		System.out.print("Enter B: ");
		b = scanner.nextInt();
		
		System.out.println("A + B = " + (a + b));
		scanner.close();
		
	}

}
