package codigo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class VentanaVariosJPane2 extends JFrame {

	private JFrame frame;
	private JLabel etiquetaMensaje;
	private JLabel tituloMensaje;

	public VentanaVariosJPane2() {
		setTitle("Ejemplo con Dos contenedores.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelTitulo = new JPanel();
		JPanel panelBotones = new JPanel();
		JPanel panelMensajes = new JPanel();

		tituloMensaje = new JLabel("Bienvenido: ");
		etiquetaMensaje = new JLabel("Mensaje: ");

		for (byte i = 0; i <= 3; i++) {
			JButton boton = new JButton("Boton: " + i);

			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String textoBoton = ((JButton) e.getSource()).getText();

					etiquetaMensaje.setText("Mensaje: " + textoBoton);
					tituloMensaje.setText("Bienvenido: " + textoBoton + " Otra vez");

				} // action
			}); // action
			panelBotones.add(boton);
		} // for

		setLayout(new BorderLayout());
		add(panelTitulo, BorderLayout.NORTH);
		add(panelBotones, BorderLayout.CENTER);
		add(panelMensajes, BorderLayout.SOUTH);
		panelTitulo.add(tituloMensaje);
		panelMensajes.add(etiquetaMensaje);

		pack();

		setLocationRelativeTo(null);
		setVisible(true);

	} // constructor

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new VentanaVariosJPane2();
			} // run
		});

	} // main

	/**
	 * Create the frame.
	 */
}
