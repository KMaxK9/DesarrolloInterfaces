package main;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class UIManager1 {
	
	public static void method() {
		
	UIManager.put("OptionPane.yesButtonText", "Claro");
	UIManager.put("OptionPane.noButtonText", "Jamás");
	
	byte codigo = (byte) JOptionPane.showConfirmDialog(null, "¿Quieres un euro para una buena causa?", "Donación",
			JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

	if (codigo == JOptionPane.YES_OPTION) {
		System.out.println("Le has dado a \"Claro\", toma el euro.");
	} else if (codigo == JOptionPane.NO_OPTION) {
		System.out.println("Le has dado a \"Jamás\", te quedas sin euro.");
	} // if / else
	
	} // method	
	
} // class
