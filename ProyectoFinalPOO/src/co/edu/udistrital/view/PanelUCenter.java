package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelUCenter extends JPanel {

	private JComboBox<String> lpareja;
	private JButton bcompra;
	private JButton baddpareja;
	private JLabel ecupo;
	private JLabel epersona1;
	private JLabel epareja;
	private JLabel cajapersona1;
	private JLabel cajacupo;

	public PanelUCenter() {
		setLayout(new GridLayout(3,2));
		setBackground(new Color(236, 159, 91));
		setPreferredSize(new Dimension(200, 60));

		inicializarComponentes();

		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		epersona1 = new  JLabel("Nombre: ");
		add(epersona1);
		
		cajapersona1 = new JLabel();
		add(cajapersona1);
		
		epareja = new JLabel("Nombre");
		add(epareja);
		
		lpareja = new JComboBox<String>();
		lpareja.setActionCommand("LISTAP");
		add(lpareja);
		
		ecupo = new JLabel("CUPO");
		add(ecupo);
		
		cajacupo = new JLabel();
		add(cajacupo);
		
		
	}

	public JComboBox<String> getLpareja() {
		return lpareja;
	}

	public void setLpareja(JComboBox<String> lpareja) {
		this.lpareja = lpareja;
	}

	public JButton getBcompra() {
		return bcompra;
	}

	public void setBcompra(JButton bcompra) {
		this.bcompra = bcompra;
	}

	public JButton getBaddpareja() {
		return baddpareja;
	}

	public void setBaddpareja(JButton baddpareja) {
		this.baddpareja = baddpareja;
	}

	public JLabel getEcupo() {
		return ecupo;
	}

	public void setEcupo(JLabel ecupo) {
		this.ecupo = ecupo;
	}

	public JLabel getEpersona1() {
		return epersona1;
	}

	public void setEpersona1(JLabel epersona1) {
		this.epersona1 = epersona1;
	}

	public JLabel getEpareja() {
		return epareja;
	}

	public void setEpareja(JLabel epareja) {
		this.epareja = epareja;
	}

	public JLabel getCajapersona1() {
		return cajapersona1;
	}

	public void setCajapersona1(JLabel cajapersona1) {
		this.cajapersona1 = cajapersona1;
	}

	public JLabel getCajacupo() {
		return cajacupo;
	}

	public void setCajacupo(JLabel cajacupo) {
		this.cajacupo = cajacupo;
	}

}
