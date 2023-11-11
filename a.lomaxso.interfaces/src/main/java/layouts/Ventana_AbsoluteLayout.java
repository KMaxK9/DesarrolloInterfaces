package layouts;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Ventana_AbsoluteLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_AbsoluteLayout frame = new Ventana_AbsoluteLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana_AbsoluteLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton boton1 = new JButton("Boton1");
		boton1.setBounds(62, 55, 63, 21);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("Boton2");
		boton2.setBounds(211, 187, 63, 21);
		contentPane.add(boton2);
		
		JButton boton3 = new JButton("Boton3");
		boton3.setBounds(312, 81, 63, 21);
		contentPane.add(boton3);
	}

}
