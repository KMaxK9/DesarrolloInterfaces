package ventanasCodigo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventana2_1 {

	public static void main(String[] args) {

		JFrame ventana = new JFrame("mi primera ventana");
		ventana.setSize(400, 400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton boton = new JButton("Haz click aqui");
		boton.setBounds(120, 120, 160, 40);
		ventana.getContentPane().setLayout(null);
		ventana.getContentPane().add(boton);

		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				byte panel = (byte) JOptionPane.showConfirmDialog(ventana, "¿Seguro que quieres avanzar?");

				if (panel == JOptionPane.YES_OPTION) {
					System.out.println("Le has dado a \"Si\", toma un Virus");

					for (byte i = 0; i < 7; i++) {
						JOptionPane.showMessageDialog(ventana, "Tienes un virus", "aaaaaaaaa",
								JOptionPane.ERROR_MESSAGE);
					} // for

				} else if (panel == JOptionPane.NO_OPTION) {
					System.out.println("Le has dado a \"No\", te has salvado.");
					JOptionPane.showMessageDialog(ventana, "Te has salvado", "tomaa", JOptionPane.INFORMATION_MESSAGE);
				} else {
					System.out.println("Le has dado a \"Cancelar\", te has salvado.");
				} // if / else

			} // AL
		}); // AL

		ventana.setVisible(true);

	} // mains

}
