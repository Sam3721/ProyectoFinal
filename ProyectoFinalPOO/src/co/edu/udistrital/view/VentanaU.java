package co.edu.udistrital.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class VentanaU extends JFrame {
	
	private PanelU pu;
	private PanelUCenter pc;
	private PanelUSur pb;

	public VentanaU() {
		setTitle("USUARIO");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(new BorderLayout(10, 10));
		inicializarComponentes();
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(false);
		
	}
	
	
	
	public void inicializarComponentes() {
			
		pu= new PanelU();
		getContentPane().add(pu,BorderLayout.NORTH);
		
		pc = new PanelUCenter();
		getContentPane().add(pc,BorderLayout.CENTER);
		
		pb = new PanelUSur();
		getContentPane().add(pb, BorderLayout.SOUTH);
		
	}



	public PanelUSur getPb() {
		return pb;
	}



	public void setPb(PanelUSur pb) {
		this.pb = pb;
	}



	public PanelUCenter getPc() {
		return pc;
	}



	public void setPc(PanelUCenter pc) {
		this.pc = pc;
	}



	public PanelU getPu() {
		return pu;
	}



	public void setPu(PanelU pu) {
		this.pu = pu;
	}
	
	
	
	
}
