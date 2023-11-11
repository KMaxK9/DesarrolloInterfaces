package codigo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class VentanaVariosJPane1 extends JFrame {

	private JLabel etiquetaMensaje;

	public VentanaVariosJPane1() {
		setTitle("Ejemplo con Dos contenedores.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelBotones = new JPanel();
		JPanel panelMensajes = new JPanel();

		etiquetaMensaje = new JLabel("Mensaje: ");

		for (byte i = 0; i <= 3; i++) {
			JButton boton = new JButton("Boton: " + i);

			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String textoBoton = ((JButton) e.getSource()).getText();

				} // action
			}); // action
			panelBotones.add(boton);
		} // for

		setLayout(new BorderLayout());
		add(panelBotones, BorderLayout.SOUTH);
		add(panelMensajes, BorderLayout.CENTER);
		panelMensajes.add(etiquetaMensaje);

		pack();

		setLocationRelativeTo(null);
		setVisible(true);

	} // constructor

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new VentanaVariosJPane1();
			} // run
		});

	} // main

	/**
	 * Create the frame.
	 */
}
