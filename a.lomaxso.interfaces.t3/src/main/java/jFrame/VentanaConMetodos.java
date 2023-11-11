package jFrame;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaConMetodos extends JFrame {

	private JPanel panel;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VentanaConMetodos frame = new VentanaConMetodos();
		frame.iniciarVentana();

		int y = 50;
		for (byte i = 1; i < 4; i++) {
			frame.agregarBoton("Boton " + i, 50, y);
			y = y + 50;
		} // for
	} // main	

	private void iniciarVentana() {
		setSize(300, 300);
		setVisible(true);
		panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);
	} // method

	private void agregarBoton(String nombreBoton, int x, int y) {
		JButton botonBienvenido = new JButton(nombreBoton);
		botonBienvenido.setBounds(x, y, 100, 50);
		panel.add(botonBienvenido);

	} // metod
} // class
