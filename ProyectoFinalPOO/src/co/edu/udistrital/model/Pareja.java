package co.edu.udistrital.model;

import javax.swing.JOptionPane;

public class Pareja {

	private String cupo;
	private String nombre1;
	private String nombre2;

	public Pareja(String nombre1, String nombre2, String cupo) {

		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.cupo = cupo;

	}

	

	public String getCupo() {
		return cupo;
	}

	public void setCupo(String cupo) {
		this.cupo = cupo;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

}
