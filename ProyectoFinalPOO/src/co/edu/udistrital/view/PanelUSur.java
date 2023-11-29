package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelUSur extends JPanel {

	private JButton bcompra;
	private JButton baddpareja;
	private JComboBox<String> ltienda;
	private JComboBox<String> lproducto;
	private JLabel eprecio;
	private JLabel cajaprecio;
	
	public PanelUSur() {
		setLayout(new GridLayout(3,2));
		setBackground(new Color(236, 159, 91));
		setPreferredSize(new Dimension(800, 60));
		

		inicializarComponentes();

		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		ltienda = new JComboBox<String>();
		ltienda.addItem("D1");
		ltienda.addItem("SuperCol");
		ltienda.addItem("TiendaABC");
		ltienda.setActionCommand("LISTA1");
		add(ltienda);
		
		lproducto = new JComboBox<String>();
		lproducto.setActionCommand("LISTA2");
		add(lproducto);
		
		eprecio = new JLabel("Precio");
		add(eprecio);
		
		cajaprecio = new JLabel();
		add(cajaprecio);
		
		bcompra = new JButton("Comprar");
		bcompra.setActionCommand("COMPRA");
		add(bcompra);
		
		baddpareja = new JButton("Registrar");
		baddpareja.setActionCommand("REGISTER");
		add(baddpareja);
		
		
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

	public JComboBox<String> getLtienda() {
		return ltienda;
	}

	public void setLtienda(JComboBox<String> ltienda) {
		this.ltienda = ltienda;
	}

	public JComboBox<String> getLproducto() {
		return lproducto;
	}

	public void setLproducto(JComboBox<String> lproducto) {
		this.lproducto = lproducto;
	}

	public JLabel getEprecio() {
		return eprecio;
	}

	public void setEprecio(JLabel eprecio) {
		this.eprecio = eprecio;
	}

	public JLabel getCajaprecio() {
		return cajaprecio;
	}

	public void setCajaprecio(JLabel cajaprecio) {
		this.cajaprecio = cajaprecio;
	}
	
	
	
}
