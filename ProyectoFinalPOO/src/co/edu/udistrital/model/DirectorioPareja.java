package co.edu.udistrital.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DirectorioPareja {

private ArrayList<Pareja> directoriop;
	
	
	public DirectorioPareja() {
		directoriop = new ArrayList<Pareja>();
		cargarDatosIniciales();
	}
	
	public void cargarDatosIniciales() {
		Pareja x;
		
		x= new Pareja("samuel", "carol","1000");
		directoriop.add(x);
		
	}
	
	
	public static void hacerPago(Pareja pareja, String costo) {
	    int auxCupo = Integer.parseInt(pareja.getCupo());
	    int auxCosto = Integer.parseInt(costo);

	    if (auxCosto > auxCupo) {
	        JOptionPane.showMessageDialog(null, "El costo supera a su cupo");
	    } else {
	        auxCupo -= auxCosto;
	        pareja.setCupo(String.valueOf(auxCupo));
	        JOptionPane.showMessageDialog(null, "Compra realizada con exito");
	    }
	}
	
	public void agregarPersona(Pareja x) {
		directoriop.add(x);
	}

	public ArrayList<Pareja> getDirectoriou() {
		return directoriop;
	}

	public void setDirectoriou(ArrayList<Pareja> directoriop) {
		this.directoriop = directoriop;
	}
	
	
	
}
