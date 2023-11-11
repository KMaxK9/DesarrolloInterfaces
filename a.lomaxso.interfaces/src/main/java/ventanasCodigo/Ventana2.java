package ventanasCodigo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana2 {

	public static void main(String[] args) {

		JFrame ventana = new JFrame ("mi primera ventana");
		ventana.setSize(400,400);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		JButton boton = new JButton ("Haz click aqui");
		ventana.add(boton);
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				JOptionPane.showInputDialog(ventana , "Dime tu nombre", "DatosPersonales",JOptionPane.QUESTION_MESSAGE);
				
			} // AL
		}); // AL
		
		ventana.setVisible(true);
		
	} // mains
	
}
