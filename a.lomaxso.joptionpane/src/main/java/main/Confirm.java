package main;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Confirm {

	public static void method() {

		byte codigo = (byte) JOptionPane.showConfirmDialog(null, "¿Quieres un euro para una buena causa?", "Donación",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

		if (codigo == JOptionPane.YES_OPTION) {
			System.out.println("Le has dado a \"Si\", toma el euro.");
		} else if (codigo == JOptionPane.NO_OPTION) {
			System.out.println("Le has dado a \"No\", te quedas sin euro.");
		} else {
			System.out.println("Le has dado a \"Cancelar\", te quedas sin euro.");
		} // if / else
	} // main

} // class
