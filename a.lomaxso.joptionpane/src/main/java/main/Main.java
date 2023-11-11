package main;

import java.util.Scanner;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// necesario para que funcionen los JOptionPane fuera del Main en otra clase.
		JFrame frame = new JFrame();
		byte e;
		
		do {
		System.out.println("\nBienvenidos al menú de actividades del día 16 de Octubre.\n\nElige la actividad"
				+ "\n1. Message\n2. Input\n3. Confirm\n4. UIManager 1\n5. UIManager 2\n\n0. Salir del programa.");
		Scanner sc = new Scanner(System.in);

		e = Byte.parseByte(sc.nextLine());

		// elige la actividad.
		switch (e) {
		case 1:
			Message.method();
			break;
		case 2:
			Input.method();
			break;
		case 3:
			Confirm.method();
			break;
		case 4:
			UIManager1.method();
			break;
		case 5:
			UIManager2.method();
			break;
		} // switch
		} while (e != 0);
		System.out.println("Te has salido, gracias.");
	} // main
} // class
