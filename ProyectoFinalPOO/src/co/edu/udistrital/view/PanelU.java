package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelU extends JPanel {

	private JLabel enombre;
	
	

	public PanelU() {
		setLayout(new GridLayout(1, 1));
		setBackground(new Color(236, 159, 91));
		setPreferredSize(new Dimension(800, 60));
	

		inicializarComponentes();

		setVisible(true);
	}

	public void inicializarComponentes() {

		
		enombre = new JLabel();
		add(enombre);
		
	

	}

	public JLabel getEnombre() {
		return enombre;
	}

	public void setEnombre(JLabel enombre) {
		this.enombre = enombre;
	}


}
