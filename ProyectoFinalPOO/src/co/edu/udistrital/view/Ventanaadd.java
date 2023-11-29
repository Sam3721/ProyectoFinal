package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Ventanaadd extends JFrame {

	private Paneladd padd;
	private Panelbotonadd pb;

	public Ventanaadd() {
		setTitle("ADD");
		setSize(800, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setBackground(Color.ORANGE);
		
		inicializarComponentes();

		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(false);

	}

	public void inicializarComponentes() {

		padd = new Paneladd();

		getContentPane().add(padd, BorderLayout.CENTER);

		pb = new Panelbotonadd();
		getContentPane().add(pb,BorderLayout.SOUTH);
	}

	public Panelbotonadd getPb() {
		return pb;
	}

	public void setPb(Panelbotonadd pb) {
		this.pb = pb;
	}

	public Paneladd getPadd() {
		return padd;
	}

	public void setPadd(Paneladd padd) {
		this.padd = padd;
	}

}
