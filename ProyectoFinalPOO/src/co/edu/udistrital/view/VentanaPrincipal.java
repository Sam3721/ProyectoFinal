package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	private PanelInicio pin;
	private PanelTexto ptex;

	public VentanaPrincipal() {
		setTitle("HIDE&&SEAK");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(new BorderLayout(10, 10));

		inicializarComponentes();

		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void inicializarComponentes() {

		ptex = new PanelTexto();
		 getContentPane().add(ptex,BorderLayout.NORTH);
		
		pin = new PanelInicio();

		getContentPane().add(pin, BorderLayout.CENTER);

	}

	public PanelInicio getPin() {
		return pin;
	}

	public void setPin(PanelInicio pin) {
		this.pin = pin;
	}

}
