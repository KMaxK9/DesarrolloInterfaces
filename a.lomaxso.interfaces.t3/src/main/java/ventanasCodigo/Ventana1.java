package ventanasCodigo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana1 {

	public static void main(String[] args) {

		JFrame ventana = new JFrame ("mi priera ventana");
		ventana.setSize(400,400); 
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel texto = new JLabel("hola alumno");
		ventana.getContentPane().add(texto);
		
		ventana.setVisible(true);
		
	} // main

} // class
