package main;

import javax.swing.JOptionPane;

public class Input {

	public static void method() {
		
		String nombre = JOptionPane.showInputDialog(null, "Dime tu nombre","Datos personales",JOptionPane.QUESTION_MESSAGE);

		if (nombre != null) {
			System.out.println("Has pulsado \"ok\", tu nombre es: " + nombre);
		} else {
			System.out.println("Le has dado a cancelar");
		} // if / else
		
		
	} // main
	
} // class
