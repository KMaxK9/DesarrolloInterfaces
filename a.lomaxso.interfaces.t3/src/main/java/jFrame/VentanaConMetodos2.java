package jFrame;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaConMetodos2 extends JFrame {

	private JPanel panel;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VentanaConMetodos2 frame = new VentanaConMetodos2();
		frame.iniciarVentana();

		String[] botones = { "Boton 1", "Boton 2", "Boton 3" };

		int y = 50;
		for (String boton : botones) {
			frame.agregarBoton(boton, 50, y);
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
