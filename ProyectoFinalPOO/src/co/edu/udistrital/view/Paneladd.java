package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Paneladd extends JPanel {

	private JComboBox<String> lrol;
	private JLabel erol;
	private JLabel eusuario;
	private JTextField cajanombre;
	private JTextField cajacontra;
	private JLabel econtra;
	private JLabel eemail;
	private JTextField cajaemail;
	private JLabel eedad;
	private JTextField cajaedad;

	public Paneladd() {

		setLayout(new GridLayout(5, 2));
		setBackground(new Color(236, 159, 91));
		setPreferredSize(new Dimension(800, 60));

		inicializarComponentes();

		setVisible(true);

	}

	public void inicializarComponentes() {

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

		eemail = new JLabel("Email");
		add(eemail);

		cajaemail = new JTextField();
		add(cajaemail);
		
		eemail = new JLabel("Edad");
		add(eemail);

		cajaedad = new JTextField();
		add(cajaedad);

	}

	public JLabel getEedad() {
		return eedad;
	}

	public void setEedad(JLabel eedad) {
		this.eedad = eedad;
	}

	public JTextField getCajaedad() {
		return cajaedad;
	}

	public void setCajaedad(JTextField cajaedad) {
		this.cajaedad = cajaedad;
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

	public JLabel getEemail() {
		return eemail;
	}

	public void setEemail(JLabel eemail) {
		this.eemail = eemail;
	}

	public JTextField getCajaemail() {
		return cajaemail;
	}

	public void setCajaemail(JTextField cajaemail) {
		this.cajaemail = cajaemail;
	}

}
