package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelTexto extends JPanel {

	private JLabel etexto;
	private JLabel eblanco;

	public PanelTexto() {
		setLayout(new GridLayout(1, 3));
		setBackground(new Color(236, 159, 91));
		setPreferredSize(new Dimension(800, 60));
		inicializarComponentes();

		setVisible(true);
	}

	public void inicializarComponentes() {
		eblanco = new JLabel();
		add(eblanco);
		
		etexto = new JLabel("BIENVENIDO AL SISTEMA DE GESTION");
		add(etexto);
		
		eblanco = new JLabel();
		add(eblanco);
	}

	public JLabel getEtexto() {
		return etexto;
	}

	public void setEtexto(JLabel etexto) {
		this.etexto = etexto;
	}

	public JLabel getEblanco() {
		return eblanco;
	}

	public void setEblanco(JLabel eblanco) {
		this.eblanco = eblanco;
	}

}
