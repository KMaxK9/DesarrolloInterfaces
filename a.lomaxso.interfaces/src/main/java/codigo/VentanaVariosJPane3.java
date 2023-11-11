package codigo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class VentanaVariosJPane3 extends JFrame {

	private JFrame frame;
	private JLabel etiquetaMensaje;
	private JLabel tituloMensaje;
	private JLabel etiquetaPulsado;

	public VentanaVariosJPane3() {
		setTitle("Ejemplo con Dos contenedores.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame = new JFrame("Ventana");
		frame.setSize(300, 200);
		frame.setVisible(false);

		JPanel panelTitulo = new JPanel();
		JPanel panelBotones = new JPanel();
		JPanel panelMensajes = new JPanel();
		JPanel panelPulsado = new JPanel();

		tituloMensaje = new JLabel("Bienvenido: ");
		etiquetaMensaje = new JLabel("Mensaje: ");
		etiquetaPulsado = new JLabel("");

		for (byte i = 0; i <= 3; i++) {
			JButton boton = new JButton("Boton: " + i);

			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String textoBoton = ((JButton) e.getSource()).getText();

					etiquetaMensaje.setText("Mensaje: " + textoBoton);
					tituloMensaje.setText("Bienvenido: " + textoBoton + " Otra vez");
					etiquetaPulsado.setText("Has pulsado: " + textoBoton);

					frame.setVisible(true);

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
		frame.add(etiquetaPulsado);

		pack();

		setLocationRelativeTo(null);
		setVisible(true);

	} // constructor

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new VentanaVariosJPane3();
			} // run
		});

	} // main

	/**
	 * Create the frame.
	 */
}
