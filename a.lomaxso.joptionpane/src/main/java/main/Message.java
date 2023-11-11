package main;

import javax.swing.JOptionPane;

public class Message {

	public static void method() {

		String nombre = "Max";

		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
		JOptionPane.showMessageDialog(null, "Su ordenador tiene Randsomeware", "Error grave", 0);
		JOptionPane.showMessageDialog(null, "Su ordenador tiene Randsomeware", "Error grave",
				JOptionPane.INFORMATION_MESSAGE);

	} // main

} // class
