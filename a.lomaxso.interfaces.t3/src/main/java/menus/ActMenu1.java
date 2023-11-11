package menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class ActMenu1 extends JFrame implements ActionListener {

	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem mi1, mi2, mi3;

	public ActMenu1() {
		setTitle("Titulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		mb = new JMenuBar();

		setJMenuBar(mb);
		menu1 = new JMenu("Clientes");
		mb.add(menu1);

		mi1 = new JMenuItem("Añadir");
		mi1.addActionListener(this);
		menu1.add(mi1);

	} // constructor

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			ActMenu1 formulario1 = new ActMenu1();

		});

	} // main

	public void actionPerformed(ActionEvent e) {

	} // action

}// class
