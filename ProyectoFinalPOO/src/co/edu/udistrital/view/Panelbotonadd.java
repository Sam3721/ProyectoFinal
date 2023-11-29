package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panelbotonadd extends JPanel {

	private JButton badd;

	public Panelbotonadd() {
		setLayout(new GridLayout(1, 1));
		setBackground(new Color(236, 159, 91));
		setPreferredSize(new Dimension(800, 60));

		inicializarComponentes();

		setVisible(true);
	}

	public void inicializarComponentes() {

		badd = new JButton("ADD");
		badd.setActionCommand("ADD2");
		add(badd);

	}

	public JButton getBadd() {
		return badd;
	}

	public void setBadd(JButton badd) {
		this.badd = badd;
	}

}
