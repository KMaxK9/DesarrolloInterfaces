package ventanasCodigo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana3_1 {

	public static void main(String[] args) {

		JFrame ventana = new JFrame("mi primera ventana");
		ventana.setSize(400, 400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		
		JButton boton1 = new JButton("Haz click aqui");
		JButton boton2 = new JButton("aqui no");
		boton1.setBounds(120, 120, 160, 40);
		boton2.setBounds(120, 160, 160, 40);
		ventana.getContentPane().add(boton1);
		ventana.getContentPane().add(boton2);

		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(ventana, "Tienes un virus", "aaaaaaaaa",
						JOptionPane.ERROR_MESSAGE);
			} // AL
		}); // AL
		
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(ventana, "Te has salvado", "tomaa", JOptionPane.INFORMATION_MESSAGE);
				
			} // AL
		}); // AL

		ventana.setVisible(true);
	} // mains

}
