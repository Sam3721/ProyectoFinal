package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelInicio extends JPanel {

	private JComboBox<String> lrol;
	private JLabel erol;
	private JLabel eusuario;
	private JTextField cajanombre;
	private JTextField cajacontra;
	private JLabel econtra;
	private JButton bentrar;
	private JButton badd;
	
	public PanelInicio() {
			setLayout(new GridLayout(4,2));
			setBackground(new Color(236, 159, 91));
			setPreferredSize(new Dimension(800, 60));
			setBorder(new TitledBorder("Modulo de datos "));

			inicializarComponentes();

			setVisible(true);
	}
	
	
	public void inicializarComponentes(){
		
		erol = new JLabel("ROL: ");
		add(erol);
		
		lrol = new JComboBox<String>();
		lrol.addItem("Usuario");
		lrol.addItem("Administrativo");
		lrol.setActionCommand("LISTA");
		add(lrol);
		
		eusuario = new JLabel("Usuario");
		add(eusuario);
		
		cajanombre = new JTextField();
		add(cajanombre);
		
		econtra = new JLabel("Contrasenia");
		add(econtra);
		
		cajacontra = new JTextField();
		add(cajacontra);
		
		bentrar = new JButton("Entrar");
		bentrar.setActionCommand("SING");
		add(bentrar);
		
		badd = new JButton("Nuevo");
		badd.setActionCommand("ADD");
		add(badd);
		
	}


	public JComboBox<String> getLrol() {
		return lrol;
	}


	public void setLrol(JComboBox<String> lrol) {
		this.lrol = lrol;
	}


	public JLabel getErol() {
		return erol;
	}


	public void setErol(JLabel erol) {
		this.erol = erol;
	}


	public JLabel getEusuario() {
		return eusuario;
	}


	public void setEusuario(JLabel eusuario) {
		this.eusuario = eusuario;
	}




	public JTextField getCajanombre() {
		return cajanombre;
	}


	public void setCajanombre(JTextField cajanombre) {
		this.cajanombre = cajanombre;
	}


	public JTextField getCajacontra() {
		return cajacontra;
	}


	public void setCajacontra(JTextField cajacontra) {
		this.cajacontra = cajacontra;
	}


	public JLabel getEcontra() {
		return econtra;
	}


	public void setEcontra(JLabel econtra) {
		this.econtra = econtra;
	}


	public JButton getBentrar() {
		return bentrar;
	}


	public void setBentrar(JButton bentrar) {
		this.bentrar = bentrar;
	}


	public JButton getBadd() {
		return badd;
	}


	public void setBadd(JButton badd) {
		this.badd = badd;
	}
	
	
	
}
