package jFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaConMetodos4 extends JFrame {

	private JPanel panel;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VentanaConMetodos4 frame = new VentanaConMetodos4();
		frame.iniciarVentana();

		String[] botones = { "Aceptar", "Cancelar", "Siguiente", "Anterior" };

		int y = 50;
		for (String boton : botones) {
			frame.agregarBoton(boton, 50, y);
			y = y + 50;
		} // for
		frame.agregarBoton("Redimensionar", 150, 50);
		
	} // main

	private void iniciarVentana() {
		setSize(300, 300);
		setVisible(true);
		panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);
	} // method

	private void agregarBoton(String nombreBoton, int x, int y) {
		JButton boton = new JButton(nombreBoton);
		boton.setBounds(x, y, 100, 50);
		panel.add(boton);

		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaNueva = new JFrame("Nueva ventana");
				if (nombreBoton.equals("Redimensionar")) {
					ventanaNueva.setSize(400, 400);
				} else {
					ventanaNueva.setSize(300, 300);
				} // if / else
				ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				ventanaNueva.add(new JLabel("has pulsado el boton" + nombreBoton));
				ventanaNueva.setVisible(true);
			} // listener
		});

		// 2 jpanel, botonea t jlabel en le 2, dandole al boton se le da abre el jpanel con el label cambiado.
	} // metod
} // class
