package jFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.Border;

import java.awt.BorderLayout;

public class VentanaConMetodos5 extends JFrame {
	public VentanaConMetodos5() {
		getContentPane().setLayout(null);
	}

	private JPanel panel;
	private JPanel panel2;
	
	public static void main(String[] args) {
		
		VentanaConMetodos5 frame = new VentanaConMetodos5();
		frame.iniciarVentana();
		
		frame.agregarBoton("si", 50, 100);
	
		
	} // main
	
	private void iniciarVentana() {
		setSize(300, 300);
		
		panel = new JPanel();
		panel2 = new JPanel();
		setLayout(new BorderLayout());
		
		add(panel, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
		

		pack();
		setVisible(true);
	} // method
	
	private void agregarBoton(String nombre, int x, int y) {
		
		JButton boton = new JButton(nombre);
		boton.setBounds(x, y, 100, 50);
		panel.add(boton);
		panel2.add(new JLabel("texto"));

		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			} // listener
		});
		
	} // method
	
} // class
